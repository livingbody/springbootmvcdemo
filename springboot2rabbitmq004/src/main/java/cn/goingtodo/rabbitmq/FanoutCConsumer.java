package cn.goingtodo.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "fanout.c")
public class FanoutCConsumer {

    @Autowired
    private AmqpTemplate rabbitmqTemplate;

    /**
     * 消息消费
     * @RabbitHandler 代表此方法为接受到消息后的处理方法
     */
    @RabbitHandler
    public void recieved(String msg) {
        System.out.println("[fanout.c] recieved message:" + msg);
    }
}