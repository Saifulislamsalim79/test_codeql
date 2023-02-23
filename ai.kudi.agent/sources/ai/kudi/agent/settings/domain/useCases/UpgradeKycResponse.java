package ai.kudi.agent.settings.domain.useCases;

import ai.kudi.agent.register.data.sources.CacheDataSource;
import ai.kudi.agent.register.p022v2.p023ui.PhoneFragment;
import ai.kudi.agent.transactions.p032ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.wallettopup.data.BanksWithMethods;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: UpgradeKycRequest.kt */
@Metadata(m10422d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\by\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BÁ\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0001\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0001\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0001\u0012\u0006\u0010\u0013\u001a\u00020\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0001\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0001\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\b\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0001\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\b\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010$\u001a\u00020\u0003\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\u0006\u0010&\u001a\u00020\b\u0012\u0006\u0010'\u001a\u00020\u0001\u0012\u0006\u0010(\u001a\u00020\u0001\u0012\u0006\u0010)\u001a\u00020\u0001\u0012\u0006\u0010*\u001a\u00020\u0001\u0012\u0006\u0010+\u001a\u00020\u0003\u0012\u0006\u0010,\u001a\u00020\u0003\u0012\u0006\u0010-\u001a\u00020\b\u0012\u0006\u0010.\u001a\u00020\u0003\u0012\u0006\u0010/\u001a\u00020\u0001\u0012\u0006\u00100\u001a\u00020\u0001\u0012\u0006\u00101\u001a\u00020\u0003\u0012\u0006\u00102\u001a\u000203\u0012\u0006\u00104\u001a\u00020\u0003\u0012\u0006\u00105\u001a\u00020\u0003\u0012\u0006\u00106\u001a\u00020\u0003\u0012\u0006\u00107\u001a\u00020\u0003\u0012\u0006\u00108\u001a\u00020\u0003\u0012\u0006\u00109\u001a\u00020\u0003\u0012\u0006\u0010:\u001a\u00020\u0003\u0012\u0006\u0010;\u001a\u00020\u0003\u0012\u0006\u0010<\u001a\u00020=¢\u0006\u0002\u0010>J\t\u0010|\u001a\u00020\u0003HÆ\u0003J\t\u0010}\u001a\u00020\u0001HÆ\u0003J\t\u0010~\u001a\u00020\u0003HÆ\u0003J\t\u0010\u007f\u001a\u00020\bHÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0081\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0015HÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0088\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010\u008a\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008c\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u008d\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010\u008f\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0090\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0091\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0092\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020\bHÆ\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0095\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0096\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0097\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u0098\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010\u0099\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010\u009a\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010\u009b\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010\u009c\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009d\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009e\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009f\u0001\u001a\u00020\bHÆ\u0003J\n\u0010 \u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¡\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010¢\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010£\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¤\u0001\u001a\u000203HÆ\u0003J\n\u0010¥\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¦\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010§\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¨\u0001\u001a\u00020\bHÆ\u0003J\n\u0010©\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ª\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010«\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¬\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u00ad\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010®\u0001\u001a\u00020=HÆ\u0003J\n\u0010¯\u0001\u001a\u00020\u0001HÆ\u0003J\n\u0010°\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010±\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010²\u0001\u001a\u00020\u0003HÆ\u0003J²\u0004\u0010³\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\b2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020\b2\b\b\u0002\u0010'\u001a\u00020\u00012\b\b\u0002\u0010(\u001a\u00020\u00012\b\b\u0002\u0010)\u001a\u00020\u00012\b\b\u0002\u0010*\u001a\u00020\u00012\b\b\u0002\u0010+\u001a\u00020\u00032\b\b\u0002\u0010,\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020\b2\b\b\u0002\u0010.\u001a\u00020\u00032\b\b\u0002\u0010/\u001a\u00020\u00012\b\b\u0002\u00100\u001a\u00020\u00012\b\b\u0002\u00101\u001a\u00020\u00032\b\b\u0002\u00102\u001a\u0002032\b\b\u0002\u00104\u001a\u00020\u00032\b\b\u0002\u00105\u001a\u00020\u00032\b\b\u0002\u00106\u001a\u00020\u00032\b\b\u0002\u00107\u001a\u00020\u00032\b\b\u0002\u00108\u001a\u00020\u00032\b\b\u0002\u00109\u001a\u00020\u00032\b\b\u0002\u0010:\u001a\u00020\u00032\b\b\u0002\u0010;\u001a\u00020\u00032\b\b\u0002\u0010<\u001a\u00020=HÆ\u0001J\u0015\u0010´\u0001\u001a\u00020\b2\t\u0010µ\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010¶\u0001\u001a\u00030·\u0001HÖ\u0001J\n\u0010¸\u0001\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010@R\u0011\u0010\u0005\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bD\u0010@R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0011\u0010\t\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bG\u0010CR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u0010@R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u0010@R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010@R\u0011\u0010\r\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bK\u0010CR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bL\u0010@R\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bM\u0010FR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bN\u0010@R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u0010@R\u0011\u0010\u0012\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bP\u0010CR\u0011\u0010\u0013\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010CR\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0011\u0010\u0016\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bT\u0010CR\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bU\u0010@R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bV\u0010@R\u0011\u0010\u0019\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bW\u0010CR\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bX\u0010@R\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bY\u0010@R\u0011\u0010\u001c\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010FR\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b[\u0010@R\u0011\u0010\u001e\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010CR\u0011\u0010\u001f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b]\u0010@R\u0011\u0010 \u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b^\u0010@R\u0011\u0010!\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b_\u0010@R\u0011\u0010\"\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b`\u0010FR\u0013\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\ba\u0010@R\u0011\u0010$\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bb\u0010@R\u0011\u0010%\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bc\u0010@R\u0011\u0010&\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bd\u0010FR\u0011\u0010'\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\be\u0010CR\u0011\u0010(\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bf\u0010CR\u0011\u0010)\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bg\u0010CR\u0011\u0010*\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bh\u0010CR\u0011\u0010+\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bi\u0010@R\u0011\u0010,\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bj\u0010@R\u0011\u0010-\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bk\u0010FR\u0011\u0010.\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bl\u0010@R\u0011\u0010/\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bm\u0010CR\u0011\u00100\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bn\u0010CR\u0011\u00101\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bo\u0010@R\u0011\u00102\u001a\u000203¢\u0006\b\n\u0000\u001a\u0004\bp\u0010qR\u0011\u00104\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\br\u0010@R\u0011\u00105\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bs\u0010@R\u0011\u00106\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bt\u0010@R\u0011\u00107\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bu\u0010@R\u0011\u00108\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bv\u0010@R\u0011\u00109\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bw\u0010@R\u0011\u0010:\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bx\u0010@R\u0011\u0010;\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\by\u0010@R\u0011\u0010<\u001a\u00020=¢\u0006\b\n\u0000\u001a\u0004\bz\u0010{¨\u0006¹\u0001"}, m10421d2 = {"Lai/kudi/agent/settings/domain/useCases/UpgradeKycResponse;", "", BanksWithMethods.ACCOUNT_NAME, "", BanksWithMethods.ACCOUNT_NUMBER, "accountType", "agentKyc", "aggregator", "", "aggregatorId", "bank", "businessAddress", "businessName", "businessType", PhoneFragment.ARG_BVN, "c2C", "cacDocumentId", "cacRegistrationNo", "category", "city", "commissionWallet", "Lai/kudi/agent/settings/domain/useCases/CommissionWallet;", "device", "dob", "email", "estimatedTransactionRange", "firstName", "gender", "hasOutlets", "hashedPin", "homeAddress", "id", "identificationCardImageId", "insurancePlan", "kcashEnabled", "kycLevel", "lastName", "localGovernmentArea", "manager", "managerId", "marketerId", "mposVendor", "parentId", "personalBusinessAddress", "phoneNumber", "phoneVerified", "profilePictureId", "referrerId", "referrerPhone", "referrerType", "registrationLocation", "Lai/kudi/agent/settings/domain/useCases/RegistrationLocation;", "secondaryUid", SendReceiptToTerminalConfirmationBottomSheet.STATE, TransactionField.STATUS, "terminalId", "timeCreated", "timeUpdated", CacheDataSource.PREF_USERNAME, "utilityBillImageId", "wallets", "Lai/kudi/agent/settings/domain/useCases/Wallets;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Lai/kudi/agent/settings/domain/useCases/CommissionWallet;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Lai/kudi/agent/settings/domain/useCases/RegistrationLocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lai/kudi/agent/settings/domain/useCases/Wallets;)V", "getAccountName", "()Ljava/lang/String;", "getAccountNumber", "getAccountType", "()Ljava/lang/Object;", "getAgentKyc", "getAggregator", "()Z", "getAggregatorId", "getBank", "getBusinessAddress", "getBusinessName", "getBusinessType", "getBvn", "getC2C", "getCacDocumentId", "getCacRegistrationNo", "getCategory", "getCity", "getCommissionWallet", "()Lai/kudi/agent/settings/domain/useCases/CommissionWallet;", "getDevice", "getDob", "getEmail", "getEstimatedTransactionRange", "getFirstName", "getGender", "getHasOutlets", "getHashedPin", "getHomeAddress", "getId", "getIdentificationCardImageId", "getInsurancePlan", "getKcashEnabled", "getKycLevel", "getLastName", "getLocalGovernmentArea", "getManager", "getManagerId", "getMarketerId", "getMposVendor", "getParentId", "getPersonalBusinessAddress", "getPhoneNumber", "getPhoneVerified", "getProfilePictureId", "getReferrerId", "getReferrerPhone", "getReferrerType", "getRegistrationLocation", "()Lai/kudi/agent/settings/domain/useCases/RegistrationLocation;", "getSecondaryUid", "getState", "getStatus", "getTerminalId", "getTimeCreated", "getTimeUpdated", "getUsername", "getUtilityBillImageId", "getWallets", "()Lai/kudi/agent/settings/domain/useCases/Wallets;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class UpgradeKycResponse {
    private final String accountName;
    private final String accountNumber;
    private final Object accountType;
    private final String agentKyc;
    private final boolean aggregator;
    private final Object aggregatorId;
    private final String bank;
    private final String businessAddress;
    private final String businessName;
    private final Object businessType;
    private final String cacDocumentId;
    private final String cacRegistrationNo;
    private final Object category;
    private final Object city;
    private final CommissionWallet commissionWallet;
    private final Object device;
    private final String email;
    private final Object estimatedTransactionRange;
    private final boolean eventId;
    private final String firstName;
    private final String gender;
    private final boolean hasOutlets;
    private final String hashedPin;
    private final Object homeAddress;
    private final String identificationCardImageId;
    private final String insurancePlan;
    private final boolean kcashEnabled;
    private final String kycLevel;
    private final String lastName;
    private final String localGovernmentArea;
    private final boolean manager;
    private final Object managerId;
    private final Object marketerId;
    private final Object mposVendor;
    private final String name;
    private final String notificationId;
    private final Object parentId;
    private final String personalBusinessAddress;
    private final String phoneNumber;
    private final boolean phoneVerified;
    private final String profilePictureId;
    private final String range;
    private final Object referrerId;
    private final Object referrerPhone;
    private final String referrerType;
    private final RegistrationLocation registrationLocation;
    private final String secondaryUid;
    private final String state;
    private final String status;
    private final String terminalId;
    private final String timeCreated;
    private final String timeUpdated;
    private final String username;
    private final String utilityBillImageId;
    private final Wallets wallets;

    public UpgradeKycResponse(String str, String str2, Object obj, String str3, boolean z, Object obj2, String str4, String str5, String str6, Object obj3, String str7, boolean z2, String str8, String str9, Object obj4, Object obj5, CommissionWallet commissionWallet, Object obj6, String str10, String str11, Object obj7, String str12, String str13, boolean z3, String str14, Object obj8, String str15, String str16, String str17, boolean z4, String str18, String str19, String str20, boolean z5, Object obj9, Object obj10, Object obj11, Object obj12, String str21, String str22, boolean z6, String str23, Object obj13, Object obj14, String str24, RegistrationLocation registrationLocation, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, Wallets wallets) {
        Log_OC.getArray(str, BanksWithMethods.ACCOUNT_NAME);
        Log_OC.getArray(str2, BanksWithMethods.ACCOUNT_NUMBER);
        Log_OC.getArray(obj, "accountType");
        Log_OC.getArray(str3, "agentKyc");
        Log_OC.getArray(obj2, "aggregatorId");
        Log_OC.getArray(str4, "bank");
        Log_OC.getArray(str5, "businessAddress");
        Log_OC.getArray(str6, "businessName");
        Log_OC.getArray(obj3, "businessType");
        Log_OC.getArray(str7, PhoneFragment.ARG_BVN);
        Log_OC.getArray(str8, "cacDocumentId");
        Log_OC.getArray(str9, "cacRegistrationNo");
        Log_OC.getArray(obj4, "category");
        Log_OC.getArray(obj5, "city");
        Log_OC.getArray(commissionWallet, "commissionWallet");
        Log_OC.getArray(obj6, "device");
        Log_OC.getArray(str10, "dob");
        Log_OC.getArray(str11, "email");
        Log_OC.getArray(obj7, "estimatedTransactionRange");
        Log_OC.getArray(str12, "firstName");
        Log_OC.getArray(str13, "gender");
        Log_OC.getArray(str14, "hashedPin");
        Log_OC.getArray(obj8, "homeAddress");
        Log_OC.getArray(str15, "id");
        Log_OC.getArray(str16, "identificationCardImageId");
        Log_OC.getArray(str17, "insurancePlan");
        Log_OC.getArray(str19, "lastName");
        Log_OC.getArray(str20, "localGovernmentArea");
        Log_OC.getArray(obj9, "managerId");
        Log_OC.getArray(obj10, "marketerId");
        Log_OC.getArray(obj11, "mposVendor");
        Log_OC.getArray(obj12, "parentId");
        Log_OC.getArray(str21, "personalBusinessAddress");
        Log_OC.getArray(str22, "phoneNumber");
        Log_OC.getArray(str23, "profilePictureId");
        Log_OC.getArray(obj13, "referrerId");
        Log_OC.getArray(obj14, "referrerPhone");
        Log_OC.getArray(str24, "referrerType");
        Log_OC.getArray(registrationLocation, "registrationLocation");
        Log_OC.getArray(str25, "secondaryUid");
        Log_OC.getArray(str26, SendReceiptToTerminalConfirmationBottomSheet.STATE);
        Log_OC.getArray(str27, TransactionField.STATUS);
        Log_OC.getArray(str28, "terminalId");
        Log_OC.getArray(str29, "timeCreated");
        Log_OC.getArray(str30, "timeUpdated");
        Log_OC.getArray(str31, CacheDataSource.PREF_USERNAME);
        Log_OC.getArray(str32, "utilityBillImageId");
        Log_OC.getArray(wallets, "wallets");
        this.accountName = str;
        this.accountNumber = str2;
        this.accountType = obj;
        this.agentKyc = str3;
        this.aggregator = z;
        this.aggregatorId = obj2;
        this.bank = str4;
        this.businessAddress = str5;
        this.businessName = str6;
        this.businessType = obj3;
        this.notificationId = str7;
        this.eventId = z2;
        this.cacDocumentId = str8;
        this.cacRegistrationNo = str9;
        this.category = obj4;
        this.city = obj5;
        this.commissionWallet = commissionWallet;
        this.device = obj6;
        this.name = str10;
        this.email = str11;
        this.estimatedTransactionRange = obj7;
        this.firstName = str12;
        this.gender = str13;
        this.hasOutlets = z3;
        this.hashedPin = str14;
        this.homeAddress = obj8;
        this.range = str15;
        this.identificationCardImageId = str16;
        this.insurancePlan = str17;
        this.kcashEnabled = z4;
        this.kycLevel = str18;
        this.lastName = str19;
        this.localGovernmentArea = str20;
        this.manager = z5;
        this.managerId = obj9;
        this.marketerId = obj10;
        this.mposVendor = obj11;
        this.parentId = obj12;
        this.personalBusinessAddress = str21;
        this.phoneNumber = str22;
        this.phoneVerified = z6;
        this.profilePictureId = str23;
        this.referrerId = obj13;
        this.referrerPhone = obj14;
        this.referrerType = str24;
        this.registrationLocation = registrationLocation;
        this.secondaryUid = str25;
        this.state = str26;
        this.status = str27;
        this.terminalId = str28;
        this.timeCreated = str29;
        this.timeUpdated = str30;
        this.username = str31;
        this.utilityBillImageId = str32;
        this.wallets = wallets;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* synthetic */ UpgradeKycResponse(String str, String str2, Object obj, String str3, boolean z, Object obj2, String str4, String str5, String str6, Object obj3, String str7, boolean z2, String str8, String str9, Object obj4, Object obj5, CommissionWallet commissionWallet, Object obj6, String str10, String str11, Object obj7, String str12, String str13, boolean z3, String str14, Object obj8, String str15, String str16, String str17, boolean z4, String $r27, String str18, String str19, boolean z5, Object obj9, Object obj10, Object obj11, Object obj12, String str20, String str21, boolean z6, String str22, Object obj13, Object obj14, String str23, RegistrationLocation registrationLocation, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, Wallets wallets, int $i0, int i, DBUtils$1 dBUtils$1) {
        this(str, str2, obj, str3, z, obj2, str4, str5, str6, obj3, str7, z2, str8, str9, obj4, obj5, commissionWallet, obj6, str10, str11, obj7, str12, str13, z3, str14, obj8, str15, str16, str17, z4, ($i0 & 1073741824) != 0 ? "" : $r27, str18, str19, z5, obj9, obj10, obj11, obj12, str20, str21, z6, str22, obj13, obj14, str23, registrationLocation, str24, str25, str26, str27, str28, str29, str30, str31, wallets);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ UpgradeKycResponse copy$default(UpgradeKycResponse upgradeKycResponse, String $r2, String $r3, Object $r4, String $r5, boolean $z0, Object $r6, String $r7, String $r8, String $r9, Object $r10, String $r11, boolean $z1, String $r12, String $r13, Object $r14, Object $r15, CommissionWallet $r16, Object $r17, String $r18, String $r19, Object $r20, String $r21, String $r22, boolean $z2, String $r23, Object $r24, String $r25, String $r26, String $r27, boolean $z3, String $r28, String $r29, String $r30, boolean $z4, Object $r31, Object $r32, Object $r33, Object $r34, String $r35, String $r36, boolean $z5, String $r37, Object $r38, Object $r39, String $r40, RegistrationLocation $r41, String $r42, String $r43, String $r44, String $r45, String $r46, String $r47, String $r48, String $r49, Wallets $r50, int $i2, int $i0, Object obj) {
        if (($i2 & 1) != 0) {
            $r2 = upgradeKycResponse.accountName;
        }
        if (($i2 & 2) != 0) {
            $r3 = upgradeKycResponse.accountNumber;
        }
        if (($i2 & 4) != 0) {
            $r4 = upgradeKycResponse.accountType;
        }
        if (($i2 & 8) != 0) {
            $r5 = upgradeKycResponse.agentKyc;
        }
        if (($i2 & 16) != 0) {
            $z0 = upgradeKycResponse.aggregator;
        }
        if (($i2 & 32) != 0) {
            $r6 = upgradeKycResponse.aggregatorId;
        }
        if (($i2 & 64) != 0) {
            $r7 = upgradeKycResponse.bank;
        }
        if (($i2 & 128) != 0) {
            $r8 = upgradeKycResponse.businessAddress;
        }
        if (($i2 & 256) != 0) {
            $r9 = upgradeKycResponse.businessName;
        }
        if (($i2 & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) != 0) {
            $r10 = upgradeKycResponse.businessType;
        }
        if (($i2 & 1024) != 0) {
            $r11 = upgradeKycResponse.notificationId;
        }
        if (($i2 & IjkMediaMeta.FF_PROFILE_H264_INTRA) != 0) {
            $z1 = upgradeKycResponse.eventId;
        }
        if (($i2 & 4096) != 0) {
            String $r122 = upgradeKycResponse.cacDocumentId;
            $r12 = $r122;
        }
        if (($i2 & 8192) != 0) {
            String $r132 = upgradeKycResponse.cacRegistrationNo;
            $r13 = $r132;
        }
        if (($i2 & 16384) != 0) {
            Object $r142 = upgradeKycResponse.category;
            $r14 = $r142;
        }
        if (($i2 & 32768) != 0) {
            Object $r152 = upgradeKycResponse.city;
            $r15 = $r152;
        }
        if (($i2 & 65536) != 0) {
            CommissionWallet $r162 = upgradeKycResponse.commissionWallet;
            $r16 = $r162;
        }
        if (($i2 & 131072) != 0) {
            Object $r172 = upgradeKycResponse.device;
            $r17 = $r172;
        }
        if (($i2 & 262144) != 0) {
            String $r182 = upgradeKycResponse.name;
            $r18 = $r182;
        }
        if (($i2 & 524288) != 0) {
            String $r192 = upgradeKycResponse.email;
            $r19 = $r192;
        }
        if (($i2 & 1048576) != 0) {
            Object $r202 = upgradeKycResponse.estimatedTransactionRange;
            $r20 = $r202;
        }
        if (($i2 & 2097152) != 0) {
            String $r212 = upgradeKycResponse.firstName;
            $r21 = $r212;
        }
        if (($i2 & 4194304) != 0) {
            String $r222 = upgradeKycResponse.gender;
            $r22 = $r222;
        }
        if (($i2 & 8388608) != 0) {
            boolean $z22 = upgradeKycResponse.hasOutlets;
            $z2 = $z22;
        }
        if (($i2 & 16777216) != 0) {
            String $r232 = upgradeKycResponse.hashedPin;
            $r23 = $r232;
        }
        if (($i2 & 33554432) != 0) {
            Object $r242 = upgradeKycResponse.homeAddress;
            $r24 = $r242;
        }
        if (($i2 & 67108864) != 0) {
            String $r252 = upgradeKycResponse.range;
            $r25 = $r252;
        }
        if (($i2 & 134217728) != 0) {
            String $r262 = upgradeKycResponse.identificationCardImageId;
            $r26 = $r262;
        }
        if (($i2 & 268435456) != 0) {
            String $r272 = upgradeKycResponse.insurancePlan;
            $r27 = $r272;
        }
        if (($i2 & 536870912) != 0) {
            boolean $z32 = upgradeKycResponse.kcashEnabled;
            $z3 = $z32;
        }
        if (($i2 & 1073741824) != 0) {
            String $r282 = upgradeKycResponse.kycLevel;
            $r28 = $r282;
        }
        if (($i2 & Integer.MIN_VALUE) != 0) {
            String $r292 = upgradeKycResponse.lastName;
            $r29 = $r292;
        }
        if (($i0 & 1) != 0) {
            String $r302 = upgradeKycResponse.localGovernmentArea;
            $r30 = $r302;
        }
        if (($i0 & 2) != 0) {
            boolean $z42 = upgradeKycResponse.manager;
            $z4 = $z42;
        }
        if (($i0 & 4) != 0) {
            Object $r312 = upgradeKycResponse.managerId;
            $r31 = $r312;
        }
        if (($i0 & 8) != 0) {
            Object $r322 = upgradeKycResponse.marketerId;
            $r32 = $r322;
        }
        if (($i0 & 16) != 0) {
            Object $r332 = upgradeKycResponse.mposVendor;
            $r33 = $r332;
        }
        if (($i0 & 32) != 0) {
            Object $r342 = upgradeKycResponse.parentId;
            $r34 = $r342;
        }
        if (($i0 & 64) != 0) {
            String $r352 = upgradeKycResponse.personalBusinessAddress;
            $r35 = $r352;
        }
        if (($i0 & 128) != 0) {
            String $r362 = upgradeKycResponse.phoneNumber;
            $r36 = $r362;
        }
        if (($i0 & 256) != 0) {
            boolean $z52 = upgradeKycResponse.phoneVerified;
            $z5 = $z52;
        }
        if (($i0 & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) != 0) {
            String $r372 = upgradeKycResponse.profilePictureId;
            $r37 = $r372;
        }
        if (($i0 & 1024) != 0) {
            Object $r382 = upgradeKycResponse.referrerId;
            $r38 = $r382;
        }
        if (($i0 & IjkMediaMeta.FF_PROFILE_H264_INTRA) != 0) {
            Object $r392 = upgradeKycResponse.referrerPhone;
            $r39 = $r392;
        }
        if (($i0 & 4096) != 0) {
            String $r402 = upgradeKycResponse.referrerType;
            $r40 = $r402;
        }
        if (($i0 & 8192) != 0) {
            RegistrationLocation $r412 = upgradeKycResponse.registrationLocation;
            $r41 = $r412;
        }
        if (($i0 & 16384) != 0) {
            String $r422 = upgradeKycResponse.secondaryUid;
            $r42 = $r422;
        }
        if (($i0 & 32768) != 0) {
            String $r432 = upgradeKycResponse.state;
            $r43 = $r432;
        }
        if (($i0 & 65536) != 0) {
            String $r442 = upgradeKycResponse.status;
            $r44 = $r442;
        }
        if (($i0 & 131072) != 0) {
            String $r452 = upgradeKycResponse.terminalId;
            $r45 = $r452;
        }
        if (($i0 & 262144) != 0) {
            String $r462 = upgradeKycResponse.timeCreated;
            $r46 = $r462;
        }
        if (($i0 & 524288) != 0) {
            String $r472 = upgradeKycResponse.timeUpdated;
            $r47 = $r472;
        }
        if (($i0 & 1048576) != 0) {
            String $r482 = upgradeKycResponse.username;
            $r48 = $r482;
        }
        if (($i0 & 2097152) != 0) {
            String $r492 = upgradeKycResponse.utilityBillImageId;
            $r49 = $r492;
        }
        if (($i0 & 4194304) != 0) {
            Wallets $r502 = upgradeKycResponse.wallets;
            $r50 = $r502;
        }
        UpgradeKycResponse $r0 = upgradeKycResponse.copy($r2, $r3, $r4, $r5, $z0, $r6, $r7, $r8, $r9, $r10, $r11, $z1, $r12, $r13, $r14, $r15, $r16, $r17, $r18, $r19, $r20, $r21, $r22, $z2, $r23, $r24, $r25, $r26, $r27, $z3, $r28, $r29, $r30, $z4, $r31, $r32, $r33, $r34, $r35, $r36, $z5, $r37, $r38, $r39, $r40, $r41, $r42, $r43, $r44, $r45, $r46, $r47, $r48, $r49, $r50);
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
    public final Object component10() {
        Object r1 = this.businessType;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component11() {
        String r1 = this.notificationId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component12() {
        boolean z0 = this.eventId;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component13() {
        String r1 = this.cacDocumentId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component14() {
        String r1 = this.cacRegistrationNo;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Object component15() {
        Object r1 = this.category;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Object component16() {
        Object r1 = this.city;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final CommissionWallet component17() {
        CommissionWallet r1 = this.commissionWallet;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Object component18() {
        Object r1 = this.device;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component19() {
        String r1 = this.name;
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
    public final String component20() {
        String r1 = this.email;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Object component21() {
        Object r1 = this.estimatedTransactionRange;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component22() {
        String r1 = this.firstName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component23() {
        String r1 = this.gender;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component24() {
        boolean z0 = this.hasOutlets;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component25() {
        String r1 = this.hashedPin;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Object component26() {
        Object r1 = this.homeAddress;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component27() {
        String r1 = this.range;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component28() {
        String r1 = this.identificationCardImageId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component29() {
        String r1 = this.insurancePlan;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Object component3() {
        Object r1 = this.accountType;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component30() {
        boolean z0 = this.kcashEnabled;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component31() {
        String r1 = this.kycLevel;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component32() {
        String r1 = this.lastName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component33() {
        String r1 = this.localGovernmentArea;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component34() {
        boolean z0 = this.manager;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Object component35() {
        Object r1 = this.managerId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Object component36() {
        Object r1 = this.marketerId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Object component37() {
        Object r1 = this.mposVendor;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Object component38() {
        Object r1 = this.parentId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component39() {
        String r1 = this.personalBusinessAddress;
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
        String r1 = this.phoneNumber;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component41() {
        boolean z0 = this.phoneVerified;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component42() {
        String r1 = this.profilePictureId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Object component43() {
        Object r1 = this.referrerId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Object component44() {
        Object r1 = this.referrerPhone;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component45() {
        String r1 = this.referrerType;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final RegistrationLocation component46() {
        RegistrationLocation r1 = this.registrationLocation;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component47() {
        String r1 = this.secondaryUid;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component48() {
        String r1 = this.state;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component49() {
        String r1 = this.status;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component5() {
        boolean z0 = this.aggregator;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component50() {
        String r1 = this.terminalId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component51() {
        String r1 = this.timeCreated;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component52() {
        String r1 = this.timeUpdated;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component53() {
        String r1 = this.username;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component54() {
        String r1 = this.utilityBillImageId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Wallets component55() {
        Wallets r1 = this.wallets;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Object component6() {
        Object r1 = this.aggregatorId;
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
    public final UpgradeKycResponse copy(String str, String str2, Object obj, String str3, boolean z, Object obj2, String str4, String str5, String str6, Object obj3, String str7, boolean z2, String str8, String str9, Object obj4, Object obj5, CommissionWallet commissionWallet, Object obj6, String str10, String str11, Object obj7, String str12, String str13, boolean z3, String str14, Object obj8, String str15, String str16, String str17, boolean z4, String str18, String str19, String str20, boolean z5, Object obj9, Object obj10, Object obj11, Object obj12, String str21, String str22, boolean z6, String str23, Object obj13, Object obj14, String str24, RegistrationLocation registrationLocation, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, Wallets wallets) {
        Log_OC.getArray(str, BanksWithMethods.ACCOUNT_NAME);
        Log_OC.getArray(str2, BanksWithMethods.ACCOUNT_NUMBER);
        Log_OC.getArray(obj, "accountType");
        Log_OC.getArray(str3, "agentKyc");
        Log_OC.getArray(obj2, "aggregatorId");
        Log_OC.getArray(str4, "bank");
        Log_OC.getArray(str5, "businessAddress");
        Log_OC.getArray(str6, "businessName");
        Log_OC.getArray(obj3, "businessType");
        Log_OC.getArray(str7, PhoneFragment.ARG_BVN);
        Log_OC.getArray(str8, "cacDocumentId");
        Log_OC.getArray(str9, "cacRegistrationNo");
        Log_OC.getArray(obj4, "category");
        Log_OC.getArray(obj5, "city");
        Log_OC.getArray(commissionWallet, "commissionWallet");
        Log_OC.getArray(obj6, "device");
        Log_OC.getArray(str10, "dob");
        Log_OC.getArray(str11, "email");
        Log_OC.getArray(obj7, "estimatedTransactionRange");
        Log_OC.getArray(str12, "firstName");
        Log_OC.getArray(str13, "gender");
        Log_OC.getArray(str14, "hashedPin");
        Log_OC.getArray(obj8, "homeAddress");
        Log_OC.getArray(str15, "id");
        Log_OC.getArray(str16, "identificationCardImageId");
        Log_OC.getArray(str17, "insurancePlan");
        Log_OC.getArray(str19, "lastName");
        Log_OC.getArray(str20, "localGovernmentArea");
        Log_OC.getArray(obj9, "managerId");
        Log_OC.getArray(obj10, "marketerId");
        Log_OC.getArray(obj11, "mposVendor");
        Log_OC.getArray(obj12, "parentId");
        Log_OC.getArray(str21, "personalBusinessAddress");
        Log_OC.getArray(str22, "phoneNumber");
        Log_OC.getArray(str23, "profilePictureId");
        Log_OC.getArray(obj13, "referrerId");
        Log_OC.getArray(obj14, "referrerPhone");
        Log_OC.getArray(str24, "referrerType");
        Log_OC.getArray(registrationLocation, "registrationLocation");
        Log_OC.getArray(str25, "secondaryUid");
        Log_OC.getArray(str26, SendReceiptToTerminalConfirmationBottomSheet.STATE);
        Log_OC.getArray(str27, TransactionField.STATUS);
        Log_OC.getArray(str28, "terminalId");
        Log_OC.getArray(str29, "timeCreated");
        Log_OC.getArray(str30, "timeUpdated");
        Log_OC.getArray(str31, CacheDataSource.PREF_USERNAME);
        Log_OC.getArray(str32, "utilityBillImageId");
        Log_OC.getArray(wallets, "wallets");
        UpgradeKycResponse $r0 = new UpgradeKycResponse(str, str2, obj, str3, z, obj2, str4, str5, str6, obj3, str7, z2, str8, str9, obj4, obj5, commissionWallet, obj6, str10, str11, obj7, str12, str13, z3, str14, obj8, str15, str16, str17, z4, str18, str19, str20, z5, obj9, obj10, obj11, obj12, str21, str22, z6, str23, obj13, obj14, str24, registrationLocation, str25, str26, str27, str28, str29, str30, str31, str32, wallets);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof UpgradeKycResponse;
        if ($z0) {
            UpgradeKycResponse $r2 = (UpgradeKycResponse) obj;
            String $r3 = this.accountName;
            String $r4 = $r2.accountName;
            boolean $z02 = Log_OC.append($r3, $r4);
            if ($z02) {
                String $r32 = this.accountNumber;
                String $r42 = $r2.accountNumber;
                boolean $z03 = Log_OC.append($r32, $r42);
                if ($z03) {
                    Object $r1 = this.accountType;
                    Object $r5 = $r2.accountType;
                    boolean $z04 = Log_OC.append($r1, $r5);
                    if ($z04) {
                        String $r33 = this.agentKyc;
                        String $r43 = $r2.agentKyc;
                        boolean $z05 = Log_OC.append($r33, $r43);
                        if ($z05) {
                            boolean $z06 = this.aggregator;
                            boolean $z1 = $r2.aggregator;
                            if ($z06 != $z1) {
                                return false;
                            }
                            Object $r12 = this.aggregatorId;
                            Object $r52 = $r2.aggregatorId;
                            boolean $z07 = Log_OC.append($r12, $r52);
                            if ($z07) {
                                String $r34 = this.bank;
                                String $r44 = $r2.bank;
                                boolean $z08 = Log_OC.append($r34, $r44);
                                if ($z08) {
                                    String $r35 = this.businessAddress;
                                    String $r45 = $r2.businessAddress;
                                    boolean $z09 = Log_OC.append($r35, $r45);
                                    if ($z09) {
                                        String $r36 = this.businessName;
                                        String $r46 = $r2.businessName;
                                        boolean $z010 = Log_OC.append($r36, $r46);
                                        if ($z010) {
                                            Object $r13 = this.businessType;
                                            Object $r53 = $r2.businessType;
                                            boolean $z011 = Log_OC.append($r13, $r53);
                                            if ($z011) {
                                                String $r37 = this.notificationId;
                                                String $r47 = $r2.notificationId;
                                                boolean $z012 = Log_OC.append($r37, $r47);
                                                if ($z012) {
                                                    boolean $z013 = this.eventId;
                                                    boolean $z12 = $r2.eventId;
                                                    if ($z013 != $z12) {
                                                        return false;
                                                    }
                                                    String $r38 = this.cacDocumentId;
                                                    String $r48 = $r2.cacDocumentId;
                                                    boolean $z014 = Log_OC.append($r38, $r48);
                                                    if ($z014) {
                                                        String $r39 = this.cacRegistrationNo;
                                                        String $r49 = $r2.cacRegistrationNo;
                                                        boolean $z015 = Log_OC.append($r39, $r49);
                                                        if ($z015) {
                                                            Object $r14 = this.category;
                                                            Object $r54 = $r2.category;
                                                            boolean $z016 = Log_OC.append($r14, $r54);
                                                            if ($z016) {
                                                                Object $r15 = this.city;
                                                                Object $r55 = $r2.city;
                                                                boolean $z017 = Log_OC.append($r15, $r55);
                                                                if ($z017) {
                                                                    CommissionWallet $r6 = this.commissionWallet;
                                                                    CommissionWallet $r7 = $r2.commissionWallet;
                                                                    boolean $z018 = Log_OC.append($r6, $r7);
                                                                    if ($z018) {
                                                                        Object $r16 = this.device;
                                                                        Object $r56 = $r2.device;
                                                                        boolean $z019 = Log_OC.append($r16, $r56);
                                                                        if ($z019) {
                                                                            String $r310 = this.name;
                                                                            String $r410 = $r2.name;
                                                                            boolean $z020 = Log_OC.append($r310, $r410);
                                                                            if ($z020) {
                                                                                String $r311 = this.email;
                                                                                String $r411 = $r2.email;
                                                                                boolean $z021 = Log_OC.append($r311, $r411);
                                                                                if ($z021) {
                                                                                    Object $r17 = this.estimatedTransactionRange;
                                                                                    Object $r57 = $r2.estimatedTransactionRange;
                                                                                    boolean $z022 = Log_OC.append($r17, $r57);
                                                                                    if ($z022) {
                                                                                        String $r312 = this.firstName;
                                                                                        String $r412 = $r2.firstName;
                                                                                        boolean $z023 = Log_OC.append($r312, $r412);
                                                                                        if ($z023) {
                                                                                            String $r313 = this.gender;
                                                                                            String $r413 = $r2.gender;
                                                                                            boolean $z024 = Log_OC.append($r313, $r413);
                                                                                            if ($z024) {
                                                                                                boolean $z025 = this.hasOutlets;
                                                                                                boolean $z13 = $r2.hasOutlets;
                                                                                                if ($z025 != $z13) {
                                                                                                    return false;
                                                                                                }
                                                                                                String $r314 = this.hashedPin;
                                                                                                String $r414 = $r2.hashedPin;
                                                                                                boolean $z026 = Log_OC.append($r314, $r414);
                                                                                                if ($z026) {
                                                                                                    Object $r18 = this.homeAddress;
                                                                                                    Object $r58 = $r2.homeAddress;
                                                                                                    boolean $z027 = Log_OC.append($r18, $r58);
                                                                                                    if ($z027) {
                                                                                                        String $r315 = this.range;
                                                                                                        String $r415 = $r2.range;
                                                                                                        boolean $z028 = Log_OC.append($r315, $r415);
                                                                                                        if ($z028) {
                                                                                                            String $r316 = this.identificationCardImageId;
                                                                                                            String $r416 = $r2.identificationCardImageId;
                                                                                                            boolean $z029 = Log_OC.append($r316, $r416);
                                                                                                            if ($z029) {
                                                                                                                String $r317 = this.insurancePlan;
                                                                                                                String $r417 = $r2.insurancePlan;
                                                                                                                boolean $z030 = Log_OC.append($r317, $r417);
                                                                                                                if ($z030) {
                                                                                                                    boolean $z031 = this.kcashEnabled;
                                                                                                                    boolean $z14 = $r2.kcashEnabled;
                                                                                                                    if ($z031 != $z14) {
                                                                                                                        return false;
                                                                                                                    }
                                                                                                                    String $r318 = this.kycLevel;
                                                                                                                    String $r418 = $r2.kycLevel;
                                                                                                                    boolean $z032 = Log_OC.append($r318, $r418);
                                                                                                                    if ($z032) {
                                                                                                                        String $r319 = this.lastName;
                                                                                                                        String $r419 = $r2.lastName;
                                                                                                                        boolean $z033 = Log_OC.append($r319, $r419);
                                                                                                                        if ($z033) {
                                                                                                                            String $r320 = this.localGovernmentArea;
                                                                                                                            String $r420 = $r2.localGovernmentArea;
                                                                                                                            boolean $z034 = Log_OC.append($r320, $r420);
                                                                                                                            if ($z034) {
                                                                                                                                boolean $z035 = this.manager;
                                                                                                                                boolean $z15 = $r2.manager;
                                                                                                                                if ($z035 != $z15) {
                                                                                                                                    return false;
                                                                                                                                }
                                                                                                                                Object $r19 = this.managerId;
                                                                                                                                Object $r59 = $r2.managerId;
                                                                                                                                boolean $z036 = Log_OC.append($r19, $r59);
                                                                                                                                if ($z036) {
                                                                                                                                    Object $r110 = this.marketerId;
                                                                                                                                    Object $r510 = $r2.marketerId;
                                                                                                                                    boolean $z037 = Log_OC.append($r110, $r510);
                                                                                                                                    if ($z037) {
                                                                                                                                        Object $r111 = this.mposVendor;
                                                                                                                                        Object $r511 = $r2.mposVendor;
                                                                                                                                        boolean $z038 = Log_OC.append($r111, $r511);
                                                                                                                                        if ($z038) {
                                                                                                                                            Object $r112 = this.parentId;
                                                                                                                                            Object $r512 = $r2.parentId;
                                                                                                                                            boolean $z039 = Log_OC.append($r112, $r512);
                                                                                                                                            if ($z039) {
                                                                                                                                                String $r321 = this.personalBusinessAddress;
                                                                                                                                                String $r421 = $r2.personalBusinessAddress;
                                                                                                                                                boolean $z040 = Log_OC.append($r321, $r421);
                                                                                                                                                if ($z040) {
                                                                                                                                                    String $r322 = this.phoneNumber;
                                                                                                                                                    String $r422 = $r2.phoneNumber;
                                                                                                                                                    boolean $z041 = Log_OC.append($r322, $r422);
                                                                                                                                                    if ($z041) {
                                                                                                                                                        boolean $z042 = this.phoneVerified;
                                                                                                                                                        boolean $z16 = $r2.phoneVerified;
                                                                                                                                                        if ($z042 != $z16) {
                                                                                                                                                            return false;
                                                                                                                                                        }
                                                                                                                                                        String $r323 = this.profilePictureId;
                                                                                                                                                        String $r423 = $r2.profilePictureId;
                                                                                                                                                        boolean $z043 = Log_OC.append($r323, $r423);
                                                                                                                                                        if ($z043) {
                                                                                                                                                            Object $r113 = this.referrerId;
                                                                                                                                                            Object $r513 = $r2.referrerId;
                                                                                                                                                            boolean $z044 = Log_OC.append($r113, $r513);
                                                                                                                                                            if ($z044) {
                                                                                                                                                                Object $r114 = this.referrerPhone;
                                                                                                                                                                Object $r514 = $r2.referrerPhone;
                                                                                                                                                                boolean $z045 = Log_OC.append($r114, $r514);
                                                                                                                                                                if ($z045) {
                                                                                                                                                                    String $r324 = this.referrerType;
                                                                                                                                                                    String $r424 = $r2.referrerType;
                                                                                                                                                                    boolean $z046 = Log_OC.append($r324, $r424);
                                                                                                                                                                    if ($z046) {
                                                                                                                                                                        RegistrationLocation $r8 = this.registrationLocation;
                                                                                                                                                                        RegistrationLocation $r9 = $r2.registrationLocation;
                                                                                                                                                                        boolean $z047 = Log_OC.append($r8, $r9);
                                                                                                                                                                        if ($z047) {
                                                                                                                                                                            String $r325 = this.secondaryUid;
                                                                                                                                                                            String $r425 = $r2.secondaryUid;
                                                                                                                                                                            boolean $z048 = Log_OC.append($r325, $r425);
                                                                                                                                                                            if ($z048) {
                                                                                                                                                                                String $r326 = this.state;
                                                                                                                                                                                String $r426 = $r2.state;
                                                                                                                                                                                boolean $z049 = Log_OC.append($r326, $r426);
                                                                                                                                                                                if ($z049) {
                                                                                                                                                                                    String $r327 = this.status;
                                                                                                                                                                                    String $r427 = $r2.status;
                                                                                                                                                                                    boolean $z050 = Log_OC.append($r327, $r427);
                                                                                                                                                                                    if ($z050) {
                                                                                                                                                                                        String $r328 = this.terminalId;
                                                                                                                                                                                        String $r428 = $r2.terminalId;
                                                                                                                                                                                        boolean $z051 = Log_OC.append($r328, $r428);
                                                                                                                                                                                        if ($z051) {
                                                                                                                                                                                            String $r329 = this.timeCreated;
                                                                                                                                                                                            String $r429 = $r2.timeCreated;
                                                                                                                                                                                            boolean $z052 = Log_OC.append($r329, $r429);
                                                                                                                                                                                            if ($z052) {
                                                                                                                                                                                                String $r330 = this.timeUpdated;
                                                                                                                                                                                                String $r430 = $r2.timeUpdated;
                                                                                                                                                                                                boolean $z053 = Log_OC.append($r330, $r430);
                                                                                                                                                                                                if ($z053) {
                                                                                                                                                                                                    String $r331 = this.username;
                                                                                                                                                                                                    String $r431 = $r2.username;
                                                                                                                                                                                                    boolean $z054 = Log_OC.append($r331, $r431);
                                                                                                                                                                                                    if ($z054) {
                                                                                                                                                                                                        String $r332 = this.utilityBillImageId;
                                                                                                                                                                                                        String $r432 = $r2.utilityBillImageId;
                                                                                                                                                                                                        boolean $z055 = Log_OC.append($r332, $r432);
                                                                                                                                                                                                        if ($z055) {
                                                                                                                                                                                                            Wallets $r10 = this.wallets;
                                                                                                                                                                                                            Wallets $r11 = $r2.wallets;
                                                                                                                                                                                                            boolean $z056 = Log_OC.append($r10, $r11);
                                                                                                                                                                                                            return $z056;
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
    public final Object getAccountType() {
        Object r1 = this.accountType;
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
    public final boolean getAggregator() {
        boolean z0 = this.aggregator;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Object getAggregatorId() {
        Object r1 = this.aggregatorId;
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
    public final Object getBusinessType() {
        Object r1 = this.businessType;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getBvn() {
        String r1 = this.notificationId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getC2C() {
        boolean z0 = this.eventId;
        return z0;
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
    public final Object getCategory() {
        Object r1 = this.category;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Object getCity() {
        Object r1 = this.city;
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
    public final Object getDevice() {
        Object r1 = this.device;
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
    public final Object getEstimatedTransactionRange() {
        Object r1 = this.estimatedTransactionRange;
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
    public final boolean getHasOutlets() {
        boolean z0 = this.hasOutlets;
        return z0;
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
    public final Object getHomeAddress() {
        Object r1 = this.homeAddress;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getId() {
        String r1 = this.range;
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
    public final String getInsurancePlan() {
        String r1 = this.insurancePlan;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getKcashEnabled() {
        boolean z0 = this.kcashEnabled;
        return z0;
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
    public final boolean getManager() {
        boolean z0 = this.manager;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Object getManagerId() {
        Object r1 = this.managerId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Object getMarketerId() {
        Object r1 = this.marketerId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Object getMposVendor() {
        Object r1 = this.mposVendor;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Object getParentId() {
        Object r1 = this.parentId;
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
    public final boolean getPhoneVerified() {
        boolean z0 = this.phoneVerified;
        return z0;
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
    public final Object getReferrerId() {
        Object r1 = this.referrerId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Object getReferrerPhone() {
        Object r1 = this.referrerPhone;
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
    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String $r1 = this.accountName;
        int $i0 = $r1.hashCode();
        String $r12 = this.accountNumber;
        int $i1 = $r12.hashCode();
        Object $r2 = this.accountType;
        int $i12 = $r2.hashCode();
        String $r13 = this.agentKyc;
        int $i13 = $r13.hashCode();
        int $i02 = (((((($i0 * 31) + $i1) * 31) + $i12) * 31) + $i13) * 31;
        boolean $z0 = this.aggregator;
        int i = $z0;
        if ($z0 != 0) {
            i = 1;
        }
        int $i14 = i;
        Object $r22 = this.aggregatorId;
        int $i15 = $r22.hashCode();
        String $r14 = this.bank;
        int $i16 = $r14.hashCode();
        String $r15 = this.businessAddress;
        int $i17 = $r15.hashCode();
        String $r16 = this.businessName;
        int $i18 = $r16.hashCode();
        Object $r23 = this.businessType;
        int $i19 = $r23.hashCode();
        String $r17 = this.notificationId;
        int $i110 = $r17.hashCode();
        int $i03 = ((((((((((((($i02 + $i14) * 31) + $i15) * 31) + $i16) * 31) + $i17) * 31) + $i18) * 31) + $i19) * 31) + $i110) * 31;
        boolean $z02 = this.eventId;
        int i2 = $z02;
        if ($z02 != 0) {
            i2 = 1;
        }
        int $i111 = i2;
        String $r18 = this.cacDocumentId;
        int $i112 = $r18.hashCode();
        String $r19 = this.cacRegistrationNo;
        int $i113 = $r19.hashCode();
        Object $r24 = this.category;
        int $i114 = $r24.hashCode();
        Object $r25 = this.city;
        int $i115 = $r25.hashCode();
        CommissionWallet $r3 = this.commissionWallet;
        int $i116 = $r3.hashCode();
        Object $r26 = this.device;
        int $i117 = $r26.hashCode();
        String $r110 = this.name;
        int $i118 = $r110.hashCode();
        String $r111 = this.email;
        int $i119 = $r111.hashCode();
        Object $r27 = this.estimatedTransactionRange;
        int $i120 = $r27.hashCode();
        String $r112 = this.firstName;
        int $i121 = $r112.hashCode();
        String $r113 = this.gender;
        int $i122 = $r113.hashCode();
        int $i04 = ((((((((((((((((((((((($i03 + $i111) * 31) + $i112) * 31) + $i113) * 31) + $i114) * 31) + $i115) * 31) + $i116) * 31) + $i117) * 31) + $i118) * 31) + $i119) * 31) + $i120) * 31) + $i121) * 31) + $i122) * 31;
        boolean $z03 = this.hasOutlets;
        int i3 = $z03;
        if ($z03 != 0) {
            i3 = 1;
        }
        int $i123 = i3;
        String $r114 = this.hashedPin;
        int $i124 = $r114.hashCode();
        Object $r28 = this.homeAddress;
        int $i125 = $r28.hashCode();
        String $r115 = this.range;
        int $i126 = $r115.hashCode();
        String $r116 = this.identificationCardImageId;
        int $i127 = $r116.hashCode();
        String $r117 = this.insurancePlan;
        int $i128 = $r117.hashCode();
        int $i05 = ((((((((((($i04 + $i123) * 31) + $i124) * 31) + $i125) * 31) + $i126) * 31) + $i127) * 31) + $i128) * 31;
        boolean $z04 = this.kcashEnabled;
        int i4 = $z04;
        if ($z04 != 0) {
            i4 = 1;
        }
        int $i129 = i4;
        int $i06 = ($i05 + $i129) * 31;
        String $r118 = this.kycLevel;
        int $i130 = $r118 == null ? 0 : $r118.hashCode();
        String $r119 = this.lastName;
        int $i131 = $r119.hashCode();
        String $r120 = this.localGovernmentArea;
        int $i132 = $r120.hashCode();
        int $i07 = ((((($i06 + $i130) * 31) + $i131) * 31) + $i132) * 31;
        boolean $z05 = this.manager;
        int i5 = $z05;
        if ($z05 != 0) {
            i5 = 1;
        }
        int $i133 = i5;
        Object $r29 = this.managerId;
        int $i134 = $r29.hashCode();
        Object $r210 = this.marketerId;
        int $i135 = $r210.hashCode();
        Object $r211 = this.mposVendor;
        int $i136 = $r211.hashCode();
        Object $r212 = this.parentId;
        int $i137 = $r212.hashCode();
        String $r121 = this.personalBusinessAddress;
        int $i138 = $r121.hashCode();
        String $r122 = this.phoneNumber;
        int $i139 = $r122.hashCode();
        int $i08 = ((((((((((((($i07 + $i133) * 31) + $i134) * 31) + $i135) * 31) + $i136) * 31) + $i137) * 31) + $i138) * 31) + $i139) * 31;
        boolean $z06 = this.phoneVerified;
        int $i140 = $z06 ? 1 : $z06 ? 1 : 0;
        String $r123 = this.profilePictureId;
        int $i141 = $r123.hashCode();
        Object $r213 = this.referrerId;
        int $i142 = $r213.hashCode();
        Object $r214 = this.referrerPhone;
        int $i143 = $r214.hashCode();
        String $r124 = this.referrerType;
        int $i144 = $r124.hashCode();
        RegistrationLocation $r4 = this.registrationLocation;
        int $i145 = $r4.hashCode();
        String $r125 = this.secondaryUid;
        int $i146 = $r125.hashCode();
        String $r126 = this.state;
        int $i147 = $r126.hashCode();
        String $r127 = this.status;
        int $i148 = $r127.hashCode();
        String $r128 = this.terminalId;
        int $i149 = $r128.hashCode();
        String $r129 = this.timeCreated;
        int $i150 = $r129.hashCode();
        String $r130 = this.timeUpdated;
        int $i151 = $r130.hashCode();
        String $r131 = this.username;
        int $i152 = $r131.hashCode();
        String $r132 = this.utilityBillImageId;
        int $i153 = $r132.hashCode();
        Wallets $r5 = this.wallets;
        int $i154 = $r5.hashCode();
        return (((((((((((((((((((((((((((($i08 + $i140) * 31) + $i141) * 31) + $i142) * 31) + $i143) * 31) + $i144) * 31) + $i145) * 31) + $i146) * 31) + $i147) * 31) + $i148) * 31) + $i149) * 31) + $i150) * 31) + $i151) * 31) + $i152) * 31) + $i153) * 31) + $i154;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("UpgradeKycResponse(accountName=");
        String $r1 = this.accountName;
        $r2.append($r1);
        $r2.append(", accountNumber=");
        String $r12 = this.accountNumber;
        $r2.append($r12);
        $r2.append(", accountType=");
        Object $r3 = this.accountType;
        $r2.append($r3);
        $r2.append(", agentKyc=");
        String $r13 = this.agentKyc;
        $r2.append($r13);
        $r2.append(", aggregator=");
        boolean $z0 = this.aggregator;
        $r2.append($z0);
        $r2.append(", aggregatorId=");
        Object $r32 = this.aggregatorId;
        $r2.append($r32);
        $r2.append(", bank=");
        String $r14 = this.bank;
        $r2.append($r14);
        $r2.append(", businessAddress=");
        String $r15 = this.businessAddress;
        $r2.append($r15);
        $r2.append(", businessName=");
        String $r16 = this.businessName;
        $r2.append($r16);
        $r2.append(", businessType=");
        Object $r33 = this.businessType;
        $r2.append($r33);
        $r2.append(", bvn=");
        String $r17 = this.notificationId;
        $r2.append($r17);
        $r2.append(", c2C=");
        boolean $z02 = this.eventId;
        $r2.append($z02);
        $r2.append(", cacDocumentId=");
        String $r18 = this.cacDocumentId;
        $r2.append($r18);
        $r2.append(", cacRegistrationNo=");
        String $r19 = this.cacRegistrationNo;
        $r2.append($r19);
        $r2.append(", category=");
        Object $r34 = this.category;
        $r2.append($r34);
        $r2.append(", city=");
        Object $r35 = this.city;
        $r2.append($r35);
        $r2.append(", commissionWallet=");
        CommissionWallet $r4 = this.commissionWallet;
        $r2.append($r4);
        $r2.append(", device=");
        Object $r36 = this.device;
        $r2.append($r36);
        $r2.append(", dob=");
        String $r110 = this.name;
        $r2.append($r110);
        $r2.append(", email=");
        String $r111 = this.email;
        $r2.append($r111);
        $r2.append(", estimatedTransactionRange=");
        Object $r37 = this.estimatedTransactionRange;
        $r2.append($r37);
        $r2.append(", firstName=");
        String $r112 = this.firstName;
        $r2.append($r112);
        $r2.append(", gender=");
        String $r113 = this.gender;
        $r2.append($r113);
        $r2.append(", hasOutlets=");
        boolean $z03 = this.hasOutlets;
        $r2.append($z03);
        $r2.append(", hashedPin=");
        String $r114 = this.hashedPin;
        $r2.append($r114);
        $r2.append(", homeAddress=");
        Object $r38 = this.homeAddress;
        $r2.append($r38);
        $r2.append(", id=");
        String $r115 = this.range;
        $r2.append($r115);
        $r2.append(", identificationCardImageId=");
        String $r116 = this.identificationCardImageId;
        $r2.append($r116);
        $r2.append(", insurancePlan=");
        String $r117 = this.insurancePlan;
        $r2.append($r117);
        $r2.append(", kcashEnabled=");
        boolean $z04 = this.kcashEnabled;
        $r2.append($z04);
        $r2.append(", kycLevel=");
        String $r118 = this.kycLevel;
        $r2.append((Object) $r118);
        $r2.append(", lastName=");
        String $r119 = this.lastName;
        $r2.append($r119);
        $r2.append(", localGovernmentArea=");
        String $r120 = this.localGovernmentArea;
        $r2.append($r120);
        $r2.append(", manager=");
        boolean $z05 = this.manager;
        $r2.append($z05);
        $r2.append(", managerId=");
        Object $r39 = this.managerId;
        $r2.append($r39);
        $r2.append(", marketerId=");
        Object $r310 = this.marketerId;
        $r2.append($r310);
        $r2.append(", mposVendor=");
        Object $r311 = this.mposVendor;
        $r2.append($r311);
        $r2.append(", parentId=");
        Object $r312 = this.parentId;
        $r2.append($r312);
        $r2.append(", personalBusinessAddress=");
        String $r121 = this.personalBusinessAddress;
        $r2.append($r121);
        $r2.append(", phoneNumber=");
        String $r122 = this.phoneNumber;
        $r2.append($r122);
        $r2.append(", phoneVerified=");
        boolean $z06 = this.phoneVerified;
        $r2.append($z06);
        $r2.append(", profilePictureId=");
        String $r123 = this.profilePictureId;
        $r2.append($r123);
        $r2.append(", referrerId=");
        Object $r313 = this.referrerId;
        $r2.append($r313);
        $r2.append(", referrerPhone=");
        Object $r314 = this.referrerPhone;
        $r2.append($r314);
        $r2.append(", referrerType=");
        String $r124 = this.referrerType;
        $r2.append($r124);
        $r2.append(", registrationLocation=");
        RegistrationLocation $r5 = this.registrationLocation;
        $r2.append($r5);
        $r2.append(", secondaryUid=");
        String $r125 = this.secondaryUid;
        $r2.append($r125);
        $r2.append(", state=");
        String $r126 = this.state;
        $r2.append($r126);
        $r2.append(", status=");
        String $r127 = this.status;
        $r2.append($r127);
        $r2.append(", terminalId=");
        String $r128 = this.terminalId;
        $r2.append($r128);
        $r2.append(", timeCreated=");
        String $r129 = this.timeCreated;
        $r2.append($r129);
        $r2.append(", timeUpdated=");
        String $r130 = this.timeUpdated;
        $r2.append($r130);
        $r2.append(", username=");
        String $r131 = this.username;
        $r2.append($r131);
        $r2.append(", utilityBillImageId=");
        String $r132 = this.utilityBillImageId;
        $r2.append($r132);
        $r2.append(", wallets=");
        Wallets $r6 = this.wallets;
        $r2.append($r6);
        $r2.append(')');
        String $r133 = $r2.toString();
        return $r133;
    }
}
