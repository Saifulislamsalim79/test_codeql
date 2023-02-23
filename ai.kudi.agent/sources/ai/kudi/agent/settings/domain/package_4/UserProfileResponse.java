package ai.kudi.agent.settings.domain.package_4;

import ai.kudi.agent.register.data.sources.CacheDataSource;
import ai.kudi.agent.register.p022v2.p023ui.PhoneFragment;
import ai.kudi.agent.transactions.p032ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.wallettopup.data.BanksWithMethods;
import com.google.gson.u.c;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: UserProfileResponse.kt */
@Metadata(m10422d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0003\b\u0085\u0001\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BÉ\u0005\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000106\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010CJ\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0089\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010JJ\u0011\u0010\u008a\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010JJ\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0098\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010JJ\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u009f\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010JJ\f\u0010 \u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¡\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¢\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010£\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010JJ\f\u0010¤\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¥\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¦\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010§\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¨\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010©\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ª\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010«\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010JJ\f\u0010¬\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010®\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¯\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010°\u0001\u001a\u0004\u0018\u000106HÆ\u0003J\f\u0010±\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010²\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010JJ\f\u0010³\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010´\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010µ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¶\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010·\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¸\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¹\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010º\u0001\u001a\u0004\u0018\u00010@HÆ\u0003J\f\u0010»\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¼\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010½\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¾\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¿\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010À\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÔ\u0005\u0010Á\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00100\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010?\u001a\u0004\u0018\u00010@2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0003\u0010Â\u0001J\u0015\u0010Ã\u0001\u001a\u00020\b2\t\u0010Ä\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010Å\u0001\u001a\u00030Æ\u0001HÖ\u0001J\n\u0010Ç\u0001\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u0010ER\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010ER\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u0010ER\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010K\u001a\u0004\bI\u0010JR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bL\u0010ER\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bM\u0010ER\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bN\u0010ER\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u0010ER\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bP\u0010ER\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010ER\u0015\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010K\u001a\u0004\bR\u0010JR\u001a\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010K\u001a\u0004\bS\u0010JR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bT\u0010ER\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bU\u0010ER\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bV\u0010ER\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bW\u0010ER\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010ER\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u0010ER\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u0010ER\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b_\u0010ER\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b`\u0010ER\u001a\u0010\u001f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010K\u001a\u0004\ba\u0010JR\u0018\u0010 \u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bb\u0010ER\u0018\u0010!\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u0010ER\u0018\u0010\"\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bd\u0010ER\u0018\u0010#\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\be\u0010ER\u0018\u0010B\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bf\u0010ER\u0018\u0010$\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bg\u0010ER\u001a\u0010%\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010K\u001a\u0004\bh\u0010JR\u0013\u0010&\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bi\u0010ER\u0018\u0010'\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bj\u0010ER\u0018\u0010(\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bk\u0010ER\u001a\u0010)\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010K\u001a\u0004\bl\u0010JR\u0018\u0010*\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bm\u0010ER\u0018\u0010+\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bn\u0010ER\u0018\u0010,\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bo\u0010ER\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bp\u0010ER\u0013\u0010-\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bq\u0010ER\u0013\u0010.\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\br\u0010ER\u0013\u0010/\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bs\u0010ER\u0015\u00100\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010K\u001a\u0004\bt\u0010JR\u0013\u00101\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bu\u0010ER\u0013\u00102\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bv\u0010ER\u0013\u00103\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bw\u0010ER\u0013\u00104\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bx\u0010ER\u0013\u00105\u001a\u0004\u0018\u000106¢\u0006\b\n\u0000\u001a\u0004\by\u0010zR\u0013\u0010A\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b{\u0010ER\u0013\u00107\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b|\u0010ER\u0013\u00108\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b}\u0010ER\u0013\u00109\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b~\u0010ER\u0013\u0010:\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010ER\u0014\u0010;\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010ER\u0014\u0010<\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010ER\u0014\u0010=\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010ER\u0014\u0010>\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0083\u0001\u0010ER\u0015\u0010?\u001a\u0004\u0018\u00010@¢\u0006\n\n\u0000\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001¨\u0006È\u0001"}, m10421d2 = {"Lai/kudi/agent/settings/domain/dto/UserProfileResponse;", "", BanksWithMethods.ACCOUNT_NAME, "", BanksWithMethods.ACCOUNT_NUMBER, "accountType", "agentKyc", "aggregator", "", "aggregatorId", "bank", "businessAddress", "businessName", "businessType", PhoneFragment.ARG_BVN, "bvnVerified", "c2C", "cacDocumentId", "nextOfKin", "cacRegistrationNo", "category", "city", "commissionWallet", "Lai/kudi/agent/settings/domain/dto/CommissionWallet;", "device", "Lai/kudi/agent/settings/domain/dto/Device;", "dob", "email", "estimatedTransactionRange", "firstName", "gender", "hasOutlets", "hashedPin", "homeAddress", "id", "identificationCardImageId", "insurancePlan", "kcashEnabled", "kycLevel", "lastName", "localGovernmentArea", "manager", "managerId", "marketerId", "mposVendor", "parentId", "personalBusinessAddress", "phoneNumber", "phoneVerified", "profilePictureId", "referrerId", "referrerPhone", "referrerType", "registrationLocation", "Lai/kudi/agent/settings/domain/dto/RegistrationLocation;", "secondaryUid", SendReceiptToTerminalConfirmationBottomSheet.STATE, TransactionField.STATUS, "terminalId", "timeCreated", "timeUpdated", CacheDataSource.PREF_USERNAME, "utilityBillImageId", "wallets", "Lai/kudi/agent/settings/domain/dto/Wallets;", "secondaryPhoneNumber", "identityNumberType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lai/kudi/agent/settings/domain/dto/CommissionWallet;Lai/kudi/agent/settings/domain/dto/Device;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lai/kudi/agent/settings/domain/dto/RegistrationLocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lai/kudi/agent/settings/domain/dto/Wallets;Ljava/lang/String;Ljava/lang/String;)V", "getAccountName", "()Ljava/lang/String;", "getAccountNumber", "getAccountType", "getAgentKyc", "getAggregator", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAggregatorId", "getBank", "getBusinessAddress", "getBusinessName", "getBusinessType", "getBvn", "getBvnVerified", "getC2C", "getCacDocumentId", "getCacRegistrationNo", "getCategory", "getCity", "getCommissionWallet", "()Lai/kudi/agent/settings/domain/dto/CommissionWallet;", "getDevice", "()Lai/kudi/agent/settings/domain/dto/Device;", "getDob", "getEmail", "getEstimatedTransactionRange", "getFirstName", "getGender", "getHasOutlets", "getHashedPin", "getHomeAddress", "getId", "getIdentificationCardImageId", "getIdentityNumberType", "getInsurancePlan", "getKcashEnabled", "getKycLevel", "getLastName", "getLocalGovernmentArea", "getManager", "getManagerId", "getMarketerId", "getMposVendor", "getNextOfKin", "getParentId", "getPersonalBusinessAddress", "getPhoneNumber", "getPhoneVerified", "getProfilePictureId", "getReferrerId", "getReferrerPhone", "getReferrerType", "getRegistrationLocation", "()Lai/kudi/agent/settings/domain/dto/RegistrationLocation;", "getSecondaryPhoneNumber", "getSecondaryUid", "getState", "getStatus", "getTerminalId", "getTimeCreated", "getTimeUpdated", "getUsername", "getUtilityBillImageId", "getWallets", "()Lai/kudi/agent/settings/domain/dto/Wallets;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lai/kudi/agent/settings/domain/dto/CommissionWallet;Lai/kudi/agent/settings/domain/dto/Device;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lai/kudi/agent/settings/domain/dto/RegistrationLocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lai/kudi/agent/settings/domain/dto/Wallets;Ljava/lang/String;Ljava/lang/String;)Lai/kudi/agent/settings/domain/dto/UserProfileResponse;", "equals", "other", "hashCode", "", "toString", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class UserProfileResponse {
    private final String accountName;
    private final String accountNumber;
    private final String accountType;
    private final String agentKyc;
    private final Boolean aggregator;
    private final String aggregatorId;
    private final String bank;
    private final String businessAddress;
    private final String businessName;
    private final String businessType;
    private final Boolean bvnVerified;
    private final String cacDocumentId;
    private final String cacRegistrationNo;
    private final String category;
    private final String city;
    private final CommissionWallet commissionWallet;
    @c("device")
    private final Device device;
    @c("email")
    private final String email;
    @c("estimatedTransactionRange")
    private final String estimatedTransactionRange;
    @c("c2C")
    private final Boolean fileList;
    @c("firstName")
    private final String firstName;
    @c("gender")
    private final String gender;
    @c("hasOutlets")
    private final Boolean hasOutlets;
    @c("hashedPin")
    private final String hashedPin;
    @c("homeAddress")
    private final String homeAddress;
    @c("identificationCardImageId")
    private final String identificationCardImageId;
    @c("identityNumberType")
    private final String identityNumberType;
    @c("insurancePlan")
    private final String insurancePlan;
    @c("kcashEnabled")
    private final Boolean kcashEnabled;
    private final String kycLevel;
    @c("lastName")
    private final String lastName;
    @c("localGovernmentArea")
    private final String localGovernmentArea;
    @c("manager")
    private final Boolean manager;
    @c("managerId")
    private final String managerId;
    @c("marketerId")
    private final String marketerId;
    @c("mposVendor")
    private final String mposVendor;
    @c("dob")
    private final String name;
    @c("nextOfKin")
    private final String nextOfKin;
    private final String parentId;
    private final String personalBusinessAddress;
    private final String phoneNumber;
    private final Boolean phoneVerified;
    private final String profilePictureId;
    private final String range;
    private final String referrerId;
    private final String referrerPhone;
    private final String referrerType;
    private final RegistrationLocation registrationLocation;
    @c("id")
    private final String rootName;
    private final String secondaryPhoneNumber;
    private final String secondaryUid;
    private final String state;
    private final String status;
    private final String terminalId;
    private final String timeCreated;
    private final String timeUpdated;
    private final String username;
    private final String utilityBillImageId;
    private final Wallets wallets;

    public UserProfileResponse() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 134217727, null);
    }

    public UserProfileResponse(String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool2, Boolean bool3, String str11, String str12, String str13, String str14, String str15, CommissionWallet commissionWallet, Device device, String str16, String str17, String str18, String str19, String str20, Boolean bool4, String str21, String str22, String str23, String str24, String str25, Boolean bool5, String str26, String str27, String str28, Boolean bool6, String str29, String str30, String str31, String str32, String str33, String str34, Boolean bool7, String str35, String str36, String str37, String str38, RegistrationLocation registrationLocation, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, Wallets wallets, String str47, String str48) {
        this.accountName = str;
        this.accountNumber = str2;
        this.accountType = str3;
        this.agentKyc = str4;
        this.aggregator = bool;
        this.aggregatorId = str5;
        this.bank = str6;
        this.businessAddress = str7;
        this.businessName = str8;
        this.businessType = str9;
        this.range = str10;
        this.bvnVerified = bool2;
        this.fileList = bool3;
        this.cacDocumentId = str11;
        this.nextOfKin = str12;
        this.cacRegistrationNo = str13;
        this.category = str14;
        this.city = str15;
        this.commissionWallet = commissionWallet;
        this.device = device;
        this.name = str16;
        this.email = str17;
        this.estimatedTransactionRange = str18;
        this.firstName = str19;
        this.gender = str20;
        this.hasOutlets = bool4;
        this.hashedPin = str21;
        this.homeAddress = str22;
        this.rootName = str23;
        this.identificationCardImageId = str24;
        this.insurancePlan = str25;
        this.kcashEnabled = bool5;
        this.kycLevel = str26;
        this.lastName = str27;
        this.localGovernmentArea = str28;
        this.manager = bool6;
        this.managerId = str29;
        this.marketerId = str30;
        this.mposVendor = str31;
        this.parentId = str32;
        this.personalBusinessAddress = str33;
        this.phoneNumber = str34;
        this.phoneVerified = bool7;
        this.profilePictureId = str35;
        this.referrerId = str36;
        this.referrerPhone = str37;
        this.referrerType = str38;
        this.registrationLocation = registrationLocation;
        this.secondaryUid = str39;
        this.state = str40;
        this.status = str41;
        this.terminalId = str42;
        this.timeCreated = str43;
        this.timeUpdated = str44;
        this.username = str45;
        this.utilityBillImageId = str46;
        this.wallets = wallets;
        this.secondaryPhoneNumber = str47;
        this.identityNumberType = str48;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ UserProfileResponse(java.lang.String r64, java.lang.String r65, java.lang.String r66, java.lang.String r67, java.lang.Boolean r68, java.lang.String r69, java.lang.String r70, java.lang.String r71, java.lang.String r72, java.lang.String r73, java.lang.String r74, java.lang.Boolean r75, java.lang.Boolean r76, java.lang.String r77, java.lang.String r78, java.lang.String r79, java.lang.String r80, java.lang.String r81, ai.kudi.agent.settings.domain.package_4.CommissionWallet r82, ai.kudi.agent.settings.domain.package_4.Device r83, java.lang.String r84, java.lang.String r85, java.lang.String r86, java.lang.String r87, java.lang.String r88, java.lang.Boolean r89, java.lang.String r90, java.lang.String r91, java.lang.String r92, java.lang.String r93, java.lang.String r94, java.lang.Boolean r95, java.lang.String r96, java.lang.String r97, java.lang.String r98, java.lang.Boolean r99, java.lang.String r100, java.lang.String r101, java.lang.String r102, java.lang.String r103, java.lang.String r104, java.lang.String r105, java.lang.Boolean r106, java.lang.String r107, java.lang.String r108, java.lang.String r109, java.lang.String r110, ai.kudi.agent.settings.domain.package_4.RegistrationLocation r111, java.lang.String r112, java.lang.String r113, java.lang.String r114, java.lang.String r115, java.lang.String r116, java.lang.String r117, java.lang.String r118, java.lang.String r119, ai.kudi.agent.settings.domain.package_4.Wallets r120, java.lang.String r121, java.lang.String r122, int r123, int r124, kotlin.p483e0.p485d.DBUtils$1 r125) {
        /*
            Method dump skipped, instructions count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.settings.domain.package_4.UserProfileResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, ai.kudi.agent.settings.domain.package_4.CommissionWallet, ai.kudi.agent.settings.domain.package_4.Device, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, ai.kudi.agent.settings.domain.package_4.RegistrationLocation, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, ai.kudi.agent.settings.domain.package_4.Wallets, java.lang.String, java.lang.String, int, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ UserProfileResponse copy$default(UserProfileResponse userProfileResponse, String $r2, String $r3, String $r4, String $r5, Boolean $r6, String $r7, String $r8, String $r9, String $r10, String $r11, String $r12, Boolean $r13, Boolean $r14, String $r15, String $r16, String $r17, String $r18, String $r19, CommissionWallet $r20, Device $r21, String $r22, String $r23, String $r24, String $r25, String $r26, Boolean $r27, String $r28, String $r29, String $r30, String $r31, String $r32, Boolean $r33, String $r34, String $r35, String $r36, Boolean $r37, String $r38, String $r39, String $r40, String $r41, String $r42, String $r43, Boolean $r44, String $r45, String $r46, String $r47, String $r48, RegistrationLocation $r49, String $r50, String $r51, String $r52, String $r53, String $r54, String $r55, String $r56, String $r57, Wallets $r58, String $r59, String $r60, int $i2, int $i0, Object obj) {
        if (($i2 & 1) != 0) {
            $r2 = userProfileResponse.accountName;
        }
        if (($i2 & 2) != 0) {
            $r3 = userProfileResponse.accountNumber;
        }
        if (($i2 & 4) != 0) {
            $r4 = userProfileResponse.accountType;
        }
        if (($i2 & 8) != 0) {
            $r5 = userProfileResponse.agentKyc;
        }
        if (($i2 & 16) != 0) {
            $r6 = userProfileResponse.aggregator;
        }
        if (($i2 & 32) != 0) {
            $r7 = userProfileResponse.aggregatorId;
        }
        if (($i2 & 64) != 0) {
            $r8 = userProfileResponse.bank;
        }
        if (($i2 & 128) != 0) {
            $r9 = userProfileResponse.businessAddress;
        }
        if (($i2 & 256) != 0) {
            $r10 = userProfileResponse.businessName;
        }
        if (($i2 & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) != 0) {
            $r11 = userProfileResponse.businessType;
        }
        if (($i2 & 1024) != 0) {
            $r12 = userProfileResponse.range;
        }
        if (($i2 & IjkMediaMeta.FF_PROFILE_H264_INTRA) != 0) {
            $r13 = userProfileResponse.bvnVerified;
        }
        if (($i2 & 4096) != 0) {
            Boolean $r142 = userProfileResponse.fileList;
            $r14 = $r142;
        }
        if (($i2 & 8192) != 0) {
            String $r152 = userProfileResponse.cacDocumentId;
            $r15 = $r152;
        }
        if (($i2 & 16384) != 0) {
            String $r162 = userProfileResponse.nextOfKin;
            $r16 = $r162;
        }
        if (($i2 & 32768) != 0) {
            String $r172 = userProfileResponse.cacRegistrationNo;
            $r17 = $r172;
        }
        if (($i2 & 65536) != 0) {
            String $r182 = userProfileResponse.category;
            $r18 = $r182;
        }
        if (($i2 & 131072) != 0) {
            String $r192 = userProfileResponse.city;
            $r19 = $r192;
        }
        if (($i2 & 262144) != 0) {
            CommissionWallet $r202 = userProfileResponse.commissionWallet;
            $r20 = $r202;
        }
        if (($i2 & 524288) != 0) {
            Device $r212 = userProfileResponse.device;
            $r21 = $r212;
        }
        if (($i2 & 1048576) != 0) {
            String $r222 = userProfileResponse.name;
            $r22 = $r222;
        }
        if (($i2 & 2097152) != 0) {
            String $r232 = userProfileResponse.email;
            $r23 = $r232;
        }
        if (($i2 & 4194304) != 0) {
            String $r242 = userProfileResponse.estimatedTransactionRange;
            $r24 = $r242;
        }
        if (($i2 & 8388608) != 0) {
            String $r252 = userProfileResponse.firstName;
            $r25 = $r252;
        }
        if (($i2 & 16777216) != 0) {
            String $r262 = userProfileResponse.gender;
            $r26 = $r262;
        }
        if (($i2 & 33554432) != 0) {
            Boolean $r272 = userProfileResponse.hasOutlets;
            $r27 = $r272;
        }
        if (($i2 & 67108864) != 0) {
            String $r282 = userProfileResponse.hashedPin;
            $r28 = $r282;
        }
        if (($i2 & 134217728) != 0) {
            String $r292 = userProfileResponse.homeAddress;
            $r29 = $r292;
        }
        if (($i2 & 268435456) != 0) {
            String $r302 = userProfileResponse.rootName;
            $r30 = $r302;
        }
        if (($i2 & 536870912) != 0) {
            String $r312 = userProfileResponse.identificationCardImageId;
            $r31 = $r312;
        }
        if (($i2 & 1073741824) != 0) {
            String $r322 = userProfileResponse.insurancePlan;
            $r32 = $r322;
        }
        if (($i2 & Integer.MIN_VALUE) != 0) {
            Boolean $r332 = userProfileResponse.kcashEnabled;
            $r33 = $r332;
        }
        if (($i0 & 1) != 0) {
            String $r342 = userProfileResponse.kycLevel;
            $r34 = $r342;
        }
        if (($i0 & 2) != 0) {
            String $r352 = userProfileResponse.lastName;
            $r35 = $r352;
        }
        if (($i0 & 4) != 0) {
            String $r362 = userProfileResponse.localGovernmentArea;
            $r36 = $r362;
        }
        if (($i0 & 8) != 0) {
            Boolean $r372 = userProfileResponse.manager;
            $r37 = $r372;
        }
        if (($i0 & 16) != 0) {
            String $r382 = userProfileResponse.managerId;
            $r38 = $r382;
        }
        if (($i0 & 32) != 0) {
            String $r392 = userProfileResponse.marketerId;
            $r39 = $r392;
        }
        if (($i0 & 64) != 0) {
            String $r402 = userProfileResponse.mposVendor;
            $r40 = $r402;
        }
        if (($i0 & 128) != 0) {
            String $r412 = userProfileResponse.parentId;
            $r41 = $r412;
        }
        if (($i0 & 256) != 0) {
            String $r422 = userProfileResponse.personalBusinessAddress;
            $r42 = $r422;
        }
        if (($i0 & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) != 0) {
            String $r432 = userProfileResponse.phoneNumber;
            $r43 = $r432;
        }
        if (($i0 & 1024) != 0) {
            Boolean $r442 = userProfileResponse.phoneVerified;
            $r44 = $r442;
        }
        if (($i0 & IjkMediaMeta.FF_PROFILE_H264_INTRA) != 0) {
            String $r452 = userProfileResponse.profilePictureId;
            $r45 = $r452;
        }
        if (($i0 & 4096) != 0) {
            String $r462 = userProfileResponse.referrerId;
            $r46 = $r462;
        }
        if (($i0 & 8192) != 0) {
            String $r472 = userProfileResponse.referrerPhone;
            $r47 = $r472;
        }
        if (($i0 & 16384) != 0) {
            String $r482 = userProfileResponse.referrerType;
            $r48 = $r482;
        }
        if (($i0 & 32768) != 0) {
            RegistrationLocation $r492 = userProfileResponse.registrationLocation;
            $r49 = $r492;
        }
        if (($i0 & 65536) != 0) {
            String $r502 = userProfileResponse.secondaryUid;
            $r50 = $r502;
        }
        if (($i0 & 131072) != 0) {
            String $r512 = userProfileResponse.state;
            $r51 = $r512;
        }
        if (($i0 & 262144) != 0) {
            String $r522 = userProfileResponse.status;
            $r52 = $r522;
        }
        if (($i0 & 524288) != 0) {
            String $r532 = userProfileResponse.terminalId;
            $r53 = $r532;
        }
        if (($i0 & 1048576) != 0) {
            String $r542 = userProfileResponse.timeCreated;
            $r54 = $r542;
        }
        if (($i0 & 2097152) != 0) {
            String $r552 = userProfileResponse.timeUpdated;
            $r55 = $r552;
        }
        if (($i0 & 4194304) != 0) {
            String $r562 = userProfileResponse.username;
            $r56 = $r562;
        }
        if (($i0 & 8388608) != 0) {
            String $r572 = userProfileResponse.utilityBillImageId;
            $r57 = $r572;
        }
        if (($i0 & 16777216) != 0) {
            Wallets $r582 = userProfileResponse.wallets;
            $r58 = $r582;
        }
        if (($i0 & 33554432) != 0) {
            String $r592 = userProfileResponse.secondaryPhoneNumber;
            $r59 = $r592;
        }
        if (($i0 & 67108864) != 0) {
            String $r602 = userProfileResponse.identityNumberType;
            $r60 = $r602;
        }
        UserProfileResponse $r0 = userProfileResponse.copy($r2, $r3, $r4, $r5, $r6, $r7, $r8, $r9, $r10, $r11, $r12, $r13, $r14, $r15, $r16, $r17, $r18, $r19, $r20, $r21, $r22, $r23, $r24, $r25, $r26, $r27, $r28, $r29, $r30, $r31, $r32, $r33, $r34, $r35, $r36, $r37, $r38, $r39, $r40, $r41, $r42, $r43, $r44, $r45, $r46, $r47, $r48, $r49, $r50, $r51, $r52, $r53, $r54, $r55, $r56, $r57, $r58, $r59, $r60);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component1() {
        String r1 = this.accountName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component10() {
        String r1 = this.businessType;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component11() {
        String r1 = this.range;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Boolean component12() {
        Boolean r1 = this.bvnVerified;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Boolean component13() {
        Boolean r1 = this.fileList;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component14() {
        String r1 = this.cacDocumentId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component15() {
        String r1 = this.nextOfKin;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component16() {
        String r1 = this.cacRegistrationNo;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component17() {
        String r1 = this.category;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component18() {
        String r1 = this.city;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final CommissionWallet component19() {
        CommissionWallet r1 = this.commissionWallet;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component2() {
        String r1 = this.accountNumber;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Device component20() {
        Device r1 = this.device;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component21() {
        String r1 = this.name;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component22() {
        String r1 = this.email;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component23() {
        String r1 = this.estimatedTransactionRange;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component24() {
        String r1 = this.firstName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component25() {
        String r1 = this.gender;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Boolean component26() {
        Boolean r1 = this.hasOutlets;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component27() {
        String r1 = this.hashedPin;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component28() {
        String r1 = this.homeAddress;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component29() {
        String r1 = this.rootName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component3() {
        String r1 = this.accountType;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component30() {
        String r1 = this.identificationCardImageId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component31() {
        String r1 = this.insurancePlan;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Boolean component32() {
        Boolean r1 = this.kcashEnabled;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component33() {
        String r1 = this.kycLevel;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component34() {
        String r1 = this.lastName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component35() {
        String r1 = this.localGovernmentArea;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Boolean component36() {
        Boolean r1 = this.manager;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component37() {
        String r1 = this.managerId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component38() {
        String r1 = this.marketerId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component39() {
        String r1 = this.mposVendor;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component4() {
        String r1 = this.agentKyc;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component40() {
        String r1 = this.parentId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component41() {
        String r1 = this.personalBusinessAddress;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component42() {
        String r1 = this.phoneNumber;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Boolean component43() {
        Boolean r1 = this.phoneVerified;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component44() {
        String r1 = this.profilePictureId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component45() {
        String r1 = this.referrerId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component46() {
        String r1 = this.referrerPhone;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component47() {
        String r1 = this.referrerType;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final RegistrationLocation component48() {
        RegistrationLocation r1 = this.registrationLocation;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component49() {
        String r1 = this.secondaryUid;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Boolean component5() {
        Boolean r1 = this.aggregator;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component50() {
        String r1 = this.state;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component51() {
        String r1 = this.status;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component52() {
        String r1 = this.terminalId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component53() {
        String r1 = this.timeCreated;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component54() {
        String r1 = this.timeUpdated;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component55() {
        String r1 = this.username;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component56() {
        String r1 = this.utilityBillImageId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Wallets component57() {
        Wallets r1 = this.wallets;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component58() {
        String r1 = this.secondaryPhoneNumber;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component59() {
        String r1 = this.identityNumberType;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component6() {
        String r1 = this.aggregatorId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component7() {
        String r1 = this.bank;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component8() {
        String r1 = this.businessAddress;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component9() {
        String r1 = this.businessName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final UserProfileResponse copy(String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool2, Boolean bool3, String str11, String str12, String str13, String str14, String str15, CommissionWallet commissionWallet, Device device, String str16, String str17, String str18, String str19, String str20, Boolean bool4, String str21, String str22, String str23, String str24, String str25, Boolean bool5, String str26, String str27, String str28, Boolean bool6, String str29, String str30, String str31, String str32, String str33, String str34, Boolean bool7, String str35, String str36, String str37, String str38, RegistrationLocation registrationLocation, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, Wallets wallets, String str47, String str48) {
        UserProfileResponse $r0 = new UserProfileResponse(str, str2, str3, str4, bool, str5, str6, str7, str8, str9, str10, bool2, bool3, str11, str12, str13, str14, str15, commissionWallet, device, str16, str17, str18, str19, str20, bool4, str21, str22, str23, str24, str25, bool5, str26, str27, str28, bool6, str29, str30, str31, str32, str33, str34, bool7, str35, str36, str37, str38, registrationLocation, str39, str40, str41, str42, str43, str44, str45, str46, wallets, str47, str48);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof UserProfileResponse;
        if ($z0) {
            UserProfileResponse $r2 = (UserProfileResponse) obj;
            String $r3 = this.accountName;
            String $r4 = $r2.accountName;
            boolean $z02 = Log_OC.append($r3, $r4);
            if ($z02) {
                String $r32 = this.accountNumber;
                String $r42 = $r2.accountNumber;
                boolean $z03 = Log_OC.append($r32, $r42);
                if ($z03) {
                    String $r33 = this.accountType;
                    String $r43 = $r2.accountType;
                    boolean $z04 = Log_OC.append($r33, $r43);
                    if ($z04) {
                        String $r34 = this.agentKyc;
                        String $r44 = $r2.agentKyc;
                        boolean $z05 = Log_OC.append($r34, $r44);
                        if ($z05) {
                            Boolean $r5 = this.aggregator;
                            Boolean $r6 = $r2.aggregator;
                            boolean $z06 = Log_OC.append($r5, $r6);
                            if ($z06) {
                                String $r35 = this.aggregatorId;
                                String $r45 = $r2.aggregatorId;
                                boolean $z07 = Log_OC.append($r35, $r45);
                                if ($z07) {
                                    String $r36 = this.bank;
                                    String $r46 = $r2.bank;
                                    boolean $z08 = Log_OC.append($r36, $r46);
                                    if ($z08) {
                                        String $r37 = this.businessAddress;
                                        String $r47 = $r2.businessAddress;
                                        boolean $z09 = Log_OC.append($r37, $r47);
                                        if ($z09) {
                                            String $r38 = this.businessName;
                                            String $r48 = $r2.businessName;
                                            boolean $z010 = Log_OC.append($r38, $r48);
                                            if ($z010) {
                                                String $r39 = this.businessType;
                                                String $r49 = $r2.businessType;
                                                boolean $z011 = Log_OC.append($r39, $r49);
                                                if ($z011) {
                                                    String $r310 = this.range;
                                                    String $r410 = $r2.range;
                                                    boolean $z012 = Log_OC.append($r310, $r410);
                                                    if ($z012) {
                                                        Boolean $r52 = this.bvnVerified;
                                                        Boolean $r62 = $r2.bvnVerified;
                                                        boolean $z013 = Log_OC.append($r52, $r62);
                                                        if ($z013) {
                                                            Boolean $r53 = this.fileList;
                                                            Boolean $r63 = $r2.fileList;
                                                            boolean $z014 = Log_OC.append($r53, $r63);
                                                            if ($z014) {
                                                                String $r311 = this.cacDocumentId;
                                                                String $r411 = $r2.cacDocumentId;
                                                                boolean $z015 = Log_OC.append($r311, $r411);
                                                                if ($z015) {
                                                                    String $r312 = this.nextOfKin;
                                                                    String $r412 = $r2.nextOfKin;
                                                                    boolean $z016 = Log_OC.append($r312, $r412);
                                                                    if ($z016) {
                                                                        String $r313 = this.cacRegistrationNo;
                                                                        String $r413 = $r2.cacRegistrationNo;
                                                                        boolean $z017 = Log_OC.append($r313, $r413);
                                                                        if ($z017) {
                                                                            String $r314 = this.category;
                                                                            String $r414 = $r2.category;
                                                                            boolean $z018 = Log_OC.append($r314, $r414);
                                                                            if ($z018) {
                                                                                String $r315 = this.city;
                                                                                String $r415 = $r2.city;
                                                                                boolean $z019 = Log_OC.append($r315, $r415);
                                                                                if ($z019) {
                                                                                    CommissionWallet $r7 = this.commissionWallet;
                                                                                    CommissionWallet $r8 = $r2.commissionWallet;
                                                                                    boolean $z020 = Log_OC.append($r7, $r8);
                                                                                    if ($z020) {
                                                                                        Device $r9 = this.device;
                                                                                        Device $r10 = $r2.device;
                                                                                        boolean $z021 = Log_OC.append($r9, $r10);
                                                                                        if ($z021) {
                                                                                            String $r316 = this.name;
                                                                                            String $r416 = $r2.name;
                                                                                            boolean $z022 = Log_OC.append($r316, $r416);
                                                                                            if ($z022) {
                                                                                                String $r317 = this.email;
                                                                                                String $r417 = $r2.email;
                                                                                                boolean $z023 = Log_OC.append($r317, $r417);
                                                                                                if ($z023) {
                                                                                                    String $r318 = this.estimatedTransactionRange;
                                                                                                    String $r418 = $r2.estimatedTransactionRange;
                                                                                                    boolean $z024 = Log_OC.append($r318, $r418);
                                                                                                    if ($z024) {
                                                                                                        String $r319 = this.firstName;
                                                                                                        String $r419 = $r2.firstName;
                                                                                                        boolean $z025 = Log_OC.append($r319, $r419);
                                                                                                        if ($z025) {
                                                                                                            String $r320 = this.gender;
                                                                                                            String $r420 = $r2.gender;
                                                                                                            boolean $z026 = Log_OC.append($r320, $r420);
                                                                                                            if ($z026) {
                                                                                                                Boolean $r54 = this.hasOutlets;
                                                                                                                Boolean $r64 = $r2.hasOutlets;
                                                                                                                boolean $z027 = Log_OC.append($r54, $r64);
                                                                                                                if ($z027) {
                                                                                                                    String $r321 = this.hashedPin;
                                                                                                                    String $r421 = $r2.hashedPin;
                                                                                                                    boolean $z028 = Log_OC.append($r321, $r421);
                                                                                                                    if ($z028) {
                                                                                                                        String $r322 = this.homeAddress;
                                                                                                                        String $r422 = $r2.homeAddress;
                                                                                                                        boolean $z029 = Log_OC.append($r322, $r422);
                                                                                                                        if ($z029) {
                                                                                                                            String $r323 = this.rootName;
                                                                                                                            String $r423 = $r2.rootName;
                                                                                                                            boolean $z030 = Log_OC.append($r323, $r423);
                                                                                                                            if ($z030) {
                                                                                                                                String $r324 = this.identificationCardImageId;
                                                                                                                                String $r424 = $r2.identificationCardImageId;
                                                                                                                                boolean $z031 = Log_OC.append($r324, $r424);
                                                                                                                                if ($z031) {
                                                                                                                                    String $r325 = this.insurancePlan;
                                                                                                                                    String $r425 = $r2.insurancePlan;
                                                                                                                                    boolean $z032 = Log_OC.append($r325, $r425);
                                                                                                                                    if ($z032) {
                                                                                                                                        Boolean $r55 = this.kcashEnabled;
                                                                                                                                        Boolean $r65 = $r2.kcashEnabled;
                                                                                                                                        boolean $z033 = Log_OC.append($r55, $r65);
                                                                                                                                        if ($z033) {
                                                                                                                                            String $r326 = this.kycLevel;
                                                                                                                                            String $r426 = $r2.kycLevel;
                                                                                                                                            boolean $z034 = Log_OC.append($r326, $r426);
                                                                                                                                            if ($z034) {
                                                                                                                                                String $r327 = this.lastName;
                                                                                                                                                String $r427 = $r2.lastName;
                                                                                                                                                boolean $z035 = Log_OC.append($r327, $r427);
                                                                                                                                                if ($z035) {
                                                                                                                                                    String $r328 = this.localGovernmentArea;
                                                                                                                                                    String $r428 = $r2.localGovernmentArea;
                                                                                                                                                    boolean $z036 = Log_OC.append($r328, $r428);
                                                                                                                                                    if ($z036) {
                                                                                                                                                        Boolean $r56 = this.manager;
                                                                                                                                                        Boolean $r66 = $r2.manager;
                                                                                                                                                        boolean $z037 = Log_OC.append($r56, $r66);
                                                                                                                                                        if ($z037) {
                                                                                                                                                            String $r329 = this.managerId;
                                                                                                                                                            String $r429 = $r2.managerId;
                                                                                                                                                            boolean $z038 = Log_OC.append($r329, $r429);
                                                                                                                                                            if ($z038) {
                                                                                                                                                                String $r330 = this.marketerId;
                                                                                                                                                                String $r430 = $r2.marketerId;
                                                                                                                                                                boolean $z039 = Log_OC.append($r330, $r430);
                                                                                                                                                                if ($z039) {
                                                                                                                                                                    String $r331 = this.mposVendor;
                                                                                                                                                                    String $r431 = $r2.mposVendor;
                                                                                                                                                                    boolean $z040 = Log_OC.append($r331, $r431);
                                                                                                                                                                    if ($z040) {
                                                                                                                                                                        String $r332 = this.parentId;
                                                                                                                                                                        String $r432 = $r2.parentId;
                                                                                                                                                                        boolean $z041 = Log_OC.append($r332, $r432);
                                                                                                                                                                        if ($z041) {
                                                                                                                                                                            String $r333 = this.personalBusinessAddress;
                                                                                                                                                                            String $r433 = $r2.personalBusinessAddress;
                                                                                                                                                                            boolean $z042 = Log_OC.append($r333, $r433);
                                                                                                                                                                            if ($z042) {
                                                                                                                                                                                String $r334 = this.phoneNumber;
                                                                                                                                                                                String $r434 = $r2.phoneNumber;
                                                                                                                                                                                boolean $z043 = Log_OC.append($r334, $r434);
                                                                                                                                                                                if ($z043) {
                                                                                                                                                                                    Boolean $r57 = this.phoneVerified;
                                                                                                                                                                                    Boolean $r67 = $r2.phoneVerified;
                                                                                                                                                                                    boolean $z044 = Log_OC.append($r57, $r67);
                                                                                                                                                                                    if ($z044) {
                                                                                                                                                                                        String $r335 = this.profilePictureId;
                                                                                                                                                                                        String $r435 = $r2.profilePictureId;
                                                                                                                                                                                        boolean $z045 = Log_OC.append($r335, $r435);
                                                                                                                                                                                        if ($z045) {
                                                                                                                                                                                            String $r336 = this.referrerId;
                                                                                                                                                                                            String $r436 = $r2.referrerId;
                                                                                                                                                                                            boolean $z046 = Log_OC.append($r336, $r436);
                                                                                                                                                                                            if ($z046) {
                                                                                                                                                                                                String $r337 = this.referrerPhone;
                                                                                                                                                                                                String $r437 = $r2.referrerPhone;
                                                                                                                                                                                                boolean $z047 = Log_OC.append($r337, $r437);
                                                                                                                                                                                                if ($z047) {
                                                                                                                                                                                                    String $r338 = this.referrerType;
                                                                                                                                                                                                    String $r438 = $r2.referrerType;
                                                                                                                                                                                                    boolean $z048 = Log_OC.append($r338, $r438);
                                                                                                                                                                                                    if ($z048) {
                                                                                                                                                                                                        RegistrationLocation $r11 = this.registrationLocation;
                                                                                                                                                                                                        RegistrationLocation $r12 = $r2.registrationLocation;
                                                                                                                                                                                                        boolean $z049 = Log_OC.append($r11, $r12);
                                                                                                                                                                                                        if ($z049) {
                                                                                                                                                                                                            String $r339 = this.secondaryUid;
                                                                                                                                                                                                            String $r439 = $r2.secondaryUid;
                                                                                                                                                                                                            boolean $z050 = Log_OC.append($r339, $r439);
                                                                                                                                                                                                            if ($z050) {
                                                                                                                                                                                                                String $r340 = this.state;
                                                                                                                                                                                                                String $r440 = $r2.state;
                                                                                                                                                                                                                boolean $z051 = Log_OC.append($r340, $r440);
                                                                                                                                                                                                                if ($z051) {
                                                                                                                                                                                                                    String $r341 = this.status;
                                                                                                                                                                                                                    String $r441 = $r2.status;
                                                                                                                                                                                                                    boolean $z052 = Log_OC.append($r341, $r441);
                                                                                                                                                                                                                    if ($z052) {
                                                                                                                                                                                                                        String $r342 = this.terminalId;
                                                                                                                                                                                                                        String $r442 = $r2.terminalId;
                                                                                                                                                                                                                        boolean $z053 = Log_OC.append($r342, $r442);
                                                                                                                                                                                                                        if ($z053) {
                                                                                                                                                                                                                            String $r343 = this.timeCreated;
                                                                                                                                                                                                                            String $r443 = $r2.timeCreated;
                                                                                                                                                                                                                            boolean $z054 = Log_OC.append($r343, $r443);
                                                                                                                                                                                                                            if ($z054) {
                                                                                                                                                                                                                                String $r344 = this.timeUpdated;
                                                                                                                                                                                                                                String $r444 = $r2.timeUpdated;
                                                                                                                                                                                                                                boolean $z055 = Log_OC.append($r344, $r444);
                                                                                                                                                                                                                                if ($z055) {
                                                                                                                                                                                                                                    String $r345 = this.username;
                                                                                                                                                                                                                                    String $r445 = $r2.username;
                                                                                                                                                                                                                                    boolean $z056 = Log_OC.append($r345, $r445);
                                                                                                                                                                                                                                    if ($z056) {
                                                                                                                                                                                                                                        String $r346 = this.utilityBillImageId;
                                                                                                                                                                                                                                        String $r446 = $r2.utilityBillImageId;
                                                                                                                                                                                                                                        boolean $z057 = Log_OC.append($r346, $r446);
                                                                                                                                                                                                                                        if ($z057) {
                                                                                                                                                                                                                                            Wallets $r13 = this.wallets;
                                                                                                                                                                                                                                            Wallets $r132 = $r2.wallets;
                                                                                                                                                                                                                                            boolean $z058 = Log_OC.append($r13, $r132);
                                                                                                                                                                                                                                            if ($z058) {
                                                                                                                                                                                                                                                String $r347 = this.secondaryPhoneNumber;
                                                                                                                                                                                                                                                String $r447 = $r2.secondaryPhoneNumber;
                                                                                                                                                                                                                                                boolean $z059 = Log_OC.append($r347, $r447);
                                                                                                                                                                                                                                                if ($z059) {
                                                                                                                                                                                                                                                    String $r348 = this.identityNumberType;
                                                                                                                                                                                                                                                    String $r448 = $r2.identityNumberType;
                                                                                                                                                                                                                                                    boolean $z060 = Log_OC.append($r348, $r448);
                                                                                                                                                                                                                                                    return $z060;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                return false;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            return false;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        return false;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    return false;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                return false;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            return false;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        return false;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    return false;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                return false;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            return false;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        return false;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    return false;
                                                                                                                                                                                                }
                                                                                                                                                                                                return false;
                                                                                                                                                                                            }
                                                                                                                                                                                            return false;
                                                                                                                                                                                        }
                                                                                                                                                                                        return false;
                                                                                                                                                                                    }
                                                                                                                                                                                    return false;
                                                                                                                                                                                }
                                                                                                                                                                                return false;
                                                                                                                                                                            }
                                                                                                                                                                            return false;
                                                                                                                                                                        }
                                                                                                                                                                        return false;
                                                                                                                                                                    }
                                                                                                                                                                    return false;
                                                                                                                                                                }
                                                                                                                                                                return false;
                                                                                                                                                            }
                                                                                                                                                            return false;
                                                                                                                                                        }
                                                                                                                                                        return false;
                                                                                                                                                    }
                                                                                                                                                    return false;
                                                                                                                                                }
                                                                                                                                                return false;
                                                                                                                                            }
                                                                                                                                            return false;
                                                                                                                                        }
                                                                                                                                        return false;
                                                                                                                                    }
                                                                                                                                    return false;
                                                                                                                                }
                                                                                                                                return false;
                                                                                                                            }
                                                                                                                            return false;
                                                                                                                        }
                                                                                                                        return false;
                                                                                                                    }
                                                                                                                    return false;
                                                                                                                }
                                                                                                                return false;
                                                                                                            }
                                                                                                            return false;
                                                                                                        }
                                                                                                        return false;
                                                                                                    }
                                                                                                    return false;
                                                                                                }
                                                                                                return false;
                                                                                            }
                                                                                            return false;
                                                                                        }
                                                                                        return false;
                                                                                    }
                                                                                    return false;
                                                                                }
                                                                                return false;
                                                                            }
                                                                            return false;
                                                                        }
                                                                        return false;
                                                                    }
                                                                    return false;
                                                                }
                                                                return false;
                                                            }
                                                            return false;
                                                        }
                                                        return false;
                                                    }
                                                    return false;
                                                }
                                                return false;
                                            }
                                            return false;
                                        }
                                        return false;
                                    }
                                    return false;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getAccountName() {
        String r1 = this.accountName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getAccountNumber() {
        String r1 = this.accountNumber;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getAccountType() {
        String r1 = this.accountType;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getAgentKyc() {
        String r1 = this.agentKyc;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Boolean getAggregator() {
        Boolean r1 = this.aggregator;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getAggregatorId() {
        String r1 = this.aggregatorId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getBank() {
        String r1 = this.bank;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getBusinessAddress() {
        String r1 = this.businessAddress;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getBusinessName() {
        String r1 = this.businessName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getBusinessType() {
        String r1 = this.businessType;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getBvn() {
        String r1 = this.range;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Boolean getBvnVerified() {
        Boolean r1 = this.bvnVerified;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Boolean getC2C() {
        Boolean r1 = this.fileList;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getCacDocumentId() {
        String r1 = this.cacDocumentId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getCacRegistrationNo() {
        String r1 = this.cacRegistrationNo;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getCategory() {
        String r1 = this.category;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getCity() {
        String r1 = this.city;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final CommissionWallet getCommissionWallet() {
        CommissionWallet r1 = this.commissionWallet;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Device getDevice() {
        Device r1 = this.device;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getDob() {
        String r1 = this.name;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getEmail() {
        String r1 = this.email;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getEstimatedTransactionRange() {
        String r1 = this.estimatedTransactionRange;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getFirstName() {
        String r1 = this.firstName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getGender() {
        String r1 = this.gender;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Boolean getHasOutlets() {
        Boolean r1 = this.hasOutlets;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getHashedPin() {
        String r1 = this.hashedPin;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getHomeAddress() {
        String r1 = this.homeAddress;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getId() {
        String r1 = this.rootName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getIdentificationCardImageId() {
        String r1 = this.identificationCardImageId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getIdentityNumberType() {
        String r1 = this.identityNumberType;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getInsurancePlan() {
        String r1 = this.insurancePlan;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Boolean getKcashEnabled() {
        Boolean r1 = this.kcashEnabled;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getKycLevel() {
        String r1 = this.kycLevel;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getLastName() {
        String r1 = this.lastName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getLocalGovernmentArea() {
        String r1 = this.localGovernmentArea;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Boolean getManager() {
        Boolean r1 = this.manager;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getManagerId() {
        String r1 = this.managerId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getMarketerId() {
        String r1 = this.marketerId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getMposVendor() {
        String r1 = this.mposVendor;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getNextOfKin() {
        String r1 = this.nextOfKin;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getParentId() {
        String r1 = this.parentId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getPersonalBusinessAddress() {
        String r1 = this.personalBusinessAddress;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getPhoneNumber() {
        String r1 = this.phoneNumber;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Boolean getPhoneVerified() {
        Boolean r1 = this.phoneVerified;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getProfilePictureId() {
        String r1 = this.profilePictureId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getReferrerId() {
        String r1 = this.referrerId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getReferrerPhone() {
        String r1 = this.referrerPhone;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getReferrerType() {
        String r1 = this.referrerType;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final RegistrationLocation getRegistrationLocation() {
        RegistrationLocation r1 = this.registrationLocation;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getSecondaryPhoneNumber() {
        String r1 = this.secondaryPhoneNumber;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getSecondaryUid() {
        String r1 = this.secondaryUid;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getState() {
        String r1 = this.state;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getStatus() {
        String r1 = this.status;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getTerminalId() {
        String r1 = this.terminalId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getTimeCreated() {
        String r1 = this.timeCreated;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getTimeUpdated() {
        String r1 = this.timeUpdated;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getUsername() {
        String r1 = this.username;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getUtilityBillImageId() {
        String r1 = this.utilityBillImageId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Wallets getWallets() {
        Wallets r1 = this.wallets;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public int hashCode() {
        String $r1 = this.accountName;
        int $i1 = $r1 == null ? 0 : $r1.hashCode();
        int $i12 = $i1 * 31;
        String $r12 = this.accountNumber;
        int $i2 = $r12 == null ? 0 : $r12.hashCode();
        int $i13 = ($i12 + $i2) * 31;
        String $r13 = this.accountType;
        int $i22 = $r13 == null ? 0 : $r13.hashCode();
        int $i14 = ($i13 + $i22) * 31;
        String $r14 = this.agentKyc;
        int $i23 = $r14 == null ? 0 : $r14.hashCode();
        int $i15 = ($i14 + $i23) * 31;
        Boolean $r2 = this.aggregator;
        int $i24 = $r2 == null ? 0 : $r2.hashCode();
        int $i16 = ($i15 + $i24) * 31;
        String $r15 = this.aggregatorId;
        int $i25 = $r15 == null ? 0 : $r15.hashCode();
        int $i17 = ($i16 + $i25) * 31;
        String $r16 = this.bank;
        int $i26 = $r16 == null ? 0 : $r16.hashCode();
        int $i18 = ($i17 + $i26) * 31;
        String $r17 = this.businessAddress;
        int $i27 = $r17 == null ? 0 : $r17.hashCode();
        int $i19 = ($i18 + $i27) * 31;
        String $r18 = this.businessName;
        int $i28 = $r18 == null ? 0 : $r18.hashCode();
        int $i110 = ($i19 + $i28) * 31;
        String $r19 = this.businessType;
        int $i29 = $r19 == null ? 0 : $r19.hashCode();
        int $i111 = ($i110 + $i29) * 31;
        String $r110 = this.range;
        int $i210 = $r110 == null ? 0 : $r110.hashCode();
        int $i112 = ($i111 + $i210) * 31;
        Boolean $r22 = this.bvnVerified;
        int $i211 = $r22 == null ? 0 : $r22.hashCode();
        int $i113 = ($i112 + $i211) * 31;
        Boolean $r23 = this.fileList;
        int $i212 = $r23 == null ? 0 : $r23.hashCode();
        int $i114 = ($i113 + $i212) * 31;
        String $r111 = this.cacDocumentId;
        int $i213 = $r111 == null ? 0 : $r111.hashCode();
        int $i115 = ($i114 + $i213) * 31;
        String $r112 = this.nextOfKin;
        int $i214 = $r112 == null ? 0 : $r112.hashCode();
        int $i116 = ($i115 + $i214) * 31;
        String $r113 = this.cacRegistrationNo;
        int $i215 = $r113 == null ? 0 : $r113.hashCode();
        int $i117 = ($i116 + $i215) * 31;
        String $r114 = this.category;
        int $i216 = $r114 == null ? 0 : $r114.hashCode();
        int $i118 = ($i117 + $i216) * 31;
        String $r115 = this.city;
        int $i217 = $r115 == null ? 0 : $r115.hashCode();
        int $i119 = ($i118 + $i217) * 31;
        CommissionWallet $r3 = this.commissionWallet;
        int $i218 = $r3 == null ? 0 : $r3.hashCode();
        int $i120 = ($i119 + $i218) * 31;
        Device $r4 = this.device;
        int $i219 = $r4 == null ? 0 : $r4.hashCode();
        int $i121 = ($i120 + $i219) * 31;
        String $r116 = this.name;
        int $i220 = $r116 == null ? 0 : $r116.hashCode();
        int $i122 = ($i121 + $i220) * 31;
        String $r117 = this.email;
        int $i221 = $r117 == null ? 0 : $r117.hashCode();
        int $i123 = ($i122 + $i221) * 31;
        String $r118 = this.estimatedTransactionRange;
        int $i222 = $r118 == null ? 0 : $r118.hashCode();
        int $i124 = ($i123 + $i222) * 31;
        String $r119 = this.firstName;
        int $i223 = $r119 == null ? 0 : $r119.hashCode();
        int $i125 = ($i124 + $i223) * 31;
        String $r120 = this.gender;
        int $i224 = $r120 == null ? 0 : $r120.hashCode();
        int $i126 = ($i125 + $i224) * 31;
        Boolean $r24 = this.hasOutlets;
        int $i225 = $r24 == null ? 0 : $r24.hashCode();
        int $i127 = ($i126 + $i225) * 31;
        String $r121 = this.hashedPin;
        int $i226 = $r121 == null ? 0 : $r121.hashCode();
        int $i128 = ($i127 + $i226) * 31;
        String $r122 = this.homeAddress;
        int $i227 = $r122 == null ? 0 : $r122.hashCode();
        int $i129 = ($i128 + $i227) * 31;
        String $r123 = this.rootName;
        int $i228 = $r123 == null ? 0 : $r123.hashCode();
        int $i130 = ($i129 + $i228) * 31;
        String $r124 = this.identificationCardImageId;
        int $i229 = $r124 == null ? 0 : $r124.hashCode();
        int $i131 = ($i130 + $i229) * 31;
        String $r125 = this.insurancePlan;
        int $i230 = $r125 == null ? 0 : $r125.hashCode();
        int $i132 = ($i131 + $i230) * 31;
        Boolean $r25 = this.kcashEnabled;
        int $i231 = $r25 == null ? 0 : $r25.hashCode();
        int $i133 = ($i132 + $i231) * 31;
        String $r126 = this.kycLevel;
        int $i232 = $r126 == null ? 0 : $r126.hashCode();
        int $i134 = ($i133 + $i232) * 31;
        String $r127 = this.lastName;
        int $i233 = $r127 == null ? 0 : $r127.hashCode();
        int $i135 = ($i134 + $i233) * 31;
        String $r128 = this.localGovernmentArea;
        int $i234 = $r128 == null ? 0 : $r128.hashCode();
        int $i136 = ($i135 + $i234) * 31;
        Boolean $r26 = this.manager;
        int $i235 = $r26 == null ? 0 : $r26.hashCode();
        int $i137 = ($i136 + $i235) * 31;
        String $r129 = this.managerId;
        int $i236 = $r129 == null ? 0 : $r129.hashCode();
        int $i138 = ($i137 + $i236) * 31;
        String $r130 = this.marketerId;
        int $i237 = $r130 == null ? 0 : $r130.hashCode();
        int $i139 = ($i138 + $i237) * 31;
        String $r131 = this.mposVendor;
        int $i238 = $r131 == null ? 0 : $r131.hashCode();
        int $i140 = ($i139 + $i238) * 31;
        String $r132 = this.parentId;
        int $i239 = $r132 == null ? 0 : $r132.hashCode();
        int $i141 = ($i140 + $i239) * 31;
        String $r133 = this.personalBusinessAddress;
        int $i240 = $r133 == null ? 0 : $r133.hashCode();
        int $i142 = ($i141 + $i240) * 31;
        String $r134 = this.phoneNumber;
        int $i241 = $r134 == null ? 0 : $r134.hashCode();
        int $i143 = ($i142 + $i241) * 31;
        Boolean $r27 = this.phoneVerified;
        int $i242 = $r27 == null ? 0 : $r27.hashCode();
        int $i144 = ($i143 + $i242) * 31;
        String $r135 = this.profilePictureId;
        int $i243 = $r135 == null ? 0 : $r135.hashCode();
        int $i145 = ($i144 + $i243) * 31;
        String $r136 = this.referrerId;
        int $i244 = $r136 == null ? 0 : $r136.hashCode();
        int $i146 = ($i145 + $i244) * 31;
        String $r137 = this.referrerPhone;
        int $i245 = $r137 == null ? 0 : $r137.hashCode();
        int $i147 = ($i146 + $i245) * 31;
        String $r138 = this.referrerType;
        int $i246 = $r138 == null ? 0 : $r138.hashCode();
        int $i148 = ($i147 + $i246) * 31;
        RegistrationLocation $r5 = this.registrationLocation;
        int $i247 = $r5 == null ? 0 : $r5.hashCode();
        int $i149 = ($i148 + $i247) * 31;
        String $r139 = this.secondaryUid;
        int $i248 = $r139 == null ? 0 : $r139.hashCode();
        int $i150 = ($i149 + $i248) * 31;
        String $r140 = this.state;
        int $i249 = $r140 == null ? 0 : $r140.hashCode();
        int $i151 = ($i150 + $i249) * 31;
        String $r141 = this.status;
        int $i250 = $r141 == null ? 0 : $r141.hashCode();
        int $i152 = ($i151 + $i250) * 31;
        String $r142 = this.terminalId;
        int $i251 = $r142 == null ? 0 : $r142.hashCode();
        int $i153 = ($i152 + $i251) * 31;
        String $r143 = this.timeCreated;
        int $i252 = $r143 == null ? 0 : $r143.hashCode();
        int $i154 = ($i153 + $i252) * 31;
        String $r144 = this.timeUpdated;
        int $i253 = $r144 == null ? 0 : $r144.hashCode();
        int $i155 = ($i154 + $i253) * 31;
        String $r145 = this.username;
        int $i254 = $r145 == null ? 0 : $r145.hashCode();
        int $i156 = ($i155 + $i254) * 31;
        String $r146 = this.utilityBillImageId;
        int $i255 = $r146 == null ? 0 : $r146.hashCode();
        int $i157 = ($i156 + $i255) * 31;
        Wallets $r6 = this.wallets;
        int $i256 = $r6 == null ? 0 : $r6.hashCode();
        int $i158 = ($i157 + $i256) * 31;
        String $r147 = this.secondaryPhoneNumber;
        int $i257 = $r147 == null ? 0 : $r147.hashCode();
        int $i159 = ($i158 + $i257) * 31;
        String $r148 = this.identityNumberType;
        int $i0 = $r148 != null ? $r148.hashCode() : 0;
        return $i159 + $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("UserProfileResponse(accountName=");
        String $r1 = this.accountName;
        $r2.append((Object) $r1);
        $r2.append(", accountNumber=");
        String $r12 = this.accountNumber;
        $r2.append((Object) $r12);
        $r2.append(", accountType=");
        String $r13 = this.accountType;
        $r2.append((Object) $r13);
        $r2.append(", agentKyc=");
        String $r14 = this.agentKyc;
        $r2.append((Object) $r14);
        $r2.append(", aggregator=");
        Boolean $r3 = this.aggregator;
        $r2.append($r3);
        $r2.append(", aggregatorId=");
        String $r15 = this.aggregatorId;
        $r2.append((Object) $r15);
        $r2.append(", bank=");
        String $r16 = this.bank;
        $r2.append((Object) $r16);
        $r2.append(", businessAddress=");
        String $r17 = this.businessAddress;
        $r2.append((Object) $r17);
        $r2.append(", businessName=");
        String $r18 = this.businessName;
        $r2.append((Object) $r18);
        $r2.append(", businessType=");
        String $r19 = this.businessType;
        $r2.append((Object) $r19);
        $r2.append(", bvn=");
        String $r110 = this.range;
        $r2.append((Object) $r110);
        $r2.append(", bvnVerified=");
        Boolean $r32 = this.bvnVerified;
        $r2.append($r32);
        $r2.append(", c2C=");
        Boolean $r33 = this.fileList;
        $r2.append($r33);
        $r2.append(", cacDocumentId=");
        String $r111 = this.cacDocumentId;
        $r2.append((Object) $r111);
        $r2.append(", nextOfKin=");
        String $r112 = this.nextOfKin;
        $r2.append((Object) $r112);
        $r2.append(", cacRegistrationNo=");
        String $r113 = this.cacRegistrationNo;
        $r2.append((Object) $r113);
        $r2.append(", category=");
        String $r114 = this.category;
        $r2.append((Object) $r114);
        $r2.append(", city=");
        String $r115 = this.city;
        $r2.append((Object) $r115);
        $r2.append(", commissionWallet=");
        CommissionWallet $r4 = this.commissionWallet;
        $r2.append($r4);
        $r2.append(", device=");
        Device $r5 = this.device;
        $r2.append($r5);
        $r2.append(", dob=");
        String $r116 = this.name;
        $r2.append((Object) $r116);
        $r2.append(", email=");
        String $r117 = this.email;
        $r2.append((Object) $r117);
        $r2.append(", estimatedTransactionRange=");
        String $r118 = this.estimatedTransactionRange;
        $r2.append((Object) $r118);
        $r2.append(", firstName=");
        String $r119 = this.firstName;
        $r2.append((Object) $r119);
        $r2.append(", gender=");
        String $r120 = this.gender;
        $r2.append((Object) $r120);
        $r2.append(", hasOutlets=");
        Boolean $r34 = this.hasOutlets;
        $r2.append($r34);
        $r2.append(", hashedPin=");
        String $r121 = this.hashedPin;
        $r2.append((Object) $r121);
        $r2.append(", homeAddress=");
        String $r122 = this.homeAddress;
        $r2.append((Object) $r122);
        $r2.append(", id=");
        String $r123 = this.rootName;
        $r2.append((Object) $r123);
        $r2.append(", identificationCardImageId=");
        String $r124 = this.identificationCardImageId;
        $r2.append((Object) $r124);
        $r2.append(", insurancePlan=");
        String $r125 = this.insurancePlan;
        $r2.append((Object) $r125);
        $r2.append(", kcashEnabled=");
        Boolean $r35 = this.kcashEnabled;
        $r2.append($r35);
        $r2.append(", kycLevel=");
        String $r126 = this.kycLevel;
        $r2.append((Object) $r126);
        $r2.append(", lastName=");
        String $r127 = this.lastName;
        $r2.append((Object) $r127);
        $r2.append(", localGovernmentArea=");
        String $r128 = this.localGovernmentArea;
        $r2.append((Object) $r128);
        $r2.append(", manager=");
        Boolean $r36 = this.manager;
        $r2.append($r36);
        $r2.append(", managerId=");
        String $r129 = this.managerId;
        $r2.append((Object) $r129);
        $r2.append(", marketerId=");
        String $r130 = this.marketerId;
        $r2.append((Object) $r130);
        $r2.append(", mposVendor=");
        String $r131 = this.mposVendor;
        $r2.append((Object) $r131);
        $r2.append(", parentId=");
        String $r132 = this.parentId;
        $r2.append((Object) $r132);
        $r2.append(", personalBusinessAddress=");
        String $r133 = this.personalBusinessAddress;
        $r2.append((Object) $r133);
        $r2.append(", phoneNumber=");
        String $r134 = this.phoneNumber;
        $r2.append((Object) $r134);
        $r2.append(", phoneVerified=");
        Boolean $r37 = this.phoneVerified;
        $r2.append($r37);
        $r2.append(", profilePictureId=");
        String $r135 = this.profilePictureId;
        $r2.append((Object) $r135);
        $r2.append(", referrerId=");
        String $r136 = this.referrerId;
        $r2.append((Object) $r136);
        $r2.append(", referrerPhone=");
        String $r137 = this.referrerPhone;
        $r2.append((Object) $r137);
        $r2.append(", referrerType=");
        String $r138 = this.referrerType;
        $r2.append((Object) $r138);
        $r2.append(", registrationLocation=");
        RegistrationLocation $r6 = this.registrationLocation;
        $r2.append($r6);
        $r2.append(", secondaryUid=");
        String $r139 = this.secondaryUid;
        $r2.append((Object) $r139);
        $r2.append(", state=");
        String $r140 = this.state;
        $r2.append((Object) $r140);
        $r2.append(", status=");
        String $r141 = this.status;
        $r2.append((Object) $r141);
        $r2.append(", terminalId=");
        String $r142 = this.terminalId;
        $r2.append((Object) $r142);
        $r2.append(", timeCreated=");
        String $r143 = this.timeCreated;
        $r2.append((Object) $r143);
        $r2.append(", timeUpdated=");
        String $r144 = this.timeUpdated;
        $r2.append((Object) $r144);
        $r2.append(", username=");
        String $r145 = this.username;
        $r2.append((Object) $r145);
        $r2.append(", utilityBillImageId=");
        String $r146 = this.utilityBillImageId;
        $r2.append((Object) $r146);
        $r2.append(", wallets=");
        Wallets $r7 = this.wallets;
        $r2.append($r7);
        $r2.append(", secondaryPhoneNumber=");
        String $r147 = this.secondaryPhoneNumber;
        $r2.append((Object) $r147);
        $r2.append(", identityNumberType=");
        String $r148 = this.identityNumberType;
        $r2.append((Object) $r148);
        $r2.append(')');
        String $r149 = $r2.toString();
        return $r149;
    }
}
