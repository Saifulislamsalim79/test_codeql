package ai.kudi.agent.core.analytics;

import ai.kudi.agent.core.analytics.EventType;
import ai.kudi.agent.core.analytics.VoucherEventType;
import ai.kudi.agent.core.analytics.contracts.AnnouncementAnalytics;
import ai.kudi.agent.core.analytics.contracts.HomeAnalytics;
import ai.kudi.agent.core.analytics.contracts.IssueResolutionAnalytics;
import ai.kudi.agent.core.analytics.contracts.KShockAnalytics;
import ai.kudi.agent.core.analytics.contracts.LoginAnalytics;
import ai.kudi.agent.core.analytics.contracts.MarketplaceAnalytics;
import ai.kudi.agent.core.analytics.contracts.OnboardingAnalytics;
import ai.kudi.agent.core.analytics.contracts.OutletMgtAnalytics;
import ai.kudi.agent.core.analytics.contracts.ReferralAnalytics;
import ai.kudi.agent.core.analytics.contracts.SavingsAnalytics;
import ai.kudi.agent.core.analytics.contracts.SettingsAnalytics;
import ai.kudi.agent.core.analytics.contracts.TransactionsCommissionsAnalytics;
import ai.kudi.agent.core.analytics.contracts.TransferToBankAnalytics;
import ai.kudi.agent.core.analytics.contracts.TransferToMultipleBanksAnalytics;
import ai.kudi.agent.core.analytics.contracts.WalletTopUpAnalytics;
import ai.kudi.agent.core.analytics.contracts.WithdrawalAnalytics;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.core.util.ManageDevice;
import ai.kudi.agent.kshock.p009ui.views.KshockPendingLoansListFragment;
import ai.kudi.agent.register.p022v2.p023ui.PhoneFragment;
import ai.kudi.agent.transactions.p032ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.users.domain.package_1.User;
import ai.kudi.agent.wallettopup.data.BanksWithMethods;
import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.views.holder.AttributeType;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: FirebaseAnalyticsImpl.kt */
@Metadata(m10422d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\bM\n\u0002\u0010\u0006\n\u0002\b~\u0018\u0000 \u0099\u00022\u00020\u0001:\u0002\u0099\u0002B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J*\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0016J2\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u0015\u001a\u00020\nH\u0016J\u001a\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u0018\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\fH\u0016J\b\u0010\u001d\u001a\u00020\u0019H\u0002J\b\u0010\u001e\u001a\u00020\nH\u0016J\b\u0010\u001f\u001a\u00020\nH\u0016J\u0010\u0010 \u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\fH\u0016J\"\u0010!\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\fH\u0016J\u001c\u0010$\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\f2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0019H\u0002J\u0018\u0010&\u001a\u00020\n2\u0006\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020\fH\u0016J\u0018\u0010)\u001a\u00020\n2\u0006\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020\fH\u0016JD\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\f2\u0006\u0010-\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010.\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0018\u00101\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u00102\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u00103\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u00104\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u0010\u00105\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u0018\u00106\u001a\u00020\n2\u0006\u00107\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u0010\u00108\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0016J0\u00109\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010:\u001a\u00020\f2\u0006\u0010;\u001a\u00020\f2\u0006\u0010<\u001a\u00020\f2\u0006\u0010=\u001a\u00020\fH\u0016J\u0018\u0010>\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010?\u001a\u00020\n2\u0006\u0010@\u001a\u00020\f2\u0006\u0010A\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\"\u0010B\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010C\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0010\u0010D\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u0010\u0010E\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0016J*\u0010F\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010G\u001a\u00020\n2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0010\u0010H\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0016J\"\u0010I\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0016J\u0018\u0010I\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010J\u001a\u00020\fH\u0016J\u0018\u0010K\u001a\u00020\n2\u0006\u0010L\u001a\u00020\f2\u0006\u0010M\u001a\u00020NH\u0016J\u0018\u0010O\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010P\u001a\u00020NH\u0016J\u0018\u0010Q\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010R\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010S\u001a\u00020\f2\u0006\u0010T\u001a\u00020\fH\u0016J\u0018\u0010U\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010V\u001a\u00020\fH\u0016J\u0018\u0010W\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0018\u0010X\u001a\u00020\n2\u0006\u0010@\u001a\u00020\f2\u0006\u0010Y\u001a\u00020\fH\u0016J\u001a\u0010Z\u001a\u00020\n2\u0006\u0010[\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\\\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010]\u001a\u00020\n2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0010\u0010^\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u0010\u0010_\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010`\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010a\u001a\u00020\nH\u0016J\u0012\u0010b\u001a\u00020\n2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u0010c\u001a\u00020\nH\u0016J\u0010\u0010d\u001a\u00020\n2\u0006\u0010@\u001a\u00020\fH\u0016J\u0010\u0010e\u001a\u00020\n2\u0006\u0010@\u001a\u00020\fH\u0016J\u0010\u0010f\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u0010\u0010g\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u0010\u0010h\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u0018\u0010i\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010j\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u001a\u0010k\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010l\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010m\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010n\u001a\u00020NH\u0016J \u0010o\u001a\u00020\n2\u0006\u0010@\u001a\u00020\f2\u0006\u0010A\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010p\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J*\u0010q\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010s\u001a\u00020\n2\u0006\u0010t\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0010\u0010u\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010v\u001a\u00020\nH\u0016J\b\u0010w\u001a\u00020\nH\u0016JP\u0010x\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010y\u001a\u00020\f2\u0006\u0010z\u001a\u00020\f2\u0006\u0010V\u001a\u00020\f2\u0006\u0010{\u001a\u00020\f2\u0006\u0010|\u001a\u00020\f2\u0006\u0010}\u001a\u00020\f2\u0006\u0010~\u001a\u00020\f2\u0006\u0010\u007f\u001a\u00020\fH\u0016J\t\u0010\u0080\u0001\u001a\u00020\nH\u0016J\u0011\u0010\u0081\u0001\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u001a\u0010\u0082\u0001\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0007\u0010\u0083\u0001\u001a\u00020\fH\u0016J#\u0010\u0084\u0001\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0016J\u0011\u0010\u0085\u0001\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u0011\u0010\u0086\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\t\u0010\u0087\u0001\u001a\u00020\nH\u0016J-\u0010\u0088\u0001\u001a\u00020\n2\u0006\u0010t\u001a\u00020\f2\u0007\u0010\u0089\u0001\u001a\u00020\f2\u0007\u0010\u008a\u0001\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J-\u0010\u008b\u0001\u001a\u00020\n2\u0006\u0010t\u001a\u00020\f2\u0007\u0010\u0089\u0001\u001a\u00020\f2\u0007\u0010\u008a\u0001\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0011\u0010\u008c\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0011\u0010\u008d\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0011\u0010\u008e\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001a\u0010\u008f\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0007\u0010\u0090\u0001\u001a\u00020NH\u0016J\u0011\u0010\u0091\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J-\u0010\u0092\u0001\u001a\u00020\n2\u0006\u0010t\u001a\u00020\f2\u0007\u0010\u0093\u0001\u001a\u00020\f2\u0007\u0010\u0094\u0001\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0011\u0010\u0095\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J!\u0010\u0096\u0001\u001a\u00020\n2\u0006\u0010'\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0011\u0010\u0097\u0001\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u0011\u0010\u0098\u0001\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u0019\u0010\u0099\u0001\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0011\u0010\u009a\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001b\u0010\u009b\u0001\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\b\u0010\u008a\u0001\u001a\u00030\u009c\u0001H\u0016J\u0011\u0010\u009d\u0001\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u001a\u0010\u009e\u0001\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0007\u0010\u009f\u0001\u001a\u00020\fH\u0016J\u0011\u0010 \u0001\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u0011\u0010¡\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0011\u0010¢\u0001\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u0011\u0010£\u0001\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0016J#\u0010¤\u0001\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0016J\u0011\u0010¥\u0001\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0016J6\u0010¦\u0001\u001a\u00020\n2\u0006\u0010t\u001a\u00020\f2\u0007\u0010\u008a\u0001\u001a\u00020\f2\u0007\u0010§\u0001\u001a\u00020\f2\u0007\u0010¨\u0001\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\t\u0010©\u0001\u001a\u00020\nH\u0016J\u001c\u0010ª\u0001\u001a\u00020\n2\u0007\u0010«\u0001\u001a\u00020N2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u001c\u0010¬\u0001\u001a\u00020\n2\u0007\u0010«\u0001\u001a\u00020N2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u001a\u0010\u00ad\u0001\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\f2\u0007\u0010®\u0001\u001a\u00020NH\u0016J\u0019\u0010¯\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\t\u0010°\u0001\u001a\u00020\nH\u0016J\u001a\u0010±\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0007\u0010²\u0001\u001a\u00020\fH\u0016J,\u0010³\u0001\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0007\u0010´\u0001\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0016J#\u0010µ\u0001\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0016J\u0011\u0010¶\u0001\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0016J#\u0010·\u0001\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0016J!\u0010¸\u0001\u001a\u00020\n2\u0006\u0010@\u001a\u00020\f2\u0006\u0010A\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0011\u0010¹\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J-\u0010º\u0001\u001a\u00020\n2\u0007\u0010¨\u0001\u001a\u00020\f2\u0006\u0010t\u001a\u00020\f2\u0007\u0010\u008a\u0001\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0019\u0010»\u0001\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0019\u0010¼\u0001\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0019\u0010½\u0001\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\t\u0010¾\u0001\u001a\u00020\nH\u0016J\u0012\u0010¿\u0001\u001a\u00020\n2\u0007\u0010À\u0001\u001a\u00020\fH\u0016J\t\u0010Á\u0001\u001a\u00020\nH\u0016J\t\u0010Â\u0001\u001a\u00020\nH\u0016J\t\u0010Ã\u0001\u001a\u00020\nH\u0016J\u0011\u0010Ä\u0001\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u0011\u0010Å\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0011\u0010Æ\u0001\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u0019\u0010Ç\u0001\u001a\u00020\n2\u0006\u0010@\u001a\u00020\f2\u0006\u0010Y\u001a\u00020\fH\u0016J\u0013\u0010È\u0001\u001a\u00020\n2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J#\u0010É\u0001\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0016J\u0011\u0010Ê\u0001\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0016J\t\u0010Ë\u0001\u001a\u00020\nH\u0016J\u0011\u0010Ì\u0001\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u001a\u0010Í\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0007\u0010Î\u0001\u001a\u00020\fH\u0016J\t\u0010Ï\u0001\u001a\u00020\nH\u0016J#\u0010Ð\u0001\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0016J\u0011\u0010Ñ\u0001\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u0019\u0010Ò\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J#\u0010Ó\u0001\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0016J\u0019\u0010Ô\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0019\u0010Õ\u0001\u001a\u00020\n2\u0006\u0010@\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\t\u0010Ö\u0001\u001a\u00020\nH\u0016J\u0013\u0010×\u0001\u001a\u00020\n2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J?\u0010Ø\u0001\u001a\u00020\n2\u0006\u0010t\u001a\u00020\f2\u0007\u0010\u008a\u0001\u001a\u00020\f2\u0007\u0010¨\u0001\u001a\u00020\f2\u0007\u0010Ù\u0001\u001a\u00020\f2\u0007\u0010Ú\u0001\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0013\u0010Û\u0001\u001a\u00020\n2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J-\u0010Ü\u0001\u001a\u00020\n2\u0006\u0010t\u001a\u00020\f2\u0007\u0010Ý\u0001\u001a\u00020\f2\u0007\u0010Þ\u0001\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J?\u0010ß\u0001\u001a\u00020\n2\u0006\u0010t\u001a\u00020\f2\u0007\u0010\u008a\u0001\u001a\u00020\f2\u0007\u0010¨\u0001\u001a\u00020\f2\u0007\u0010Ù\u0001\u001a\u00020\f2\u0007\u0010Ú\u0001\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J?\u0010à\u0001\u001a\u00020\n2\u0006\u0010t\u001a\u00020\f2\u0007\u0010\u008a\u0001\u001a\u00020\f2\u0007\u0010¨\u0001\u001a\u00020\f2\u0007\u0010Ù\u0001\u001a\u00020\f2\u0007\u0010Ú\u0001\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J?\u0010á\u0001\u001a\u00020\n2\u0006\u0010t\u001a\u00020\f2\u0007\u0010\u008a\u0001\u001a\u00020\f2\u0007\u0010¨\u0001\u001a\u00020\f2\u0007\u0010Ù\u0001\u001a\u00020\f2\u0007\u0010Ú\u0001\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u001b\u0010â\u0001\u001a\u00020\n2\u0006\u0010t\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0011\u0010ã\u0001\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0016JG\u0010ä\u0001\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0007\u0010å\u0001\u001a\u00020\f2\u0007\u0010æ\u0001\u001a\u00020\f2\u0007\u0010ç\u0001\u001a\u00020\f2\u0007\u0010è\u0001\u001a\u00020\f2\u0007\u0010é\u0001\u001a\u00020\f2\u0007\u0010§\u0001\u001a\u00020\fH\u0016J\u0019\u0010ê\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0019\u0010ë\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0011\u0010ì\u0001\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u0011\u0010í\u0001\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u0019\u0010î\u0001\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0019\u0010ï\u0001\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0011\u0010ð\u0001\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u0011\u0010ñ\u0001\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u0011\u0010ò\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0019\u0010ó\u0001\u001a\u00020\n2\u0006\u0010@\u001a\u00020\f2\u0006\u0010A\u001a\u00020\fH\u0016J\u0019\u0010ô\u0001\u001a\u00020\n2\u0006\u0010@\u001a\u00020\f2\u0006\u0010A\u001a\u00020\fH\u0016J\u0019\u0010õ\u0001\u001a\u00020\n2\u0006\u0010@\u001a\u00020\f2\u0006\u0010Y\u001a\u00020\fH\u0016J\u0011\u0010ö\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J$\u0010÷\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0007\u0010\u008a\u0001\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J.\u0010ø\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u000f2\t\u0010ù\u0001\u001a\u0004\u0018\u00010\f2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J/\u0010ú\u0001\u001a\u00020\n2\u0006\u0010+\u001a\u00020\u000f2\u0007\u0010¨\u0001\u001a\u00020\f2\t\u0010ù\u0001\u001a\u0004\u0018\u00010\f2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J/\u0010û\u0001\u001a\u00020\n2\u0007\u0010ü\u0001\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u000f2\t\u0010ù\u0001\u001a\u0004\u0018\u00010\f2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J.\u0010ý\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u000f2\t\u0010ù\u0001\u001a\u0004\u0018\u00010\f2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J.\u0010þ\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u000f2\t\u0010ù\u0001\u001a\u0004\u0018\u00010\f2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J#\u0010ÿ\u0001\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010C\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J/\u0010\u0080\u0002\u001a\u00020\n2\u0006\u0010+\u001a\u00020\u000f2\u0007\u0010\u0081\u0002\u001a\u00020\f2\t\u0010ù\u0001\u001a\u0004\u0018\u00010\f2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J#\u0010\u0082\u0002\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010C\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0011\u0010\u0083\u0002\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u0012\u0010\u0084\u0002\u001a\u00020\n2\u0007\u0010\u008a\u0001\u001a\u00020\fH\u0016J\u0011\u0010\u0085\u0002\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\fH\u0016J\t\u0010\u0086\u0002\u001a\u00020\nH\u0016J+\u0010\u0087\u0002\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0016J+\u0010\u0088\u0002\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0016J3\u0010\u0089\u0002\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0016J#\u0010\u008a\u0002\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0016J\u0019\u0010\u008b\u0002\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J+\u0010\u008c\u0002\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0014\u001a\u00020\fH\u0016J+\u0010\u008d\u0002\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u0011\u0010\u008e\u0002\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\u008f\u0002\u001a\u00020\n2\u0007\u0010\u0083\u0001\u001a\u00020\fH\u0016J\u0012\u0010\u0090\u0002\u001a\u00020\n2\u0007\u0010\u0091\u0002\u001a\u00020\fH\u0016J\u001b\u0010\u0092\u0002\u001a\u00020\n2\b\u0010/\u001a\u0004\u0018\u0001002\u0006\u0010.\u001a\u00020\fH\u0002J\u0011\u0010\u0093\u0002\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u0019\u0010\u0094\u0002\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\fH\u0016J+\u0010\u0095\u0002\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0016J#\u0010\u0096\u0002\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0016J+\u0010\u0097\u0002\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0016J-\u0010\u0098\u0002\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u008a\u0001\u001a\u00030\u009c\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u009a\u0002"}, m10421d2 = {"Lai/kudi/agent/core/analytics/FirebaseAnalyticsImpl;", "Lai/kudi/agent/core/analytics/Analytics;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "fireBaseAnalytics", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "buzzReferredAgentClicked", "", "phoneNumber", "", "referredPhoneNumber", TransactionField.STATUS, "", "errorMessage", "bvnVerification", AttributeType.PHONE, PhoneFragment.ARG_BVN, "userType", "createAccountClicked", "debugLog", "event", "properties", "Landroid/os/Bundle;", "enableFingerPrintClicked", "enterPinInitiated", "fundWalletOnWelcomeScreenClicked", "getBundle", "launchCreateSavingScreen", "launchWithdrawScreen", "learnMoreAboutBVN", "listOfReferredAgentsClicked", "lockOptionSelected", "lock", "logEvent", "paramBundle", "logKYCFormWasNotHelpfulClicked", "issueType", "issueDescription", "logKYcFormWasHelpfulClicked", "loginEvent", "isSuccessful", "deviceName", "deviceId", "appVersionName", "user", "Lai/kudi/agent/users/domain/dto/User;", "makePaymentInitiated", "marketPlaceMenuNavClicked", "marketPlaceProductClicked", "onAboutKycLevelClick", "onAccountPageOpen", "onActivateTerminalButtonClick", "terminalDetails", "onAddEmployeeButtonClicked", "onAddNewAccountButtonClick", "acctNumber", "acctName", "bank", "purpose", "onAddOutletClicked", "onAddOutletFormClicked", "userPhoneNumber", "outletPhoneNumber", "onAgentCreation", "name", "onAgentHavingPendingKyc", "onAgentKycCompleted", "onAgentReferralCreation", "onAgentReferralInfoEvent", "onAirtimeOrDataMenuClick", "onAmountEntered", KshockPendingLoansListFragment.KEY_MAX_LOAN_AMT, "onAnnouncementClicked", Part.LEGACY_ANNOUNCEMENT_STYLE, "id", "", "onAttachmentAdded", "count", "onBankSelected", "onBillerMenuClick", "billerName", "lookupId", "onBiometricsOptionToggle", SendReceiptToTerminalConfirmationBottomSheet.STATE, "onBuyPosButtonClick", "onBuzzAgentClicked", "outletId", "onCallSupportClicked", "screen", "onCallUsClicked", "onCallUsEvent", "onCancelCommissionsCashout", "onCardPageVisited", "onCheckAppBuildClicked", "onClickExitApp", "onClickFAQ", "onClickGoToPlaystore", "onClickOutletPinReset", "onClickOutletSecurity", "onCommissionOptions", "onCommissionPage", "onCommissionsCashout", "onConfirmCommissionsCashout", "onConfirmMultipleTransfers", "onConfirmWithdraw", "onContactUsReached", "onContinueMultipleTransfer", "numberOfTransfers", "onCreateOutletClicked", "onCreateSavingsClicked", "onCustomerInfoEntered", "transactionNote", "onDashboardEvent", "type", "onDeactivateSavingsClicked", "onEditAccountDetailsClicked", "onEditAmountClicked", "onEditButtonClick", "businessName", "businessAddress", "lga", "email", "dob", "homeAddress", "closestLandmark", "onEditCustomerInfoClicked", "onEditPhoneNumberClicked", "onFilterCommissions", AttributeType.DATE, "onFinalTransferPerformed", "onFundWalletClick", "onFundWalletClicked", "onGetStartedClicked", "onHelpNosButtonClickedEvent", "option", TransactionField.AMOUNT, "onHelpYesButtonClickedEvent", "onIssueHistoryClicked", "onIssueHistoryFilterClicked", "onIssueHistorySelected", "onIssueRated", "rating", "onIssueStatusCheckClicked", "onIssueSubmitButtonClickedEvent", "comment", "issueTitle", "onIssueSummaryPageReached", "onIssueTypeClicked", "onKShockLanding", "onKShockPinEntered", "onKShockTermsAndCondition", "onKtaPageVisited", "onLoanAmountEntered", "", "onLoanApplicationSubmitted", "onLoanStatus", "loanStatus", "onLoanSummary", "onLoginClicked", "onMultipleTransferClicked", "onMultipleTransferPinEntered", "onMultipleTransferStatus", "onMultipleTransferSuccess", "onNeedHelpedClickedEvent", "kycLevel", "reference", "onNewCardAdded", "onNotificationIconClickedEvent", "numberOfUnreadNotification", "onNotificationMenuClickedEvent", "onOtpSentForBvnVerification", "score", "onOutletFilterClicked", "onOutletManagerButtonClicked", "onOutletTypeClicked", "outletType", "onPerformAccountNameLookup", BanksWithMethods.BANK_NAME, "onPerformServiceFeeLookup", "onPhoneNumberEntered", "onPinEnteredClicked", "onPinEnteredForCreateOutletClicked", "onPrimaryPhoneVerificationClicked", "onPrinterButtonClickedEvent", "onResetPinButtonClick", "onSaveAccountNumberClick", "onSaveProfileButtonClick", "onSavingsGetStartedClicked", "onSavingsGoalEntered", "goalName", "onSavingsMenuItemClicked", "onSavingsPinEntered", "onSavingsReviewed", "onSecondaryPhoneNumberProvided", "onSecondaryPhoneNumberVerificationClicked", "onSecondaryPhoneNumberVerified", "onSelectOutletItem", "onSendAMessageEvent", "onSendAmountClicked", "onSettingsMenuClick", "onShowUnAuthorizedInstalledScreen", "onSignUpButtonClicked", "onSocialNetworkClicked", "socialNetwork", "onSplashScreenReached", "onSubmitAccountDetails", "onSubmitInsuranceButtonClicked", "onSubmitIssueClicked", "onSuccessfulInsuranceSignUp", "onSupportButtonClicked", "onSuspendOutlet", "onTermsAndConditionAccepted", "onTransactionAuthEvent", "onTransactionCreationEvent", "productId", "fee", "onTransactionFilterIconClickedEvent", "onTransactionFilterSubmitButtonClickedEvent", "timeFrom", "timeTo", "onTransactionLookUpEvent", "onTransactionPriceFetchEvent", "onTransactionRefreshedClickedEvent", "onTransactionTypeSelectedEvent", "onTransferMenuClick", "onUpgradeAccountButtonClick", "idType", "idNumber", "nokName", "nokNumber", "utilityBill", "onUssdCodeCopied", "onUssdCodeDialed", "onUssdInfoCopied", "onUssdProviderSelected", "onUssdTransactionCompleted", "onUssdVoucherCodeValidated", "onUssdWithdrawalOptionClicked", "onVerifyAccountButtonClick", "onVerifyFaceIdClicked", "onViewOutletAccount", "onViewOutletProfile", "onViewOutletTransaction", "onVisitWebsiteClicked", "onVoucherAmountEntered", "onVoucherCashInCreationButtonClicked", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, "onVoucherCashOutRequestEvent", "onVoucherCodeLookUpClickedEvent", "voucherCode", "onVoucherPinCashInPinVerification", "onVoucherPinCashOutPinVerification", "onVoucherRecipientInfoEntered", "onVoucherRecipientPhoneVerificationEvent", "recipientNameOrPhone", "onVoucherSenderInfoEntered", "onWelcomeScreenReached", "onWithdrawAmountEntered", "onWithdrawMoneyMenuClick", "onWithdrawSuccessScreenLaunch", "outletDetailsSubmitted", "personalDetailsSubmitted", "phoneNumberAndBvnSubmitted", "pinSubmitted", "proceedToCollectionClicked", "profilePictureCaptured", "profilePictureUploaded", "reviewOurAppClicked", "savingsDateSelected", "savingsDurationSelected", "duration", "setUserProperties", "skipFingerPrintClicked", "skipOnWelcomeScreenClicked", "verifyPhoneNumber", "viewEarningsClicked", "viewReferredAgentSummaryClicked", "withdrawAvailableFundsClicked", "Companion", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class FirebaseAnalyticsImpl implements Analytics {
    public static final Companion Companion;
    public static final String STATUS_FAILURE = "failure";
    public static final String STATUS_SUCCESS = "success";
    private final Context context;
    private final FirebaseAnalytics fireBaseAnalytics;

    /* compiled from: FirebaseAnalyticsImpl.kt */
    @Metadata(m10422d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/core/analytics/FirebaseAnalyticsImpl$Companion;", "", "()V", "STATUS_FAILURE", "", "STATUS_SUCCESS", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DBUtils$1 dBUtils$1) {
            this();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        Companion $r0 = new Companion(null);
        Companion = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FirebaseAnalyticsImpl(Context context) {
        Log_OC.getArray(context, "context");
        this.context = context;
        FirebaseAnalytics $r1 = FirebaseAnalytics.getInstance(context);
        Log_OC.loadImage($r1, "getInstance(context)");
        this.fireBaseAnalytics = $r1;
    }

    private final void debugLog(String str, Bundle bundle) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final Bundle getBundle() {
        Bundle $r1 = new Bundle();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void logEvent(String str, Bundle bundle) {
        FirebaseAnalytics $r3 = this.fireBaseAnalytics;
        $r3.m25450a(str, bundle);
        debugLog(str, bundle);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static /* synthetic */ void logEvent$default(FirebaseAnalyticsImpl firebaseAnalyticsImpl, String str, Bundle $r3, int i, Object obj) {
        int $i0 = i & 2;
        if ($i0 != 0) {
            $r3 = null;
        }
        firebaseAnalyticsImpl.logEvent(str, $r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setUserProperties(User user, String str) {
        if (user != null) {
            String $r3 = user.getId();
            String $r4 = user.getMposVendor();
            String $r5 = $r4;
            if ($r4 == null) {
                $r5 = "";
            }
            String $r7 = user.getTerminalId() != null ? "true" : "false";
            ManageDevice $r8 = new ManageDevice();
            String $r9 = $r8.getDeviceName();
            String $r10 = user.agentKyc;
            if ($r10 == null) {
                $r10 = "";
            }
            String $r11 = user.getPhoneNumber();
            String $r6 = $r11 != null ? $r11 : "";
            String $r112 = user.state;
            Context $r12 = this.context;
            boolean $z0 = ContextExtKt.checkPlayServices($r12);
            String $r42 = $z0 ? "true" : "false";
            FirebaseAnalytics $r13 = this.fireBaseAnalytics;
            String $r14 = user.getId();
            $r13.m25449b($r14);
            FirebaseAnalytics $r132 = this.fireBaseAnalytics;
            String $r142 = user.getId();
            $r132.m25448c("userId", $r142);
            FirebaseAnalytics $r133 = this.fireBaseAnalytics;
            $r133.m25448c("posVendor", $r5);
            FirebaseAnalytics $r134 = this.fireBaseAnalytics;
            $r134.m25448c("hasTerminal", $r7);
            FirebaseAnalytics $r135 = this.fireBaseAnalytics;
            $r135.m25448c("deviceName", $r9);
            FirebaseAnalytics $r136 = this.fireBaseAnalytics;
            $r136.m25448c("kycLevel", $r10);
            FirebaseAnalytics $r137 = this.fireBaseAnalytics;
            $r137.m25448c("phoneNo", $r6);
            FirebaseAnalytics $r138 = this.fireBaseAnalytics;
            $r138.m25448c(SendReceiptToTerminalConfirmationBottomSheet.STATE, $r112);
            FirebaseAnalytics $r139 = this.fireBaseAnalytics;
            $r139.m25448c("appVersion", str);
            FirebaseAnalytics $r1310 = this.fireBaseAnalytics;
            $r1310.m25448c("hasPlayServices", $r42);
            Bundle $r15 = getBundle();
            $r15.putString("userId", $r3);
            $r15.putString("phoneNumber", $r6);
            $r15.putString(SendReceiptToTerminalConfirmationBottomSheet.STATE, $r112);
            $r15.putString("posVendor", $r5);
            $r15.putString("hasTerminal", $r7);
            $r15.putString("deviceName", $r9);
            $r15.putString("kycLevel", $r10);
            $r15.putString("appVersion", str);
            $r15.putString("hasPlayServices", $r42);
            C13666w c13666w = C13666w.f30112a;
            debugLog("user_properties", $r15);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.ReferralAnalytics
    public void buzzReferredAgentClicked(String str, String str2, boolean z, String str3) {
        Log_OC.getArray(str, "phoneNumber");
        Log_OC.getArray(str2, "referredPhoneNumber");
        Bundle $r4 = new Bundle();
        ReferralAnalytics.EventType.AgentReferralParameters $r5 = ReferralAnalytics.EventType.AgentReferralParameters.PHONE_NUMBER;
        String $r6 = String.valueOf($r5);
        $r4.putString($r6, str);
        ReferralAnalytics.EventType.AgentReferralParameters $r52 = ReferralAnalytics.EventType.AgentReferralParameters.REFERRED_PHONE_NUMBER;
        String $r3 = String.valueOf($r52);
        $r4.putString($r3, str2);
        ReferralAnalytics.EventType.AgentReferralParameters $r53 = ReferralAnalytics.EventType.AgentReferralParameters.STATUS;
        String $r32 = String.valueOf($r53);
        $r4.putBoolean($r32, z);
        ReferralAnalytics.EventType.AgentReferralParameters $r54 = ReferralAnalytics.EventType.AgentReferralParameters.ERROR_MESSAGE;
        String $r33 = String.valueOf($r54);
        $r4.putString($r33, str3);
        ReferralAnalytics.EventType.AgentReferralType $r7 = ReferralAnalytics.EventType.AgentReferralType.BUZZ_REFERRED_AGENT_CLICKED;
        String $r34 = String.valueOf($r7);
        logEvent($r34, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.OnboardingAnalytics
    public void bvnVerification(String str, String str2, boolean z, String str3, String str4) {
        Log_OC.getArray(str, AttributeType.PHONE);
        Log_OC.getArray(str2, PhoneFragment.ARG_BVN);
        Log_OC.getArray(str3, "userType");
        Bundle $r5 = new Bundle();
        OnboardingAnalytics.EventType.OnboardingParameters $r6 = OnboardingAnalytics.EventType.OnboardingParameters.PHONE_NUMBER;
        String $r7 = String.valueOf($r6);
        $r5.putString($r7, str);
        OnboardingAnalytics.EventType.OnboardingParameters $r62 = OnboardingAnalytics.EventType.OnboardingParameters.IS_CLOSED;
        String $r4 = String.valueOf($r62);
        $r5.putString($r4, str2);
        OnboardingAnalytics.EventType.OnboardingParameters $r63 = OnboardingAnalytics.EventType.OnboardingParameters.STATUS;
        String $r42 = String.valueOf($r63);
        $r5.putBoolean($r42, z);
        OnboardingAnalytics.EventType.OnboardingParameters $r64 = OnboardingAnalytics.EventType.OnboardingParameters.USERTYPE;
        String $r43 = String.valueOf($r64);
        $r5.putString($r43, str3);
        OnboardingAnalytics.EventType.OnboardingParameters $r65 = OnboardingAnalytics.EventType.OnboardingParameters.ERROR_MESSAGE;
        String $r44 = String.valueOf($r65);
        $r5.putString($r44, str4);
        OnboardingAnalytics.EventType.OnboardingFlowEvents $r8 = OnboardingAnalytics.EventType.OnboardingFlowEvents.BVN_VERIFICATION_SUCCESSFUL;
        String $r45 = String.valueOf($r8);
        logEvent($r45, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.OnboardingAnalytics
    public void createAccountClicked() {
        OnboardingAnalytics.EventType.OnboardingFlowEvents $r3 = OnboardingAnalytics.EventType.OnboardingFlowEvents.CREATE_ACCOUNT;
        String $r2 = String.valueOf($r3);
        Bundle $r1 = new Bundle();
        logEvent($r2, $r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.OnboardingAnalytics
    public void enableFingerPrintClicked(String str) {
        Log_OC.getArray(str, AttributeType.PHONE);
        Bundle $r2 = new Bundle();
        OnboardingAnalytics.EventType.OnboardingParameters $r3 = OnboardingAnalytics.EventType.OnboardingParameters.PHONE_NUMBER;
        String $r4 = String.valueOf($r3);
        $r2.putString($r4, str);
        OnboardingAnalytics.EventType.OnboardingFlowEvents $r5 = OnboardingAnalytics.EventType.OnboardingFlowEvents.ONBOARDING_ENABLE_FINGERPRINT_CLICKED;
        String $r1 = String.valueOf($r5);
        logEvent($r1, $r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.MarketplaceAnalytics.Actions
    public void enterPinInitiated(String str, boolean z) {
        Log_OC.getArray(str, "phoneNumber");
        MarketplaceAnalytics.Events $r2 = MarketplaceAnalytics.Events.MARKETPLACE_TRANSACTION_COMPLETION;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        MarketplaceAnalytics.Parameters $r5 = MarketplaceAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        MarketplaceAnalytics.Parameters $r52 = MarketplaceAnalytics.Parameters.STATUS;
        String $r1 = $r52.toString();
        $r4.putBoolean($r1, z);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.OnboardingAnalytics
    public void fundWalletOnWelcomeScreenClicked(String str, String str2) {
        Log_OC.getArray(str, AttributeType.PHONE);
        Log_OC.getArray(str2, "userType");
        Bundle $r3 = new Bundle();
        OnboardingAnalytics.EventType.OnboardingParameters $r4 = OnboardingAnalytics.EventType.OnboardingParameters.PHONE_NUMBER;
        String $r5 = String.valueOf($r4);
        $r3.putString($r5, str);
        OnboardingAnalytics.EventType.OnboardingParameters $r42 = OnboardingAnalytics.EventType.OnboardingParameters.USERTYPE;
        String $r2 = String.valueOf($r42);
        $r3.putString($r2, str2);
        OnboardingAnalytics.EventType.OnboardingFlowEvents $r6 = OnboardingAnalytics.EventType.OnboardingFlowEvents.WELCOME_SCREEN_FUND_WALLET_CLICKED;
        String $r22 = String.valueOf($r6);
        logEvent($r22, $r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Context getContext() {
        Context r1 = this.context;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.SavingsAnalytics.Actions
    public void launchCreateSavingScreen() {
        SavingsAnalytics.Events $r2 = SavingsAnalytics.Events.CREATE_SAVINGS_SCREEN_LAUNCH;
        String $r1 = $r2.toString();
        logEvent$default(this, $r1, null, 2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.SavingsAnalytics.Actions
    public void launchWithdrawScreen() {
        SavingsAnalytics.Events $r2 = SavingsAnalytics.Events.WITHDRAW_SAVINGS_SCREEN_LAUNCH;
        String $r1 = $r2.toString();
        logEvent$default(this, $r1, null, 2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.OnboardingAnalytics
    public void learnMoreAboutBVN(String str) {
        Log_OC.getArray(str, "userType");
        Bundle $r2 = new Bundle();
        OnboardingAnalytics.EventType.OnboardingParameters $r3 = OnboardingAnalytics.EventType.OnboardingParameters.USERTYPE;
        String $r4 = String.valueOf($r3);
        $r2.putString($r4, str);
        OnboardingAnalytics.EventType.OnboardingFlowEvents $r5 = OnboardingAnalytics.EventType.OnboardingFlowEvents.LEARN_MORE_BVN;
        String $r1 = String.valueOf($r5);
        Bundle $r22 = new Bundle();
        logEvent($r1, $r22);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.ReferralAnalytics
    public void listOfReferredAgentsClicked(String str, boolean z, String str2) {
        Log_OC.getArray(str, "phoneNumber");
        Bundle $r3 = new Bundle();
        ReferralAnalytics.EventType.AgentReferralParameters $r4 = ReferralAnalytics.EventType.AgentReferralParameters.PHONE_NUMBER;
        String $r5 = String.valueOf($r4);
        $r3.putString($r5, str);
        ReferralAnalytics.EventType.AgentReferralParameters $r42 = ReferralAnalytics.EventType.AgentReferralParameters.STATUS;
        String $r2 = String.valueOf($r42);
        $r3.putBoolean($r2, z);
        ReferralAnalytics.EventType.AgentReferralParameters $r43 = ReferralAnalytics.EventType.AgentReferralParameters.ERROR_MESSAGE;
        String $r22 = String.valueOf($r43);
        $r3.putString($r22, str2);
        ReferralAnalytics.EventType.AgentReferralType $r6 = ReferralAnalytics.EventType.AgentReferralType.LIST_OF_REFERRED_AGENT_CLICKED;
        String $r23 = String.valueOf($r6);
        logEvent($r23, $r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.SavingsAnalytics.Actions
    public void lockOptionSelected(String str) {
        Log_OC.getArray(str, "lock");
        SavingsAnalytics.Events $r2 = SavingsAnalytics.Events.LOCK_OPTIONS;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        SavingsAnalytics.Parameters $r5 = SavingsAnalytics.Parameters.LOCK_SAVING;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.Analytics
    public void logKYCFormWasNotHelpfulClicked(String str, String str2) {
        Log_OC.getArray(str, "issueType");
        Log_OC.getArray(str2, "issueDescription");
        Bundle $r3 = new Bundle();
        EventType.IssueResolkutionParams $r4 = EventType.IssueResolkutionParams.ISSUE_TYPE;
        String $r5 = String.valueOf($r4);
        $r3.putString($r5, str);
        EventType.IssueResolkutionParams $r42 = EventType.IssueResolkutionParams.ISSUE_DESCRIPTION;
        String $r2 = String.valueOf($r42);
        $r3.putString($r2, str2);
        EventType.IssueResolutionTypes $r6 = EventType.IssueResolutionTypes.NOT_HELPFUL;
        String $r22 = String.valueOf($r6);
        logEvent($r22, $r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.Analytics
    public void logKYcFormWasHelpfulClicked(String str, String str2) {
        Log_OC.getArray(str, "issueType");
        Log_OC.getArray(str2, "issueDescription");
        Bundle $r3 = new Bundle();
        EventType.IssueResolkutionParams $r4 = EventType.IssueResolkutionParams.ISSUE_TYPE;
        String $r5 = String.valueOf($r4);
        $r3.putString($r5, str);
        EventType.IssueResolkutionParams $r42 = EventType.IssueResolkutionParams.ISSUE_DESCRIPTION;
        String $r2 = String.valueOf($r42);
        $r3.putString($r2, str2);
        EventType.IssueResolutionTypes $r6 = EventType.IssueResolutionTypes.HELPFUL;
        String $r22 = String.valueOf($r6);
        logEvent($r22, $r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.Analytics
    public void loginEvent(boolean z, String str, String str2, String str3, String str4, String str5, User user) {
        Log_OC.getArray(str, "deviceName");
        Log_OC.getArray(str2, "deviceId");
        Log_OC.getArray(str3, "phoneNumber");
        Log_OC.getArray(str5, "appVersionName");
        Bundle $r7 = new Bundle();
        EventType.LoginParameters $r8 = EventType.LoginParameters.DEVICE_ID;
        String $r6 = String.valueOf($r8);
        $r7.putString($r6, str2);
        EventType.LoginParameters $r82 = EventType.LoginParameters.DEVICE_NAME;
        String $r5 = String.valueOf($r82);
        $r7.putString($r5, str);
        EventType.LoginParameters $r83 = EventType.LoginParameters.IS_LOGIN_SUCCESSFUL;
        String $r4 = String.valueOf($r83);
        $r7.putBoolean($r4, z);
        EventType.LoginParameters $r84 = EventType.LoginParameters.ERROR_MESSAGE;
        String $r42 = String.valueOf($r84);
        $r7.putString($r42, str4);
        EventType.LoginTypes $r9 = EventType.LoginTypes.LOGIN;
        String $r43 = String.valueOf($r9);
        logEvent($r43, $r7);
        setUserProperties(user, str5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.MarketplaceAnalytics.Actions
    public void makePaymentInitiated(String str, boolean z) {
        Log_OC.getArray(str, "phoneNumber");
        MarketplaceAnalytics.Events $r2 = MarketplaceAnalytics.Events.MARKETPLACE_MAKE_PAYMENT_BUTTON_CLICKED;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        MarketplaceAnalytics.Parameters $r5 = MarketplaceAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        MarketplaceAnalytics.Parameters $r52 = MarketplaceAnalytics.Parameters.STATUS;
        String $r1 = $r52.toString();
        $r4.putBoolean($r1, z);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.MarketplaceAnalytics.Actions
    public void marketPlaceMenuNavClicked(String str, boolean z) {
        Log_OC.getArray(str, "phoneNumber");
        MarketplaceAnalytics.Events $r2 = MarketplaceAnalytics.Events.MARKETPLACE_CLICKED;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        MarketplaceAnalytics.Parameters $r5 = MarketplaceAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        MarketplaceAnalytics.Parameters $r52 = MarketplaceAnalytics.Parameters.STATUS;
        String $r1 = $r52.toString();
        $r4.putBoolean($r1, z);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.MarketplaceAnalytics.Actions
    public void marketPlaceProductClicked(String str, boolean z) {
        Log_OC.getArray(str, "phoneNumber");
        MarketplaceAnalytics.Events $r2 = MarketplaceAnalytics.Events.MARKETPLACE_PRODUCTS;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        MarketplaceAnalytics.Parameters $r5 = MarketplaceAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        MarketplaceAnalytics.Parameters $r52 = MarketplaceAnalytics.Parameters.STATUS;
        String $r1 = $r52.toString();
        $r4.putBoolean($r1, z);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.SettingsAnalytics.Actions
    public void onAboutKycLevelClick(String str) {
        Log_OC.getArray(str, AttributeType.PHONE);
        SettingsAnalytics.Events $r2 = SettingsAnalytics.Events.ABOUT_KYC_PAGE_CLICKED_ON_KYC_LEVEL_CARD;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        SettingsAnalytics.Parameters $r5 = SettingsAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.SettingsAnalytics.Actions
    public void onAccountPageOpen(String str) {
        Log_OC.getArray(str, AttributeType.PHONE);
        SettingsAnalytics.Events $r2 = SettingsAnalytics.Events.ACCOUNT_SCREEN_OPENED_ON_SETTINGS_PAGE;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        SettingsAnalytics.Parameters $r5 = SettingsAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.SettingsAnalytics.Actions
    public void onActivateTerminalButtonClick(String str, String str2) {
        Log_OC.getArray(str, "terminalDetails");
        Log_OC.getArray(str2, AttributeType.PHONE);
        SettingsAnalytics.Events $r3 = SettingsAnalytics.Events.ACTIVATE_TERMINAL_CLICKED;
        String $r4 = $r3.toString();
        Bundle $r5 = getBundle();
        SettingsAnalytics.Parameters $r6 = SettingsAnalytics.Parameters.TERMINAL_DETAILS;
        String $r7 = $r6.toString();
        $r5.putString($r7, str);
        SettingsAnalytics.Parameters $r62 = SettingsAnalytics.Parameters.PHONE_NUMBER;
        String $r2 = $r62.toString();
        $r5.putString($r2, str2);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r4, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.InsuranceAnalytics.Actions
    public void onAddEmployeeButtonClicked(String str) {
        Log_OC.getArray(str, AttributeType.PHONE);
        SettingsAnalytics.Events $r2 = SettingsAnalytics.Events.INSURANCE_EMPLOYEE_ADDED;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        SettingsAnalytics.Parameters $r5 = SettingsAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.SettingsAnalytics.Actions
    public void onAddNewAccountButtonClick(String str, String str2, String str3, String str4, String str5) {
        Log_OC.getArray(str, AttributeType.PHONE);
        Log_OC.getArray(str2, "acctNumber");
        Log_OC.getArray(str3, "acctName");
        Log_OC.getArray(str4, "bank");
        Log_OC.getArray(str5, "purpose");
        SettingsAnalytics.Events $r6 = SettingsAnalytics.Events.ADD_NEW_ACCOUNT_NUMBER_CLICKED_ON_ACCOUNT_PAGE;
        String $r7 = $r6.toString();
        Bundle $r8 = getBundle();
        SettingsAnalytics.Parameters $r9 = SettingsAnalytics.Parameters.PHONE_NUMBER;
        String $r10 = $r9.toString();
        $r8.putString($r10, str);
        SettingsAnalytics.Parameters $r92 = SettingsAnalytics.Parameters.ACCOUNT_NAME;
        String $r5 = $r92.toString();
        $r8.putString($r5, str3);
        SettingsAnalytics.Parameters $r93 = SettingsAnalytics.Parameters.ACCOUNT_NUMBER;
        String $r52 = $r93.toString();
        $r8.putString($r52, str2);
        SettingsAnalytics.Parameters $r94 = SettingsAnalytics.Parameters.BANK;
        String $r53 = $r94.toString();
        $r8.putString($r53, str4);
        SettingsAnalytics.Parameters $r95 = SettingsAnalytics.Parameters.PURPOSE;
        String $r54 = $r95.toString();
        $r8.putString($r54, str5);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r7, $r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.OutletMgtAnalytics.Actions
    public void onAddOutletClicked(String str, boolean z) {
        Log_OC.getArray(str, "phoneNumber");
        OutletMgtAnalytics.Events $r2 = OutletMgtAnalytics.Events.CLICK_ADD_OUTLET;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        OutletMgtAnalytics.Parameters $r5 = OutletMgtAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        OutletMgtAnalytics.Parameters $r52 = OutletMgtAnalytics.Parameters.STATUS;
        String $r1 = $r52.toString();
        $r4.putBoolean($r1, z);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.OutletMgtAnalytics.Actions
    public void onAddOutletFormClicked(String str, String str2, boolean z) {
        Log_OC.getArray(str, "userPhoneNumber");
        Log_OC.getArray(str2, "outletPhoneNumber");
        OutletMgtAnalytics.Events $r3 = OutletMgtAnalytics.Events.CLICK_ADD_OUTLET_FORM;
        String $r4 = $r3.toString();
        Bundle $r5 = getBundle();
        OutletMgtAnalytics.Parameters $r6 = OutletMgtAnalytics.Parameters.PHONE_NUMBER;
        String $r7 = $r6.toString();
        $r5.putString($r7, str);
        OutletMgtAnalytics.Parameters $r62 = OutletMgtAnalytics.Parameters.OUTLET_PHONE_NUMBER;
        String $r2 = $r62.toString();
        $r5.putString($r2, str2);
        OutletMgtAnalytics.Parameters $r63 = OutletMgtAnalytics.Parameters.STATUS;
        String $r22 = $r63.toString();
        $r5.putBoolean($r22, z);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r4, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.Analytics
    public void onAgentCreation(String str, String str2, User user) {
        Log_OC.getArray(str, "phoneNumber");
        Log_OC.getArray(str2, "name");
        Bundle $r4 = new Bundle();
        EventType.AgentRegistrationParameters $r5 = EventType.AgentRegistrationParameters.AGENT_NAME;
        String $r6 = String.valueOf($r5);
        $r4.putString($r6, str2);
        EventType.AgentRegistrationParameters $r52 = EventType.AgentRegistrationParameters.AGENT_PHONE_NUMBER;
        String $r2 = String.valueOf($r52);
        $r4.putString($r2, str);
        EventType.AgentRegistrationType $r7 = EventType.AgentRegistrationType.AGENT_CREATION;
        String $r1 = String.valueOf($r7);
        logEvent($r1, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.OnboardingAnalytics
    public void onAgentHavingPendingKyc(String str) {
        Log_OC.getArray(str, AttributeType.PHONE);
        OnboardingAnalytics.EventType.OnboardingFlowEvents $r2 = OnboardingAnalytics.EventType.OnboardingFlowEvents.AGENT_PENDING_KYC;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        OnboardingAnalytics.EventType.OnboardingParameters $r5 = OnboardingAnalytics.EventType.OnboardingParameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.OnboardingAnalytics
    public void onAgentKycCompleted(String str) {
        Log_OC.getArray(str, AttributeType.PHONE);
        OnboardingAnalytics.EventType.OnboardingFlowEvents $r2 = OnboardingAnalytics.EventType.OnboardingFlowEvents.AGENT_COMPLETED_KYC;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        OnboardingAnalytics.EventType.OnboardingParameters $r5 = OnboardingAnalytics.EventType.OnboardingParameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.ReferralAnalytics
    public void onAgentReferralCreation(String str, String str2, boolean z, String str3) {
        Log_OC.getArray(str, "phoneNumber");
        Log_OC.getArray(str2, "referredPhoneNumber");
        Bundle $r4 = new Bundle();
        ReferralAnalytics.EventType.AgentReferralParameters $r5 = ReferralAnalytics.EventType.AgentReferralParameters.PHONE_NUMBER;
        String $r6 = String.valueOf($r5);
        $r4.putString($r6, str);
        ReferralAnalytics.EventType.AgentReferralParameters $r52 = ReferralAnalytics.EventType.AgentReferralParameters.REFERRED_PHONE_NUMBER;
        String $r3 = String.valueOf($r52);
        $r4.putString($r3, str2);
        ReferralAnalytics.EventType.AgentReferralParameters $r53 = ReferralAnalytics.EventType.AgentReferralParameters.STATUS;
        String $r32 = String.valueOf($r53);
        $r4.putBoolean($r32, z);
        ReferralAnalytics.EventType.AgentReferralParameters $r54 = ReferralAnalytics.EventType.AgentReferralParameters.ERROR_MESSAGE;
        String $r33 = String.valueOf($r54);
        $r4.putString($r33, str3);
        ReferralAnalytics.EventType.AgentReferralType $r7 = ReferralAnalytics.EventType.AgentReferralType.REFER_AGENT_CLICKED;
        String $r34 = String.valueOf($r7);
        logEvent($r34, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.ReferralAnalytics
    public void onAgentReferralInfoEvent(User user) {
        ReferralAnalytics.EventType.AgentReferralType $r3 = ReferralAnalytics.EventType.AgentReferralType.START_AGENT_REFERRAL;
        String $r1 = String.valueOf($r3);
        logEvent($r1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.HomeAnalytics.Actions
    public void onAirtimeOrDataMenuClick(String str) {
        Log_OC.getArray(str, AttributeType.PHONE);
        HomeAnalytics.Events $r2 = HomeAnalytics.Events.HOME_SCREEN_AIRTIME_DATA_CLICKED;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        HomeAnalytics.Parameters $r5 = HomeAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.WalletTopUpAnalytics
    public void onAmountEntered(String str, String str2) {
        Log_OC.getArray(str, "phoneNumber");
        Log_OC.getArray(str2, KshockPendingLoansListFragment.KEY_MAX_LOAN_AMT);
        Bundle $r3 = new Bundle();
        WalletTopUpAnalytics.EventType.WalletTopUpParams $r4 = WalletTopUpAnalytics.EventType.WalletTopUpParams.PHONE_NUMBER;
        String $r5 = String.valueOf($r4);
        $r3.putString($r5, str);
        WalletTopUpAnalytics.EventType.WalletTopUpParams $r42 = WalletTopUpAnalytics.EventType.WalletTopUpParams.AMOUNT;
        String $r2 = String.valueOf($r42);
        $r3.putString($r2, str2);
        WalletTopUpAnalytics.EventType.WalletTopUpEvents $r6 = WalletTopUpAnalytics.EventType.WalletTopUpEvents.ENTER_AMOUNT;
        String $r22 = String.valueOf($r6);
        logEvent($r22, $r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.TransferToBankAnalytics
    public void onAmountEntered(String str, boolean z, String str2) {
        Log_OC.getArray(str, AttributeType.PHONE);
        Bundle $r3 = new Bundle();
        TransferToBankAnalytics.EventType.TransferParameters $r4 = TransferToBankAnalytics.EventType.TransferParameters.PHONE_NUMBER;
        String $r5 = String.valueOf($r4);
        $r3.putString($r5, str);
        TransferToBankAnalytics.EventType.TransferParameters $r42 = TransferToBankAnalytics.EventType.TransferParameters.STATUS;
        String $r2 = String.valueOf($r42);
        $r3.putBoolean($r2, z);
        TransferToBankAnalytics.EventType.TransferParameters $r43 = TransferToBankAnalytics.EventType.TransferParameters.ERROR_MESSAGE;
        String $r22 = String.valueOf($r43);
        $r3.putString($r22, str2);
        TransferToBankAnalytics.EventType.TransferFlowEvents $r6 = TransferToBankAnalytics.EventType.TransferFlowEvents.SUBMIT_AMOUNT;
        String $r23 = String.valueOf($r6);
        logEvent($r23, $r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.AnnouncementAnalytics.Actions
    public void onAnnouncementClicked(String str, int i) {
        Log_OC.getArray(str, Part.LEGACY_ANNOUNCEMENT_STYLE);
        AnnouncementAnalytics.Events $r2 = AnnouncementAnalytics.Events.ANNOUNCEMENT_CLICKED;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        AnnouncementAnalytics.Parameters $r5 = AnnouncementAnalytics.Parameters.ANNOUNCEMENT;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        AnnouncementAnalytics.Parameters $r52 = AnnouncementAnalytics.Parameters.NEGATIVE;
        String $r1 = $r52.toString();
        $r4.putInt($r1, i);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.IssueResolutionAnalytics.Actions
    public void onAttachmentAdded(String str, int i) {
        Log_OC.getArray(str, "phoneNumber");
        IssueResolutionAnalytics.Events $r2 = IssueResolutionAnalytics.Events.ATTACHMENT_ADDED;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        IssueResolutionAnalytics.Parameters $r5 = IssueResolutionAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        IssueResolutionAnalytics.Parameters $r52 = IssueResolutionAnalytics.Parameters.COUNT;
        String $r1 = $r52.toString();
        $r4.putInt($r1, i);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.WalletTopUpAnalytics
    public void onBankSelected(String str, boolean z) {
        Log_OC.getArray(str, "phoneNumber");
        Bundle $r2 = new Bundle();
        WalletTopUpAnalytics.EventType.WalletTopUpParams $r3 = WalletTopUpAnalytics.EventType.WalletTopUpParams.PHONE_NUMBER;
        String $r4 = String.valueOf($r3);
        $r2.putString($r4, str);
        WalletTopUpAnalytics.EventType.WalletTopUpParams $r32 = WalletTopUpAnalytics.EventType.WalletTopUpParams.STATUS;
        String $r1 = String.valueOf($r32);
        $r2.putBoolean($r1, z);
        WalletTopUpAnalytics.EventType.WalletTopUpEvents $r5 = WalletTopUpAnalytics.EventType.WalletTopUpEvents.SELECT_BANK;
        String $r12 = String.valueOf($r5);
        logEvent($r12, $r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.HomeAnalytics.Actions
    public void onBillerMenuClick(String str, String str2, String str3) {
        Log_OC.getArray(str, AttributeType.PHONE);
        Log_OC.getArray(str2, "billerName");
        Log_OC.getArray(str3, "lookupId");
        HomeAnalytics.Events $r4 = HomeAnalytics.Events.HOME_SCREEN_BILLER_CLICKED;
        String $r5 = $r4.toString();
        Bundle $r6 = getBundle();
        HomeAnalytics.Parameters $r7 = HomeAnalytics.Parameters.PHONE_NUMBER;
        String $r8 = $r7.toString();
        $r6.putString($r8, str);
        HomeAnalytics.Parameters $r72 = HomeAnalytics.Parameters.BILLER_NAME;
        String $r3 = $r72.toString();
        $r6.putString($r3, str2);
        HomeAnalytics.Parameters $r73 = HomeAnalytics.Parameters.BILLER_LOOKUP_ID;
        String $r32 = $r73.toString();
        $r6.putString($r32, str3);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r5, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.SettingsAnalytics.Actions
    public void onBiometricsOptionToggle(String str, String str2) {
        Log_OC.getArray(str, AttributeType.PHONE);
        Log_OC.getArray(str2, SendReceiptToTerminalConfirmationBottomSheet.STATE);
        SettingsAnalytics.Events $r3 = SettingsAnalytics.Events.BIOMETRICS_TOGGLE_ON_SECURITY_PAGE;
        String $r4 = $r3.toString();
        Bundle $r5 = getBundle();
        SettingsAnalytics.Parameters $r6 = SettingsAnalytics.Parameters.PHONE_NUMBER;
        String $r7 = $r6.toString();
        $r5.putString($r7, str);
        SettingsAnalytics.Parameters $r62 = SettingsAnalytics.Parameters.STATE;
        String $r2 = $r62.toString();
        $r5.putString($r2, str2);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r4, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.SettingsAnalytics.Actions
    public void onBuyPosButtonClick(String str, String str2) {
        Log_OC.getArray(str, AttributeType.PHONE);
        Log_OC.getArray(str2, TransactionField.STATUS);
        SettingsAnalytics.Events $r3 = SettingsAnalytics.Events.BUY_POS_BUTTON_CLICKED_ON_ACCOUNT_SECTION;
        String $r4 = $r3.toString();
        Bundle $r5 = getBundle();
        SettingsAnalytics.Parameters $r6 = SettingsAnalytics.Parameters.PHONE_NUMBER;
        String $r7 = $r6.toString();
        $r5.putString($r7, str);
        SettingsAnalytics.Parameters $r62 = SettingsAnalytics.Parameters.STATUS;
        String $r2 = $r62.toString();
        $r5.putString($r2, str2);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r4, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.OutletMgtAnalytics.Actions
    public void onBuzzAgentClicked(String str, String str2) {
        Log_OC.getArray(str, "userPhoneNumber");
        Log_OC.getArray(str2, "outletId");
        OutletMgtAnalytics.Events $r3 = OutletMgtAnalytics.Events.CLICK_BUZZ_AGENT;
        String $r4 = $r3.toString();
        Bundle $r5 = getBundle();
        OutletMgtAnalytics.Parameters $r6 = OutletMgtAnalytics.Parameters.PHONE_NUMBER;
        String $r7 = $r6.toString();
        $r5.putString($r7, str);
        OutletMgtAnalytics.Parameters $r62 = OutletMgtAnalytics.Parameters.OUTLET_PHONE_NUMBER;
        String $r2 = $r62.toString();
        $r5.putString($r2, str2);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r4, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.Analytics
    public void onCallSupportClicked(String str, String str2) {
        Log_OC.getArray(str, "screen");
        Bundle $r2 = getBundle();
        $r2.putString("screen", str);
        $r2.putString("phone_number", str2);
        C13666w c13666w = C13666w.f30112a;
        logEvent("call_support_clicked", $r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.IssueResolutionAnalytics.Actions
    public void onCallUsClicked(String str) {
        Log_OC.getArray(str, "phoneNumber");
        IssueResolutionAnalytics.Events $r2 = IssueResolutionAnalytics.Events.CALL_US_CLICKED;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        IssueResolutionAnalytics.Parameters $r5 = IssueResolutionAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.Analytics
    public void onCallUsEvent(User user) {
        EventType.IssueTypes $r3 = EventType.IssueTypes.CHAT_WITH_US_CLICKED;
        String $r1 = String.valueOf($r3);
        logEvent$default(this, $r1, null, 2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.TransactionsCommissionsAnalytics.Actions
    public void onCancelCommissionsCashout(String str) {
        Log_OC.getArray(str, AttributeType.PHONE);
        TransactionsCommissionsAnalytics.Events $r2 = TransactionsCommissionsAnalytics.Events.CANCELLED_COMMISSIONS_CASHOUT;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        TransactionsCommissionsAnalytics.Parameters $r5 = TransactionsCommissionsAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.WalletTopUpAnalytics
    public void onCardPageVisited(String str) {
        Log_OC.getArray(str, "phoneNumber");
        Bundle $r2 = new Bundle();
        WalletTopUpAnalytics.EventType.WalletTopUpParams $r3 = WalletTopUpAnalytics.EventType.WalletTopUpParams.PHONE_NUMBER;
        String $r4 = String.valueOf($r3);
        $r2.putString($r4, str);
        WalletTopUpAnalytics.EventType.WalletTopUpEvents $r5 = WalletTopUpAnalytics.EventType.WalletTopUpEvents.VISIT_CARD_PAGE;
        String $r1 = String.valueOf($r5);
        logEvent($r1, $r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.IssueResolutionAnalytics.Actions
    public void onCheckAppBuildClicked(String str) {
        Log_OC.getArray(str, "phoneNumber");
        IssueResolutionAnalytics.Events $r2 = IssueResolutionAnalytics.Events.CHECK_APP_BUILD_CLICKED;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        IssueResolutionAnalytics.Parameters $r5 = IssueResolutionAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.Analytics
    public void onClickExitApp() {
        EventType.UnAuthorizedInstallationTypes $r3 = EventType.UnAuthorizedInstallationTypes.UNAUTHORIZED_INSTALLATON_EXIT_CLICKED;
        String $r2 = $r3.toString();
        Bundle $r1 = new Bundle();
        logEvent($r2, $r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.Analytics
    public void onClickFAQ(User user) {
        EventType.IssueTypes $r3 = EventType.IssueTypes.FAQ_CLICKED;
        String $r1 = String.valueOf($r3);
        logEvent$default(this, $r1, null, 2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.Analytics
    public void onClickGoToPlaystore() {
        EventType.UnAuthorizedInstallationTypes $r3 = EventType.UnAuthorizedInstallationTypes.UNAUTHORIZED_INSTALLATON_UPDATE_CLICKED;
        String $r2 = $r3.toString();
        Bundle $r1 = new Bundle();
        logEvent($r2, $r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.OutletMgtAnalytics.Actions
    public void onClickOutletPinReset(String str) {
        Log_OC.getArray(str, "userPhoneNumber");
        OutletMgtAnalytics.Events $r2 = OutletMgtAnalytics.Events.CLICK_OUTLET_RESET_PIN;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        OutletMgtAnalytics.Parameters $r5 = OutletMgtAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.OutletMgtAnalytics.Actions
    public void onClickOutletSecurity(String str) {
        Log_OC.getArray(str, "userPhoneNumber");
        OutletMgtAnalytics.Events $r2 = OutletMgtAnalytics.Events.CLICK_OUTLET_SECURITY;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        OutletMgtAnalytics.Parameters $r5 = OutletMgtAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.TransactionsCommissionsAnalytics.Actions
    public void onCommissionOptions(String str) {
        Log_OC.getArray(str, AttributeType.PHONE);
        TransactionsCommissionsAnalytics.Events $r2 = TransactionsCommissionsAnalytics.Events.CLICK_COMMISSIONS_MORE_ACTIONS;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        TransactionsCommissionsAnalytics.Parameters $r5 = TransactionsCommissionsAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.TransactionsCommissionsAnalytics.Actions
    public void onCommissionPage(String str) {
        Log_OC.getArray(str, AttributeType.PHONE);
        TransactionsCommissionsAnalytics.Events $r2 = TransactionsCommissionsAnalytics.Events.COMMISSIONS_PAGE;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        TransactionsCommissionsAnalytics.Parameters $r5 = TransactionsCommissionsAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.TransactionsCommissionsAnalytics.Actions
    public void onCommissionsCashout(String str) {
        Log_OC.getArray(str, AttributeType.PHONE);
        TransactionsCommissionsAnalytics.Events $r2 = TransactionsCommissionsAnalytics.Events.CLICK_COMMISSIONS_CASHOUT;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        TransactionsCommissionsAnalytics.Parameters $r5 = TransactionsCommissionsAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.TransactionsCommissionsAnalytics.Actions
    public void onConfirmCommissionsCashout(String str, boolean z) {
        Log_OC.getArray(str, AttributeType.PHONE);
        TransactionsCommissionsAnalytics.Events $r2 = TransactionsCommissionsAnalytics.Events.CONFIRM_COMMISSIONS_CASHOUT;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        TransactionsCommissionsAnalytics.Parameters $r5 = TransactionsCommissionsAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        TransactionsCommissionsAnalytics.Parameters $r52 = TransactionsCommissionsAnalytics.Parameters.STATUS;
        String $r1 = $r52.toString();
        $r4.putBoolean($r1, z);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.TransferToMultipleBanksAnalytics.Actions
    public void onConfirmMultipleTransfers(String str) {
        Log_OC.getArray(str, AttributeType.PHONE);
        TransferToMultipleBanksAnalytics.Events $r2 = TransferToMultipleBanksAnalytics.Events.CONFIRM_TRANSFER;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        TransferToMultipleBanksAnalytics.Parameters $r5 = TransferToMultipleBanksAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.SavingsAnalytics.Actions
    public void onConfirmWithdraw(boolean z, String str) {
        SavingsAnalytics.Events $r2 = SavingsAnalytics.Events.WITHDRAWAL_CONFIRMATION_CLICKED;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        SavingsAnalytics.Parameters $r5 = SavingsAnalytics.Parameters.WITHDRAW_CONFIRMED;
        String $r6 = $r5.toString();
        String $r7 = String.valueOf(z);
        $r4.putString($r6, $r7);
        if (str != null) {
            SavingsAnalytics.Parameters $r52 = SavingsAnalytics.Parameters.PHONE_NUMBER;
            String $r62 = $r52.toString();
            $r4.putString($r62, str);
        }
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.IssueResolutionAnalytics.Actions
    public void onContactUsReached(String str) {
        Log_OC.getArray(str, "phoneNumber");
        IssueResolutionAnalytics.Events $r2 = IssueResolutionAnalytics.Events.ON_CONTACT_US_REACHED;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        IssueResolutionAnalytics.Parameters $r5 = IssueResolutionAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.TransferToMultipleBanksAnalytics.Actions
    public void onContinueMultipleTransfer(String str, int i) {
        Log_OC.getArray(str, AttributeType.PHONE);
        TransferToMultipleBanksAnalytics.Events $r2 = TransferToMultipleBanksAnalytics.Events.CLICK_CONTINUE;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        TransferToMultipleBanksAnalytics.Parameters $r5 = TransferToMultipleBanksAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        TransferToMultipleBanksAnalytics.Parameters $r52 = TransferToMultipleBanksAnalytics.Parameters.NUMBER_OF_TRANSFERS;
        String $r1 = $r52.toString();
        $r4.putInt($r1, i);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.OutletMgtAnalytics.Actions
    public void onCreateOutletClicked(String str, String str2, boolean z) {
        Log_OC.getArray(str, "userPhoneNumber");
        Log_OC.getArray(str2, "outletPhoneNumber");
        OutletMgtAnalytics.Events $r3 = OutletMgtAnalytics.Events.CLICK_CREATE_OUTLET;
        String $r4 = $r3.toString();
        Bundle $r5 = getBundle();
        OutletMgtAnalytics.Parameters $r6 = OutletMgtAnalytics.Parameters.PHONE_NUMBER;
        String $r7 = $r6.toString();
        $r5.putString($r7, str);
        OutletMgtAnalytics.Parameters $r62 = OutletMgtAnalytics.Parameters.OUTLET_PHONE_NUMBER;
        String $r2 = $r62.toString();
        $r5.putString($r2, str2);
        OutletMgtAnalytics.Parameters $r63 = OutletMgtAnalytics.Parameters.STATUS;
        String $r22 = $r63.toString();
        $r5.putBoolean($r22, z);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r4, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.SavingsAnalytics.Actions
    public void onCreateSavingsClicked(String str) {
        Log_OC.getArray(str, "phoneNumber");
        SavingsAnalytics.Events $r2 = SavingsAnalytics.Events.CREATE_SAVINGS_CLICKED;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        SavingsAnalytics.Parameters $r5 = SavingsAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.TransferToBankAnalytics
    public void onCustomerInfoEntered(String str, String str2, boolean z, String str3) {
        Log_OC.getArray(str, AttributeType.PHONE);
        Log_OC.getArray(str2, "transactionNote");
        Bundle $r4 = new Bundle();
        TransferToBankAnalytics.EventType.TransferParameters $r5 = TransferToBankAnalytics.EventType.TransferParameters.PHONE_NUMBER;
        String $r6 = String.valueOf($r5);
        $r4.putString($r6, str);
        TransferToBankAnalytics.EventType.TransferParameters $r52 = TransferToBankAnalytics.EventType.TransferParameters.TRANSACTION_NOTE;
        String $r3 = String.valueOf($r52);
        $r4.putString($r3, str2);
        TransferToBankAnalytics.EventType.TransferParameters $r53 = TransferToBankAnalytics.EventType.TransferParameters.STATUS;
        String $r32 = String.valueOf($r53);
        $r4.putBoolean($r32, z);
        TransferToBankAnalytics.EventType.TransferParameters $r54 = TransferToBankAnalytics.EventType.TransferParameters.ERROR_MESSAGE;
        String $r33 = String.valueOf($r54);
        $r4.putString($r33, str3);
        TransferToBankAnalytics.EventType.TransferFlowEvents $r7 = TransferToBankAnalytics.EventType.TransferFlowEvents.SUBMIT_CUSTOMER_INFO;
        String $r34 = String.valueOf($r7);
        logEvent($r34, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.Analytics
    public void onDashboardEvent(String str, User user) {
        Log_OC.getArray(str, "type");
        Bundle $r3 = new Bundle();
        EventType.DashboardParameters $r4 = EventType.DashboardParameters.DASHBOARD_EVENT_TYPE;
        String $r5 = String.valueOf($r4);
        $r3.putString($r5, str);
        EventType.DashboardType $r6 = EventType.DashboardType.DASHBOARD;
        String $r1 = String.valueOf($r6);
        logEvent($r1, $r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.SavingsAnalytics.Actions
    public void onDeactivateSavingsClicked(String str) {
        Log_OC.getArray(str, "phoneNumber");
        SavingsAnalytics.Events $r2 = SavingsAnalytics.Events.DEACTIVATE_SAVINGS_CLICKED;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        SavingsAnalytics.Parameters $r5 = SavingsAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.TransferToBankAnalytics
    public void onEditAccountDetailsClicked() {
        TransferToBankAnalytics.EventType.TransferFlowEvents $r2 = TransferToBankAnalytics.EventType.TransferFlowEvents.EDIT_ACCOUNT_DETAILS;
        String $r1 = String.valueOf($r2);
        logEvent($r1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.TransferToBankAnalytics
    public void onEditAmountClicked() {
        TransferToBankAnalytics.EventType.TransferFlowEvents $r2 = TransferToBankAnalytics.EventType.TransferFlowEvents.EDIT_AMOUNT;
        String $r1 = String.valueOf($r2);
        logEvent$default(this, $r1, null, 2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.SettingsAnalytics.Actions
    public void onEditButtonClick(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        Log_OC.getArray(str, PhoneFragment.ARG_BVN);
        Log_OC.getArray(str2, "businessName");
        Log_OC.getArray(str3, "businessAddress");
        Log_OC.getArray(str4, SendReceiptToTerminalConfirmationBottomSheet.STATE);
        Log_OC.getArray(str5, "lga");
        Log_OC.getArray(str6, "email");
        Log_OC.getArray(str7, "dob");
        Log_OC.getArray(str8, "homeAddress");
        Log_OC.getArray(str9, "closestLandmark");
        SettingsAnalytics.Events $r10 = SettingsAnalytics.Events.EDIT_PROFILE_BUTTON_CLICKED_ON_PROFILE_PAGE;
        String $r11 = $r10.toString();
        Bundle $r12 = getBundle();
        SettingsAnalytics.Parameters $r13 = SettingsAnalytics.Parameters.COMPONENT;
        String $r14 = $r13.toString();
        $r12.putString($r14, str);
        SettingsAnalytics.Parameters $r132 = SettingsAnalytics.Parameters.BUSINESS_NAME;
        String $r9 = $r132.toString();
        $r12.putString($r9, str2);
        SettingsAnalytics.Parameters $r133 = SettingsAnalytics.Parameters.BUSINESS_ADDRESS;
        String $r92 = $r133.toString();
        $r12.putString($r92, str3);
        SettingsAnalytics.Parameters $r134 = SettingsAnalytics.Parameters.STATE;
        String $r93 = $r134.toString();
        $r12.putString($r93, str4);
        SettingsAnalytics.Parameters $r135 = SettingsAnalytics.Parameters.HOME_ADDRESS;
        String $r94 = $r135.toString();
        $r12.putString($r94, str8);
        SettingsAnalytics.Parameters $r136 = SettingsAnalytics.Parameters.CLOSEST_LANDMARK;
        String $r95 = $r136.toString();
        $r12.putString($r95, str9);
        SettingsAnalytics.Parameters $r137 = SettingsAnalytics.Parameters.NAME;
        String $r96 = $r137.toString();
        $r12.putString($r96, str5);
        SettingsAnalytics.Parameters $r138 = SettingsAnalytics.Parameters.EMAIL;
        String $r97 = $r138.toString();
        $r12.putString($r97, str6);
        SettingsAnalytics.Parameters $r139 = SettingsAnalytics.Parameters.OTHER;
        String $r98 = $r139.toString();
        $r12.putString($r98, str7);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r11, $r12);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.TransferToBankAnalytics
    public void onEditCustomerInfoClicked() {
        TransferToBankAnalytics.EventType.TransferFlowEvents $r2 = TransferToBankAnalytics.EventType.TransferFlowEvents.EDIT_CUSTOMER_INFO;
        String $r1 = String.valueOf($r2);
        logEvent($r1, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.InsuranceAnalytics.Actions
    public void onEditPhoneNumberClicked(String str) {
        Log_OC.getArray(str, AttributeType.PHONE);
        SettingsAnalytics.Events $r2 = SettingsAnalytics.Events.INSURANCE_PHONE_NUMBER_CHANGED;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        SettingsAnalytics.Parameters $r5 = SettingsAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.TransactionsCommissionsAnalytics.Actions
    public void onFilterCommissions(String str, String str2) {
        Log_OC.getArray(str, AttributeType.PHONE);
        Log_OC.getArray(str2, AttributeType.DATE);
        TransactionsCommissionsAnalytics.Events $r3 = TransactionsCommissionsAnalytics.Events.FILTER_COMMISSIONS;
        String $r4 = $r3.toString();
        Bundle $r5 = getBundle();
        TransactionsCommissionsAnalytics.Parameters $r6 = TransactionsCommissionsAnalytics.Parameters.PHONE_NUMBER;
        String $r7 = $r6.toString();
        $r5.putString($r7, str);
        TransactionsCommissionsAnalytics.Parameters $r62 = TransactionsCommissionsAnalytics.Parameters.DATE;
        String $r2 = $r62.toString();
        $r5.putString($r2, str2);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r4, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.TransferToBankAnalytics
    public void onFinalTransferPerformed(String str, boolean z, String str2) {
        Log_OC.getArray(str, AttributeType.PHONE);
        Bundle $r3 = new Bundle();
        TransferToBankAnalytics.EventType.TransferParameters $r4 = TransferToBankAnalytics.EventType.TransferParameters.PHONE_NUMBER;
        String $r5 = String.valueOf($r4);
        $r3.putString($r5, str);
        TransferToBankAnalytics.EventType.TransferParameters $r42 = TransferToBankAnalytics.EventType.TransferParameters.STATUS;
        String $r2 = String.valueOf($r42);
        $r3.putBoolean($r2, z);
        TransferToBankAnalytics.EventType.TransferParameters $r43 = TransferToBankAnalytics.EventType.TransferParameters.ERROR_MESSAGE;
        String $r22 = String.valueOf($r43);
        $r3.putString($r22, str2);
        TransferToBankAnalytics.EventType.TransferFlowEvents $r6 = TransferToBankAnalytics.EventType.TransferFlowEvents.PERFORM_FINAL_TRANSFER;
        String $r23 = String.valueOf($r6);
        logEvent($r23, $r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.HomeAnalytics.Actions
    public void onFundWalletClick(String str) {
        Log_OC.getArray(str, AttributeType.PHONE);
        HomeAnalytics.Events $r2 = HomeAnalytics.Events.HOME_SCREEN_FUND_WALLET_CLICKED;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        HomeAnalytics.Parameters $r5 = HomeAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.WalletTopUpAnalytics
    public void onFundWalletClicked(String str) {
        Log_OC.getArray(str, "phoneNumber");
        Bundle $r2 = new Bundle();
        WalletTopUpAnalytics.EventType.WalletTopUpParams $r3 = WalletTopUpAnalytics.EventType.WalletTopUpParams.PHONE_NUMBER;
        String $r4 = String.valueOf($r3);
        $r2.putString($r4, str);
        WalletTopUpAnalytics.EventType.WalletTopUpEvents $r5 = WalletTopUpAnalytics.EventType.WalletTopUpEvents.CLICKED_FUND_WALLET;
        String $r1 = String.valueOf($r5);
        logEvent($r1, $r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.OnboardingAnalytics
    public void onGetStartedClicked() {
        OnboardingAnalytics.EventType.OnboardingFlowEvents $r2 = OnboardingAnalytics.EventType.OnboardingFlowEvents.GET_STARTED_CLICKED;
        String $r1 = $r2.toString();
        logEvent$default(this, $r1, null, 2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.Analytics
    public void onHelpNosButtonClickedEvent(String str, String str2, String str3, User user) {
        Log_OC.getArray(str, "type");
        Log_OC.getArray(str2, "option");
        Log_OC.getArray(str3, TransactionField.AMOUNT);
        Bundle $r5 = new Bundle();
        EventType.IssueParameters $r6 = EventType.IssueParameters.TYPE;
        String $r7 = String.valueOf($r6);
        $r5.putString($r7, str);
        EventType.IssueParameters $r62 = EventType.IssueParameters.AMOUNT;
        String $r3 = String.valueOf($r62);
        $r5.putString($r3, str3);
        EventType.IssueParameters $r63 = EventType.IssueParameters.HELP_OPTION;
        String $r32 = String.valueOf($r63);
        $r5.putString($r32, str2);
        EventType.IssueTypes $r8 = EventType.IssueTypes.HELP_TEXT_UNHELPFUL_CLICKED;
        String $r33 = String.valueOf($r8);
        logEvent($r33, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.Analytics
    public void onHelpYesButtonClickedEvent(String str, String str2, String str3, User user) {
        Log_OC.getArray(str, "type");
        Log_OC.getArray(str2, "option");
        Log_OC.getArray(str3, TransactionField.AMOUNT);
        Bundle $r5 = new Bundle();
        EventType.IssueParameters $r6 = EventType.IssueParameters.TYPE;
        String $r7 = String.valueOf($r6);
        $r5.putString($r7, str);
        EventType.IssueParameters $r62 = EventType.IssueParameters.AMOUNT;
        String $r3 = String.valueOf($r62);
        $r5.putString($r3, str3);
        EventType.IssueParameters $r63 = EventType.IssueParameters.HELP_OPTION;
        String $r32 = String.valueOf($r63);
        $r5.putString($r32, str2);
        EventType.IssueTypes $r8 = EventType.IssueTypes.HELP_TEXT_HELPFUL_CLICKED;
        String $r33 = String.valueOf($r8);
        logEvent($r33, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.IssueResolutionAnalytics.Actions
    public void onIssueHistoryClicked(String str) {
        Log_OC.getArray(str, "phoneNumber");
        IssueResolutionAnalytics.Events $r2 = IssueResolutionAnalytics.Events.ISSUE_HISTORY;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        IssueResolutionAnalytics.Parameters $r5 = IssueResolutionAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.IssueResolutionAnalytics.Actions
    public void onIssueHistoryFilterClicked(String str) {
        Log_OC.getArray(str, "phoneNumber");
        IssueResolutionAnalytics.Events $r2 = IssueResolutionAnalytics.Events.ISSUE_FILTER;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        IssueResolutionAnalytics.Parameters $r5 = IssueResolutionAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.IssueResolutionAnalytics.Actions
    public void onIssueHistorySelected(String str) {
        Log_OC.getArray(str, "phoneNumber");
        IssueResolutionAnalytics.Events $r2 = IssueResolutionAnalytics.Events.ISSUE_SELECTION;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        IssueResolutionAnalytics.Parameters $r5 = IssueResolutionAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.IssueResolutionAnalytics.Actions
    public void onIssueRated(String str, int i) {
        Log_OC.getArray(str, "phoneNumber");
        IssueResolutionAnalytics.Events $r2 = IssueResolutionAnalytics.Events.ISSUE_RATED;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        IssueResolutionAnalytics.Parameters $r5 = IssueResolutionAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        IssueResolutionAnalytics.Parameters $r52 = IssueResolutionAnalytics.Parameters.RATING;
        String $r1 = $r52.toString();
        $r4.putInt($r1, i);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.IssueResolutionAnalytics.Actions
    public void onIssueStatusCheckClicked(String str) {
        Log_OC.getArray(str, "phoneNumber");
        IssueResolutionAnalytics.Events $r2 = IssueResolutionAnalytics.Events.ISSUE_STATUS_CLICKED;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        IssueResolutionAnalytics.Parameters $r5 = IssueResolutionAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.Analytics
    public void onIssueSubmitButtonClickedEvent(String str, String str2, String str3, User user) {
        Log_OC.getArray(str, "type");
        Log_OC.getArray(str2, "comment");
        Log_OC.getArray(str3, "issueTitle");
        Bundle $r5 = new Bundle();
        EventType.IssueParameters $r6 = EventType.IssueParameters.TYPE;
        String $r7 = String.valueOf($r6);
        $r5.putString($r7, str);
        EventType.IssueParameters $r62 = EventType.IssueParameters.COMMENT;
        String $r3 = String.valueOf($r62);
        $r5.putString($r3, str2);
        EventType.IssueParameters $r63 = EventType.IssueParameters.ISSUE_TITLE;
        String $r32 = String.valueOf($r63);
        $r5.putString($r32, str3);
        EventType.IssueTypes $r8 = EventType.IssueTypes.ISSUE_SUBMITTED;
        String $r33 = String.valueOf($r8);
        logEvent($r33, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.IssueResolutionAnalytics.Actions
    public void onIssueSummaryPageReached(String str) {
        Log_OC.getArray(str, "phoneNumber");
        IssueResolutionAnalytics.Events $r2 = IssueResolutionAnalytics.Events.ISSUE_SUMMARY_REACHED;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        IssueResolutionAnalytics.Parameters $r5 = IssueResolutionAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.IssueResolutionAnalytics.Actions
    public void onIssueTypeClicked(String str, String str2, String str3) {
        Log_OC.getArray(str, "issueType");
        Log_OC.getArray(str2, "phoneNumber");
        Log_OC.getArray(str3, TransactionField.STATUS);
        IssueResolutionAnalytics.Events $r4 = IssueResolutionAnalytics.Events.ISSUE_TYPE_CLICKED;
        String $r5 = $r4.toString();
        Bundle $r6 = getBundle();
        IssueResolutionAnalytics.Parameters $r7 = IssueResolutionAnalytics.Parameters.PHONE_NUMBER;
        String $r8 = $r7.toString();
        $r6.putString($r8, str2);
        IssueResolutionAnalytics.Parameters $r72 = IssueResolutionAnalytics.Parameters.ISSUE_TYPE;
        String $r3 = $r72.toString();
        $r6.putString($r3, str);
        IssueResolutionAnalytics.Parameters $r73 = IssueResolutionAnalytics.Parameters.STATUS;
        String $r2 = $r73.toString();
        $r6.putString($r2, str3);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r5, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.KShockAnalytics.Actions
    public void onKShockLanding(String str) {
        Log_OC.getArray(str, AttributeType.PHONE);
        KShockAnalytics.Events $r2 = KShockAnalytics.Events.KSHOCK_LANDING;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        KShockAnalytics.Parameters $r5 = KShockAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.KShockAnalytics.Actions
    public void onKShockPinEntered(String str) {
        Log_OC.getArray(str, AttributeType.PHONE);
        KShockAnalytics.Events $r2 = KShockAnalytics.Events.ENTER_PIN;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        KShockAnalytics.Parameters $r5 = KShockAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.KShockAnalytics.Actions
    public void onKShockTermsAndCondition(String str, boolean z) {
        Log_OC.getArray(str, AttributeType.PHONE);
        KShockAnalytics.Events $r2 = KShockAnalytics.Events.TERMS_AND_CONDITION;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        KShockAnalytics.Parameters $r5 = KShockAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.WalletTopUpAnalytics
    public void onKtaPageVisited(String str) {
        Log_OC.getArray(str, "phoneNumber");
        Bundle $r2 = new Bundle();
        WalletTopUpAnalytics.EventType.WalletTopUpParams $r3 = WalletTopUpAnalytics.EventType.WalletTopUpParams.PHONE_NUMBER;
        String $r4 = String.valueOf($r3);
        $r2.putString($r4, str);
        WalletTopUpAnalytics.EventType.WalletTopUpEvents $r5 = WalletTopUpAnalytics.EventType.WalletTopUpEvents.VISIT_KTA_PAGE;
        String $r1 = String.valueOf($r5);
        logEvent($r1, $r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.KShockAnalytics.Actions
    public void onLoanAmountEntered(String str, double d) {
        Log_OC.getArray(str, AttributeType.PHONE);
        KShockAnalytics.Events $r2 = KShockAnalytics.Events.LOAN_AMOUNT;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        KShockAnalytics.Parameters $r5 = KShockAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        KShockAnalytics.Parameters $r52 = KShockAnalytics.Parameters.PHONE_NUMBER;
        String $r1 = $r52.toString();
        $r4.putDouble($r1, d);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.KShockAnalytics.Actions
    public void onLoanApplicationSubmitted(String str) {
        Log_OC.getArray(str, AttributeType.PHONE);
        KShockAnalytics.Events $r2 = KShockAnalytics.Events.SUCCESS_PAGE;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        KShockAnalytics.Parameters $r5 = KShockAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.KShockAnalytics.Actions
    public void onLoanStatus(String str, String str2) {
        Log_OC.getArray(str, AttributeType.PHONE);
        Log_OC.getArray(str2, "loanStatus");
        KShockAnalytics.Events $r3 = KShockAnalytics.Events.LOAN_STATUS_PAGE;
        String $r4 = $r3.toString();
        Bundle $r5 = getBundle();
        KShockAnalytics.Parameters $r6 = KShockAnalytics.Parameters.PHONE_NUMBER;
        String $r7 = $r6.toString();
        $r5.putString($r7, str);
        KShockAnalytics.Parameters $r62 = KShockAnalytics.Parameters.STATUS;
        String $r2 = $r62.toString();
        $r5.putString($r2, str2);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r4, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.KShockAnalytics.Actions
    public void onLoanSummary(String str) {
        Log_OC.getArray(str, AttributeType.PHONE);
        KShockAnalytics.Events $r2 = KShockAnalytics.Events.LOAN_SUMMARY;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        KShockAnalytics.Parameters $r5 = KShockAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.LoginAnalytics.Actions
    public void onLoginClicked(String str) {
        Log_OC.getArray(str, "phoneNumber");
        LoginAnalytics.Events $r2 = LoginAnalytics.Events.CLICK_LOGIN;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        LoginAnalytics.Parameters $r5 = LoginAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.TransferToMultipleBanksAnalytics.Actions
    public void onMultipleTransferClicked(String str) {
        Log_OC.getArray(str, AttributeType.PHONE);
        TransferToMultipleBanksAnalytics.Events $r2 = TransferToMultipleBanksAnalytics.Events.CLICK_MULTIPLE_TRANSFER;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        TransferToMultipleBanksAnalytics.Parameters $r5 = TransferToMultipleBanksAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.TransferToMultipleBanksAnalytics.Actions
    public void onMultipleTransferPinEntered(String str) {
        Log_OC.getArray(str, AttributeType.PHONE);
        TransferToMultipleBanksAnalytics.Events $r2 = TransferToMultipleBanksAnalytics.Events.ENTERS_PIN;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        TransferToMultipleBanksAnalytics.Parameters $r5 = TransferToMultipleBanksAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.TransferToMultipleBanksAnalytics.Actions
    public void onMultipleTransferStatus(String str, boolean z, String str2) {
        Log_OC.getArray(str, AttributeType.PHONE);
        TransferToMultipleBanksAnalytics.Events $r3 = TransferToMultipleBanksAnalytics.Events.STATUS_OF_REQUEST;
        String $r4 = $r3.toString();
        Bundle $r5 = getBundle();
        TransferToMultipleBanksAnalytics.Parameters $r6 = TransferToMultipleBanksAnalytics.Parameters.PHONE_NUMBER;
        String $r7 = $r6.toString();
        $r5.putString($r7, str);
        TransferToMultipleBanksAnalytics.Parameters $r62 = TransferToMultipleBanksAnalytics.Parameters.STATUS;
        String $r2 = $r62.toString();
        $r5.putBoolean($r2, z);
        TransferToMultipleBanksAnalytics.Parameters $r63 = TransferToMultipleBanksAnalytics.Parameters.ERROR_MESSAGE;
        String $r22 = $r63.toString();
        $r5.putString($r22, str2);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r4, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.TransferToMultipleBanksAnalytics.Actions
    public void onMultipleTransferSuccess(String str) {
        Log_OC.getArray(str, AttributeType.PHONE);
        TransferToMultipleBanksAnalytics.Events $r2 = TransferToMultipleBanksAnalytics.Events.SUCCESS_PAGE;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        TransferToMultipleBanksAnalytics.Parameters $r5 = TransferToMultipleBanksAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.Analytics
    public void onNeedHelpedClickedEvent(String str, String str2, String str3, String str4, User user) {
        Log_OC.getArray(str, "type");
        Log_OC.getArray(str2, TransactionField.AMOUNT);
        Log_OC.getArray(str3, "kycLevel");
        Log_OC.getArray(str4, "reference");
        Bundle $r6 = new Bundle();
        EventType.IssueParameters $r7 = EventType.IssueParameters.TYPE;
        String $r8 = String.valueOf($r7);
        $r6.putString($r8, str);
        EventType.IssueParameters $r72 = EventType.IssueParameters.AMOUNT;
        String $r4 = String.valueOf($r72);
        $r6.putString($r4, str2);
        EventType.IssueParameters $r73 = EventType.IssueParameters.KYC_LEVEL;
        String $r42 = String.valueOf($r73);
        $r6.putString($r42, str3);
        EventType.IssueParameters $r74 = EventType.IssueParameters.REFERENCE;
        String $r43 = String.valueOf($r74);
        $r6.putString($r43, str4);
        EventType.IssueTypes $r9 = EventType.IssueTypes.NEED_HELP_CLICKED;
        String $r44 = String.valueOf($r9);
        logEvent($r44, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.WalletTopUpAnalytics
    public void onNewCardAdded() {
        Bundle $r1 = new Bundle();
        WalletTopUpAnalytics.EventType.WalletTopUpEvents $r3 = WalletTopUpAnalytics.EventType.WalletTopUpEvents.ADD_NEW_CARD;
        String $r2 = String.valueOf($r3);
        logEvent($r2, $r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.Analytics
    public void onNotificationIconClickedEvent(int i, User user) {
        Bundle $r2 = new Bundle();
        EventType.NotificationParameters $r3 = EventType.NotificationParameters.NUMBER_OF_UNREAD_NOTIFICATION;
        String $r4 = String.valueOf($r3);
        $r2.putInt($r4, i);
        EventType.NoticationType $r5 = EventType.NoticationType.NOTIFICATION_ICON;
        String $r42 = String.valueOf($r5);
        logEvent($r42, $r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.Analytics
    public void onNotificationMenuClickedEvent(int i, User user) {
        Bundle $r2 = new Bundle();
        EventType.NotificationParameters $r3 = EventType.NotificationParameters.NUMBER_OF_UNREAD_NOTIFICATION;
        String $r4 = String.valueOf($r3);
        $r2.putInt($r4, i);
        EventType.NoticationType $r5 = EventType.NoticationType.NOTIFICATION_MENU;
        String $r42 = String.valueOf($r5);
        logEvent($r42, $r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.OnboardingAnalytics
    public void onOtpSentForBvnVerification(String str, int i) {
        Log_OC.getArray(str, "userType");
        Bundle $r2 = new Bundle();
        OnboardingAnalytics.EventType.OnboardingParameters $r3 = OnboardingAnalytics.EventType.OnboardingParameters.USERTYPE;
        String $r4 = String.valueOf($r3);
        $r2.putString($r4, str);
        OnboardingAnalytics.EventType.OnboardingParameters $r32 = OnboardingAnalytics.EventType.OnboardingParameters.SCORE;
        String $r1 = String.valueOf($r32);
        $r2.putInt($r1, i);
        OnboardingAnalytics.EventType.OnboardingFlowEvents $r5 = OnboardingAnalytics.EventType.OnboardingFlowEvents.SUBMIT_PERSONAL_DETAILS;
        String $r12 = String.valueOf($r5);
        logEvent($r12, $r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.OutletMgtAnalytics.Actions
    public void onOutletFilterClicked(String str, boolean z) {
        Log_OC.getArray(str, "phoneNumber");
        OutletMgtAnalytics.Events $r2 = OutletMgtAnalytics.Events.CLICK_FILTER;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        OutletMgtAnalytics.Parameters $r5 = OutletMgtAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        OutletMgtAnalytics.Parameters $r52 = OutletMgtAnalytics.Parameters.STATUS;
        String $r1 = $r52.toString();
        $r4.putBoolean($r1, z);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.OutletMgtAnalytics.Actions
    public void onOutletManagerButtonClicked() {
        OutletMgtAnalytics.Events $r2 = OutletMgtAnalytics.Events.CLICK_OUTLET_MGR_BUTTON;
        String $r1 = $r2.toString();
        logEvent$default(this, $r1, null, 2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.OutletMgtAnalytics.Actions
    public void onOutletTypeClicked(String str, String str2) {
        Log_OC.getArray(str, "phoneNumber");
        Log_OC.getArray(str2, "outletType");
        OutletMgtAnalytics.Events $r3 = OutletMgtAnalytics.Events.CLICK_OUTLET_TYPE;
        String $r4 = $r3.toString();
        Bundle $r5 = getBundle();
        OutletMgtAnalytics.Parameters $r6 = OutletMgtAnalytics.Parameters.PHONE_NUMBER;
        String $r7 = $r6.toString();
        $r5.putString($r7, str);
        OutletMgtAnalytics.Parameters $r62 = OutletMgtAnalytics.Parameters.OUTLET_TYPE;
        String $r2 = $r62.toString();
        $r5.putString($r2, str2);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r4, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.TransferToBankAnalytics
    public void onPerformAccountNameLookup(String str, String str2, boolean z, String str3) {
        Log_OC.getArray(str, AttributeType.PHONE);
        Log_OC.getArray(str2, BanksWithMethods.BANK_NAME);
        Bundle $r4 = new Bundle();
        TransferToBankAnalytics.EventType.TransferParameters $r5 = TransferToBankAnalytics.EventType.TransferParameters.PHONE_NUMBER;
        String $r6 = String.valueOf($r5);
        $r4.putString($r6, str);
        TransferToBankAnalytics.EventType.TransferParameters $r52 = TransferToBankAnalytics.EventType.TransferParameters.BANK_NAME;
        String $r3 = String.valueOf($r52);
        $r4.putString($r3, str2);
        TransferToBankAnalytics.EventType.TransferParameters $r53 = TransferToBankAnalytics.EventType.TransferParameters.STATUS;
        String $r32 = String.valueOf($r53);
        $r4.putBoolean($r32, z);
        TransferToBankAnalytics.EventType.TransferParameters $r54 = TransferToBankAnalytics.EventType.TransferParameters.ERROR_MESSAGE;
        String $r33 = String.valueOf($r54);
        $r4.putString($r33, str3);
        TransferToBankAnalytics.EventType.TransferFlowEvents $r7 = TransferToBankAnalytics.EventType.TransferFlowEvents.PERFORM_ACCOUNT_LOOKUP;
        String $r34 = String.valueOf($r7);
        logEvent($r34, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.TransferToBankAnalytics
    public void onPerformServiceFeeLookup(String str, boolean z, String str2) {
        Log_OC.getArray(str, AttributeType.PHONE);
        Bundle $r3 = new Bundle();
        TransferToBankAnalytics.EventType.TransferParameters $r4 = TransferToBankAnalytics.EventType.TransferParameters.PHONE_NUMBER;
        String $r5 = String.valueOf($r4);
        $r3.putString($r5, str);
        TransferToBankAnalytics.EventType.TransferParameters $r42 = TransferToBankAnalytics.EventType.TransferParameters.STATUS;
        String $r2 = String.valueOf($r42);
        $r3.putBoolean($r2, z);
        TransferToBankAnalytics.EventType.TransferParameters $r43 = TransferToBankAnalytics.EventType.TransferParameters.ERROR_MESSAGE;
        String $r22 = String.valueOf($r43);
        $r3.putString($r22, str2);
        TransferToBankAnalytics.EventType.TransferFlowEvents $r6 = TransferToBankAnalytics.EventType.TransferFlowEvents.PERFORM_ACCOUNT_LOOKUP;
        String $r23 = String.valueOf($r6);
        logEvent($r23, $r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.OnboardingAnalytics
    public void onPhoneNumberEntered(String str) {
        Log_OC.getArray(str, AttributeType.PHONE);
        OnboardingAnalytics.EventType.OnboardingFlowEvents $r2 = OnboardingAnalytics.EventType.OnboardingFlowEvents.PHONE_NO_ENTERED;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        OnboardingAnalytics.EventType.OnboardingParameters $r5 = OnboardingAnalytics.EventType.OnboardingParameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.TransferToBankAnalytics
    public void onPinEnteredClicked(String str, boolean z, String str2) {
        Log_OC.getArray(str, AttributeType.PHONE);
        Bundle $r3 = new Bundle();
        TransferToBankAnalytics.EventType.TransferParameters $r4 = TransferToBankAnalytics.EventType.TransferParameters.PHONE_NUMBER;
        String $r5 = String.valueOf($r4);
        $r3.putString($r5, str);
        TransferToBankAnalytics.EventType.TransferParameters $r42 = TransferToBankAnalytics.EventType.TransferParameters.STATUS;
        String $r2 = String.valueOf($r42);
        $r3.putBoolean($r2, z);
        TransferToBankAnalytics.EventType.TransferParameters $r43 = TransferToBankAnalytics.EventType.TransferParameters.ERROR_MESSAGE;
        String $r22 = String.valueOf($r43);
        $r3.putString($r22, str2);
        TransferToBankAnalytics.EventType.TransferFlowEvents $r6 = TransferToBankAnalytics.EventType.TransferFlowEvents.SUBMIT_KUDI_PIN;
        String $r23 = String.valueOf($r6);
        logEvent($r23, $r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.OutletMgtAnalytics.Actions
    public void onPinEnteredForCreateOutletClicked(String str, String str2, boolean z) {
        Log_OC.getArray(str, "userPhoneNumber");
        Log_OC.getArray(str2, "outletPhoneNumber");
        OutletMgtAnalytics.Events $r3 = OutletMgtAnalytics.Events.CLICK_PIN_ENTERED;
        String $r4 = $r3.toString();
        Bundle $r5 = getBundle();
        OutletMgtAnalytics.Parameters $r6 = OutletMgtAnalytics.Parameters.PHONE_NUMBER;
        String $r7 = $r6.toString();
        $r5.putString($r7, str);
        OutletMgtAnalytics.Parameters $r62 = OutletMgtAnalytics.Parameters.OUTLET_PHONE_NUMBER;
        String $r2 = $r62.toString();
        $r5.putString($r2, str2);
        OutletMgtAnalytics.Parameters $r63 = OutletMgtAnalytics.Parameters.STATUS;
        String $r22 = $r63.toString();
        $r5.putBoolean($r22, z);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r4, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.LoginAnalytics.Actions
    public void onPrimaryPhoneVerificationClicked(String str) {
        Log_OC.getArray(str, "phoneNumber");
        LoginAnalytics.Events $r2 = LoginAnalytics.Events.CLICK_VERIFY_PRIMARY_PHONE_NUMBER;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        LoginAnalytics.Parameters $r5 = LoginAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.Analytics
    public void onPrinterButtonClickedEvent(String str, String str2, String str3, User user) {
        Log_OC.getArray(str, "reference");
        Log_OC.getArray(str2, "type");
        Log_OC.getArray(str3, TransactionField.AMOUNT);
        Bundle $r5 = new Bundle();
        EventType.TransactionParameters $r6 = EventType.TransactionParameters.REFERENCE;
        String $r7 = String.valueOf($r6);
        $r5.putString($r7, str);
        EventType.TransactionParameters $r62 = EventType.TransactionParameters.TRANSACTION_TYPE;
        String $r3 = String.valueOf($r62);
        $r5.putString($r3, str2);
        EventType.TransactionParameters $r63 = EventType.TransactionParameters.AMOUNT;
        String $r32 = String.valueOf($r63);
        $r5.putString($r32, str3);
        EventType.TransactionTypes $r8 = EventType.TransactionTypes.TRANSACTION_PRINTER_CLICKED;
        String $r33 = String.valueOf($r8);
        logEvent($r33, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.SettingsAnalytics.Actions
    public void onResetPinButtonClick(String str, String str2) {
        Log_OC.getArray(str, AttributeType.PHONE);
        Log_OC.getArray(str2, TransactionField.STATUS);
        SettingsAnalytics.Events $r3 = SettingsAnalytics.Events.RESET_PIN_CLICKED_ON_SECURITY_PAGE;
        String $r4 = $r3.toString();
        Bundle $r5 = getBundle();
        SettingsAnalytics.Parameters $r6 = SettingsAnalytics.Parameters.PHONE_NUMBER;
        String $r7 = $r6.toString();
        $r5.putString($r7, str);
        SettingsAnalytics.Parameters $r62 = SettingsAnalytics.Parameters.STATUS;
        String $r2 = $r62.toString();
        $r5.putString($r2, str2);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r4, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.SettingsAnalytics.Actions
    public void onSaveAccountNumberClick(String str, String str2) {
        Log_OC.getArray(str, AttributeType.PHONE);
        Log_OC.getArray(str2, TransactionField.STATUS);
        SettingsAnalytics.Events $r3 = SettingsAnalytics.Events.SAVE_ACCOUNT_NUMBER_CLICKED;
        String $r4 = $r3.toString();
        Bundle $r5 = getBundle();
        SettingsAnalytics.Parameters $r6 = SettingsAnalytics.Parameters.PHONE_NUMBER;
        String $r7 = $r6.toString();
        $r5.putString($r7, str);
        SettingsAnalytics.Parameters $r62 = SettingsAnalytics.Parameters.STATUS;
        String $r2 = $r62.toString();
        $r5.putString($r2, str2);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r4, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.SettingsAnalytics.Actions
    public void onSaveProfileButtonClick(String str, String str2) {
        Log_OC.getArray(str, AttributeType.PHONE);
        Log_OC.getArray(str2, TransactionField.STATUS);
        SettingsAnalytics.Events $r3 = SettingsAnalytics.Events.SAVE_PROFILE_CLICKED_ON_EDIT_PROFILE_PAGE;
        String $r4 = $r3.toString();
        Bundle $r5 = getBundle();
        SettingsAnalytics.Parameters $r6 = SettingsAnalytics.Parameters.PHONE_NUMBER;
        String $r7 = $r6.toString();
        $r5.putString($r7, str);
        SettingsAnalytics.Parameters $r62 = SettingsAnalytics.Parameters.STATUS;
        String $r2 = $r62.toString();
        $r5.putString($r2, str2);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r4, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.SavingsAnalytics.Actions
    public void onSavingsGetStartedClicked() {
        SavingsAnalytics.Events $r2 = SavingsAnalytics.Events.GET_STARTED;
        String $r1 = $r2.toString();
        logEvent$default(this, $r1, null, 2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.SavingsAnalytics.Actions
    public void onSavingsGoalEntered(String str) {
        Log_OC.getArray(str, "goalName");
        SavingsAnalytics.Events $r2 = SavingsAnalytics.Events.SAVINGS_GOAL_ENTERED;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        SavingsAnalytics.Parameters $r5 = SavingsAnalytics.Parameters.GOAL_NAME;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.SavingsAnalytics.Actions
    public void onSavingsMenuItemClicked() {
        SavingsAnalytics.Events $r2 = SavingsAnalytics.Events.SAVINGS_MENU_CLICKED;
        String $r1 = $r2.toString();
        logEvent$default(this, $r1, null, 2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.SavingsAnalytics.Actions
    public void onSavingsPinEntered() {
        SavingsAnalytics.Events $r2 = SavingsAnalytics.Events.SAVINGS_PIN_ENTERED;
        String $r1 = $r2.toString();
        logEvent$default(this, $r1, null, 2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.SavingsAnalytics.Actions
    public void onSavingsReviewed() {
        SavingsAnalytics.Events $r2 = SavingsAnalytics.Events.SAVINGS_OVERVIEW_COMPLETE;
        String $r1 = $r2.toString();
        logEvent$default(this, $r1, null, 2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.OnboardingAnalytics
    public void onSecondaryPhoneNumberProvided(String str) {
        Log_OC.getArray(str, AttributeType.PHONE);
        OnboardingAnalytics.EventType.OnboardingFlowEvents $r2 = OnboardingAnalytics.EventType.OnboardingFlowEvents.SECONDARY_PHONE_PROVIDED;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        OnboardingAnalytics.EventType.OnboardingParameters $r5 = OnboardingAnalytics.EventType.OnboardingParameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.LoginAnalytics.Actions
    public void onSecondaryPhoneNumberVerificationClicked(String str) {
        Log_OC.getArray(str, "phoneNumber");
        LoginAnalytics.Events $r2 = LoginAnalytics.Events.CLICK_VERIFY_SECONDARY_PHONE_NUMBER;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        LoginAnalytics.Parameters $r5 = LoginAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.OnboardingAnalytics
    public void onSecondaryPhoneNumberVerified(String str) {
        Log_OC.getArray(str, AttributeType.PHONE);
        OnboardingAnalytics.EventType.OnboardingFlowEvents $r2 = OnboardingAnalytics.EventType.OnboardingFlowEvents.SECONDARY_PHONE_VERIFIED;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        OnboardingAnalytics.EventType.OnboardingParameters $r5 = OnboardingAnalytics.EventType.OnboardingParameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.OutletMgtAnalytics.Actions
    public void onSelectOutletItem(String str, String str2) {
        Log_OC.getArray(str, "userPhoneNumber");
        Log_OC.getArray(str2, "outletId");
        OutletMgtAnalytics.Events $r3 = OutletMgtAnalytics.Events.SELECT_OUTLET_ITEM;
        String $r4 = $r3.toString();
        Bundle $r5 = getBundle();
        OutletMgtAnalytics.Parameters $r6 = OutletMgtAnalytics.Parameters.PHONE_NUMBER;
        String $r7 = $r6.toString();
        $r5.putString($r7, str);
        OutletMgtAnalytics.Parameters $r62 = OutletMgtAnalytics.Parameters.OUTLET_ID;
        String $r2 = $r62.toString();
        $r5.putString($r2, str2);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r4, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.Analytics
    public void onSendAMessageEvent(User user) {
        EventType.IssueTypes $r3 = EventType.IssueTypes.SEND_A_MESSAGE_CLICKED;
        String $r1 = String.valueOf($r3);
        logEvent$default(this, $r1, null, 2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.TransferToBankAnalytics
    public void onSendAmountClicked(String str, boolean z, String str2) {
        Log_OC.getArray(str, AttributeType.PHONE);
        Bundle $r3 = new Bundle();
        TransferToBankAnalytics.EventType.TransferParameters $r4 = TransferToBankAnalytics.EventType.TransferParameters.PHONE_NUMBER;
        String $r5 = String.valueOf($r4);
        $r3.putString($r5, str);
        TransferToBankAnalytics.EventType.TransferParameters $r42 = TransferToBankAnalytics.EventType.TransferParameters.STATUS;
        String $r2 = String.valueOf($r42);
        $r3.putBoolean($r2, z);
        TransferToBankAnalytics.EventType.TransferParameters $r43 = TransferToBankAnalytics.EventType.TransferParameters.ERROR_MESSAGE;
        String $r22 = String.valueOf($r43);
        $r3.putString($r22, str2);
        TransferToBankAnalytics.EventType.TransferFlowEvents $r6 = TransferToBankAnalytics.EventType.TransferFlowEvents.CONFIRM_TRANSFER_SUMMARY;
        String $r23 = String.valueOf($r6);
        logEvent($r23, $r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.SettingsAnalytics.Actions
    public void onSettingsMenuClick(String str) {
        Log_OC.getArray(str, AttributeType.PHONE);
        SettingsAnalytics.Events $r2 = SettingsAnalytics.Events.SETTINGS_CLICKED_ON_SIDEBAR;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        SettingsAnalytics.Parameters $r5 = SettingsAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.Analytics
    public void onShowUnAuthorizedInstalledScreen() {
        EventType.UnAuthorizedInstallationTypes $r3 = EventType.UnAuthorizedInstallationTypes.UNAUTHORIZED_INSTALLATON_SCREEN_SHOWN;
        String $r2 = $r3.toString();
        Bundle $r1 = new Bundle();
        logEvent($r2, $r1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.InsuranceAnalytics.Actions
    public void onSignUpButtonClicked(String str) {
        Log_OC.getArray(str, AttributeType.PHONE);
        SettingsAnalytics.Events $r2 = SettingsAnalytics.Events.INSURANCE_SIGNUP_CLICKED;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        SettingsAnalytics.Parameters $r5 = SettingsAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.IssueResolutionAnalytics.Actions
    public void onSocialNetworkClicked(String str, String str2) {
        Log_OC.getArray(str, "phoneNumber");
        Log_OC.getArray(str2, "socialNetwork");
        IssueResolutionAnalytics.Events $r3 = IssueResolutionAnalytics.Events.SOCIAL_NETWORK_CLICKED;
        String $r4 = $r3.toString();
        Bundle $r5 = getBundle();
        IssueResolutionAnalytics.Parameters $r6 = IssueResolutionAnalytics.Parameters.PHONE_NUMBER;
        String $r7 = $r6.toString();
        $r5.putString($r7, str);
        IssueResolutionAnalytics.Parameters $r62 = IssueResolutionAnalytics.Parameters.SOCIAL_NETWORK;
        String $r2 = $r62.toString();
        $r5.putString($r2, str2);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r4, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.OnboardingAnalytics
    public void onSplashScreenReached() {
        OnboardingAnalytics.EventType.OnboardingFlowEvents $r2 = OnboardingAnalytics.EventType.OnboardingFlowEvents.SPLASH_SCREEN_REACHED;
        String $r1 = $r2.toString();
        logEvent$default(this, $r1, null, 2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.TransferToBankAnalytics
    public void onSubmitAccountDetails(String str, boolean z, String str2) {
        Log_OC.getArray(str, AttributeType.PHONE);
        Bundle $r3 = new Bundle();
        TransferToBankAnalytics.EventType.TransferParameters $r4 = TransferToBankAnalytics.EventType.TransferParameters.PHONE_NUMBER;
        String $r5 = String.valueOf($r4);
        $r3.putString($r5, str);
        TransferToBankAnalytics.EventType.TransferParameters $r42 = TransferToBankAnalytics.EventType.TransferParameters.STATUS;
        String $r2 = String.valueOf($r42);
        $r3.putBoolean($r2, z);
        TransferToBankAnalytics.EventType.TransferParameters $r43 = TransferToBankAnalytics.EventType.TransferParameters.ERROR_MESSAGE;
        String $r22 = String.valueOf($r43);
        $r3.putString($r22, str2);
        TransferToBankAnalytics.EventType.TransferFlowEvents $r6 = TransferToBankAnalytics.EventType.TransferFlowEvents.SUBMIT_ACCOUNT_DETAILS;
        String $r23 = String.valueOf($r6);
        logEvent($r23, $r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.InsuranceAnalytics.Actions
    public void onSubmitInsuranceButtonClicked(String str) {
        Log_OC.getArray(str, AttributeType.PHONE);
        SettingsAnalytics.Events $r2 = SettingsAnalytics.Events.INSURANCE_SUBMIT_BUTTON_CLICKED;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        SettingsAnalytics.Parameters $r5 = SettingsAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.IssueResolutionAnalytics.Actions
    public void onSubmitIssueClicked(String str, String str2) {
        Log_OC.getArray(str, "phoneNumber");
        Log_OC.getArray(str2, TransactionField.STATUS);
        IssueResolutionAnalytics.Events $r3 = IssueResolutionAnalytics.Events.SUBMIT_ISSUE_CLICKED;
        String $r4 = $r3.toString();
        Bundle $r5 = getBundle();
        IssueResolutionAnalytics.Parameters $r6 = IssueResolutionAnalytics.Parameters.PHONE_NUMBER;
        String $r7 = $r6.toString();
        $r5.putString($r7, str);
        IssueResolutionAnalytics.Parameters $r62 = IssueResolutionAnalytics.Parameters.STATUS;
        String $r2 = $r62.toString();
        $r5.putString($r2, str2);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r4, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.InsuranceAnalytics.Actions
    public void onSuccessfulInsuranceSignUp(String str, String str2, String str3) {
        Log_OC.getArray(str, AttributeType.PHONE);
        Log_OC.getArray(str2, TransactionField.STATUS);
        SettingsAnalytics.Events $r4 = SettingsAnalytics.Events.INSURANCE_DETAILS_SUBMITTED;
        String $r5 = $r4.toString();
        Bundle $r6 = getBundle();
        SettingsAnalytics.Parameters $r7 = SettingsAnalytics.Parameters.PHONE_NUMBER;
        String $r8 = $r7.toString();
        $r6.putString($r8, str);
        SettingsAnalytics.Parameters $r72 = SettingsAnalytics.Parameters.STATUS;
        String $r3 = $r72.toString();
        $r6.putString($r3, str2);
        SettingsAnalytics.Parameters $r73 = SettingsAnalytics.Parameters.ERROR_MESSAGE;
        String $r32 = $r73.toString();
        $r6.putString($r32, str3);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r5, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.IssueResolutionAnalytics.Actions
    public void onSupportButtonClicked(String str, String str2) {
        Log_OC.getArray(str, "phoneNumber");
        Log_OC.getArray(str2, TransactionField.STATUS);
        IssueResolutionAnalytics.Events $r3 = IssueResolutionAnalytics.Events.SUPPORT_MENU_CLICKED;
        String $r4 = $r3.toString();
        Bundle $r5 = getBundle();
        IssueResolutionAnalytics.Parameters $r6 = IssueResolutionAnalytics.Parameters.PHONE_NUMBER;
        String $r7 = $r6.toString();
        $r5.putString($r7, str);
        IssueResolutionAnalytics.Parameters $r62 = IssueResolutionAnalytics.Parameters.STATUS;
        String $r2 = $r62.toString();
        $r5.putString($r2, str2);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r4, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.OutletMgtAnalytics.Actions
    public void onSuspendOutlet(String str, boolean z) {
        Log_OC.getArray(str, "userPhoneNumber");
        OutletMgtAnalytics.Events $r2 = OutletMgtAnalytics.Events.CLICK_SUSPEND_OUTLET;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        OutletMgtAnalytics.Parameters $r5 = OutletMgtAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        OutletMgtAnalytics.Parameters $r52 = OutletMgtAnalytics.Parameters.STATUS;
        String $r1 = $r52.toString();
        $r4.putBoolean($r1, z);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.SavingsAnalytics.Actions
    public void onTermsAndConditionAccepted() {
        SavingsAnalytics.Events $r2 = SavingsAnalytics.Events.TERMS_AND_CONDITION_ACCEPTED;
        String $r1 = $r2.toString();
        logEvent$default(this, $r1, null, 2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.Analytics
    public void onTransactionAuthEvent(User user) {
        EventType.TransactionTypes $r3 = EventType.TransactionTypes.TRANSACTION_AUTHORIZATION;
        String $r1 = String.valueOf($r3);
        logEvent$default(this, $r1, null, 2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.Analytics
    public void onTransactionCreationEvent(String str, String str2, String str3, String str4, String str5, User user) {
        Log_OC.getArray(str, "type");
        Log_OC.getArray(str2, TransactionField.AMOUNT);
        Log_OC.getArray(str3, "reference");
        Log_OC.getArray(str4, "productId");
        Log_OC.getArray(str5, "fee");
        Bundle $r7 = new Bundle();
        EventType.TransactionParameters $r8 = EventType.TransactionParameters.TYPE;
        String $r9 = String.valueOf($r8);
        $r7.putString($r9, str);
        EventType.TransactionParameters $r82 = EventType.TransactionParameters.AMOUNT;
        String $r5 = String.valueOf($r82);
        $r7.putString($r5, str2);
        EventType.TransactionParameters $r83 = EventType.TransactionParameters.REFERENCE;
        String $r52 = String.valueOf($r83);
        $r7.putString($r52, str3);
        EventType.TransactionParameters $r84 = EventType.TransactionParameters.PRODUCT_ID;
        String $r53 = String.valueOf($r84);
        $r7.putString($r53, str4);
        EventType.TransactionParameters $r85 = EventType.TransactionParameters.IOERR;
        String $r54 = String.valueOf($r85);
        $r7.putString($r54, str5);
        EventType.TransactionTypes $r10 = EventType.TransactionTypes.TRANSACTION_CREATION;
        String $r55 = String.valueOf($r10);
        logEvent($r55, $r7);
    }

    @Override // ai.kudi.agent.core.analytics.Analytics
    public void onTransactionFilterIconClickedEvent(User user) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.Analytics
    public void onTransactionFilterSubmitButtonClickedEvent(String str, String str2, String str3, User user) {
        Log_OC.getArray(str, "type");
        Log_OC.getArray(str2, "timeFrom");
        Log_OC.getArray(str3, "timeTo");
        Bundle $r5 = new Bundle();
        EventType.TransactionParameters $r6 = EventType.TransactionParameters.TYPE;
        String $r7 = String.valueOf($r6);
        $r5.putString($r7, str);
        EventType.TransactionParameters $r62 = EventType.TransactionParameters.TIME_FROM;
        String $r3 = String.valueOf($r62);
        $r5.putString($r3, str2);
        EventType.TransactionParameters $r63 = EventType.TransactionParameters.TIME_TO;
        String $r32 = String.valueOf($r63);
        $r5.putString($r32, str3);
        EventType.TransactionTypes $r8 = EventType.TransactionTypes.TRANSACTION_FILTERED_CLICKED;
        String $r33 = String.valueOf($r8);
        logEvent($r33, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.Analytics
    public void onTransactionLookUpEvent(String str, String str2, String str3, String str4, String str5, User user) {
        Log_OC.getArray(str, "type");
        Log_OC.getArray(str2, TransactionField.AMOUNT);
        Log_OC.getArray(str3, "reference");
        Log_OC.getArray(str4, "productId");
        Log_OC.getArray(str5, "fee");
        Bundle $r7 = new Bundle();
        EventType.TransactionParameters $r8 = EventType.TransactionParameters.TYPE;
        String $r9 = String.valueOf($r8);
        $r7.putString($r9, str);
        EventType.TransactionParameters $r82 = EventType.TransactionParameters.AMOUNT;
        String $r5 = String.valueOf($r82);
        $r7.putString($r5, str2);
        EventType.TransactionParameters $r83 = EventType.TransactionParameters.REFERENCE;
        String $r52 = String.valueOf($r83);
        $r7.putString($r52, str3);
        EventType.TransactionParameters $r84 = EventType.TransactionParameters.PRODUCT_ID;
        String $r53 = String.valueOf($r84);
        $r7.putString($r53, str4);
        EventType.TransactionParameters $r85 = EventType.TransactionParameters.IOERR;
        String $r54 = String.valueOf($r85);
        $r7.putString($r54, str5);
        EventType.TransactionTypes $r10 = EventType.TransactionTypes.TRANSACTION_LOOKUP;
        String $r55 = String.valueOf($r10);
        logEvent($r55, $r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.Analytics
    public void onTransactionPriceFetchEvent(String str, String str2, String str3, String str4, String str5, User user) {
        Log_OC.getArray(str, "type");
        Log_OC.getArray(str2, TransactionField.AMOUNT);
        Log_OC.getArray(str3, "reference");
        Log_OC.getArray(str4, "productId");
        Log_OC.getArray(str5, "fee");
        Bundle $r7 = new Bundle();
        EventType.TransactionParameters $r8 = EventType.TransactionParameters.TYPE;
        String $r9 = String.valueOf($r8);
        $r7.putString($r9, str);
        EventType.TransactionParameters $r82 = EventType.TransactionParameters.AMOUNT;
        String $r5 = String.valueOf($r82);
        $r7.putString($r5, str2);
        EventType.TransactionParameters $r83 = EventType.TransactionParameters.REFERENCE;
        String $r52 = String.valueOf($r83);
        $r7.putString($r52, str3);
        EventType.TransactionParameters $r84 = EventType.TransactionParameters.PRODUCT_ID;
        String $r53 = String.valueOf($r84);
        $r7.putString($r53, str4);
        EventType.TransactionParameters $r85 = EventType.TransactionParameters.IOERR;
        String $r54 = String.valueOf($r85);
        $r7.putString($r54, str5);
        EventType.TransactionTypes $r10 = EventType.TransactionTypes.TRANSACTION_PRICE_FETCH;
        String $r55 = String.valueOf($r10);
        logEvent($r55, $r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.Analytics
    public void onTransactionRefreshedClickedEvent(String str, String str2, String str3, String str4, String str5, User user) {
        Log_OC.getArray(str, "type");
        Log_OC.getArray(str2, TransactionField.AMOUNT);
        Log_OC.getArray(str3, "reference");
        Log_OC.getArray(str4, "productId");
        Log_OC.getArray(str5, "fee");
        Bundle $r7 = new Bundle();
        EventType.TransactionParameters $r8 = EventType.TransactionParameters.TYPE;
        String $r9 = String.valueOf($r8);
        $r7.putString($r9, str);
        EventType.TransactionParameters $r82 = EventType.TransactionParameters.AMOUNT;
        String $r5 = String.valueOf($r82);
        $r7.putString($r5, str2);
        EventType.TransactionParameters $r83 = EventType.TransactionParameters.REFERENCE;
        String $r52 = String.valueOf($r83);
        $r7.putString($r52, str3);
        EventType.TransactionParameters $r84 = EventType.TransactionParameters.PRODUCT_ID;
        String $r53 = String.valueOf($r84);
        $r7.putString($r53, str4);
        EventType.TransactionParameters $r85 = EventType.TransactionParameters.IOERR;
        String $r54 = String.valueOf($r85);
        $r7.putString($r54, str5);
        EventType.TransactionTypes $r10 = EventType.TransactionTypes.TRANSACTION_REFERESH;
        String $r55 = String.valueOf($r10);
        logEvent($r55, $r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.Analytics
    public void onTransactionTypeSelectedEvent(String str, User user) {
        Log_OC.getArray(str, "type");
        Bundle $r3 = new Bundle();
        EventType.TransactionParameters $r4 = EventType.TransactionParameters.TYPE;
        String $r5 = String.valueOf($r4);
        $r3.putString($r5, str);
        EventType.TransactionTypes $r6 = EventType.TransactionTypes.TRANSACTION_INITIATED;
        String $r1 = String.valueOf($r6);
        logEvent($r1, $r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.HomeAnalytics.Actions
    public void onTransferMenuClick(String str) {
        Log_OC.getArray(str, AttributeType.PHONE);
        HomeAnalytics.Events $r2 = HomeAnalytics.Events.HOME_SCREEN_TRANSFER_CLICKED;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        HomeAnalytics.Parameters $r5 = HomeAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.SettingsAnalytics.Actions
    public void onUpgradeAccountButtonClick(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Log_OC.getArray(str, AttributeType.PHONE);
        Log_OC.getArray(str2, "idType");
        Log_OC.getArray(str3, "idNumber");
        Log_OC.getArray(str4, "nokName");
        Log_OC.getArray(str5, "nokNumber");
        Log_OC.getArray(str6, "utilityBill");
        Log_OC.getArray(str7, "kycLevel");
        SettingsAnalytics.Events $r8 = SettingsAnalytics.Events.UPGRADE_ACCOUNT_BUTTON_CLICKED_ON_PROFILE_PAGE;
        String $r9 = $r8.toString();
        Bundle $r10 = getBundle();
        SettingsAnalytics.Parameters $r11 = SettingsAnalytics.Parameters.PHONE_NUMBER;
        String $r12 = $r11.toString();
        $r10.putString($r12, str);
        SettingsAnalytics.Parameters $r112 = SettingsAnalytics.Parameters.ID_TYPE;
        String $r7 = $r112.toString();
        $r10.putString($r7, str2);
        SettingsAnalytics.Parameters $r113 = SettingsAnalytics.Parameters.ID_NUMBER;
        String $r72 = $r113.toString();
        $r10.putString($r72, str3);
        SettingsAnalytics.Parameters $r114 = SettingsAnalytics.Parameters.NOK_NAME;
        String $r73 = $r114.toString();
        $r10.putString($r73, str4);
        SettingsAnalytics.Parameters $r115 = SettingsAnalytics.Parameters.NOK_NUMBER;
        String $r74 = $r115.toString();
        $r10.putString($r74, str5);
        SettingsAnalytics.Parameters $r116 = SettingsAnalytics.Parameters.UTILITY_BILL;
        String $r75 = $r116.toString();
        $r10.putString($r75, str6);
        SettingsAnalytics.Parameters $r117 = SettingsAnalytics.Parameters.INITIAL_KYC_LEVEL;
        String $r76 = $r117.toString();
        $r10.putString($r76, str7);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r9, $r10);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.WalletTopUpAnalytics
    public void onUssdCodeCopied(String str, boolean z) {
        Log_OC.getArray(str, "phoneNumber");
        Bundle $r2 = new Bundle();
        WalletTopUpAnalytics.EventType.WalletTopUpParams $r3 = WalletTopUpAnalytics.EventType.WalletTopUpParams.PHONE_NUMBER;
        String $r4 = String.valueOf($r3);
        $r2.putString($r4, str);
        WalletTopUpAnalytics.EventType.WalletTopUpParams $r32 = WalletTopUpAnalytics.EventType.WalletTopUpParams.STATUS;
        String $r1 = String.valueOf($r32);
        $r2.putBoolean($r1, z);
        WalletTopUpAnalytics.EventType.WalletTopUpEvents $r5 = WalletTopUpAnalytics.EventType.WalletTopUpEvents.COPY_USSD_CODE;
        String $r12 = String.valueOf($r5);
        logEvent($r12, $r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.WalletTopUpAnalytics
    public void onUssdCodeDialed(String str, boolean z) {
        Log_OC.getArray(str, "phoneNumber");
        Bundle $r2 = new Bundle();
        WalletTopUpAnalytics.EventType.WalletTopUpParams $r3 = WalletTopUpAnalytics.EventType.WalletTopUpParams.PHONE_NUMBER;
        String $r4 = String.valueOf($r3);
        $r2.putString($r4, str);
        WalletTopUpAnalytics.EventType.WalletTopUpParams $r32 = WalletTopUpAnalytics.EventType.WalletTopUpParams.STATUS;
        String $r1 = String.valueOf($r32);
        $r2.putBoolean($r1, z);
        WalletTopUpAnalytics.EventType.WalletTopUpEvents $r5 = WalletTopUpAnalytics.EventType.WalletTopUpEvents.DIAL_USSD_CODE;
        String $r12 = String.valueOf($r5);
        logEvent($r12, $r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.WithdrawalAnalytics.Actions
    public void onUssdInfoCopied(String str) {
        Log_OC.getArray(str, AttributeType.PHONE);
        WithdrawalAnalytics.Events $r2 = WithdrawalAnalytics.Events.COPY_USSD_INFO;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        WithdrawalAnalytics.Parameters $r5 = WithdrawalAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.WithdrawalAnalytics.Actions
    public void onUssdProviderSelected(String str) {
        Log_OC.getArray(str, AttributeType.PHONE);
        WithdrawalAnalytics.Events $r2 = WithdrawalAnalytics.Events.SELECT_PROVIDER;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        WithdrawalAnalytics.Parameters $r5 = WithdrawalAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.WithdrawalAnalytics.Actions
    public void onUssdTransactionCompleted(String str, String str2) {
        Log_OC.getArray(str, AttributeType.PHONE);
        Log_OC.getArray(str2, TransactionField.STATUS);
        WithdrawalAnalytics.Events $r3 = WithdrawalAnalytics.Events.COMPLETE_TRANSACTION;
        String $r4 = $r3.toString();
        Bundle $r5 = getBundle();
        WithdrawalAnalytics.Parameters $r6 = WithdrawalAnalytics.Parameters.PHONE_NUMBER;
        String $r7 = $r6.toString();
        $r5.putString($r7, str);
        WithdrawalAnalytics.Parameters $r62 = WithdrawalAnalytics.Parameters.STATUS;
        String $r2 = $r62.toString();
        $r5.putString($r2, str2);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r4, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.WithdrawalAnalytics.Actions
    public void onUssdVoucherCodeValidated(String str, String str2) {
        Log_OC.getArray(str, AttributeType.PHONE);
        Log_OC.getArray(str2, TransactionField.STATUS);
        WithdrawalAnalytics.Events $r3 = WithdrawalAnalytics.Events.VALIDATE_CODE;
        String $r4 = $r3.toString();
        Bundle $r5 = getBundle();
        WithdrawalAnalytics.Parameters $r6 = WithdrawalAnalytics.Parameters.PHONE_NUMBER;
        String $r7 = $r6.toString();
        $r5.putString($r7, str);
        WithdrawalAnalytics.Parameters $r62 = WithdrawalAnalytics.Parameters.STATUS;
        String $r2 = $r62.toString();
        $r5.putString($r2, str2);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r4, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.WithdrawalAnalytics.Actions
    public void onUssdWithdrawalOptionClicked(String str) {
        Log_OC.getArray(str, AttributeType.PHONE);
        WithdrawalAnalytics.Events $r2 = WithdrawalAnalytics.Events.SELECT_USSD_WITHDRAWAL;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        WithdrawalAnalytics.Parameters $r5 = WithdrawalAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.SettingsAnalytics.Actions
    public void onVerifyAccountButtonClick(String str) {
        Log_OC.getArray(str, AttributeType.PHONE);
        SettingsAnalytics.Events $r2 = SettingsAnalytics.Events.VERIFY_ACCOUNT_BUTTON_CLICKED_ON_SETTINGS_PAGE;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        SettingsAnalytics.Parameters $r5 = SettingsAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.LoginAnalytics.Actions
    public void onVerifyFaceIdClicked(String str) {
        Log_OC.getArray(str, "phoneNumber");
        LoginAnalytics.Events $r2 = LoginAnalytics.Events.CLICK_VERIFY_FACE_ID;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        LoginAnalytics.Parameters $r5 = LoginAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.OutletMgtAnalytics.Actions
    public void onViewOutletAccount(String str, String str2) {
        Log_OC.getArray(str, "userPhoneNumber");
        Log_OC.getArray(str2, "outletPhoneNumber");
        OutletMgtAnalytics.Events $r3 = OutletMgtAnalytics.Events.VIEW_OUTLET_ACCOUNT;
        String $r4 = $r3.toString();
        Bundle $r5 = getBundle();
        OutletMgtAnalytics.Parameters $r6 = OutletMgtAnalytics.Parameters.PHONE_NUMBER;
        String $r7 = $r6.toString();
        $r5.putString($r7, str);
        OutletMgtAnalytics.Parameters $r62 = OutletMgtAnalytics.Parameters.OUTLET_PHONE_NUMBER;
        String $r2 = $r62.toString();
        $r5.putString($r2, str2);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r4, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.OutletMgtAnalytics.Actions
    public void onViewOutletProfile(String str, String str2) {
        Log_OC.getArray(str, "userPhoneNumber");
        Log_OC.getArray(str2, "outletPhoneNumber");
        OutletMgtAnalytics.Events $r3 = OutletMgtAnalytics.Events.VIEW_OUTLET_PROFILE;
        String $r4 = $r3.toString();
        Bundle $r5 = getBundle();
        OutletMgtAnalytics.Parameters $r6 = OutletMgtAnalytics.Parameters.PHONE_NUMBER;
        String $r7 = $r6.toString();
        $r5.putString($r7, str);
        OutletMgtAnalytics.Parameters $r62 = OutletMgtAnalytics.Parameters.OUTLET_PHONE_NUMBER;
        String $r2 = $r62.toString();
        $r5.putString($r2, str2);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r4, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.OutletMgtAnalytics.Actions
    public void onViewOutletTransaction(String str, String str2) {
        Log_OC.getArray(str, "userPhoneNumber");
        Log_OC.getArray(str2, "outletId");
        OutletMgtAnalytics.Events $r3 = OutletMgtAnalytics.Events.VIEW_OUTLET_TRANSACTION;
        String $r4 = $r3.toString();
        Bundle $r5 = getBundle();
        OutletMgtAnalytics.Parameters $r6 = OutletMgtAnalytics.Parameters.PHONE_NUMBER;
        String $r7 = $r6.toString();
        $r5.putString($r7, str);
        OutletMgtAnalytics.Parameters $r62 = OutletMgtAnalytics.Parameters.OUTLET_ID;
        String $r2 = $r62.toString();
        $r5.putString($r2, str2);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r4, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.IssueResolutionAnalytics.Actions
    public void onVisitWebsiteClicked(String str) {
        Log_OC.getArray(str, "phoneNumber");
        IssueResolutionAnalytics.Events $r2 = IssueResolutionAnalytics.Events.VISIT_WEBSITE_CLICKED;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        IssueResolutionAnalytics.Parameters $r5 = IssueResolutionAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.VoucherAnalytics
    public void onVoucherAmountEntered(String str, String str2, User user) {
        Log_OC.getArray(str, "phoneNumber");
        Log_OC.getArray(str2, TransactionField.AMOUNT);
        Bundle $r4 = new Bundle();
        VoucherEventType.VoucherEventParameters $r5 = VoucherEventType.VoucherEventParameters.AMOUNT;
        String $r6 = String.valueOf($r5);
        $r4.putString($r6, str2);
        VoucherEventType.VoucherEventParameters $r52 = VoucherEventType.VoucherEventParameters.PHONE_NUMBER;
        String $r2 = String.valueOf($r52);
        $r4.putString($r2, str);
        VoucherEventType.CashIn $r7 = VoucherEventType.CashIn.VOUCHER_AMOUNT_ENTERED;
        String $r1 = String.valueOf($r7);
        logEvent($r1, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.VoucherAnalytics
    public void onVoucherCashInCreationButtonClicked(String str, boolean z, String str2, User user) {
        Log_OC.getArray(str, "phoneNumber");
        Bundle $r4 = new Bundle();
        VoucherEventType.VoucherEventParameters $r5 = VoucherEventType.VoucherEventParameters.PHONE_NUMBER;
        String $r6 = String.valueOf($r5);
        $r4.putString($r6, str);
        VoucherEventType.VoucherEventParameters $r52 = VoucherEventType.VoucherEventParameters.IS_SUCCESSFUL;
        String $r2 = String.valueOf($r52);
        $r4.putBoolean($r2, z);
        VoucherEventType.VoucherEventParameters $r53 = VoucherEventType.VoucherEventParameters.ERROR;
        String $r22 = String.valueOf($r53);
        $r4.putString($r22, str2);
        VoucherEventType.CashIn $r7 = VoucherEventType.CashIn.VOUCHER_CASH_BUTTON_CLICKED;
        String $r23 = String.valueOf($r7);
        logEvent($r23, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.VoucherAnalytics
    public void onVoucherCashOutRequestEvent(boolean z, String str, String str2, User user) {
        Log_OC.getArray(str, "reference");
        Bundle $r4 = new Bundle();
        VoucherEventType.VoucherEventParameters $r5 = VoucherEventType.VoucherEventParameters.IS_SUCCESSFUL;
        String $r6 = String.valueOf($r5);
        $r4.putBoolean($r6, z);
        VoucherEventType.VoucherEventParameters $r52 = VoucherEventType.VoucherEventParameters.REFERENCE;
        String $r62 = String.valueOf($r52);
        $r4.putString($r62, str);
        VoucherEventType.VoucherEventParameters $r53 = VoucherEventType.VoucherEventParameters.ERROR;
        String $r1 = String.valueOf($r53);
        $r4.putString($r1, str2);
        VoucherEventType.CashOut $r7 = VoucherEventType.CashOut.VOUCHER_CASH_OUT_BUTTON_CLICKED;
        String $r12 = String.valueOf($r7);
        logEvent($r12, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.VoucherAnalytics
    public void onVoucherCodeLookUpClickedEvent(String str, boolean z, String str2, User user) {
        Log_OC.getArray(str, "voucherCode");
        Bundle $r4 = new Bundle();
        VoucherEventType.VoucherEventParameters $r5 = VoucherEventType.VoucherEventParameters.IS_SUCCESSFUL;
        String $r2 = String.valueOf($r5);
        $r4.putBoolean($r2, z);
        VoucherEventType.VoucherEventParameters $r52 = VoucherEventType.VoucherEventParameters.ERROR;
        String $r22 = String.valueOf($r52);
        $r4.putString($r22, str2);
        VoucherEventType.CashOut $r6 = VoucherEventType.CashOut.VOUCHER_CODE_LOOKUP;
        String $r23 = String.valueOf($r6);
        logEvent($r23, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.VoucherAnalytics
    public void onVoucherPinCashInPinVerification(String str, boolean z, String str2, User user) {
        Log_OC.getArray(str, "phoneNumber");
        Bundle $r4 = new Bundle();
        VoucherEventType.VoucherEventParameters $r5 = VoucherEventType.VoucherEventParameters.PHONE_NUMBER;
        String $r6 = String.valueOf($r5);
        $r4.putString($r6, str);
        VoucherEventType.VoucherEventParameters $r52 = VoucherEventType.VoucherEventParameters.IS_SUCCESSFUL;
        String $r2 = String.valueOf($r52);
        $r4.putBoolean($r2, z);
        VoucherEventType.VoucherEventParameters $r53 = VoucherEventType.VoucherEventParameters.ERROR;
        String $r22 = String.valueOf($r53);
        $r4.putString($r22, str2);
        VoucherEventType.CashIn $r7 = VoucherEventType.CashIn.PIN_VERIFICATION_ON_VOUHCER_CASH_IN;
        String $r23 = String.valueOf($r7);
        logEvent($r23, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.VoucherAnalytics
    public void onVoucherPinCashOutPinVerification(String str, boolean z, String str2, User user) {
        Log_OC.getArray(str, "phoneNumber");
        Bundle $r4 = new Bundle();
        VoucherEventType.VoucherEventParameters $r5 = VoucherEventType.VoucherEventParameters.IS_SUCCESSFUL;
        String $r6 = String.valueOf($r5);
        $r4.putBoolean($r6, z);
        VoucherEventType.VoucherEventParameters $r52 = VoucherEventType.VoucherEventParameters.PHONE_NUMBER;
        String $r62 = String.valueOf($r52);
        $r4.putString($r62, str);
        VoucherEventType.VoucherEventParameters $r53 = VoucherEventType.VoucherEventParameters.ERROR;
        String $r2 = String.valueOf($r53);
        $r4.putString($r2, str2);
        VoucherEventType.CashOut $r7 = VoucherEventType.CashOut.PIN_VERIFICATION_ON_VOUCHER_CASHOUT;
        String $r22 = String.valueOf($r7);
        logEvent($r22, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.VoucherAnalytics
    public void onVoucherRecipientInfoEntered(String str, String str2, User user) {
        Log_OC.getArray(str, "phoneNumber");
        Log_OC.getArray(str2, "name");
        Bundle $r4 = new Bundle();
        VoucherEventType.VoucherEventParameters $r5 = VoucherEventType.VoucherEventParameters.PHONE_NUMBER;
        String $r6 = String.valueOf($r5);
        $r4.putString($r6, str);
        VoucherEventType.VoucherEventParameters $r52 = VoucherEventType.VoucherEventParameters.NAME;
        String $r2 = String.valueOf($r52);
        $r4.putString($r2, str2);
        VoucherEventType.CashIn $r7 = VoucherEventType.CashIn.VOUCHER_CASH_IN_RECIPIENT_INFO_ENTRY;
        String $r22 = String.valueOf($r7);
        logEvent($r22, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.VoucherAnalytics
    public void onVoucherRecipientPhoneVerificationEvent(boolean z, String str, String str2, User user) {
        Log_OC.getArray(str, "recipientNameOrPhone");
        Bundle $r4 = new Bundle();
        VoucherEventType.VoucherEventParameters $r5 = VoucherEventType.VoucherEventParameters.IS_SUCCESSFUL;
        String $r6 = String.valueOf($r5);
        $r4.putBoolean($r6, z);
        VoucherEventType.VoucherEventParameters $r52 = VoucherEventType.VoucherEventParameters.RECIPIENT_NAME_OR_PHONE;
        String $r62 = String.valueOf($r52);
        $r4.putString($r62, str);
        VoucherEventType.VoucherEventParameters $r53 = VoucherEventType.VoucherEventParameters.ERROR;
        String $r1 = String.valueOf($r53);
        $r4.putString($r1, str2);
        VoucherEventType.CashOut $r7 = VoucherEventType.CashOut.VOUCHER_RECIPIENT_PHONE_VERIFICATION;
        String $r12 = String.valueOf($r7);
        logEvent($r12, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.VoucherAnalytics
    public void onVoucherSenderInfoEntered(String str, String str2, User user) {
        Log_OC.getArray(str, "phoneNumber");
        Log_OC.getArray(str2, "name");
        Bundle $r4 = new Bundle();
        VoucherEventType.VoucherEventParameters $r5 = VoucherEventType.VoucherEventParameters.PHONE_NUMBER;
        String $r6 = String.valueOf($r5);
        $r4.putString($r6, str);
        VoucherEventType.VoucherEventParameters $r52 = VoucherEventType.VoucherEventParameters.NAME;
        String $r2 = String.valueOf($r52);
        $r4.putString($r2, str2);
        VoucherEventType.CashIn $r7 = VoucherEventType.CashIn.VOUCHER_CASH_IN_SENDER_INFO_ENTRY;
        String $r22 = String.valueOf($r7);
        logEvent($r22, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.OnboardingAnalytics
    public void onWelcomeScreenReached(String str) {
        Log_OC.getArray(str, AttributeType.PHONE);
        OnboardingAnalytics.EventType.OnboardingFlowEvents $r2 = OnboardingAnalytics.EventType.OnboardingFlowEvents.WELCOME_SCREEN_REACHED;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        OnboardingAnalytics.EventType.OnboardingParameters $r5 = OnboardingAnalytics.EventType.OnboardingParameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.SavingsAnalytics.Actions
    public void onWithdrawAmountEntered(String str) {
        Log_OC.getArray(str, TransactionField.AMOUNT);
        SavingsAnalytics.Events $r2 = SavingsAnalytics.Events.AMOUNT_ENTERED;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        SavingsAnalytics.Parameters $r5 = SavingsAnalytics.Parameters.AMOUNT_TO_WITHDRAW;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.HomeAnalytics.Actions
    public void onWithdrawMoneyMenuClick(String str) {
        Log_OC.getArray(str, AttributeType.PHONE);
        HomeAnalytics.Events $r2 = HomeAnalytics.Events.HOME_SCREEN_WITHDRAW_MONEY_CLICKED;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        HomeAnalytics.Parameters $r5 = HomeAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.SavingsAnalytics.Actions
    public void onWithdrawSuccessScreenLaunch() {
        SavingsAnalytics.Events $r2 = SavingsAnalytics.Events.WITHDRAW_SUCCESS_SCREEN_DISPLAYED;
        String $r1 = $r2.toString();
        logEvent$default(this, $r1, null, 2, null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.OnboardingAnalytics
    public void outletDetailsSubmitted(String str, boolean z, String str2, String str3) {
        Log_OC.getArray(str, AttributeType.PHONE);
        Log_OC.getArray(str2, "userType");
        Bundle $r4 = new Bundle();
        OnboardingAnalytics.EventType.OnboardingParameters $r5 = OnboardingAnalytics.EventType.OnboardingParameters.PHONE_NUMBER;
        String $r6 = String.valueOf($r5);
        $r4.putString($r6, str);
        OnboardingAnalytics.EventType.OnboardingParameters $r52 = OnboardingAnalytics.EventType.OnboardingParameters.STATUS;
        String $r3 = String.valueOf($r52);
        $r4.putBoolean($r3, z);
        OnboardingAnalytics.EventType.OnboardingParameters $r53 = OnboardingAnalytics.EventType.OnboardingParameters.ERROR_MESSAGE;
        String $r32 = String.valueOf($r53);
        $r4.putString($r32, str3);
        OnboardingAnalytics.EventType.OnboardingParameters $r54 = OnboardingAnalytics.EventType.OnboardingParameters.USERTYPE;
        String $r33 = String.valueOf($r54);
        $r4.putString($r33, str2);
        OnboardingAnalytics.EventType.OnboardingFlowEvents $r7 = OnboardingAnalytics.EventType.OnboardingFlowEvents.SUBMIT_OUTLET_DETAILS;
        String $r34 = String.valueOf($r7);
        logEvent($r34, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.OnboardingAnalytics
    public void personalDetailsSubmitted(String str, boolean z, String str2, String str3) {
        Log_OC.getArray(str, AttributeType.PHONE);
        Log_OC.getArray(str2, "userType");
        Bundle $r4 = new Bundle();
        OnboardingAnalytics.EventType.OnboardingParameters $r5 = OnboardingAnalytics.EventType.OnboardingParameters.PHONE_NUMBER;
        String $r6 = String.valueOf($r5);
        $r4.putString($r6, str);
        OnboardingAnalytics.EventType.OnboardingParameters $r52 = OnboardingAnalytics.EventType.OnboardingParameters.STATUS;
        String $r3 = String.valueOf($r52);
        $r4.putBoolean($r3, z);
        OnboardingAnalytics.EventType.OnboardingParameters $r53 = OnboardingAnalytics.EventType.OnboardingParameters.ERROR_MESSAGE;
        String $r32 = String.valueOf($r53);
        $r4.putString($r32, str3);
        OnboardingAnalytics.EventType.OnboardingParameters $r54 = OnboardingAnalytics.EventType.OnboardingParameters.USERTYPE;
        String $r33 = String.valueOf($r54);
        $r4.putString($r33, str2);
        OnboardingAnalytics.EventType.OnboardingFlowEvents $r7 = OnboardingAnalytics.EventType.OnboardingFlowEvents.SUBMIT_PERSONAL_DETAILS;
        String $r34 = String.valueOf($r7);
        logEvent($r34, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.OnboardingAnalytics
    public void phoneNumberAndBvnSubmitted(String str, String str2, boolean z, String str3, String str4) {
        Log_OC.getArray(str, AttributeType.PHONE);
        Log_OC.getArray(str2, PhoneFragment.ARG_BVN);
        Log_OC.getArray(str3, "userType");
        Bundle $r5 = new Bundle();
        OnboardingAnalytics.EventType.OnboardingParameters $r6 = OnboardingAnalytics.EventType.OnboardingParameters.PHONE_NUMBER;
        String $r7 = String.valueOf($r6);
        $r5.putString($r7, str);
        OnboardingAnalytics.EventType.OnboardingParameters $r62 = OnboardingAnalytics.EventType.OnboardingParameters.IS_CLOSED;
        String $r4 = String.valueOf($r62);
        $r5.putString($r4, str2);
        OnboardingAnalytics.EventType.OnboardingParameters $r63 = OnboardingAnalytics.EventType.OnboardingParameters.STATUS;
        String $r42 = String.valueOf($r63);
        $r5.putBoolean($r42, z);
        OnboardingAnalytics.EventType.OnboardingParameters $r64 = OnboardingAnalytics.EventType.OnboardingParameters.ERROR_MESSAGE;
        String $r43 = String.valueOf($r64);
        $r5.putString($r43, str4);
        OnboardingAnalytics.EventType.OnboardingParameters $r65 = OnboardingAnalytics.EventType.OnboardingParameters.USERTYPE;
        String $r44 = String.valueOf($r65);
        $r5.putString($r44, str3);
        OnboardingAnalytics.EventType.OnboardingFlowEvents $r8 = OnboardingAnalytics.EventType.OnboardingFlowEvents.SUBMIT_PHONE_BVN_SUBMIT;
        String $r45 = String.valueOf($r8);
        logEvent($r45, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.OnboardingAnalytics
    public void pinSubmitted(String str, boolean z, String str2) {
        Log_OC.getArray(str, AttributeType.PHONE);
        Bundle $r3 = new Bundle();
        OnboardingAnalytics.EventType.OnboardingParameters $r4 = OnboardingAnalytics.EventType.OnboardingParameters.PHONE_NUMBER;
        String $r5 = String.valueOf($r4);
        $r3.putString($r5, str);
        OnboardingAnalytics.EventType.OnboardingParameters $r42 = OnboardingAnalytics.EventType.OnboardingParameters.STATUS;
        String $r2 = String.valueOf($r42);
        $r3.putBoolean($r2, z);
        OnboardingAnalytics.EventType.OnboardingParameters $r43 = OnboardingAnalytics.EventType.OnboardingParameters.ERROR_MESSAGE;
        String $r22 = String.valueOf($r43);
        $r3.putString($r22, str2);
        OnboardingAnalytics.EventType.OnboardingFlowEvents $r6 = OnboardingAnalytics.EventType.OnboardingFlowEvents.CREATE_PIN;
        String $r23 = String.valueOf($r6);
        logEvent($r23, $r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.MarketplaceAnalytics.Actions
    public void proceedToCollectionClicked(String str, boolean z) {
        Log_OC.getArray(str, "phoneNumber");
        MarketplaceAnalytics.Events $r2 = MarketplaceAnalytics.Events.MARKETPLACE_PRODUCT_DETAIL_PAGE_OPENED;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        MarketplaceAnalytics.Parameters $r5 = MarketplaceAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        MarketplaceAnalytics.Parameters $r52 = MarketplaceAnalytics.Parameters.STATUS;
        String $r1 = $r52.toString();
        $r4.putBoolean($r1, z);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.OnboardingAnalytics
    public void profilePictureCaptured(String str, boolean z, String str2, String str3) {
        Log_OC.getArray(str, AttributeType.PHONE);
        Log_OC.getArray(str3, "userType");
        Bundle $r4 = new Bundle();
        OnboardingAnalytics.EventType.OnboardingParameters $r5 = OnboardingAnalytics.EventType.OnboardingParameters.PHONE_NUMBER;
        String $r6 = String.valueOf($r5);
        $r4.putString($r6, str);
        OnboardingAnalytics.EventType.OnboardingParameters $r52 = OnboardingAnalytics.EventType.OnboardingParameters.STATUS;
        String $r3 = String.valueOf($r52);
        $r4.putBoolean($r3, z);
        OnboardingAnalytics.EventType.OnboardingParameters $r53 = OnboardingAnalytics.EventType.OnboardingParameters.USERTYPE;
        String $r32 = String.valueOf($r53);
        $r4.putString($r32, str3);
        OnboardingAnalytics.EventType.OnboardingParameters $r54 = OnboardingAnalytics.EventType.OnboardingParameters.ERROR_MESSAGE;
        String $r33 = String.valueOf($r54);
        $r4.putString($r33, str2);
        OnboardingAnalytics.EventType.OnboardingParameters $r55 = OnboardingAnalytics.EventType.OnboardingParameters.USERTYPE;
        String $r34 = String.valueOf($r55);
        $r4.putString($r34, str3);
        OnboardingAnalytics.EventType.OnboardingFlowEvents $r7 = OnboardingAnalytics.EventType.OnboardingFlowEvents.PROFILE_PICTURE_CAPTURED;
        String $r35 = String.valueOf($r7);
        logEvent($r35, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.OnboardingAnalytics
    public void profilePictureUploaded(String str, boolean z, String str2, String str3) {
        Log_OC.getArray(str, AttributeType.PHONE);
        Log_OC.getArray(str3, "userType");
        Bundle $r4 = new Bundle();
        OnboardingAnalytics.EventType.OnboardingParameters $r5 = OnboardingAnalytics.EventType.OnboardingParameters.PHONE_NUMBER;
        String $r6 = String.valueOf($r5);
        $r4.putString($r6, str);
        OnboardingAnalytics.EventType.OnboardingParameters $r52 = OnboardingAnalytics.EventType.OnboardingParameters.STATUS;
        String $r3 = String.valueOf($r52);
        $r4.putBoolean($r3, z);
        OnboardingAnalytics.EventType.OnboardingParameters $r53 = OnboardingAnalytics.EventType.OnboardingParameters.ERROR_MESSAGE;
        String $r32 = String.valueOf($r53);
        $r4.putString($r32, str2);
        OnboardingAnalytics.EventType.OnboardingParameters $r54 = OnboardingAnalytics.EventType.OnboardingParameters.USERTYPE;
        String $r33 = String.valueOf($r54);
        $r4.putString($r33, str3);
        OnboardingAnalytics.EventType.OnboardingFlowEvents $r7 = OnboardingAnalytics.EventType.OnboardingFlowEvents.PROFILE_PICTURE_UPLOADED;
        String $r34 = String.valueOf($r7);
        logEvent($r34, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.IssueResolutionAnalytics.Actions
    public void reviewOurAppClicked(String str) {
        Log_OC.getArray(str, "phoneNumber");
        IssueResolutionAnalytics.Events $r2 = IssueResolutionAnalytics.Events.REVIEW_APP_CLICKED;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        IssueResolutionAnalytics.Parameters $r5 = IssueResolutionAnalytics.Parameters.PHONE_NUMBER;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.SavingsAnalytics.Actions
    public void savingsDateSelected(String str) {
        Log_OC.getArray(str, AttributeType.DATE);
        SavingsAnalytics.Events $r2 = SavingsAnalytics.Events.SAVINGS_DATE_SELECTED;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        SavingsAnalytics.Parameters $r5 = SavingsAnalytics.Parameters.SAVING_DATE;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.SavingsAnalytics.Actions
    public void savingsDurationSelected(String str) {
        Log_OC.getArray(str, "duration");
        SavingsAnalytics.Events $r2 = SavingsAnalytics.Events.SAVINGS_DURATION_SELECTED;
        String $r3 = $r2.toString();
        Bundle $r4 = getBundle();
        SavingsAnalytics.Parameters $r5 = SavingsAnalytics.Parameters.SAVING_DURATION;
        String $r6 = $r5.toString();
        $r4.putString($r6, str);
        C13666w c13666w = C13666w.f30112a;
        logEvent($r3, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.OnboardingAnalytics
    public void skipFingerPrintClicked(String str) {
        Log_OC.getArray(str, "userType");
        Bundle $r2 = new Bundle();
        OnboardingAnalytics.EventType.OnboardingParameters $r3 = OnboardingAnalytics.EventType.OnboardingParameters.USERTYPE;
        String $r4 = String.valueOf($r3);
        $r2.putString($r4, str);
        OnboardingAnalytics.EventType.OnboardingFlowEvents $r5 = OnboardingAnalytics.EventType.OnboardingFlowEvents.ONBOARDING_SKIP_FINGERPRINT_CLICKED;
        String $r1 = String.valueOf($r5);
        logEvent($r1, $r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.OnboardingAnalytics
    public void skipOnWelcomeScreenClicked(String str, String str2) {
        Log_OC.getArray(str, AttributeType.PHONE);
        Log_OC.getArray(str2, "userType");
        Bundle $r3 = new Bundle();
        OnboardingAnalytics.EventType.OnboardingParameters $r4 = OnboardingAnalytics.EventType.OnboardingParameters.PHONE_NUMBER;
        String $r5 = String.valueOf($r4);
        $r3.putString($r5, str);
        OnboardingAnalytics.EventType.OnboardingParameters $r42 = OnboardingAnalytics.EventType.OnboardingParameters.USERTYPE;
        String $r2 = String.valueOf($r42);
        $r3.putString($r2, str2);
        OnboardingAnalytics.EventType.OnboardingFlowEvents $r6 = OnboardingAnalytics.EventType.OnboardingFlowEvents.WELCOME_SCREEN_SKIP_CLICKED;
        String $r22 = String.valueOf($r6);
        logEvent($r22, $r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.OnboardingAnalytics
    public void verifyPhoneNumber(String str, boolean z, String str2, String str3) {
        Log_OC.getArray(str, AttributeType.PHONE);
        Log_OC.getArray(str2, "userType");
        Bundle $r4 = new Bundle();
        OnboardingAnalytics.EventType.OnboardingParameters $r5 = OnboardingAnalytics.EventType.OnboardingParameters.PHONE_NUMBER;
        String $r6 = String.valueOf($r5);
        $r4.putString($r6, str);
        OnboardingAnalytics.EventType.OnboardingParameters $r52 = OnboardingAnalytics.EventType.OnboardingParameters.STATUS;
        String $r3 = String.valueOf($r52);
        $r4.putBoolean($r3, z);
        OnboardingAnalytics.EventType.OnboardingParameters $r53 = OnboardingAnalytics.EventType.OnboardingParameters.STATUS;
        String $r32 = String.valueOf($r53);
        $r4.putString($r32, str3);
        OnboardingAnalytics.EventType.OnboardingParameters $r54 = OnboardingAnalytics.EventType.OnboardingParameters.USERTYPE;
        String $r33 = String.valueOf($r54);
        $r4.putString($r33, str2);
        OnboardingAnalytics.EventType.OnboardingFlowEvents $r7 = OnboardingAnalytics.EventType.OnboardingFlowEvents.VERIFY_PHONE_NUMBER;
        String $r34 = String.valueOf($r7);
        logEvent($r34, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.ReferralAnalytics
    public void viewEarningsClicked(String str, boolean z, String str2) {
        Log_OC.getArray(str, "phoneNumber");
        Bundle $r3 = new Bundle();
        ReferralAnalytics.EventType.AgentReferralParameters $r4 = ReferralAnalytics.EventType.AgentReferralParameters.PHONE_NUMBER;
        String $r5 = String.valueOf($r4);
        $r3.putString($r5, str);
        ReferralAnalytics.EventType.AgentReferralParameters $r42 = ReferralAnalytics.EventType.AgentReferralParameters.STATUS;
        String $r2 = String.valueOf($r42);
        $r3.putBoolean($r2, z);
        ReferralAnalytics.EventType.AgentReferralParameters $r43 = ReferralAnalytics.EventType.AgentReferralParameters.ERROR_MESSAGE;
        String $r22 = String.valueOf($r43);
        $r3.putString($r22, str2);
        ReferralAnalytics.EventType.AgentReferralType $r6 = ReferralAnalytics.EventType.AgentReferralType.VIEW_EARNINGS_CLICKED;
        String $r23 = String.valueOf($r6);
        logEvent($r23, $r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.ReferralAnalytics
    public void viewReferredAgentSummaryClicked(String str, String str2, boolean z, String str3) {
        Log_OC.getArray(str, "phoneNumber");
        Log_OC.getArray(str2, "referredPhoneNumber");
        Bundle $r4 = new Bundle();
        ReferralAnalytics.EventType.AgentReferralParameters $r5 = ReferralAnalytics.EventType.AgentReferralParameters.PHONE_NUMBER;
        String $r6 = String.valueOf($r5);
        $r4.putString($r6, str);
        ReferralAnalytics.EventType.AgentReferralParameters $r52 = ReferralAnalytics.EventType.AgentReferralParameters.REFERRED_PHONE_NUMBER;
        String $r3 = String.valueOf($r52);
        $r4.putString($r3, str2);
        ReferralAnalytics.EventType.AgentReferralParameters $r53 = ReferralAnalytics.EventType.AgentReferralParameters.STATUS;
        String $r32 = String.valueOf($r53);
        $r4.putBoolean($r32, z);
        ReferralAnalytics.EventType.AgentReferralParameters $r54 = ReferralAnalytics.EventType.AgentReferralParameters.ERROR_MESSAGE;
        String $r33 = String.valueOf($r54);
        $r4.putString($r33, str3);
        ReferralAnalytics.EventType.AgentReferralType $r7 = ReferralAnalytics.EventType.AgentReferralType.VIEW_REFERRED_AGENT_SUMMARY_CLICKED;
        String $r34 = String.valueOf($r7);
        logEvent($r34, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.analytics.contracts.ReferralAnalytics
    public void withdrawAvailableFundsClicked(String str, double d, boolean z, String str2) {
        Log_OC.getArray(str, "phoneNumber");
        Bundle $r3 = new Bundle();
        ReferralAnalytics.EventType.AgentReferralParameters $r4 = ReferralAnalytics.EventType.AgentReferralParameters.PHONE_NUMBER;
        String $r5 = String.valueOf($r4);
        $r3.putString($r5, str);
        ReferralAnalytics.EventType.AgentReferralParameters $r42 = ReferralAnalytics.EventType.AgentReferralParameters.STATUS;
        String $r2 = String.valueOf($r42);
        $r3.putBoolean($r2, z);
        ReferralAnalytics.EventType.AgentReferralParameters $r43 = ReferralAnalytics.EventType.AgentReferralParameters.AMOUNT;
        String $r22 = String.valueOf($r43);
        $r3.putDouble($r22, d);
        ReferralAnalytics.EventType.AgentReferralParameters $r44 = ReferralAnalytics.EventType.AgentReferralParameters.ERROR_MESSAGE;
        String $r23 = String.valueOf($r44);
        $r3.putString($r23, str2);
        ReferralAnalytics.EventType.AgentReferralType $r6 = ReferralAnalytics.EventType.AgentReferralType.WITHDRAW_AVAILABLE_FUNDS_CLICKED;
        String $r24 = String.valueOf($r6);
        logEvent($r24, $r3);
    }
}
