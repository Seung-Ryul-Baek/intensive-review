package edu.intensive;

import edu.intensive.config.kafka.KafkaProcessor;
import edu.intensive.event.LectureApproved;
import edu.intensive.event.LectureEvaluated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler {
    @Autowired
    StatusRepository studentLectureHistoryRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void onEvent(@Payload String message) {
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverLectureRequested(@Payload LectureApproved lectureApproved) {
        if(lectureApproved.isMe()){

        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverLectureRequested(@Payload LectureEvaluated lectureEvaluated) {
        if(lectureEvaluated.isMe()) {

        }
    }

}
