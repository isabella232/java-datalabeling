// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/annotation.proto

package com.google.cloud.datalabeling.v1beta1;

public interface PolylineOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.Polyline)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The polyline vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.Vertex vertices = 1;</code>
   */
  java.util.List<com.google.cloud.datalabeling.v1beta1.Vertex> getVerticesList();
  /**
   *
   *
   * <pre>
   * The polyline vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.Vertex vertices = 1;</code>
   */
  com.google.cloud.datalabeling.v1beta1.Vertex getVertices(int index);
  /**
   *
   *
   * <pre>
   * The polyline vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.Vertex vertices = 1;</code>
   */
  int getVerticesCount();
  /**
   *
   *
   * <pre>
   * The polyline vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.Vertex vertices = 1;</code>
   */
  java.util.List<? extends com.google.cloud.datalabeling.v1beta1.VertexOrBuilder>
      getVerticesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The polyline vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.datalabeling.v1beta1.Vertex vertices = 1;</code>
   */
  com.google.cloud.datalabeling.v1beta1.VertexOrBuilder getVerticesOrBuilder(int index);
}