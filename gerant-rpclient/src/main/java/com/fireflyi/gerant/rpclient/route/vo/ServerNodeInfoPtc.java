// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ServerNodeInfoVo.proto

package com.fireflyi.gerant.rpclient.route.vo;

public final class ServerNodeInfoPtc {
  private ServerNodeInfoPtc() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protobuf_route_ServerNodeInfoVo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protobuf_route_ServerNodeInfoVo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026ServerNodeInfoVo.proto\022\016protobuf.route" +
      "\"I\n\020ServerNodeInfoVo\022\n\n\002ip\030\001 \001(\t\022\014\n\004port" +
      "\030\002 \001(\005\022\014\n\004name\030\003 \001(\t\022\r\n\005group\030\004 \001(\tB<\n%c" +
      "om.fireflyi.gerant.rpclient.route.voB\021Se" +
      "rverNodeInfoPtcP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_protobuf_route_ServerNodeInfoVo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protobuf_route_ServerNodeInfoVo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protobuf_route_ServerNodeInfoVo_descriptor,
        new java.lang.String[] { "Ip", "Port", "Name", "Group", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
