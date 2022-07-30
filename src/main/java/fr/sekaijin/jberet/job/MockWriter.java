package fr.sekaijin.jberet.job;

import java.util.List;

import javax.enterprise.context.Dependent;
import javax.inject.Named;

import org.jboss.logging.Logger;

import fr.sekaijin.jberet.core.AbstractItemWriter;

@Named(MockWriter.NAME)
@Dependent
public class MockWriter extends AbstractItemWriter<Integer, String> {

	public static final String NAME = "myItemWriter";
	Logger LOGGER = Logger.getLogger(MockReader.class);

	@Override
	public void write(List<String> items) throws Exception {
		LOGGER.infof("write %s", items);

//		for (Object object : items) {
//			Exchange e = Exchange.class.cast(object);
//			LOGGER.infof("write %s", e.getIn().getHeaders());
//
//		}

	}

}

