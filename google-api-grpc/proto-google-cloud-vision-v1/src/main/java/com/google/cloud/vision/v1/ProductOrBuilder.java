// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1/product_search_service.proto

package com.google.cloud.vision.v1;

public interface ProductOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1.Product)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the product.
   * Format is:
   * `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`.
   * This field is ignored when creating a product.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The resource name of the product.
   * Format is:
   * `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`.
   * This field is ignored when creating a product.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The user-provided name for this Product. Must not be empty. Must be at most
   * 4096 characters long.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * The user-provided name for this Product. Must not be empty. Must be at most
   * 4096 characters long.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * User-provided metadata to be stored with this product. Must be at most 4096
   * characters long.
   * </pre>
   *
   * <code>string description = 3;</code>
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * User-provided metadata to be stored with this product. Must be at most 4096
   * characters long.
   * </pre>
   *
   * <code>string description = 3;</code>
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * The category for the product identified by the reference image. This should
   * be either "homegoods-v2", "apparel-v2", or "toys-v2". The legacy categories
   * "homegoods", "apparel", and "toys" are still supported, but these should
   * not be used for new products.
   * This field is immutable.
   * </pre>
   *
   * <code>string product_category = 4;</code>
   */
  java.lang.String getProductCategory();
  /**
   *
   *
   * <pre>
   * The category for the product identified by the reference image. This should
   * be either "homegoods-v2", "apparel-v2", or "toys-v2". The legacy categories
   * "homegoods", "apparel", and "toys" are still supported, but these should
   * not be used for new products.
   * This field is immutable.
   * </pre>
   *
   * <code>string product_category = 4;</code>
   */
  com.google.protobuf.ByteString getProductCategoryBytes();

  /**
   *
   *
   * <pre>
   * Key-value pairs that can be attached to a product. At query time,
   * constraints can be specified based on the product_labels.
   * Note that integer values can be provided as strings, e.g. "1199". Only
   * strings with integer values can match a range-based restriction which is
   * to be supported soon.
   * Multiple values can be assigned to the same key. One product may have up to
   * 100 product_labels.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.Product.KeyValue product_labels = 5;</code>
   */
  java.util.List<com.google.cloud.vision.v1.Product.KeyValue> getProductLabelsList();
  /**
   *
   *
   * <pre>
   * Key-value pairs that can be attached to a product. At query time,
   * constraints can be specified based on the product_labels.
   * Note that integer values can be provided as strings, e.g. "1199". Only
   * strings with integer values can match a range-based restriction which is
   * to be supported soon.
   * Multiple values can be assigned to the same key. One product may have up to
   * 100 product_labels.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.Product.KeyValue product_labels = 5;</code>
   */
  com.google.cloud.vision.v1.Product.KeyValue getProductLabels(int index);
  /**
   *
   *
   * <pre>
   * Key-value pairs that can be attached to a product. At query time,
   * constraints can be specified based on the product_labels.
   * Note that integer values can be provided as strings, e.g. "1199". Only
   * strings with integer values can match a range-based restriction which is
   * to be supported soon.
   * Multiple values can be assigned to the same key. One product may have up to
   * 100 product_labels.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.Product.KeyValue product_labels = 5;</code>
   */
  int getProductLabelsCount();
  /**
   *
   *
   * <pre>
   * Key-value pairs that can be attached to a product. At query time,
   * constraints can be specified based on the product_labels.
   * Note that integer values can be provided as strings, e.g. "1199". Only
   * strings with integer values can match a range-based restriction which is
   * to be supported soon.
   * Multiple values can be assigned to the same key. One product may have up to
   * 100 product_labels.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.Product.KeyValue product_labels = 5;</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1.Product.KeyValueOrBuilder>
      getProductLabelsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Key-value pairs that can be attached to a product. At query time,
   * constraints can be specified based on the product_labels.
   * Note that integer values can be provided as strings, e.g. "1199". Only
   * strings with integer values can match a range-based restriction which is
   * to be supported soon.
   * Multiple values can be assigned to the same key. One product may have up to
   * 100 product_labels.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.Product.KeyValue product_labels = 5;</code>
   */
  com.google.cloud.vision.v1.Product.KeyValueOrBuilder getProductLabelsOrBuilder(int index);
}
