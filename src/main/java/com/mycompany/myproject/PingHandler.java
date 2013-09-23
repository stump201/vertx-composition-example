package com.mycompany.myproject;

import java.util.logging.Logger;

import org.vertx.java.core.Handler;
import org.vertx.java.core.buffer.Buffer;
import org.vertx.java.core.eventbus.Message;

public class PingHandler implements Handler<Message<Buffer>>{

	Logger LOG = Logger.getLogger(PingHandler.class.getName());
	
	@Override
	public void handle(Message<Buffer> event) {
		event.reply(new Buffer("pong!"));
	}

}
