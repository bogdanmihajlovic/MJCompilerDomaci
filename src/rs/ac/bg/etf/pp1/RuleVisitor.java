package rs.ac.bg.etf.pp1;

import rs.ac.bg.etf.pp1.ast.*;
import org.apache.log4j.*;

public class RuleVisitor extends VisitorAdaptor{
	
	Logger log = Logger.getLogger(MJParserTest.class);
	
	int printCallCount = 0;
	
	@Override
	public void visit() {
		printCallCount++;
		log.info("Prepoznata naredba print;");
	}

}
