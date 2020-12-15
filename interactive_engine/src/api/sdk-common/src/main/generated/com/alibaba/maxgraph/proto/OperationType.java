// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sdk/common.proto

package com.alibaba.maxgraph.proto;

/**
 * Protobuf enum {@code OperationType}
 */
public enum OperationType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * overwrite whole vertex
   * </pre>
   *
   * <code>INSERT_OVERWRITE_VERTEX = 0;</code>
   */
  INSERT_OVERWRITE_VERTEX(0),
  /**
   * <pre>
   * overwrite the property by property key
   * </pre>
   *
   * <code>INSERT_OVERWRITE_VERTEX_PROPERTY = 1;</code>
   */
  INSERT_OVERWRITE_VERTEX_PROPERTY(1),
  /**
   * <pre>
   * delete vertex
   * </pre>
   *
   * <code>DELETE_VERTEX = 2;</code>
   */
  DELETE_VERTEX(2),
  /**
   * <code>INSERT_OVERWRITE_EDGE = 3;</code>
   */
  INSERT_OVERWRITE_EDGE(3),
  /**
   * <code>INSERT_OVERWRITE_EDGE_PROPERTY = 4;</code>
   */
  INSERT_OVERWRITE_EDGE_PROPERTY(4),
  /**
   * <code>DELETE_EDGE = 5;</code>
   */
  DELETE_EDGE(5),
  /**
   * <code>BARRIER_MARKER = 6;</code>
   */
  BARRIER_MARKER(6),
  /**
   * <code>INSERT_REPLACE_VERTEX = 7;</code>
   */
  INSERT_REPLACE_VERTEX(7),
  /**
   * <code>INSERT_REPLACE_EDGE = 8;</code>
   */
  INSERT_REPLACE_EDGE(8),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * overwrite whole vertex
   * </pre>
   *
   * <code>INSERT_OVERWRITE_VERTEX = 0;</code>
   */
  public static final int INSERT_OVERWRITE_VERTEX_VALUE = 0;
  /**
   * <pre>
   * overwrite the property by property key
   * </pre>
   *
   * <code>INSERT_OVERWRITE_VERTEX_PROPERTY = 1;</code>
   */
  public static final int INSERT_OVERWRITE_VERTEX_PROPERTY_VALUE = 1;
  /**
   * <pre>
   * delete vertex
   * </pre>
   *
   * <code>DELETE_VERTEX = 2;</code>
   */
  public static final int DELETE_VERTEX_VALUE = 2;
  /**
   * <code>INSERT_OVERWRITE_EDGE = 3;</code>
   */
  public static final int INSERT_OVERWRITE_EDGE_VALUE = 3;
  /**
   * <code>INSERT_OVERWRITE_EDGE_PROPERTY = 4;</code>
   */
  public static final int INSERT_OVERWRITE_EDGE_PROPERTY_VALUE = 4;
  /**
   * <code>DELETE_EDGE = 5;</code>
   */
  public static final int DELETE_EDGE_VALUE = 5;
  /**
   * <code>BARRIER_MARKER = 6;</code>
   */
  public static final int BARRIER_MARKER_VALUE = 6;
  /**
   * <code>INSERT_REPLACE_VERTEX = 7;</code>
   */
  public static final int INSERT_REPLACE_VERTEX_VALUE = 7;
  /**
   * <code>INSERT_REPLACE_EDGE = 8;</code>
   */
  public static final int INSERT_REPLACE_EDGE_VALUE = 8;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static OperationType valueOf(int value) {
    return forNumber(value);
  }

  public static OperationType forNumber(int value) {
    switch (value) {
      case 0: return INSERT_OVERWRITE_VERTEX;
      case 1: return INSERT_OVERWRITE_VERTEX_PROPERTY;
      case 2: return DELETE_VERTEX;
      case 3: return INSERT_OVERWRITE_EDGE;
      case 4: return INSERT_OVERWRITE_EDGE_PROPERTY;
      case 5: return DELETE_EDGE;
      case 6: return BARRIER_MARKER;
      case 7: return INSERT_REPLACE_VERTEX;
      case 8: return INSERT_REPLACE_EDGE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<OperationType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      OperationType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OperationType>() {
          public OperationType findValueByNumber(int number) {
            return OperationType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.alibaba.maxgraph.proto.CommonProto.getDescriptor()
        .getEnumTypes().get(0);
  }

  private static final OperationType[] VALUES = values();

  public static OperationType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private OperationType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:OperationType)
}
