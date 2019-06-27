
// Generated by Akka gRPC. DO NOT EDIT.
package com.google.pubsub.v1;

import akka.grpc.ProtobufSerializer;
import akka.grpc.javadsl.GoogleProtobufSerializer;

public interface Publisher {
  
  java.util.concurrent.CompletionStage<com.google.pubsub.v1.Topic> createTopic(com.google.pubsub.v1.Topic in);
  
  java.util.concurrent.CompletionStage<com.google.pubsub.v1.Topic> updateTopic(com.google.pubsub.v1.UpdateTopicRequest in);
  
  java.util.concurrent.CompletionStage<com.google.pubsub.v1.PublishResponse> publish(com.google.pubsub.v1.PublishRequest in);
  
  java.util.concurrent.CompletionStage<com.google.pubsub.v1.Topic> getTopic(com.google.pubsub.v1.GetTopicRequest in);
  
  java.util.concurrent.CompletionStage<com.google.pubsub.v1.ListTopicsResponse> listTopics(com.google.pubsub.v1.ListTopicsRequest in);
  
  java.util.concurrent.CompletionStage<com.google.pubsub.v1.ListTopicSubscriptionsResponse> listTopicSubscriptions(com.google.pubsub.v1.ListTopicSubscriptionsRequest in);
  
  java.util.concurrent.CompletionStage<com.google.protobuf.Empty> deleteTopic(com.google.pubsub.v1.DeleteTopicRequest in);
  

  static String name = "google.pubsub.v1.Publisher";

  public static class Serializers {
    
      public static ProtobufSerializer<com.google.pubsub.v1.ListTopicsResponse> ListTopicsResponseSerializer = new GoogleProtobufSerializer<>(com.google.pubsub.v1.ListTopicsResponse.class);
    
      public static ProtobufSerializer<com.google.pubsub.v1.ListTopicsRequest> ListTopicsRequestSerializer = new GoogleProtobufSerializer<>(com.google.pubsub.v1.ListTopicsRequest.class);
    
      public static ProtobufSerializer<com.google.pubsub.v1.ListTopicSubscriptionsRequest> ListTopicSubscriptionsRequestSerializer = new GoogleProtobufSerializer<>(com.google.pubsub.v1.ListTopicSubscriptionsRequest.class);
    
      public static ProtobufSerializer<com.google.pubsub.v1.GetTopicRequest> GetTopicRequestSerializer = new GoogleProtobufSerializer<>(com.google.pubsub.v1.GetTopicRequest.class);
    
      public static ProtobufSerializer<com.google.pubsub.v1.Topic> TopicSerializer = new GoogleProtobufSerializer<>(com.google.pubsub.v1.Topic.class);
    
      public static ProtobufSerializer<com.google.protobuf.Empty> EmptySerializer = new GoogleProtobufSerializer<>(com.google.protobuf.Empty.class);
    
      public static ProtobufSerializer<com.google.pubsub.v1.PublishRequest> PublishRequestSerializer = new GoogleProtobufSerializer<>(com.google.pubsub.v1.PublishRequest.class);
    
      public static ProtobufSerializer<com.google.pubsub.v1.DeleteTopicRequest> DeleteTopicRequestSerializer = new GoogleProtobufSerializer<>(com.google.pubsub.v1.DeleteTopicRequest.class);
    
      public static ProtobufSerializer<com.google.pubsub.v1.PublishResponse> PublishResponseSerializer = new GoogleProtobufSerializer<>(com.google.pubsub.v1.PublishResponse.class);
    
      public static ProtobufSerializer<com.google.pubsub.v1.ListTopicSubscriptionsResponse> ListTopicSubscriptionsResponseSerializer = new GoogleProtobufSerializer<>(com.google.pubsub.v1.ListTopicSubscriptionsResponse.class);
    
      public static ProtobufSerializer<com.google.pubsub.v1.UpdateTopicRequest> UpdateTopicRequestSerializer = new GoogleProtobufSerializer<>(com.google.pubsub.v1.UpdateTopicRequest.class);
    
  }
}
