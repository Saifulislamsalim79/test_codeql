package ai.kudi.agent.login.domain.wiki;

import ai.kudi.agent.login.domain.LoginParams;
import ai.kudi.agent.register.data.sources.CacheDataSource;
import ai.kudi.agent.register.p022v2.p023ui.PhoneFragment;
import ai.kudi.agent.transactions.p032ui.bottomsheet.SendReceiptToTerminalConfirmationBottomSheet;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.agent.wallettopup.data.BanksWithMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.DBUtils$1;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: LoginResponse.kt */
@Metadata(m10422d1 = {"\u0000M\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0003\b¡\u0001\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B½\u0005\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010*\u001a\u00020+\u0012\u0006\u0010,\u001a\u00020-\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010-\u0012\b\u00102\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u00103\u001a\u000204\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010:\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010FJ\n\u0010\u009b\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010 \u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¡\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¢\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010£\u0001\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003J\f\u0010¤\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¥\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010¦\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010§\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¨\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010©\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ª\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010«\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¬\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010®\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¯\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010°\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010±\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010²\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010³\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010´\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010µ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¶\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010·\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¸\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010¹\u0001\u001a\u00020+HÆ\u0003J\n\u0010º\u0001\u001a\u00020-HÆ\u0003J\u0011\u0010»\u0001\u001a\u0004\u0018\u00010-HÆ\u0003¢\u0006\u0002\u0010mJ\n\u0010¼\u0001\u001a\u00020\u0007HÆ\u0003J\u0011\u0010½\u0001\u001a\u0004\u0018\u00010-HÆ\u0003¢\u0006\u0002\u0010mJ\f\u0010¾\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010¿\u0001\u001a\u0004\u0018\u00010-HÆ\u0003¢\u0006\u0002\u0010mJ\f\u0010À\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010Á\u0001\u001a\u000204HÆ\u0003J\u0011\u0010Â\u0001\u001a\u0004\u0018\u00010-HÆ\u0003¢\u0006\u0002\u0010mJ\f\u0010Ã\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010Ä\u0001\u001a\u0004\u0018\u00010-HÆ\u0003¢\u0006\u0002\u0010mJ\u0011\u0010Å\u0001\u001a\u0004\u0018\u00010-HÆ\u0003¢\u0006\u0002\u0010mJ\f\u0010Æ\u0001\u001a\u0004\u0018\u00010:HÆ\u0003J\n\u0010Ç\u0001\u001a\u00020\u0007HÆ\u0003J\f\u0010È\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010É\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ê\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ë\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ì\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Í\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Î\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ï\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010Ð\u0001\u001a\u0004\u0018\u00010-HÆ\u0003¢\u0006\u0002\u0010mJ\f\u0010Ñ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010Ò\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010Ó\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ô\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Õ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ö\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÔ\u0005\u0010×\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020-2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010-2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00101\u001a\u0004\u0018\u00010-2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u00103\u001a\u0002042\n\b\u0002\u00105\u001a\u0004\u0018\u00010-2\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00107\u001a\u0004\u0018\u00010-2\n\b\u0002\u00108\u001a\u0004\u0018\u00010-2\n\b\u0002\u00109\u001a\u0004\u0018\u00010:2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010C\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0003\u0010Ø\u0001J\u0015\u0010Ù\u0001\u001a\u00020-2\t\u0010Ú\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010Û\u0001\u001a\u00030Ü\u0001HÖ\u0001J\n\u0010Ý\u0001\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010H\"\u0004\bL\u0010JR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010H\"\u0004\bN\u0010JR\u0013\u0010?\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bO\u0010HR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010H\"\u0004\bQ\u0010JR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010H\"\u0004\bS\u0010JR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010H\"\u0004\bU\u0010JR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010H\"\u0004\bW\u0010JR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010H\"\u0004\bY\u0010JR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010H\"\u0004\b[\u0010JR\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010]R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010H\"\u0004\b_\u0010JR\u0013\u0010A\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b`\u0010HR\u0013\u0010@\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\ba\u0010HR\u0011\u00103\u001a\u000204¢\u0006\b\n\u0000\u001a\u0004\bb\u0010cR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010H\"\u0004\be\u0010JR\u0013\u0010)\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bf\u0010HR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bg\u0010hR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bi\u0010hR\u0013\u00100\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bj\u0010HR\u0013\u0010%\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bk\u0010HR\u0015\u00105\u001a\u0004\u0018\u00010-¢\u0006\n\n\u0002\u0010n\u001a\u0004\bl\u0010mR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010H\"\u0004\bp\u0010JR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010H\"\u0004\br\u0010JR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010H\"\u0004\bt\u0010JR\u0013\u0010B\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bu\u0010HR\u0013\u00109\u001a\u0004\u0018\u00010:¢\u0006\b\n\u0000\u001a\u0004\bv\u0010wR\u0015\u00101\u001a\u0004\u0018\u00010-¢\u0006\n\n\u0002\u0010n\u001a\u0004\b1\u0010mR\u0015\u0010/\u001a\u0004\u0018\u00010-¢\u0006\n\n\u0002\u0010n\u001a\u0004\b/\u0010mR\u0015\u00107\u001a\u0004\u0018\u00010-¢\u0006\n\n\u0002\u0010n\u001a\u0004\b7\u0010mR\u0015\u0010.\u001a\u0004\u0018\u00010-¢\u0006\n\n\u0002\u0010n\u001a\u0004\b.\u0010mR\u0011\u0010,\u001a\u00020-¢\u0006\b\n\u0000\u001a\u0004\b,\u0010xR\u0015\u00108\u001a\u0004\u0018\u00010-¢\u0006\n\n\u0002\u0010n\u001a\u0004\b8\u0010mR\u0013\u00102\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\by\u0010HR\u0013\u0010&\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bz\u0010HR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b{\u0010H\"\u0004\b|\u0010JR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b}\u0010H\"\u0004\b~\u0010JR\u0013\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010HR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u0010H\"\u0005\b\u0081\u0001\u0010JR\u0014\u0010'\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010HR\u0016\u0010C\u001a\u0004\u0018\u00010-¢\u0006\u000b\n\u0002\u0010n\u001a\u0005\b\u0083\u0001\u0010mR\u0014\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010HR\u0014\u0010D\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0085\u0001\u0010HR\u001e\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0086\u0001\u0010H\"\u0005\b\u0087\u0001\u0010JR\u0014\u00106\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0088\u0001\u0010HR\u0012\u0010\u0005\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0089\u0001\u0010HR\u0014\u0010E\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008a\u0001\u0010HR\u0014\u0010;\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008b\u0001\u0010HR\u0014\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008c\u0001\u0010HR\u0012\u0010\u0004\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008d\u0001\u0010HR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008e\u0001\u0010H\"\u0005\b\u008f\u0001\u0010JR\u0012\u0010\u0002\u001a\u00020\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0090\u0001\u0010HR\u0014\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0091\u0001\u0010HR\u0014\u0010=\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0092\u0001\u0010HR\u0014\u0010>\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0093\u0001\u0010HR\u0014\u0010<\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0094\u0001\u0010HR\u0014\u0010$\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0095\u0001\u0010HR\u0014\u0010(\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0096\u0001\u0010HR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0097\u0001\u0010H\"\u0005\b\u0098\u0001\u0010JR\u0013\u0010*\u001a\u00020+¢\u0006\n\n\u0000\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001¨\u0006Þ\u0001"}, m10421d2 = {"Lai/kudi/agent/login/domain/dto/LoginResponse;", "", TransactionField.STATUS, "", "sessionId", "role", "expiresInSeconds", "", "expiresInMinutes", "loginAttemptId", "gender", "homeAddress", PhoneFragment.ARG_BVN, "profilePictureId", "cacDocumentId", "utilityBillImageId", "identificationCardImageId", "dob", SendReceiptToTerminalConfirmationBottomSheet.STATE, "city", "cashoutAccounts", "", "Lai/kudi/agent/login/domain/dto/CashoutAccount;", "localGovernmentArea", "agentKyc", "bank", BanksWithMethods.ACCOUNT_NAME, BanksWithMethods.ACCOUNT_NUMBER, "businessAddress", "businessName", "cacRegistrationNo", "personalBusinessAddress", "posDeviceName", "terminalId", "mposVendor", "serialNumber", "userId", "firstName", "lastName", "phoneNumber", CacheDataSource.PREF_USERNAME, "email", "walletBalance", "", "isNewUser", "", "isKCashEnabled", "isC2C", "firebaseToken", "isBvnVerified", "kycLevel", "device", "Lai/kudi/agent/login/domain/dto/Device;", LoginParams.SHOULD_FORCE_KYC_UPGRADE, "referrerType", "isHq", "isOutlet", "insuranceStatus", "Lai/kudi/agent/login/domain/dto/InsuranceStatus;", "secondaryPhoneNumber", "uplineType", "timeCreated", "uplinePhone", "area", "customerType", "closestLandmark", "identityNumberType", "pinResetRequired", "primaryBusinessCategory", "savingsCategory", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lai/kudi/agent/login/domain/dto/Device;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lai/kudi/agent/login/domain/dto/InsuranceStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getAccountName", "()Ljava/lang/String;", "setAccountName", "(Ljava/lang/String;)V", "getAccountNumber", "setAccountNumber", "getAgentKyc", "setAgentKyc", "getArea", "getBank", "setBank", "getBusinessAddress", "setBusinessAddress", "getBusinessName", "setBusinessName", "getBvn", "setBvn", "getCacDocumentId", "setCacDocumentId", "getCacRegistrationNo", "setCacRegistrationNo", "getCashoutAccounts", "()Ljava/util/List;", "getCity", "setCity", "getClosestLandmark", "getCustomerType", "getDevice", "()Lai/kudi/agent/login/domain/dto/Device;", "getDob", "setDob", "getEmail", "getExpiresInMinutes", "()J", "getExpiresInSeconds", "getFirebaseToken", "getFirstName", "getForceKycUpgrade", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getGender", "setGender", "getHomeAddress", "setHomeAddress", "getIdentificationCardImageId", "setIdentificationCardImageId", "getIdentityNumberType", "getInsuranceStatus", "()Lai/kudi/agent/login/domain/dto/InsuranceStatus;", "()Z", "getKycLevel", "getLastName", "getLocalGovernmentArea", "setLocalGovernmentArea", "getLoginAttemptId", "setLoginAttemptId", "getMposVendor", "getPersonalBusinessAddress", "setPersonalBusinessAddress", "getPhoneNumber", "getPinResetRequired", "getPosDeviceName", "getPrimaryBusinessCategory", "getProfilePictureId", "setProfilePictureId", "getReferrerType", "getRole", "getSavingsCategory", "getSecondaryPhoneNumber", "getSerialNumber", "getSessionId", "getState", "setState", "getStatus", "getTerminalId", "getTimeCreated", "getUplinePhone", "getUplineType", "getUserId", "getUsername", "getUtilityBillImageId", "setUtilityBillImageId", "getWalletBalance", "()D", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component60", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lai/kudi/agent/login/domain/dto/Device;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lai/kudi/agent/login/domain/dto/InsuranceStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lai/kudi/agent/login/domain/dto/LoginResponse;", "equals", "other", "hashCode", "", "toString", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class LoginResponse {
    private String accountName;
    private String accountNumber;
    private String agentKyc;
    private final String area;
    private String bank;
    private String businessAddress;
    private String businessName;
    private String cacDocumentId;
    private String cacRegistrationNo;
    private final List<ai.kudi.agent.login.domain.dto.CashoutAccount> cashoutAccounts;
    private String city;
    private final String closestLandmark;
    private final String customerType;
    private final Device device;
    private final String email;
    private final long expiresInMinutes;
    private final long expiresInSeconds;
    private final String firebaseToken;
    private String first;
    private final String firstName;
    private final Boolean forceKycUpgrade;
    private String gender;
    private String homeAddress;
    private String identificationCardImageId;
    private final String identityNumberType;
    private final InsuranceStatus insuranceStatus;
    private final Boolean isBvnVerified;
    private final Boolean isC2C;
    private final Boolean isHq;
    private final Boolean isKCashEnabled;
    private final boolean isNewUser;
    private final Boolean isOutlet;
    private final String kycLevel;
    private final String lastName;
    private String localGovernmentArea;
    private String loginAttemptId;
    private final String mposVendor;
    private String personalBusinessAddress;
    private final String phoneNumber;
    private final Boolean pinResetRequired;
    private final String posDeviceName;
    private final String primaryBusinessCategory;
    private String profilePictureId;
    private String range;
    private final String referrerType;
    private final String role;
    private final String savingsCategory;
    private final String secondaryPhoneNumber;
    private final String serialNumber;
    private final String sessionId;
    private String state;
    private final String status;
    private final String terminalId;
    private final String timeCreated;
    private final String uplinePhone;
    private final String uplineType;
    private final String userId;
    private final String username;
    private String utilityBillImageId;
    private final double walletBalance;

    public LoginResponse(String str, String str2, String str3, long j, long j2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, List list, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, double d, boolean z, Boolean bool, Boolean bool2, String str34, Boolean bool3, String str35, Device device, Boolean bool4, String str36, Boolean bool5, Boolean bool6, InsuranceStatus insuranceStatus, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, Boolean bool7, String str45, String str46) {
        Log_OC.getArray(str, TransactionField.STATUS);
        Log_OC.getArray(str2, "sessionId");
        Log_OC.getArray(str3, "role");
        Log_OC.getArray(str4, "loginAttemptId");
        Log_OC.getArray(device, "device");
        this.status = str;
        this.sessionId = str2;
        this.role = str3;
        this.expiresInSeconds = j;
        this.expiresInMinutes = j2;
        this.loginAttemptId = str4;
        this.gender = str5;
        this.homeAddress = str6;
        this.range = str7;
        this.profilePictureId = str8;
        this.cacDocumentId = str9;
        this.utilityBillImageId = str10;
        this.identificationCardImageId = str11;
        this.first = str12;
        this.state = str13;
        this.city = str14;
        this.cashoutAccounts = list;
        this.localGovernmentArea = str15;
        this.agentKyc = str16;
        this.bank = str17;
        this.accountName = str18;
        this.accountNumber = str19;
        this.businessAddress = str20;
        this.businessName = str21;
        this.cacRegistrationNo = str22;
        this.personalBusinessAddress = str23;
        this.posDeviceName = str24;
        this.terminalId = str25;
        this.mposVendor = str26;
        this.serialNumber = str27;
        this.userId = str28;
        this.firstName = str29;
        this.lastName = str30;
        this.phoneNumber = str31;
        this.username = str32;
        this.email = str33;
        this.walletBalance = d;
        this.isNewUser = z;
        this.isKCashEnabled = bool;
        this.isC2C = bool2;
        this.firebaseToken = str34;
        this.isBvnVerified = bool3;
        this.kycLevel = str35;
        this.device = device;
        this.forceKycUpgrade = bool4;
        this.referrerType = str36;
        this.isHq = bool5;
        this.isOutlet = bool6;
        this.insuranceStatus = insuranceStatus;
        this.secondaryPhoneNumber = str37;
        this.uplineType = str38;
        this.timeCreated = str39;
        this.uplinePhone = str40;
        this.area = str41;
        this.customerType = str42;
        this.closestLandmark = str43;
        this.identityNumberType = str44;
        this.pinResetRequired = bool7;
        this.primaryBusinessCategory = str45;
        this.savingsCategory = str46;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* synthetic */ LoginResponse(String str, String str2, String $r3, long $l0, long $l1, String $r4, String $r5, String $r6, String $r7, String $r8, String str3, String str4, String str5, String str6, String str7, String str8, List $r15, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, double d, boolean z, Boolean $r35, Boolean $r36, String str28, Boolean $r38, String str29, Device device, Boolean $r41, String str30, Boolean $r43, Boolean $r44, InsuranceStatus insuranceStatus, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, Boolean $r54, String str39, String str40, int $i4, int $i2, DBUtils$1 dBUtils$1) {
        this(str, str2, ($i4 & 4) != 0 ? "" : $r3, ($i4 & 8) != 0 ? 0L : $l0, ($i4 & 16) != 0 ? 0L : $l1, ($i4 & 32) != 0 ? "" : $r4, ($i4 & 64) != 0 ? null : $r5, ($i4 & 128) != 0 ? null : $r6, ($i4 & 256) != 0 ? null : $r7, ($i4 & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) != 0 ? null : $r8, ($i4 & 1024) != 0 ? null : str3, ($i4 & IjkMediaMeta.FF_PROFILE_H264_INTRA) != 0 ? null : str4, ($i4 & 4096) != 0 ? null : str5, ($i4 & 8192) != 0 ? null : str6, ($i4 & 16384) != 0 ? null : str7, ($i4 & 32768) != 0 ? null : str8, ($i4 & 65536) != 0 ? C13726r.m3891e() : $r15, ($i4 & 131072) != 0 ? null : str9, ($i4 & 262144) != 0 ? null : str10, ($i4 & 524288) != 0 ? null : str11, ($i4 & 1048576) != 0 ? null : str12, ($i4 & 2097152) != 0 ? null : str13, ($i4 & 4194304) != 0 ? null : str14, ($i4 & 8388608) != 0 ? null : str15, ($i4 & 16777216) != 0 ? null : str16, ($i4 & 33554432) != 0 ? null : str17, ($i4 & 67108864) != 0 ? null : str18, ($i4 & 134217728) != 0 ? null : str19, ($i4 & 268435456) != 0 ? null : str20, ($i4 & 536870912) != 0 ? null : str21, ($i4 & 1073741824) != 0 ? null : str22, ($i4 & Integer.MIN_VALUE) != 0 ? null : str23, ($i2 & 1) != 0 ? null : str24, ($i2 & 2) != 0 ? null : str25, ($i2 & 4) != 0 ? null : str26, ($i2 & 8) != 0 ? null : str27, d, z, ($i2 & 64) != 0 ? Boolean.FALSE : $r35, ($i2 & 128) != 0 ? Boolean.FALSE : $r36, ($i2 & 256) != 0 ? null : str28, ($i2 & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) != 0 ? Boolean.FALSE : $r38, str29, device, ($i2 & 4096) != 0 ? Boolean.FALSE : $r41, ($i2 & 8192) != 0 ? null : str30, ($i2 & 16384) != 0 ? Boolean.FALSE : $r43, (32768 & $i2) != 0 ? Boolean.FALSE : $r44, ($i2 & 65536) != 0 ? null : insuranceStatus, ($i2 & 131072) != 0 ? null : str31, (262144 & $i2) != 0 ? null : str32, ($i2 & 524288) != 0 ? null : str33, ($i2 & 1048576) != 0 ? null : str34, ($i2 & 2097152) != 0 ? null : str35, ($i2 & 4194304) != 0 ? null : str36, ($i2 & 8388608) != 0 ? null : str37, ($i2 & 16777216) != 0 ? null : str38, (33554432 & $i2) != 0 ? Boolean.FALSE : $r54, (67108864 & $i2) != 0 ? null : str39, ($i2 & 134217728) != 0 ? null : str40);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: SSATransform
        java.lang.IndexOutOfBoundsException: bitIndex < 0: -124
        	at java.util.BitSet.get(BitSet.java:623)
        	at jadx.core.dex.visitors.ssa.LiveVarAnalysis.fillBasicBlockInfo(LiveVarAnalysis.java:65)
        	at jadx.core.dex.visitors.ssa.LiveVarAnalysis.runAnalysis(LiveVarAnalysis.java:36)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:55)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:41)
        */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ ai.kudi.agent.login.domain.wiki.LoginResponse copy$default(ai.kudi.agent.login.domain.wiki.LoginResponse r68, java.lang.String r69, java.lang.String r70, java.lang.String r71, long r72, long r74, java.lang.String r76, java.lang.String r77, java.lang.String r78, java.lang.String r79, java.lang.String r80, java.lang.String r81, java.lang.String r82, java.lang.String r83, java.lang.String r84, java.lang.String r85, java.lang.String r86, java.util.List r87, java.lang.String r88, java.lang.String r89, java.lang.String r90, java.lang.String r91, java.lang.String r92, java.lang.String r93, java.lang.String r94, java.lang.String r95, java.lang.String r96, java.lang.String r97, java.lang.String r98, java.lang.String r99, java.lang.String r100, java.lang.String r101, java.lang.String r102, java.lang.String r103, java.lang.String r104, java.lang.String r105, java.lang.String r106, double r107, boolean r109, java.lang.Boolean r110, java.lang.Boolean r111, java.lang.String r112, java.lang.Boolean r113, java.lang.String r114, ai.kudi.agent.login.domain.wiki.Device r115, java.lang.Boolean r116, java.lang.String r117, java.lang.Boolean r118, java.lang.Boolean r119, ai.kudi.agent.login.domain.wiki.InsuranceStatus r120, java.lang.String r121, java.lang.String r122, java.lang.String r123, java.lang.String r124, java.lang.String r125, java.lang.String r126, java.lang.String r127, java.lang.String r128, java.lang.Boolean r129, java.lang.String r130, java.lang.String r131, int r132, int r133, java.lang.Object r134) {
        /*
            Method dump skipped, instructions count: 1002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.login.domain.wiki.LoginResponse.copy$default(ai.kudi.agent.login.domain.wiki.LoginResponse, java.lang.String, java.lang.String, java.lang.String, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double, boolean, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.String, ai.kudi.agent.login.domain.wiki.Device, java.lang.Boolean, java.lang.String, java.lang.Boolean, java.lang.Boolean, ai.kudi.agent.login.domain.wiki.InsuranceStatus, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, int, int, java.lang.Object):ai.kudi.agent.login.domain.wiki.LoginResponse");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component1() {
        String r1 = this.status;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component10() {
        String r1 = this.profilePictureId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component11() {
        String r1 = this.cacDocumentId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component12() {
        String r1 = this.utilityBillImageId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component13() {
        String r1 = this.identificationCardImageId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component14() {
        String r1 = this.first;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component15() {
        String r1 = this.state;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component16() {
        String r1 = this.city;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List component17() {
        List r1 = this.cashoutAccounts;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component18() {
        String r1 = this.localGovernmentArea;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component19() {
        String r1 = this.agentKyc;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component2() {
        String r1 = this.sessionId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component20() {
        String r1 = this.bank;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component21() {
        String r1 = this.accountName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component22() {
        String r1 = this.accountNumber;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component23() {
        String r1 = this.businessAddress;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component24() {
        String r1 = this.businessName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component25() {
        String r1 = this.cacRegistrationNo;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component26() {
        String r1 = this.personalBusinessAddress;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component27() {
        String r1 = this.posDeviceName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component28() {
        String r1 = this.terminalId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component29() {
        String r1 = this.mposVendor;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component3() {
        String r1 = this.role;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component30() {
        String r1 = this.serialNumber;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component31() {
        String r1 = this.userId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component32() {
        String r1 = this.firstName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component33() {
        String r1 = this.lastName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component34() {
        String r1 = this.phoneNumber;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component35() {
        String r1 = this.username;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component36() {
        String r1 = this.email;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final double component37() {
        double d0 = this.walletBalance;
        return d0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean component38() {
        boolean z0 = this.isNewUser;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Boolean component39() {
        Boolean r1 = this.isKCashEnabled;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final long component4() {
        long l0 = this.expiresInSeconds;
        return l0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Boolean component40() {
        Boolean r1 = this.isC2C;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component41() {
        String r1 = this.firebaseToken;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Boolean component42() {
        Boolean r1 = this.isBvnVerified;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component43() {
        String r1 = this.kycLevel;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Device component44() {
        Device r1 = this.device;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Boolean component45() {
        Boolean r1 = this.forceKycUpgrade;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component46() {
        String r1 = this.referrerType;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Boolean component47() {
        Boolean r1 = this.isHq;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Boolean component48() {
        Boolean r1 = this.isOutlet;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InsuranceStatus component49() {
        InsuranceStatus r1 = this.insuranceStatus;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final long component5() {
        long l0 = this.expiresInMinutes;
        return l0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component50() {
        String r1 = this.secondaryPhoneNumber;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component51() {
        String r1 = this.uplineType;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component52() {
        String r1 = this.timeCreated;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component53() {
        String r1 = this.uplinePhone;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component54() {
        String r1 = this.area;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component55() {
        String r1 = this.customerType;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component56() {
        String r1 = this.closestLandmark;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component57() {
        String r1 = this.identityNumberType;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Boolean component58() {
        Boolean r1 = this.pinResetRequired;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component59() {
        String r1 = this.primaryBusinessCategory;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component6() {
        String r1 = this.loginAttemptId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component60() {
        String r1 = this.savingsCategory;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component7() {
        String r1 = this.gender;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component8() {
        String r1 = this.homeAddress;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String component9() {
        String r1 = this.range;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final LoginResponse copy(String str, String str2, String str3, long j, long j2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, List list, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, double d, boolean z, Boolean bool, Boolean bool2, String str34, Boolean bool3, String str35, Device device, Boolean bool4, String str36, Boolean bool5, Boolean bool6, InsuranceStatus insuranceStatus, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, Boolean bool7, String str45, String str46) {
        Log_OC.getArray(str, TransactionField.STATUS);
        Log_OC.getArray(str2, "sessionId");
        Log_OC.getArray(str3, "role");
        Log_OC.getArray(str4, "loginAttemptId");
        Log_OC.getArray(device, "device");
        LoginResponse $r0 = new LoginResponse(str, str2, str3, j, j2, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, list, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, d, z, bool, bool2, str34, bool3, str35, device, bool4, str36, bool5, bool6, insuranceStatus, str37, str38, str39, str40, str41, str42, str43, str44, bool7, str45, str46);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof LoginResponse;
        if ($z0) {
            LoginResponse $r2 = (LoginResponse) obj;
            String $r3 = this.status;
            String $r4 = $r2.status;
            boolean $z02 = Log_OC.append($r3, $r4);
            if ($z02) {
                String $r32 = this.sessionId;
                String $r42 = $r2.sessionId;
                boolean $z03 = Log_OC.append($r32, $r42);
                if ($z03) {
                    String $r33 = this.role;
                    String $r43 = $r2.role;
                    boolean $z04 = Log_OC.append($r33, $r43);
                    if ($z04) {
                        long $l0 = this.expiresInSeconds;
                        long $l1 = $r2.expiresInSeconds;
                        if ($l0 != $l1) {
                            return false;
                        }
                        long $l02 = this.expiresInMinutes;
                        long $l12 = $r2.expiresInMinutes;
                        if ($l02 != $l12) {
                            return false;
                        }
                        String $r34 = this.loginAttemptId;
                        String $r44 = $r2.loginAttemptId;
                        boolean $z05 = Log_OC.append($r34, $r44);
                        if ($z05) {
                            String $r35 = this.gender;
                            String $r45 = $r2.gender;
                            boolean $z06 = Log_OC.append($r35, $r45);
                            if ($z06) {
                                String $r36 = this.homeAddress;
                                String $r46 = $r2.homeAddress;
                                boolean $z07 = Log_OC.append($r36, $r46);
                                if ($z07) {
                                    String $r37 = this.range;
                                    String $r47 = $r2.range;
                                    boolean $z08 = Log_OC.append($r37, $r47);
                                    if ($z08) {
                                        String $r38 = this.profilePictureId;
                                        String $r48 = $r2.profilePictureId;
                                        boolean $z09 = Log_OC.append($r38, $r48);
                                        if ($z09) {
                                            String $r39 = this.cacDocumentId;
                                            String $r49 = $r2.cacDocumentId;
                                            boolean $z010 = Log_OC.append($r39, $r49);
                                            if ($z010) {
                                                String $r310 = this.utilityBillImageId;
                                                String $r410 = $r2.utilityBillImageId;
                                                boolean $z011 = Log_OC.append($r310, $r410);
                                                if ($z011) {
                                                    String $r311 = this.identificationCardImageId;
                                                    String $r411 = $r2.identificationCardImageId;
                                                    boolean $z012 = Log_OC.append($r311, $r411);
                                                    if ($z012) {
                                                        String $r312 = this.first;
                                                        String $r412 = $r2.first;
                                                        boolean $z013 = Log_OC.append($r312, $r412);
                                                        if ($z013) {
                                                            String $r313 = this.state;
                                                            String $r413 = $r2.state;
                                                            boolean $z014 = Log_OC.append($r313, $r413);
                                                            if ($z014) {
                                                                String $r314 = this.city;
                                                                String $r414 = $r2.city;
                                                                boolean $z015 = Log_OC.append($r314, $r414);
                                                                if ($z015) {
                                                                    List $r5 = this.cashoutAccounts;
                                                                    List $r6 = $r2.cashoutAccounts;
                                                                    boolean $z016 = Log_OC.append($r5, $r6);
                                                                    if ($z016) {
                                                                        String $r315 = this.localGovernmentArea;
                                                                        String $r415 = $r2.localGovernmentArea;
                                                                        boolean $z017 = Log_OC.append($r315, $r415);
                                                                        if ($z017) {
                                                                            String $r316 = this.agentKyc;
                                                                            String $r416 = $r2.agentKyc;
                                                                            boolean $z018 = Log_OC.append($r316, $r416);
                                                                            if ($z018) {
                                                                                String $r317 = this.bank;
                                                                                String $r417 = $r2.bank;
                                                                                boolean $z019 = Log_OC.append($r317, $r417);
                                                                                if ($z019) {
                                                                                    String $r318 = this.accountName;
                                                                                    String $r418 = $r2.accountName;
                                                                                    boolean $z020 = Log_OC.append($r318, $r418);
                                                                                    if ($z020) {
                                                                                        String $r319 = this.accountNumber;
                                                                                        String $r419 = $r2.accountNumber;
                                                                                        boolean $z021 = Log_OC.append($r319, $r419);
                                                                                        if ($z021) {
                                                                                            String $r320 = this.businessAddress;
                                                                                            String $r420 = $r2.businessAddress;
                                                                                            boolean $z022 = Log_OC.append($r320, $r420);
                                                                                            if ($z022) {
                                                                                                String $r321 = this.businessName;
                                                                                                String $r421 = $r2.businessName;
                                                                                                boolean $z023 = Log_OC.append($r321, $r421);
                                                                                                if ($z023) {
                                                                                                    String $r322 = this.cacRegistrationNo;
                                                                                                    String $r422 = $r2.cacRegistrationNo;
                                                                                                    boolean $z024 = Log_OC.append($r322, $r422);
                                                                                                    if ($z024) {
                                                                                                        String $r323 = this.personalBusinessAddress;
                                                                                                        String $r423 = $r2.personalBusinessAddress;
                                                                                                        boolean $z025 = Log_OC.append($r323, $r423);
                                                                                                        if ($z025) {
                                                                                                            String $r324 = this.posDeviceName;
                                                                                                            String $r424 = $r2.posDeviceName;
                                                                                                            boolean $z026 = Log_OC.append($r324, $r424);
                                                                                                            if ($z026) {
                                                                                                                String $r325 = this.terminalId;
                                                                                                                String $r425 = $r2.terminalId;
                                                                                                                boolean $z027 = Log_OC.append($r325, $r425);
                                                                                                                if ($z027) {
                                                                                                                    String $r326 = this.mposVendor;
                                                                                                                    String $r426 = $r2.mposVendor;
                                                                                                                    boolean $z028 = Log_OC.append($r326, $r426);
                                                                                                                    if ($z028) {
                                                                                                                        String $r327 = this.serialNumber;
                                                                                                                        String $r427 = $r2.serialNumber;
                                                                                                                        boolean $z029 = Log_OC.append($r327, $r427);
                                                                                                                        if ($z029) {
                                                                                                                            String $r328 = this.userId;
                                                                                                                            String $r428 = $r2.userId;
                                                                                                                            boolean $z030 = Log_OC.append($r328, $r428);
                                                                                                                            if ($z030) {
                                                                                                                                String $r329 = this.firstName;
                                                                                                                                String $r429 = $r2.firstName;
                                                                                                                                boolean $z031 = Log_OC.append($r329, $r429);
                                                                                                                                if ($z031) {
                                                                                                                                    String $r330 = this.lastName;
                                                                                                                                    String $r430 = $r2.lastName;
                                                                                                                                    boolean $z032 = Log_OC.append($r330, $r430);
                                                                                                                                    if ($z032) {
                                                                                                                                        String $r331 = this.phoneNumber;
                                                                                                                                        String $r431 = $r2.phoneNumber;
                                                                                                                                        boolean $z033 = Log_OC.append($r331, $r431);
                                                                                                                                        if ($z033) {
                                                                                                                                            String $r332 = this.username;
                                                                                                                                            String $r432 = $r2.username;
                                                                                                                                            boolean $z034 = Log_OC.append($r332, $r432);
                                                                                                                                            if ($z034) {
                                                                                                                                                String $r333 = this.email;
                                                                                                                                                String $r433 = $r2.email;
                                                                                                                                                boolean $z035 = Log_OC.append($r333, $r433);
                                                                                                                                                if ($z035) {
                                                                                                                                                    double $d0 = this.walletBalance;
                                                                                                                                                    Double $r7 = Double.valueOf($d0);
                                                                                                                                                    double $d02 = $r2.walletBalance;
                                                                                                                                                    Double $r8 = Double.valueOf($d02);
                                                                                                                                                    boolean $z036 = Log_OC.append($r7, $r8);
                                                                                                                                                    if ($z036) {
                                                                                                                                                        boolean $z037 = this.isNewUser;
                                                                                                                                                        boolean $z1 = $r2.isNewUser;
                                                                                                                                                        if ($z037 != $z1) {
                                                                                                                                                            return false;
                                                                                                                                                        }
                                                                                                                                                        Boolean $r9 = this.isKCashEnabled;
                                                                                                                                                        Boolean $r92 = $r2.isKCashEnabled;
                                                                                                                                                        boolean $z038 = Log_OC.append($r9, $r92);
                                                                                                                                                        if ($z038) {
                                                                                                                                                            Boolean $r93 = this.isC2C;
                                                                                                                                                            Boolean $r94 = $r2.isC2C;
                                                                                                                                                            boolean $z039 = Log_OC.append($r93, $r94);
                                                                                                                                                            if ($z039) {
                                                                                                                                                                String $r334 = this.firebaseToken;
                                                                                                                                                                String $r434 = $r2.firebaseToken;
                                                                                                                                                                boolean $z040 = Log_OC.append($r334, $r434);
                                                                                                                                                                if ($z040) {
                                                                                                                                                                    Boolean $r95 = this.isBvnVerified;
                                                                                                                                                                    Boolean $r96 = $r2.isBvnVerified;
                                                                                                                                                                    boolean $z041 = Log_OC.append($r95, $r96);
                                                                                                                                                                    if ($z041) {
                                                                                                                                                                        String $r335 = this.kycLevel;
                                                                                                                                                                        String $r435 = $r2.kycLevel;
                                                                                                                                                                        boolean $z042 = Log_OC.append($r335, $r435);
                                                                                                                                                                        if ($z042) {
                                                                                                                                                                            Device $r11 = this.device;
                                                                                                                                                                            Device $r112 = $r2.device;
                                                                                                                                                                            boolean $z043 = Log_OC.append($r11, $r112);
                                                                                                                                                                            if ($z043) {
                                                                                                                                                                                Boolean $r97 = this.forceKycUpgrade;
                                                                                                                                                                                Boolean $r98 = $r2.forceKycUpgrade;
                                                                                                                                                                                boolean $z044 = Log_OC.append($r97, $r98);
                                                                                                                                                                                if ($z044) {
                                                                                                                                                                                    String $r336 = this.referrerType;
                                                                                                                                                                                    String $r436 = $r2.referrerType;
                                                                                                                                                                                    boolean $z045 = Log_OC.append($r336, $r436);
                                                                                                                                                                                    if ($z045) {
                                                                                                                                                                                        Boolean $r99 = this.isHq;
                                                                                                                                                                                        Boolean $r910 = $r2.isHq;
                                                                                                                                                                                        boolean $z046 = Log_OC.append($r99, $r910);
                                                                                                                                                                                        if ($z046) {
                                                                                                                                                                                            Boolean $r911 = this.isOutlet;
                                                                                                                                                                                            Boolean $r912 = $r2.isOutlet;
                                                                                                                                                                                            boolean $z047 = Log_OC.append($r911, $r912);
                                                                                                                                                                                            if ($z047) {
                                                                                                                                                                                                InsuranceStatus $r13 = this.insuranceStatus;
                                                                                                                                                                                                InsuranceStatus $r132 = $r2.insuranceStatus;
                                                                                                                                                                                                boolean $z048 = Log_OC.append($r13, $r132);
                                                                                                                                                                                                if ($z048) {
                                                                                                                                                                                                    String $r337 = this.secondaryPhoneNumber;
                                                                                                                                                                                                    String $r437 = $r2.secondaryPhoneNumber;
                                                                                                                                                                                                    boolean $z049 = Log_OC.append($r337, $r437);
                                                                                                                                                                                                    if ($z049) {
                                                                                                                                                                                                        String $r338 = this.uplineType;
                                                                                                                                                                                                        String $r438 = $r2.uplineType;
                                                                                                                                                                                                        boolean $z050 = Log_OC.append($r338, $r438);
                                                                                                                                                                                                        if ($z050) {
                                                                                                                                                                                                            String $r339 = this.timeCreated;
                                                                                                                                                                                                            String $r439 = $r2.timeCreated;
                                                                                                                                                                                                            boolean $z051 = Log_OC.append($r339, $r439);
                                                                                                                                                                                                            if ($z051) {
                                                                                                                                                                                                                String $r340 = this.uplinePhone;
                                                                                                                                                                                                                String $r440 = $r2.uplinePhone;
                                                                                                                                                                                                                boolean $z052 = Log_OC.append($r340, $r440);
                                                                                                                                                                                                                if ($z052) {
                                                                                                                                                                                                                    String $r341 = this.area;
                                                                                                                                                                                                                    String $r441 = $r2.area;
                                                                                                                                                                                                                    boolean $z053 = Log_OC.append($r341, $r441);
                                                                                                                                                                                                                    if ($z053) {
                                                                                                                                                                                                                        String $r342 = this.customerType;
                                                                                                                                                                                                                        String $r442 = $r2.customerType;
                                                                                                                                                                                                                        boolean $z054 = Log_OC.append($r342, $r442);
                                                                                                                                                                                                                        if ($z054) {
                                                                                                                                                                                                                            String $r343 = this.closestLandmark;
                                                                                                                                                                                                                            String $r443 = $r2.closestLandmark;
                                                                                                                                                                                                                            boolean $z055 = Log_OC.append($r343, $r443);
                                                                                                                                                                                                                            if ($z055) {
                                                                                                                                                                                                                                String $r344 = this.identityNumberType;
                                                                                                                                                                                                                                String $r444 = $r2.identityNumberType;
                                                                                                                                                                                                                                boolean $z056 = Log_OC.append($r344, $r444);
                                                                                                                                                                                                                                if ($z056) {
                                                                                                                                                                                                                                    Boolean $r913 = this.pinResetRequired;
                                                                                                                                                                                                                                    Boolean $r914 = $r2.pinResetRequired;
                                                                                                                                                                                                                                    boolean $z057 = Log_OC.append($r913, $r914);
                                                                                                                                                                                                                                    if ($z057) {
                                                                                                                                                                                                                                        String $r345 = this.primaryBusinessCategory;
                                                                                                                                                                                                                                        String $r445 = $r2.primaryBusinessCategory;
                                                                                                                                                                                                                                        boolean $z058 = Log_OC.append($r345, $r445);
                                                                                                                                                                                                                                        if ($z058) {
                                                                                                                                                                                                                                            String $r346 = this.savingsCategory;
                                                                                                                                                                                                                                            String $r446 = $r2.savingsCategory;
                                                                                                                                                                                                                                            boolean $z059 = Log_OC.append($r346, $r446);
                                                                                                                                                                                                                                            return $z059;
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
    public final String getAgentKyc() {
        String r1 = this.agentKyc;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getArea() {
        String r1 = this.area;
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
    public final String getBvn() {
        String r1 = this.range;
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
    public final List getCashoutAccounts() {
        List r1 = this.cashoutAccounts;
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
    public final String getClosestLandmark() {
        String r1 = this.closestLandmark;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getCustomerType() {
        String r1 = this.customerType;
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
        String r1 = this.first;
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
    public final long getExpiresInMinutes() {
        long l0 = this.expiresInMinutes;
        return l0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final long getExpiresInSeconds() {
        long l0 = this.expiresInSeconds;
        return l0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getFirebaseToken() {
        String r1 = this.firebaseToken;
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
    public final Boolean getForceKycUpgrade() {
        Boolean r1 = this.forceKycUpgrade;
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
    public final String getHomeAddress() {
        String r1 = this.homeAddress;
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
    public final InsuranceStatus getInsuranceStatus() {
        InsuranceStatus r1 = this.insuranceStatus;
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
    public final String getLoginAttemptId() {
        String r1 = this.loginAttemptId;
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
    public final Boolean getPinResetRequired() {
        Boolean r1 = this.pinResetRequired;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getPosDeviceName() {
        String r1 = this.posDeviceName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getPrimaryBusinessCategory() {
        String r1 = this.primaryBusinessCategory;
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
    public final String getReferrerType() {
        String r1 = this.referrerType;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getRole() {
        String r1 = this.role;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getSavingsCategory() {
        String r1 = this.savingsCategory;
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
    public final String getSerialNumber() {
        String r1 = this.serialNumber;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getSessionId() {
        String r1 = this.sessionId;
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
    public final String getUplinePhone() {
        String r1 = this.uplinePhone;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getUplineType() {
        String r1 = this.uplineType;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getUserId() {
        String r1 = this.userId;
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
    public final double getWalletBalance() {
        double d0 = this.walletBalance;
        return d0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String $r1 = this.status;
        int $i0 = $r1.hashCode();
        String $r12 = this.sessionId;
        int $i1 = $r12.hashCode();
        String $r13 = this.role;
        int $i12 = $r13.hashCode();
        long $l2 = this.expiresInSeconds;
        int $i13 = Version$BuildAwareOrder.compare($l2);
        long $l22 = this.expiresInMinutes;
        int $i14 = Version$BuildAwareOrder.compare($l22);
        String $r14 = this.loginAttemptId;
        int $i15 = $r14.hashCode();
        int $i16 = (((((((((($i0 * 31) + $i1) * 31) + $i12) * 31) + $i13) * 31) + $i14) * 31) + $i15) * 31;
        String $r15 = this.gender;
        int $i3 = $r15 == null ? 0 : $r15.hashCode();
        int $i17 = ($i16 + $i3) * 31;
        String $r16 = this.homeAddress;
        int $i32 = $r16 == null ? 0 : $r16.hashCode();
        int $i18 = ($i17 + $i32) * 31;
        String $r17 = this.range;
        int $i33 = $r17 == null ? 0 : $r17.hashCode();
        int $i19 = ($i18 + $i33) * 31;
        String $r18 = this.profilePictureId;
        int $i34 = $r18 == null ? 0 : $r18.hashCode();
        int $i110 = ($i19 + $i34) * 31;
        String $r19 = this.cacDocumentId;
        int $i35 = $r19 == null ? 0 : $r19.hashCode();
        int $i111 = ($i110 + $i35) * 31;
        String $r110 = this.utilityBillImageId;
        int $i36 = $r110 == null ? 0 : $r110.hashCode();
        int $i112 = ($i111 + $i36) * 31;
        String $r111 = this.identificationCardImageId;
        int $i37 = $r111 == null ? 0 : $r111.hashCode();
        int $i113 = ($i112 + $i37) * 31;
        String $r112 = this.first;
        int $i38 = $r112 == null ? 0 : $r112.hashCode();
        int $i114 = ($i113 + $i38) * 31;
        String $r113 = this.state;
        int $i39 = $r113 == null ? 0 : $r113.hashCode();
        int $i115 = ($i114 + $i39) * 31;
        String $r114 = this.city;
        int $i310 = $r114 == null ? 0 : $r114.hashCode();
        int $i116 = ($i115 + $i310) * 31;
        List $r2 = this.cashoutAccounts;
        int $i311 = $r2 == null ? 0 : $r2.hashCode();
        int $i117 = ($i116 + $i311) * 31;
        String $r115 = this.localGovernmentArea;
        int $i312 = $r115 == null ? 0 : $r115.hashCode();
        int $i118 = ($i117 + $i312) * 31;
        String $r116 = this.agentKyc;
        int $i313 = $r116 == null ? 0 : $r116.hashCode();
        int $i119 = ($i118 + $i313) * 31;
        String $r117 = this.bank;
        int $i314 = $r117 == null ? 0 : $r117.hashCode();
        int $i120 = ($i119 + $i314) * 31;
        String $r118 = this.accountName;
        int $i315 = $r118 == null ? 0 : $r118.hashCode();
        int $i121 = ($i120 + $i315) * 31;
        String $r119 = this.accountNumber;
        int $i316 = $r119 == null ? 0 : $r119.hashCode();
        int $i122 = ($i121 + $i316) * 31;
        String $r120 = this.businessAddress;
        int $i317 = $r120 == null ? 0 : $r120.hashCode();
        int $i123 = ($i122 + $i317) * 31;
        String $r121 = this.businessName;
        int $i318 = $r121 == null ? 0 : $r121.hashCode();
        int $i124 = ($i123 + $i318) * 31;
        String $r122 = this.cacRegistrationNo;
        int $i319 = $r122 == null ? 0 : $r122.hashCode();
        int $i125 = ($i124 + $i319) * 31;
        String $r123 = this.personalBusinessAddress;
        int $i320 = $r123 == null ? 0 : $r123.hashCode();
        int $i126 = ($i125 + $i320) * 31;
        String $r124 = this.posDeviceName;
        int $i321 = $r124 == null ? 0 : $r124.hashCode();
        int $i127 = ($i126 + $i321) * 31;
        String $r125 = this.terminalId;
        int $i322 = $r125 == null ? 0 : $r125.hashCode();
        int $i128 = ($i127 + $i322) * 31;
        String $r126 = this.mposVendor;
        int $i323 = $r126 == null ? 0 : $r126.hashCode();
        int $i129 = ($i128 + $i323) * 31;
        String $r127 = this.serialNumber;
        int $i324 = $r127 == null ? 0 : $r127.hashCode();
        int $i130 = ($i129 + $i324) * 31;
        String $r128 = this.userId;
        int $i325 = $r128 == null ? 0 : $r128.hashCode();
        int $i131 = ($i130 + $i325) * 31;
        String $r129 = this.firstName;
        int $i326 = $r129 == null ? 0 : $r129.hashCode();
        int $i132 = ($i131 + $i326) * 31;
        String $r130 = this.lastName;
        int $i327 = $r130 == null ? 0 : $r130.hashCode();
        int $i133 = ($i132 + $i327) * 31;
        String $r131 = this.phoneNumber;
        int $i328 = $r131 == null ? 0 : $r131.hashCode();
        int $i134 = ($i133 + $i328) * 31;
        String $r132 = this.username;
        int $i329 = $r132 == null ? 0 : $r132.hashCode();
        int $i135 = ($i134 + $i329) * 31;
        String $r133 = this.email;
        int $i330 = $r133 == null ? 0 : $r133.hashCode();
        double $d0 = this.walletBalance;
        int $i331 = Tags.append($d0);
        int $i136 = ((($i135 + $i330) * 31) + $i331) * 31;
        boolean $z0 = this.isNewUser;
        int i = $z0;
        if ($z0 != 0) {
            i = 1;
        }
        int $i332 = i;
        int $i137 = ($i136 + $i332) * 31;
        Boolean $r3 = this.isKCashEnabled;
        int $i333 = $r3 == null ? 0 : $r3.hashCode();
        int $i138 = ($i137 + $i333) * 31;
        Boolean $r32 = this.isC2C;
        int $i334 = $r32 == null ? 0 : $r32.hashCode();
        int $i139 = ($i138 + $i334) * 31;
        String $r134 = this.firebaseToken;
        int $i335 = $r134 == null ? 0 : $r134.hashCode();
        int $i140 = ($i139 + $i335) * 31;
        Boolean $r33 = this.isBvnVerified;
        int $i336 = $r33 == null ? 0 : $r33.hashCode();
        int $i141 = ($i140 + $i336) * 31;
        String $r135 = this.kycLevel;
        int $i337 = $r135 == null ? 0 : $r135.hashCode();
        Device $r4 = this.device;
        int $i338 = $r4.hashCode();
        int $i142 = ((($i141 + $i337) * 31) + $i338) * 31;
        Boolean $r34 = this.forceKycUpgrade;
        int $i339 = $r34 == null ? 0 : $r34.hashCode();
        int $i143 = ($i142 + $i339) * 31;
        String $r136 = this.referrerType;
        int $i340 = $r136 == null ? 0 : $r136.hashCode();
        int $i144 = ($i143 + $i340) * 31;
        Boolean $r35 = this.isHq;
        int $i341 = $r35 == null ? 0 : $r35.hashCode();
        int $i145 = ($i144 + $i341) * 31;
        Boolean $r36 = this.isOutlet;
        int $i342 = $r36 == null ? 0 : $r36.hashCode();
        int $i146 = ($i145 + $i342) * 31;
        InsuranceStatus $r5 = this.insuranceStatus;
        int $i343 = $r5 == null ? 0 : $r5.hashCode();
        int $i147 = ($i146 + $i343) * 31;
        String $r137 = this.secondaryPhoneNumber;
        int $i344 = $r137 == null ? 0 : $r137.hashCode();
        int $i148 = ($i147 + $i344) * 31;
        String $r138 = this.uplineType;
        int $i345 = $r138 == null ? 0 : $r138.hashCode();
        int $i149 = ($i148 + $i345) * 31;
        String $r139 = this.timeCreated;
        int $i346 = $r139 == null ? 0 : $r139.hashCode();
        int $i150 = ($i149 + $i346) * 31;
        String $r140 = this.uplinePhone;
        int $i347 = $r140 == null ? 0 : $r140.hashCode();
        int $i151 = ($i150 + $i347) * 31;
        String $r141 = this.area;
        int $i348 = $r141 == null ? 0 : $r141.hashCode();
        int $i152 = ($i151 + $i348) * 31;
        String $r142 = this.customerType;
        int $i349 = $r142 == null ? 0 : $r142.hashCode();
        int $i153 = ($i152 + $i349) * 31;
        String $r143 = this.closestLandmark;
        int $i350 = $r143 == null ? 0 : $r143.hashCode();
        int $i154 = ($i153 + $i350) * 31;
        String $r144 = this.identityNumberType;
        int $i351 = $r144 == null ? 0 : $r144.hashCode();
        int $i155 = ($i154 + $i351) * 31;
        Boolean $r37 = this.pinResetRequired;
        int $i352 = $r37 == null ? 0 : $r37.hashCode();
        int $i156 = ($i155 + $i352) * 31;
        String $r145 = this.primaryBusinessCategory;
        int $i353 = $r145 == null ? 0 : $r145.hashCode();
        int $i157 = ($i156 + $i353) * 31;
        String $r146 = this.savingsCategory;
        int $i02 = $r146 != null ? $r146.hashCode() : 0;
        return $i157 + $i02;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Boolean isBvnVerified() {
        Boolean r1 = this.isBvnVerified;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Boolean isC2C() {
        Boolean r1 = this.isC2C;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Boolean isHq() {
        Boolean r1 = this.isHq;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Boolean isKCashEnabled() {
        Boolean r1 = this.isKCashEnabled;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isNewUser() {
        boolean z0 = this.isNewUser;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Boolean isOutlet() {
        Boolean r1 = this.isOutlet;
        return r1;
    }

    public final void setAccountName(String str) {
        this.accountName = str;
    }

    public final void setAccountNumber(String str) {
        this.accountNumber = str;
    }

    public final void setAgentKyc(String str) {
        this.agentKyc = str;
    }

    public final void setBank(String str) {
        this.bank = str;
    }

    public final void setBusinessAddress(String str) {
        this.businessAddress = str;
    }

    public final void setBusinessName(String str) {
        this.businessName = str;
    }

    public final void setBvn(String str) {
        this.range = str;
    }

    public final void setCacDocumentId(String str) {
        this.cacDocumentId = str;
    }

    public final void setCacRegistrationNo(String str) {
        this.cacRegistrationNo = str;
    }

    public final void setCity(String str) {
        this.city = str;
    }

    public final void setDob(String str) {
        this.first = str;
    }

    public final void setGender(String str) {
        this.gender = str;
    }

    public final void setHomeAddress(String str) {
        this.homeAddress = str;
    }

    public final void setIdentificationCardImageId(String str) {
        this.identificationCardImageId = str;
    }

    public final void setLocalGovernmentArea(String str) {
        this.localGovernmentArea = str;
    }

    public final void setLoginAttemptId(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.loginAttemptId = str;
    }

    public final void setPersonalBusinessAddress(String str) {
        this.personalBusinessAddress = str;
    }

    public final void setProfilePictureId(String str) {
        this.profilePictureId = str;
    }

    public final void setState(String str) {
        this.state = str;
    }

    public final void setUtilityBillImageId(String str) {
        this.utilityBillImageId = str;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("LoginResponse(status=");
        String $r1 = this.status;
        $r2.append($r1);
        $r2.append(", sessionId=");
        String $r12 = this.sessionId;
        $r2.append($r12);
        $r2.append(", role=");
        String $r13 = this.role;
        $r2.append($r13);
        $r2.append(", expiresInSeconds=");
        long $l0 = this.expiresInSeconds;
        $r2.append($l0);
        $r2.append(", expiresInMinutes=");
        long $l02 = this.expiresInMinutes;
        $r2.append($l02);
        $r2.append(", loginAttemptId=");
        String $r14 = this.loginAttemptId;
        $r2.append($r14);
        $r2.append(", gender=");
        String $r15 = this.gender;
        $r2.append((Object) $r15);
        $r2.append(", homeAddress=");
        String $r16 = this.homeAddress;
        $r2.append((Object) $r16);
        $r2.append(", bvn=");
        String $r17 = this.range;
        $r2.append((Object) $r17);
        $r2.append(", profilePictureId=");
        String $r18 = this.profilePictureId;
        $r2.append((Object) $r18);
        $r2.append(", cacDocumentId=");
        String $r19 = this.cacDocumentId;
        $r2.append((Object) $r19);
        $r2.append(", utilityBillImageId=");
        String $r110 = this.utilityBillImageId;
        $r2.append((Object) $r110);
        $r2.append(", identificationCardImageId=");
        String $r111 = this.identificationCardImageId;
        $r2.append((Object) $r111);
        $r2.append(", dob=");
        String $r112 = this.first;
        $r2.append((Object) $r112);
        $r2.append(", state=");
        String $r113 = this.state;
        $r2.append((Object) $r113);
        $r2.append(", city=");
        String $r114 = this.city;
        $r2.append((Object) $r114);
        $r2.append(", cashoutAccounts=");
        List $r3 = this.cashoutAccounts;
        $r2.append($r3);
        $r2.append(", localGovernmentArea=");
        String $r115 = this.localGovernmentArea;
        $r2.append((Object) $r115);
        $r2.append(", agentKyc=");
        String $r116 = this.agentKyc;
        $r2.append((Object) $r116);
        $r2.append(", bank=");
        String $r117 = this.bank;
        $r2.append((Object) $r117);
        $r2.append(", accountName=");
        String $r118 = this.accountName;
        $r2.append((Object) $r118);
        $r2.append(", accountNumber=");
        String $r119 = this.accountNumber;
        $r2.append((Object) $r119);
        $r2.append(", businessAddress=");
        String $r120 = this.businessAddress;
        $r2.append((Object) $r120);
        $r2.append(", businessName=");
        String $r121 = this.businessName;
        $r2.append((Object) $r121);
        $r2.append(", cacRegistrationNo=");
        String $r122 = this.cacRegistrationNo;
        $r2.append((Object) $r122);
        $r2.append(", personalBusinessAddress=");
        String $r123 = this.personalBusinessAddress;
        $r2.append((Object) $r123);
        $r2.append(", posDeviceName=");
        String $r124 = this.posDeviceName;
        $r2.append((Object) $r124);
        $r2.append(", terminalId=");
        String $r125 = this.terminalId;
        $r2.append((Object) $r125);
        $r2.append(", mposVendor=");
        String $r126 = this.mposVendor;
        $r2.append((Object) $r126);
        $r2.append(", serialNumber=");
        String $r127 = this.serialNumber;
        $r2.append((Object) $r127);
        $r2.append(", userId=");
        String $r128 = this.userId;
        $r2.append((Object) $r128);
        $r2.append(", firstName=");
        String $r129 = this.firstName;
        $r2.append((Object) $r129);
        $r2.append(", lastName=");
        String $r130 = this.lastName;
        $r2.append((Object) $r130);
        $r2.append(", phoneNumber=");
        String $r131 = this.phoneNumber;
        $r2.append((Object) $r131);
        $r2.append(", username=");
        String $r132 = this.username;
        $r2.append((Object) $r132);
        $r2.append(", email=");
        String $r133 = this.email;
        $r2.append((Object) $r133);
        $r2.append(", walletBalance=");
        double $d0 = this.walletBalance;
        $r2.append($d0);
        $r2.append(", isNewUser=");
        boolean $z0 = this.isNewUser;
        $r2.append($z0);
        $r2.append(", isKCashEnabled=");
        Boolean $r4 = this.isKCashEnabled;
        $r2.append($r4);
        $r2.append(", isC2C=");
        Boolean $r42 = this.isC2C;
        $r2.append($r42);
        $r2.append(", firebaseToken=");
        String $r134 = this.firebaseToken;
        $r2.append((Object) $r134);
        $r2.append(", isBvnVerified=");
        Boolean $r43 = this.isBvnVerified;
        $r2.append($r43);
        $r2.append(", kycLevel=");
        String $r135 = this.kycLevel;
        $r2.append((Object) $r135);
        $r2.append(", device=");
        Device $r5 = this.device;
        $r2.append($r5);
        $r2.append(", forceKycUpgrade=");
        Boolean $r44 = this.forceKycUpgrade;
        $r2.append($r44);
        $r2.append(", referrerType=");
        String $r136 = this.referrerType;
        $r2.append((Object) $r136);
        $r2.append(", isHq=");
        Boolean $r45 = this.isHq;
        $r2.append($r45);
        $r2.append(", isOutlet=");
        Boolean $r46 = this.isOutlet;
        $r2.append($r46);
        $r2.append(", insuranceStatus=");
        InsuranceStatus $r6 = this.insuranceStatus;
        $r2.append($r6);
        $r2.append(", secondaryPhoneNumber=");
        String $r137 = this.secondaryPhoneNumber;
        $r2.append((Object) $r137);
        $r2.append(", uplineType=");
        String $r138 = this.uplineType;
        $r2.append((Object) $r138);
        $r2.append(", timeCreated=");
        String $r139 = this.timeCreated;
        $r2.append((Object) $r139);
        $r2.append(", uplinePhone=");
        String $r140 = this.uplinePhone;
        $r2.append((Object) $r140);
        $r2.append(", area=");
        String $r141 = this.area;
        $r2.append((Object) $r141);
        $r2.append(", customerType=");
        String $r142 = this.customerType;
        $r2.append((Object) $r142);
        $r2.append(", closestLandmark=");
        String $r143 = this.closestLandmark;
        $r2.append((Object) $r143);
        $r2.append(", identityNumberType=");
        String $r144 = this.identityNumberType;
        $r2.append((Object) $r144);
        $r2.append(", pinResetRequired=");
        Boolean $r47 = this.pinResetRequired;
        $r2.append($r47);
        $r2.append(", primaryBusinessCategory=");
        String $r145 = this.primaryBusinessCategory;
        $r2.append((Object) $r145);
        $r2.append(", savingsCategory=");
        String $r146 = this.savingsCategory;
        $r2.append((Object) $r146);
        $r2.append(')');
        String $r147 = $r2.toString();
        return $r147;
    }
}
