/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.dataproc.v1beta2;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dataproc.v1beta2.stub.WorkflowTemplateServiceStub;
import com.google.cloud.dataproc.v1beta2.stub.WorkflowTemplateServiceStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.longrunning.Operation;
import com.google.longrunning.OperationsClient;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: The API interface for managing Workflow Templates in the Cloud Dataproc API.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
 *   RegionName parent = RegionName.of("[PROJECT]", "[REGION]");
 *   WorkflowTemplate template = WorkflowTemplate.newBuilder().build();
 *   WorkflowTemplate response = workflowTemplateServiceClient.createWorkflowTemplate(parent, template);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the workflowTemplateServiceClient object to clean up
 * resources such as threads. In the example above, try-with-resources is used, which automatically
 * calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li>A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li>A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li>A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of
 * WorkflowTemplateServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * WorkflowTemplateServiceSettings workflowTemplateServiceSettings =
 *     WorkflowTemplateServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * WorkflowTemplateServiceClient workflowTemplateServiceClient =
 *     WorkflowTemplateServiceClient.create(workflowTemplateServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * WorkflowTemplateServiceSettings workflowTemplateServiceSettings =
 *     WorkflowTemplateServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * WorkflowTemplateServiceClient workflowTemplateServiceClient =
 *     WorkflowTemplateServiceClient.create(workflowTemplateServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class WorkflowTemplateServiceClient implements BackgroundResource {
  private final WorkflowTemplateServiceSettings settings;
  private final WorkflowTemplateServiceStub stub;
  private final OperationsClient operationsClient;

  /** Constructs an instance of WorkflowTemplateServiceClient with default settings. */
  public static final WorkflowTemplateServiceClient create() throws IOException {
    return create(WorkflowTemplateServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of WorkflowTemplateServiceClient, using the given settings. The channels
   * are created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final WorkflowTemplateServiceClient create(WorkflowTemplateServiceSettings settings)
      throws IOException {
    return new WorkflowTemplateServiceClient(settings);
  }

  /**
   * Constructs an instance of WorkflowTemplateServiceClient, using the given stub for making calls.
   * This is for advanced usage - prefer to use WorkflowTemplateServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final WorkflowTemplateServiceClient create(WorkflowTemplateServiceStub stub) {
    return new WorkflowTemplateServiceClient(stub);
  }

  /**
   * Constructs an instance of WorkflowTemplateServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected WorkflowTemplateServiceClient(WorkflowTemplateServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((WorkflowTemplateServiceStubSettings) settings.getStubSettings()).createStub();
    this.operationsClient = OperationsClient.create(this.stub.getOperationsStub());
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected WorkflowTemplateServiceClient(WorkflowTemplateServiceStub stub) {
    this.settings = null;
    this.stub = stub;
    this.operationsClient = OperationsClient.create(this.stub.getOperationsStub());
  }

  public final WorkflowTemplateServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public WorkflowTemplateServiceStub getStub() {
    return stub;
  }

  /**
   * Returns the OperationsClient that can be used to query the status of a long-running operation
   * returned by another API method call.
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationsClient getOperationsClient() {
    return operationsClient;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates new workflow template.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
   *   RegionName parent = RegionName.of("[PROJECT]", "[REGION]");
   *   WorkflowTemplate template = WorkflowTemplate.newBuilder().build();
   *   WorkflowTemplate response = workflowTemplateServiceClient.createWorkflowTemplate(parent, template);
   * }
   * </code></pre>
   *
   * @param parent Required. The "resource name" of the region, as described in
   *     https://cloud.google.com/apis/design/resource_names of the form
   *     `projects/{project_id}/regions/{region}`
   * @param template Required. The Dataproc workflow template to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final WorkflowTemplate createWorkflowTemplate(
      RegionName parent, WorkflowTemplate template) {

    CreateWorkflowTemplateRequest request =
        CreateWorkflowTemplateRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setTemplate(template)
            .build();
    return createWorkflowTemplate(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates new workflow template.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
   *   RegionName parent = RegionName.of("[PROJECT]", "[REGION]");
   *   WorkflowTemplate template = WorkflowTemplate.newBuilder().build();
   *   WorkflowTemplate response = workflowTemplateServiceClient.createWorkflowTemplate(parent.toString(), template);
   * }
   * </code></pre>
   *
   * @param parent Required. The "resource name" of the region, as described in
   *     https://cloud.google.com/apis/design/resource_names of the form
   *     `projects/{project_id}/regions/{region}`
   * @param template Required. The Dataproc workflow template to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final WorkflowTemplate createWorkflowTemplate(String parent, WorkflowTemplate template) {

    CreateWorkflowTemplateRequest request =
        CreateWorkflowTemplateRequest.newBuilder().setParent(parent).setTemplate(template).build();
    return createWorkflowTemplate(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates new workflow template.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
   *   RegionName parent = RegionName.of("[PROJECT]", "[REGION]");
   *   WorkflowTemplate template = WorkflowTemplate.newBuilder().build();
   *   CreateWorkflowTemplateRequest request = CreateWorkflowTemplateRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .setTemplate(template)
   *     .build();
   *   WorkflowTemplate response = workflowTemplateServiceClient.createWorkflowTemplate(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final WorkflowTemplate createWorkflowTemplate(CreateWorkflowTemplateRequest request) {
    return createWorkflowTemplateCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Creates new workflow template.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
   *   RegionName parent = RegionName.of("[PROJECT]", "[REGION]");
   *   WorkflowTemplate template = WorkflowTemplate.newBuilder().build();
   *   CreateWorkflowTemplateRequest request = CreateWorkflowTemplateRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .setTemplate(template)
   *     .build();
   *   ApiFuture&lt;WorkflowTemplate&gt; future = workflowTemplateServiceClient.createWorkflowTemplateCallable().futureCall(request);
   *   // Do something
   *   WorkflowTemplate response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<CreateWorkflowTemplateRequest, WorkflowTemplate>
      createWorkflowTemplateCallable() {
    return stub.createWorkflowTemplateCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the latest workflow template.
   *
   * <p>Can retrieve previously instantiated template by specifying optional version parameter.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
   *   WorkflowTemplateName name = WorkflowTemplateName.of("[PROJECT]", "[REGION]", "[WORKFLOW_TEMPLATE]");
   *   WorkflowTemplate response = workflowTemplateServiceClient.getWorkflowTemplate(name);
   * }
   * </code></pre>
   *
   * @param name Required. The "resource name" of the workflow template, as described in
   *     https://cloud.google.com/apis/design/resource_names of the form
   *     `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final WorkflowTemplate getWorkflowTemplate(WorkflowTemplateName name) {

    GetWorkflowTemplateRequest request =
        GetWorkflowTemplateRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return getWorkflowTemplate(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the latest workflow template.
   *
   * <p>Can retrieve previously instantiated template by specifying optional version parameter.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
   *   WorkflowTemplateName name = WorkflowTemplateName.of("[PROJECT]", "[REGION]", "[WORKFLOW_TEMPLATE]");
   *   WorkflowTemplate response = workflowTemplateServiceClient.getWorkflowTemplate(name.toString());
   * }
   * </code></pre>
   *
   * @param name Required. The "resource name" of the workflow template, as described in
   *     https://cloud.google.com/apis/design/resource_names of the form
   *     `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final WorkflowTemplate getWorkflowTemplate(String name) {

    GetWorkflowTemplateRequest request =
        GetWorkflowTemplateRequest.newBuilder().setName(name).build();
    return getWorkflowTemplate(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the latest workflow template.
   *
   * <p>Can retrieve previously instantiated template by specifying optional version parameter.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
   *   WorkflowTemplateName name = WorkflowTemplateName.of("[PROJECT]", "[REGION]", "[WORKFLOW_TEMPLATE]");
   *   GetWorkflowTemplateRequest request = GetWorkflowTemplateRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   WorkflowTemplate response = workflowTemplateServiceClient.getWorkflowTemplate(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final WorkflowTemplate getWorkflowTemplate(GetWorkflowTemplateRequest request) {
    return getWorkflowTemplateCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Retrieves the latest workflow template.
   *
   * <p>Can retrieve previously instantiated template by specifying optional version parameter.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
   *   WorkflowTemplateName name = WorkflowTemplateName.of("[PROJECT]", "[REGION]", "[WORKFLOW_TEMPLATE]");
   *   GetWorkflowTemplateRequest request = GetWorkflowTemplateRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   ApiFuture&lt;WorkflowTemplate&gt; future = workflowTemplateServiceClient.getWorkflowTemplateCallable().futureCall(request);
   *   // Do something
   *   WorkflowTemplate response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetWorkflowTemplateRequest, WorkflowTemplate>
      getWorkflowTemplateCallable() {
    return stub.getWorkflowTemplateCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Instantiates a template and begins execution.
   *
   * <p>The returned Operation can be used to track execution of workflow by polling
   * [operations.get][google.longrunning.Operations.GetOperation]. The Operation will complete when
   * entire workflow is finished.
   *
   * <p>The running workflow can be aborted via
   * [operations.cancel][google.longrunning.Operations.CancelOperation]. This will cause any
   * inflight jobs to be cancelled and workflow-owned clusters to be deleted.
   *
   * <p>The [Operation.metadata][google.longrunning.Operation.metadata] will be
   * [WorkflowMetadata][google.cloud.dataproc.v1beta2.WorkflowMetadata].
   *
   * <p>On successful completion, [Operation.response][google.longrunning.Operation.response] will
   * be [Empty][google.protobuf.Empty].
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
   *   WorkflowTemplateName name = WorkflowTemplateName.of("[PROJECT]", "[REGION]", "[WORKFLOW_TEMPLATE]");
   *   workflowTemplateServiceClient.instantiateWorkflowTemplateAsync(name).get();
   * }
   * </code></pre>
   *
   * @param name Required. The "resource name" of the workflow template, as described in
   *     https://cloud.google.com/apis/design/resource_names of the form
   *     `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Empty, WorkflowMetadata> instantiateWorkflowTemplateAsync(
      WorkflowTemplateName name) {

    InstantiateWorkflowTemplateRequest request =
        InstantiateWorkflowTemplateRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return instantiateWorkflowTemplateAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Instantiates a template and begins execution.
   *
   * <p>The returned Operation can be used to track execution of workflow by polling
   * [operations.get][google.longrunning.Operations.GetOperation]. The Operation will complete when
   * entire workflow is finished.
   *
   * <p>The running workflow can be aborted via
   * [operations.cancel][google.longrunning.Operations.CancelOperation]. This will cause any
   * inflight jobs to be cancelled and workflow-owned clusters to be deleted.
   *
   * <p>The [Operation.metadata][google.longrunning.Operation.metadata] will be
   * [WorkflowMetadata][google.cloud.dataproc.v1beta2.WorkflowMetadata].
   *
   * <p>On successful completion, [Operation.response][google.longrunning.Operation.response] will
   * be [Empty][google.protobuf.Empty].
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
   *   WorkflowTemplateName name = WorkflowTemplateName.of("[PROJECT]", "[REGION]", "[WORKFLOW_TEMPLATE]");
   *   workflowTemplateServiceClient.instantiateWorkflowTemplateAsync(name.toString()).get();
   * }
   * </code></pre>
   *
   * @param name Required. The "resource name" of the workflow template, as described in
   *     https://cloud.google.com/apis/design/resource_names of the form
   *     `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Empty, WorkflowMetadata> instantiateWorkflowTemplateAsync(
      String name) {

    InstantiateWorkflowTemplateRequest request =
        InstantiateWorkflowTemplateRequest.newBuilder().setName(name).build();
    return instantiateWorkflowTemplateAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Instantiates a template and begins execution.
   *
   * <p>The returned Operation can be used to track execution of workflow by polling
   * [operations.get][google.longrunning.Operations.GetOperation]. The Operation will complete when
   * entire workflow is finished.
   *
   * <p>The running workflow can be aborted via
   * [operations.cancel][google.longrunning.Operations.CancelOperation]. This will cause any
   * inflight jobs to be cancelled and workflow-owned clusters to be deleted.
   *
   * <p>The [Operation.metadata][google.longrunning.Operation.metadata] will be
   * [WorkflowMetadata][google.cloud.dataproc.v1beta2.WorkflowMetadata].
   *
   * <p>On successful completion, [Operation.response][google.longrunning.Operation.response] will
   * be [Empty][google.protobuf.Empty].
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
   *   Map&lt;String, String&gt; parameters = new HashMap&lt;&gt;();
   *   workflowTemplateServiceClient.instantiateWorkflowTemplateAsync(parameters).get();
   * }
   * </code></pre>
   *
   * @param parameters Optional. Map from parameter names to values that should be used for those
   *     parameters. Values may not exceed 100 characters.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Empty, WorkflowMetadata> instantiateWorkflowTemplateAsync(
      Map<String, String> parameters) {

    InstantiateWorkflowTemplateRequest request =
        InstantiateWorkflowTemplateRequest.newBuilder().putAllParameters(parameters).build();
    return instantiateWorkflowTemplateAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Instantiates a template and begins execution.
   *
   * <p>The returned Operation can be used to track execution of workflow by polling
   * [operations.get][google.longrunning.Operations.GetOperation]. The Operation will complete when
   * entire workflow is finished.
   *
   * <p>The running workflow can be aborted via
   * [operations.cancel][google.longrunning.Operations.CancelOperation]. This will cause any
   * inflight jobs to be cancelled and workflow-owned clusters to be deleted.
   *
   * <p>The [Operation.metadata][google.longrunning.Operation.metadata] will be
   * [WorkflowMetadata][google.cloud.dataproc.v1beta2.WorkflowMetadata].
   *
   * <p>On successful completion, [Operation.response][google.longrunning.Operation.response] will
   * be [Empty][google.protobuf.Empty].
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
   *   WorkflowTemplateName name = WorkflowTemplateName.of("[PROJECT]", "[REGION]", "[WORKFLOW_TEMPLATE]");
   *   InstantiateWorkflowTemplateRequest request = InstantiateWorkflowTemplateRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   workflowTemplateServiceClient.instantiateWorkflowTemplateAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Empty, WorkflowMetadata> instantiateWorkflowTemplateAsync(
      InstantiateWorkflowTemplateRequest request) {
    return instantiateWorkflowTemplateOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Instantiates a template and begins execution.
   *
   * <p>The returned Operation can be used to track execution of workflow by polling
   * [operations.get][google.longrunning.Operations.GetOperation]. The Operation will complete when
   * entire workflow is finished.
   *
   * <p>The running workflow can be aborted via
   * [operations.cancel][google.longrunning.Operations.CancelOperation]. This will cause any
   * inflight jobs to be cancelled and workflow-owned clusters to be deleted.
   *
   * <p>The [Operation.metadata][google.longrunning.Operation.metadata] will be
   * [WorkflowMetadata][google.cloud.dataproc.v1beta2.WorkflowMetadata].
   *
   * <p>On successful completion, [Operation.response][google.longrunning.Operation.response] will
   * be [Empty][google.protobuf.Empty].
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
   *   WorkflowTemplateName name = WorkflowTemplateName.of("[PROJECT]", "[REGION]", "[WORKFLOW_TEMPLATE]");
   *   InstantiateWorkflowTemplateRequest request = InstantiateWorkflowTemplateRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   OperationFuture&lt;Empty, WorkflowMetadata&gt; future = workflowTemplateServiceClient.instantiateWorkflowTemplateOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<InstantiateWorkflowTemplateRequest, Empty, WorkflowMetadata>
      instantiateWorkflowTemplateOperationCallable() {
    return stub.instantiateWorkflowTemplateOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Instantiates a template and begins execution.
   *
   * <p>The returned Operation can be used to track execution of workflow by polling
   * [operations.get][google.longrunning.Operations.GetOperation]. The Operation will complete when
   * entire workflow is finished.
   *
   * <p>The running workflow can be aborted via
   * [operations.cancel][google.longrunning.Operations.CancelOperation]. This will cause any
   * inflight jobs to be cancelled and workflow-owned clusters to be deleted.
   *
   * <p>The [Operation.metadata][google.longrunning.Operation.metadata] will be
   * [WorkflowMetadata][google.cloud.dataproc.v1beta2.WorkflowMetadata].
   *
   * <p>On successful completion, [Operation.response][google.longrunning.Operation.response] will
   * be [Empty][google.protobuf.Empty].
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
   *   WorkflowTemplateName name = WorkflowTemplateName.of("[PROJECT]", "[REGION]", "[WORKFLOW_TEMPLATE]");
   *   InstantiateWorkflowTemplateRequest request = InstantiateWorkflowTemplateRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = workflowTemplateServiceClient.instantiateWorkflowTemplateCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<InstantiateWorkflowTemplateRequest, Operation>
      instantiateWorkflowTemplateCallable() {
    return stub.instantiateWorkflowTemplateCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Instantiates a template and begins execution.
   *
   * <p>This method is equivalent to executing the sequence
   * [CreateWorkflowTemplate][google.cloud.dataproc.v1beta2.WorkflowTemplateService.CreateWorkflowTemplate],
   * [InstantiateWorkflowTemplate][google.cloud.dataproc.v1beta2.WorkflowTemplateService.InstantiateWorkflowTemplate],
   * [DeleteWorkflowTemplate][google.cloud.dataproc.v1beta2.WorkflowTemplateService.DeleteWorkflowTemplate].
   *
   * <p>The returned Operation can be used to track execution of workflow by polling
   * [operations.get][google.longrunning.Operations.GetOperation]. The Operation will complete when
   * entire workflow is finished.
   *
   * <p>The running workflow can be aborted via
   * [operations.cancel][google.longrunning.Operations.CancelOperation]. This will cause any
   * inflight jobs to be cancelled and workflow-owned clusters to be deleted.
   *
   * <p>The [Operation.metadata][google.longrunning.Operation.metadata] will be
   * [WorkflowMetadata][google.cloud.dataproc.v1beta2.WorkflowMetadata].
   *
   * <p>On successful completion, [Operation.response][google.longrunning.Operation.response] will
   * be [Empty][google.protobuf.Empty].
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
   *   RegionName parent = RegionName.of("[PROJECT]", "[REGION]");
   *   WorkflowTemplate template = WorkflowTemplate.newBuilder().build();
   *   workflowTemplateServiceClient.instantiateInlineWorkflowTemplateAsync(parent, template).get();
   * }
   * </code></pre>
   *
   * @param parent Required. The "resource name" of the workflow template region, as described in
   *     https://cloud.google.com/apis/design/resource_names of the form
   *     `projects/{project_id}/regions/{region}`
   * @param template Required. The workflow template to instantiate.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Empty, WorkflowMetadata> instantiateInlineWorkflowTemplateAsync(
      RegionName parent, WorkflowTemplate template) {

    InstantiateInlineWorkflowTemplateRequest request =
        InstantiateInlineWorkflowTemplateRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setTemplate(template)
            .build();
    return instantiateInlineWorkflowTemplateAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Instantiates a template and begins execution.
   *
   * <p>This method is equivalent to executing the sequence
   * [CreateWorkflowTemplate][google.cloud.dataproc.v1beta2.WorkflowTemplateService.CreateWorkflowTemplate],
   * [InstantiateWorkflowTemplate][google.cloud.dataproc.v1beta2.WorkflowTemplateService.InstantiateWorkflowTemplate],
   * [DeleteWorkflowTemplate][google.cloud.dataproc.v1beta2.WorkflowTemplateService.DeleteWorkflowTemplate].
   *
   * <p>The returned Operation can be used to track execution of workflow by polling
   * [operations.get][google.longrunning.Operations.GetOperation]. The Operation will complete when
   * entire workflow is finished.
   *
   * <p>The running workflow can be aborted via
   * [operations.cancel][google.longrunning.Operations.CancelOperation]. This will cause any
   * inflight jobs to be cancelled and workflow-owned clusters to be deleted.
   *
   * <p>The [Operation.metadata][google.longrunning.Operation.metadata] will be
   * [WorkflowMetadata][google.cloud.dataproc.v1beta2.WorkflowMetadata].
   *
   * <p>On successful completion, [Operation.response][google.longrunning.Operation.response] will
   * be [Empty][google.protobuf.Empty].
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
   *   RegionName parent = RegionName.of("[PROJECT]", "[REGION]");
   *   WorkflowTemplate template = WorkflowTemplate.newBuilder().build();
   *   workflowTemplateServiceClient.instantiateInlineWorkflowTemplateAsync(parent.toString(), template).get();
   * }
   * </code></pre>
   *
   * @param parent Required. The "resource name" of the workflow template region, as described in
   *     https://cloud.google.com/apis/design/resource_names of the form
   *     `projects/{project_id}/regions/{region}`
   * @param template Required. The workflow template to instantiate.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Empty, WorkflowMetadata> instantiateInlineWorkflowTemplateAsync(
      String parent, WorkflowTemplate template) {

    InstantiateInlineWorkflowTemplateRequest request =
        InstantiateInlineWorkflowTemplateRequest.newBuilder()
            .setParent(parent)
            .setTemplate(template)
            .build();
    return instantiateInlineWorkflowTemplateAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Instantiates a template and begins execution.
   *
   * <p>This method is equivalent to executing the sequence
   * [CreateWorkflowTemplate][google.cloud.dataproc.v1beta2.WorkflowTemplateService.CreateWorkflowTemplate],
   * [InstantiateWorkflowTemplate][google.cloud.dataproc.v1beta2.WorkflowTemplateService.InstantiateWorkflowTemplate],
   * [DeleteWorkflowTemplate][google.cloud.dataproc.v1beta2.WorkflowTemplateService.DeleteWorkflowTemplate].
   *
   * <p>The returned Operation can be used to track execution of workflow by polling
   * [operations.get][google.longrunning.Operations.GetOperation]. The Operation will complete when
   * entire workflow is finished.
   *
   * <p>The running workflow can be aborted via
   * [operations.cancel][google.longrunning.Operations.CancelOperation]. This will cause any
   * inflight jobs to be cancelled and workflow-owned clusters to be deleted.
   *
   * <p>The [Operation.metadata][google.longrunning.Operation.metadata] will be
   * [WorkflowMetadata][google.cloud.dataproc.v1beta2.WorkflowMetadata].
   *
   * <p>On successful completion, [Operation.response][google.longrunning.Operation.response] will
   * be [Empty][google.protobuf.Empty].
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
   *   RegionName parent = RegionName.of("[PROJECT]", "[REGION]");
   *   WorkflowTemplate template = WorkflowTemplate.newBuilder().build();
   *   InstantiateInlineWorkflowTemplateRequest request = InstantiateInlineWorkflowTemplateRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .setTemplate(template)
   *     .build();
   *   workflowTemplateServiceClient.instantiateInlineWorkflowTemplateAsync(request).get();
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public final OperationFuture<Empty, WorkflowMetadata> instantiateInlineWorkflowTemplateAsync(
      InstantiateInlineWorkflowTemplateRequest request) {
    return instantiateInlineWorkflowTemplateOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Instantiates a template and begins execution.
   *
   * <p>This method is equivalent to executing the sequence
   * [CreateWorkflowTemplate][google.cloud.dataproc.v1beta2.WorkflowTemplateService.CreateWorkflowTemplate],
   * [InstantiateWorkflowTemplate][google.cloud.dataproc.v1beta2.WorkflowTemplateService.InstantiateWorkflowTemplate],
   * [DeleteWorkflowTemplate][google.cloud.dataproc.v1beta2.WorkflowTemplateService.DeleteWorkflowTemplate].
   *
   * <p>The returned Operation can be used to track execution of workflow by polling
   * [operations.get][google.longrunning.Operations.GetOperation]. The Operation will complete when
   * entire workflow is finished.
   *
   * <p>The running workflow can be aborted via
   * [operations.cancel][google.longrunning.Operations.CancelOperation]. This will cause any
   * inflight jobs to be cancelled and workflow-owned clusters to be deleted.
   *
   * <p>The [Operation.metadata][google.longrunning.Operation.metadata] will be
   * [WorkflowMetadata][google.cloud.dataproc.v1beta2.WorkflowMetadata].
   *
   * <p>On successful completion, [Operation.response][google.longrunning.Operation.response] will
   * be [Empty][google.protobuf.Empty].
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
   *   RegionName parent = RegionName.of("[PROJECT]", "[REGION]");
   *   WorkflowTemplate template = WorkflowTemplate.newBuilder().build();
   *   InstantiateInlineWorkflowTemplateRequest request = InstantiateInlineWorkflowTemplateRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .setTemplate(template)
   *     .build();
   *   OperationFuture&lt;Empty, WorkflowMetadata&gt; future = workflowTemplateServiceClient.instantiateInlineWorkflowTemplateOperationCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public final OperationCallable<InstantiateInlineWorkflowTemplateRequest, Empty, WorkflowMetadata>
      instantiateInlineWorkflowTemplateOperationCallable() {
    return stub.instantiateInlineWorkflowTemplateOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Instantiates a template and begins execution.
   *
   * <p>This method is equivalent to executing the sequence
   * [CreateWorkflowTemplate][google.cloud.dataproc.v1beta2.WorkflowTemplateService.CreateWorkflowTemplate],
   * [InstantiateWorkflowTemplate][google.cloud.dataproc.v1beta2.WorkflowTemplateService.InstantiateWorkflowTemplate],
   * [DeleteWorkflowTemplate][google.cloud.dataproc.v1beta2.WorkflowTemplateService.DeleteWorkflowTemplate].
   *
   * <p>The returned Operation can be used to track execution of workflow by polling
   * [operations.get][google.longrunning.Operations.GetOperation]. The Operation will complete when
   * entire workflow is finished.
   *
   * <p>The running workflow can be aborted via
   * [operations.cancel][google.longrunning.Operations.CancelOperation]. This will cause any
   * inflight jobs to be cancelled and workflow-owned clusters to be deleted.
   *
   * <p>The [Operation.metadata][google.longrunning.Operation.metadata] will be
   * [WorkflowMetadata][google.cloud.dataproc.v1beta2.WorkflowMetadata].
   *
   * <p>On successful completion, [Operation.response][google.longrunning.Operation.response] will
   * be [Empty][google.protobuf.Empty].
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
   *   RegionName parent = RegionName.of("[PROJECT]", "[REGION]");
   *   WorkflowTemplate template = WorkflowTemplate.newBuilder().build();
   *   InstantiateInlineWorkflowTemplateRequest request = InstantiateInlineWorkflowTemplateRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .setTemplate(template)
   *     .build();
   *   ApiFuture&lt;Operation&gt; future = workflowTemplateServiceClient.instantiateInlineWorkflowTemplateCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<InstantiateInlineWorkflowTemplateRequest, Operation>
      instantiateInlineWorkflowTemplateCallable() {
    return stub.instantiateInlineWorkflowTemplateCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates (replaces) workflow template. The updated template must contain version that matches
   * the current server version.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
   *   WorkflowTemplate template = WorkflowTemplate.newBuilder().build();
   *   WorkflowTemplate response = workflowTemplateServiceClient.updateWorkflowTemplate(template);
   * }
   * </code></pre>
   *
   * @param template Required. The updated workflow template.
   *     <p>The `template.version` field must match the current version.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final WorkflowTemplate updateWorkflowTemplate(WorkflowTemplate template) {

    UpdateWorkflowTemplateRequest request =
        UpdateWorkflowTemplateRequest.newBuilder().setTemplate(template).build();
    return updateWorkflowTemplate(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates (replaces) workflow template. The updated template must contain version that matches
   * the current server version.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
   *   WorkflowTemplate template = WorkflowTemplate.newBuilder().build();
   *   UpdateWorkflowTemplateRequest request = UpdateWorkflowTemplateRequest.newBuilder()
   *     .setTemplate(template)
   *     .build();
   *   WorkflowTemplate response = workflowTemplateServiceClient.updateWorkflowTemplate(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final WorkflowTemplate updateWorkflowTemplate(UpdateWorkflowTemplateRequest request) {
    return updateWorkflowTemplateCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Updates (replaces) workflow template. The updated template must contain version that matches
   * the current server version.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
   *   WorkflowTemplate template = WorkflowTemplate.newBuilder().build();
   *   UpdateWorkflowTemplateRequest request = UpdateWorkflowTemplateRequest.newBuilder()
   *     .setTemplate(template)
   *     .build();
   *   ApiFuture&lt;WorkflowTemplate&gt; future = workflowTemplateServiceClient.updateWorkflowTemplateCallable().futureCall(request);
   *   // Do something
   *   WorkflowTemplate response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<UpdateWorkflowTemplateRequest, WorkflowTemplate>
      updateWorkflowTemplateCallable() {
    return stub.updateWorkflowTemplateCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists workflows that match the specified filter in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
   *   RegionName parent = RegionName.of("[PROJECT]", "[REGION]");
   *   for (WorkflowTemplate element : workflowTemplateServiceClient.listWorkflowTemplates(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param parent Required. The "resource name" of the region, as described in
   *     https://cloud.google.com/apis/design/resource_names of the form
   *     `projects/{project_id}/regions/{region}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListWorkflowTemplatesPagedResponse listWorkflowTemplates(RegionName parent) {
    ListWorkflowTemplatesRequest request =
        ListWorkflowTemplatesRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listWorkflowTemplates(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists workflows that match the specified filter in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
   *   RegionName parent = RegionName.of("[PROJECT]", "[REGION]");
   *   for (WorkflowTemplate element : workflowTemplateServiceClient.listWorkflowTemplates(parent.toString()).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param parent Required. The "resource name" of the region, as described in
   *     https://cloud.google.com/apis/design/resource_names of the form
   *     `projects/{project_id}/regions/{region}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListWorkflowTemplatesPagedResponse listWorkflowTemplates(String parent) {
    ListWorkflowTemplatesRequest request =
        ListWorkflowTemplatesRequest.newBuilder().setParent(parent).build();
    return listWorkflowTemplates(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists workflows that match the specified filter in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
   *   RegionName parent = RegionName.of("[PROJECT]", "[REGION]");
   *   ListWorkflowTemplatesRequest request = ListWorkflowTemplatesRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   for (WorkflowTemplate element : workflowTemplateServiceClient.listWorkflowTemplates(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListWorkflowTemplatesPagedResponse listWorkflowTemplates(
      ListWorkflowTemplatesRequest request) {
    return listWorkflowTemplatesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists workflows that match the specified filter in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
   *   RegionName parent = RegionName.of("[PROJECT]", "[REGION]");
   *   ListWorkflowTemplatesRequest request = ListWorkflowTemplatesRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   ApiFuture&lt;ListWorkflowTemplatesPagedResponse&gt; future = workflowTemplateServiceClient.listWorkflowTemplatesPagedCallable().futureCall(request);
   *   // Do something
   *   for (WorkflowTemplate element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListWorkflowTemplatesRequest, ListWorkflowTemplatesPagedResponse>
      listWorkflowTemplatesPagedCallable() {
    return stub.listWorkflowTemplatesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Lists workflows that match the specified filter in the request.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
   *   RegionName parent = RegionName.of("[PROJECT]", "[REGION]");
   *   ListWorkflowTemplatesRequest request = ListWorkflowTemplatesRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   while (true) {
   *     ListWorkflowTemplatesResponse response = workflowTemplateServiceClient.listWorkflowTemplatesCallable().call(request);
   *     for (WorkflowTemplate element : response.getTemplatesList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListWorkflowTemplatesRequest, ListWorkflowTemplatesResponse>
      listWorkflowTemplatesCallable() {
    return stub.listWorkflowTemplatesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a workflow template. It does not cancel in-progress workflows.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
   *   WorkflowTemplateName name = WorkflowTemplateName.of("[PROJECT]", "[REGION]", "[WORKFLOW_TEMPLATE]");
   *   workflowTemplateServiceClient.deleteWorkflowTemplate(name);
   * }
   * </code></pre>
   *
   * @param name Required. The "resource name" of the workflow template, as described in
   *     https://cloud.google.com/apis/design/resource_names of the form
   *     `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteWorkflowTemplate(WorkflowTemplateName name) {

    DeleteWorkflowTemplateRequest request =
        DeleteWorkflowTemplateRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    deleteWorkflowTemplate(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a workflow template. It does not cancel in-progress workflows.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
   *   WorkflowTemplateName name = WorkflowTemplateName.of("[PROJECT]", "[REGION]", "[WORKFLOW_TEMPLATE]");
   *   workflowTemplateServiceClient.deleteWorkflowTemplate(name.toString());
   * }
   * </code></pre>
   *
   * @param name Required. The "resource name" of the workflow template, as described in
   *     https://cloud.google.com/apis/design/resource_names of the form
   *     `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}`
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteWorkflowTemplate(String name) {

    DeleteWorkflowTemplateRequest request =
        DeleteWorkflowTemplateRequest.newBuilder().setName(name).build();
    deleteWorkflowTemplate(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a workflow template. It does not cancel in-progress workflows.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
   *   WorkflowTemplateName name = WorkflowTemplateName.of("[PROJECT]", "[REGION]", "[WORKFLOW_TEMPLATE]");
   *   DeleteWorkflowTemplateRequest request = DeleteWorkflowTemplateRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   workflowTemplateServiceClient.deleteWorkflowTemplate(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteWorkflowTemplate(DeleteWorkflowTemplateRequest request) {
    deleteWorkflowTemplateCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Deletes a workflow template. It does not cancel in-progress workflows.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (WorkflowTemplateServiceClient workflowTemplateServiceClient = WorkflowTemplateServiceClient.create()) {
   *   WorkflowTemplateName name = WorkflowTemplateName.of("[PROJECT]", "[REGION]", "[WORKFLOW_TEMPLATE]");
   *   DeleteWorkflowTemplateRequest request = DeleteWorkflowTemplateRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   ApiFuture&lt;Void&gt; future = workflowTemplateServiceClient.deleteWorkflowTemplateCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<DeleteWorkflowTemplateRequest, Empty>
      deleteWorkflowTemplateCallable() {
    return stub.deleteWorkflowTemplateCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }

  public static class ListWorkflowTemplatesPagedResponse
      extends AbstractPagedListResponse<
          ListWorkflowTemplatesRequest,
          ListWorkflowTemplatesResponse,
          WorkflowTemplate,
          ListWorkflowTemplatesPage,
          ListWorkflowTemplatesFixedSizeCollection> {

    public static ApiFuture<ListWorkflowTemplatesPagedResponse> createAsync(
        PageContext<ListWorkflowTemplatesRequest, ListWorkflowTemplatesResponse, WorkflowTemplate>
            context,
        ApiFuture<ListWorkflowTemplatesResponse> futureResponse) {
      ApiFuture<ListWorkflowTemplatesPage> futurePage =
          ListWorkflowTemplatesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListWorkflowTemplatesPage, ListWorkflowTemplatesPagedResponse>() {
            @Override
            public ListWorkflowTemplatesPagedResponse apply(ListWorkflowTemplatesPage input) {
              return new ListWorkflowTemplatesPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListWorkflowTemplatesPagedResponse(ListWorkflowTemplatesPage page) {
      super(page, ListWorkflowTemplatesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListWorkflowTemplatesPage
      extends AbstractPage<
          ListWorkflowTemplatesRequest,
          ListWorkflowTemplatesResponse,
          WorkflowTemplate,
          ListWorkflowTemplatesPage> {

    private ListWorkflowTemplatesPage(
        PageContext<ListWorkflowTemplatesRequest, ListWorkflowTemplatesResponse, WorkflowTemplate>
            context,
        ListWorkflowTemplatesResponse response) {
      super(context, response);
    }

    private static ListWorkflowTemplatesPage createEmptyPage() {
      return new ListWorkflowTemplatesPage(null, null);
    }

    @Override
    protected ListWorkflowTemplatesPage createPage(
        PageContext<ListWorkflowTemplatesRequest, ListWorkflowTemplatesResponse, WorkflowTemplate>
            context,
        ListWorkflowTemplatesResponse response) {
      return new ListWorkflowTemplatesPage(context, response);
    }

    @Override
    public ApiFuture<ListWorkflowTemplatesPage> createPageAsync(
        PageContext<ListWorkflowTemplatesRequest, ListWorkflowTemplatesResponse, WorkflowTemplate>
            context,
        ApiFuture<ListWorkflowTemplatesResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListWorkflowTemplatesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListWorkflowTemplatesRequest,
          ListWorkflowTemplatesResponse,
          WorkflowTemplate,
          ListWorkflowTemplatesPage,
          ListWorkflowTemplatesFixedSizeCollection> {

    private ListWorkflowTemplatesFixedSizeCollection(
        List<ListWorkflowTemplatesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListWorkflowTemplatesFixedSizeCollection createEmptyCollection() {
      return new ListWorkflowTemplatesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListWorkflowTemplatesFixedSizeCollection createCollection(
        List<ListWorkflowTemplatesPage> pages, int collectionSize) {
      return new ListWorkflowTemplatesFixedSizeCollection(pages, collectionSize);
    }
  }
}
