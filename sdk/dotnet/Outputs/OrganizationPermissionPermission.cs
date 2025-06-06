// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven.Outputs
{

    [OutputType]
    public sealed class OrganizationPermissionPermission
    {
        /// <summary>
        /// Time created.
        /// </summary>
        public readonly string? CreateTime;
        /// <summary>
        /// List of [roles and permissions](https://aiven.io/docs/platform/concepts/permissions) to grant. The possible values are `admin`, `developer`, `operator`, `organization:app_users:write`, `organization:audit_logs:read`, `organization:billing:read`, `organization:billing:write`, `organization:domains:write`, `organization:groups:write`, `organization:idps:write`, `organization:networking:read`, `organization:networking:write`, `organization:projects:write`, `organization:users:write`, `project:audit_logs:read`, `project:integrations:read`, `project:integrations:write`, `project:networking:read`, `project:networking:write`, `project:permissions:read`, `project:services:read`, `project:services:write`, `read_only`, `role:organization:admin`, `role:services:maintenance`, `role:services:recover`, `service:configuration:write`, `service:data:write`, `service:logs:read`, `service:secrets:read` and `service:users:write`.
        /// </summary>
        public readonly ImmutableArray<string> Permissions;
        /// <summary>
        /// ID of the user or group to grant permissions to. Only active users who have accepted an [invite](https://aiven.io/docs/platform/howto/manage-org-users) to join the organization can be granted permissions.
        /// </summary>
        public readonly string PrincipalId;
        /// <summary>
        /// The type of principal. The possible values are `user` and `user_group`.
        /// </summary>
        public readonly string PrincipalType;
        /// <summary>
        /// Time updated.
        /// </summary>
        public readonly string? UpdateTime;

        [OutputConstructor]
        private OrganizationPermissionPermission(
            string? createTime,

            ImmutableArray<string> permissions,

            string principalId,

            string principalType,

            string? updateTime)
        {
            CreateTime = createTime;
            Permissions = permissions;
            PrincipalId = principalId;
            PrincipalType = principalType;
            UpdateTime = updateTime;
        }
    }
}
