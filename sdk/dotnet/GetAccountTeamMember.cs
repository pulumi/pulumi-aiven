// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aiven
{
    public static partial class Invokes
    {
        public static Task<GetAccountTeamMemberResult> GetAccountTeamMember(GetAccountTeamMemberArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetAccountTeamMemberResult>("aiven:index/getAccountTeamMember:getAccountTeamMember", args ?? ResourceArgs.Empty, options.WithVersion());
    }

    public sealed class GetAccountTeamMemberArgs : Pulumi.ResourceArgs
    {
        [Input("accepted")]
        public Input<bool>? Accepted { get; set; }

        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        [Input("invitedByUserEmail")]
        public Input<string>? InvitedByUserEmail { get; set; }

        [Input("teamId", required: true)]
        public Input<string> TeamId { get; set; } = null!;

        [Input("userEmail", required: true)]
        public Input<string> UserEmail { get; set; } = null!;

        public GetAccountTeamMemberArgs()
        {
        }
    }

    [OutputType]
    public sealed class GetAccountTeamMemberResult
    {
        public readonly bool Accepted;
        public readonly string AccountId;
        public readonly string CreateTime;
        public readonly string InvitedByUserEmail;
        public readonly string TeamId;
        public readonly string UserEmail;
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetAccountTeamMemberResult(
            bool accepted,
            string accountId,
            string createTime,
            string invitedByUserEmail,
            string teamId,
            string userEmail,
            string id)
        {
            Accepted = accepted;
            AccountId = accountId;
            CreateTime = createTime;
            InvitedByUserEmail = invitedByUserEmail;
            TeamId = teamId;
            UserEmail = userEmail;
            Id = id;
        }
    }
}