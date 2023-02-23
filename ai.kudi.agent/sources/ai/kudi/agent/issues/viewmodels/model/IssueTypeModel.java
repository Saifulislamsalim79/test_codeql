package ai.kudi.agent.issues.viewmodels.model;

import ai.kudi.agent.pin.KudiPin;
import ai.kudi.agent.register.adapter.DynamicSearchAdapter;
import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: IssueTypeModel.kt */
@Metadata(m10422d1 = {"\u0000K\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0003\b\u008a\u0001\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BÃ\u0003\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010&\u001a\u00020\u0004\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010+\u001a\u00020\u0014¢\u0006\u0002\u0010,J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0011\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010aJ\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0014HÆ\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040\u001aHÆ\u0003J\u0010\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001aHÆ\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\n\u0010\u0098\u0001\u001a\u00020\u0004HÆ\u0003J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\n\u0010\u009d\u0001\u001a\u00020\u0014HÆ\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010 \u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010¡\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010¢\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\f\u0010£\u0001\u001a\u0004\u0018\u00010\u0004HÆ\u0003JÎ\u0003\u0010¤\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010&\u001a\u00020\u00042\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010+\u001a\u00020\u0014HÆ\u0001¢\u0006\u0003\u0010¥\u0001J\u000b\u0010¦\u0001\u001a\u00030§\u0001HÖ\u0001J\u0016\u0010¨\u0001\u001a\u00020\u00142\n\u0010©\u0001\u001a\u0005\u0018\u00010ª\u0001HÖ\u0003J\t\u0010«\u0001\u001a\u00020\u0004H\u0016J\u000b\u0010¬\u0001\u001a\u00030§\u0001HÖ\u0001J\n\u0010\u00ad\u0001\u001a\u00020\u0004HÖ\u0001J\u001f\u0010®\u0001\u001a\u00030¯\u00012\b\u0010°\u0001\u001a\u00030±\u00012\b\u0010²\u0001\u001a\u00030§\u0001HÖ\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u0010*\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010.\"\u0004\b2\u00100R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010.\"\u0004\b4\u00100R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010.\"\u0004\b6\u00100R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010.\"\u0004\b8\u00100R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010.\"\u0004\b:\u00100R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001c\u0010#\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010.\"\u0004\b@\u00100R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010.\"\u0004\bB\u00100R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010.\"\u0004\bD\u00100R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010.\"\u0004\bF\u00100R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010<\"\u0004\bH\u0010>R\u001a\u0010+\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010I\"\u0004\bJ\u0010KR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010.\"\u0004\bM\u00100R\u001a\u0010&\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010.\"\u0004\bO\u00100R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010.\"\u0004\bQ\u00100R\u001c\u0010%\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010.\"\u0004\bS\u00100R\u001c\u0010$\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010.\"\u0004\bU\u00100R\u001c\u0010 \u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010.\"\u0004\bW\u00100R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010.\"\u0004\bY\u00100R\u001c\u0010!\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010.\"\u0004\b[\u00100R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010.\"\u0004\b]\u00100R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010.\"\u0004\b_\u00100R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u0010\n\u0002\u0010d\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001a\u0010\u0017\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010I\"\u0004\bf\u0010KR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010.\"\u0004\bh\u00100R\u001c\u0010(\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010.\"\u0004\bj\u00100R\u001c\u0010'\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010.\"\u0004\bl\u00100R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010.\"\u0004\bn\u00100R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010.\"\u0004\bp\u00100R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010.\"\u0004\br\u00100R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010.\"\u0004\bt\u00100R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bu\u0010.\"\u0004\bv\u00100R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010.\"\u0004\bx\u00100R\u001c\u0010\"\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u0010.\"\u0004\bz\u00100R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b{\u0010.\"\u0004\b|\u00100R\u001c\u0010)\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b}\u0010.\"\u0004\b~\u00100¨\u0006³\u0001"}, m10421d2 = {"Lai/kudi/agent/issues/viewmodels/model/IssueTypeModel;", "Landroid/os/Parcelable;", "Lai/kudi/agent/register/adapter/DynamicSearchAdapter$Searchable;", KudiPin.KUDI_PIN_TITLE, "", "description", "transactionId", TransactionField.AMOUNT, "type", "issueId", "transactionDate", "transactionValue", "rrn", "firstSixDigit", "lastFourDigit", "terminalId", "customerName", "customerPhoneNumber", "customerBank", "shouldSettleCustomer", "", "customerAccountNumber", "transactionType", "shouldSkipInfo", "transactionvalue", "imgUrls", "", "defaultUrls", "Ljava/io/File;", "sendersBank", "depositorsName", "sendersName", "prettyName", "senderBank", "transferRoute", "depositorName", "pickUpAddress", "maxedPan", "label", "ticketResolved", "ticketId", "typeSlug", "body", "isFromTransactionPage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getAmount", "()Ljava/lang/String;", "setAmount", "(Ljava/lang/String;)V", "getBody", "setBody", "getCustomerAccountNumber", "setCustomerAccountNumber", "getCustomerBank", "setCustomerBank", "getCustomerName", "setCustomerName", "getCustomerPhoneNumber", "setCustomerPhoneNumber", "getDefaultUrls", "()Ljava/util/List;", "setDefaultUrls", "(Ljava/util/List;)V", "getDepositorName", "setDepositorName", "getDepositorsName", "setDepositorsName", "getDescription", "setDescription", "getFirstSixDigit", "setFirstSixDigit", "getImgUrls", "setImgUrls", "()Z", "setFromTransactionPage", "(Z)V", "getIssueId", "setIssueId", "getLabel", "setLabel", "getLastFourDigit", "setLastFourDigit", "getMaxedPan", "setMaxedPan", "getPickUpAddress", "setPickUpAddress", "getPrettyName", "setPrettyName", "getRrn", "setRrn", "getSenderBank", "setSenderBank", "getSendersBank", "setSendersBank", "getSendersName", "setSendersName", "getShouldSettleCustomer", "()Ljava/lang/Boolean;", "setShouldSettleCustomer", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getShouldSkipInfo", "setShouldSkipInfo", "getTerminalId", "setTerminalId", "getTicketId", "setTicketId", "getTicketResolved", "setTicketResolved", "getTitle", "setTitle", "getTransactionDate", "setTransactionDate", "getTransactionId", "setTransactionId", "getTransactionType", "setTransactionType", "getTransactionValue", "setTransactionValue", "getTransactionvalue", "setTransactionvalue", "getTransferRoute", "setTransferRoute", "getType", "setType", "getTypeSlug", "setTypeSlug", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lai/kudi/agent/issues/viewmodels/model/IssueTypeModel;", "describeContents", "", "equals", "other", "", "getSearchCriteria", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "feature-issue-resolution_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class IssueTypeModel implements Parcelable, DynamicSearchAdapter.Searchable {
    public static final Parcelable.Creator<IssueTypeModel> CREATOR;
    private String amount;
    private String author;
    private String body;
    private String customerAccountNumber;
    private String customerBank;
    private String customerName;
    private String customerPhoneNumber;
    private List<File> defaultUrls;
    private String depositorName;
    private String depositorsName;
    private String description;
    private String firstSixDigit;
    private List<String> imgUrls;
    private boolean isFromTransactionPage;
    private String issueId;
    private String label;
    private String lastFourDigit;
    private String maxedPan;
    private String pickUpAddress;
    private String prettyName;
    private String senderBank;
    private String sendersBank;
    private String sendersName;
    private Boolean shouldSettleCustomer;
    private boolean shouldSkipInfo;
    private String terminalId;
    private String ticketId;
    private String ticketResolved;
    private String title;
    private String transactionDate;
    private String transactionId;
    private String transactionType;
    private String transactionValue;
    private String transactionvalue;
    private String transferRoute;
    private String type;
    private String typeSlug;

    /* compiled from: IssueTypeModel.kt */
    @Metadata(k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Creator implements Parcelable.Creator<IssueTypeModel> {
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
         */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IssueTypeModel createFromParcel(Parcel parcel) {
            Boolean $r18;
            Log_OC.getArray(parcel, "parcel");
            String $r3 = parcel.readString();
            String $r4 = parcel.readString();
            String $r5 = parcel.readString();
            String $r6 = parcel.readString();
            String $r7 = parcel.readString();
            String $r8 = parcel.readString();
            String $r9 = parcel.readString();
            String $r10 = parcel.readString();
            String $r11 = parcel.readString();
            String $r12 = parcel.readString();
            String $r13 = parcel.readString();
            String $r14 = parcel.readString();
            String $r15 = parcel.readString();
            String $r16 = parcel.readString();
            String $r17 = parcel.readString();
            int $i0 = parcel.readInt();
            if ($i0 == 0) {
                $r18 = null;
            } else {
                int $i02 = parcel.readInt();
                $r18 = Boolean.valueOf($i02 != 0);
            }
            String $r19 = parcel.readString();
            String $r20 = parcel.readString();
            int $i03 = parcel.readInt();
            boolean z = $i03 != 0;
            String $r21 = parcel.readString();
            ArrayList $r22 = parcel.createStringArrayList();
            int $i1 = parcel.readInt();
            ArrayList $r23 = new ArrayList($i1);
            for (int $i12 = 0; $i12 != $i1; $i12++) {
                Serializable $r24 = parcel.readSerializable();
                $r23.add($r24);
            }
            String $r25 = parcel.readString();
            String $r26 = parcel.readString();
            String $r27 = parcel.readString();
            String $r28 = parcel.readString();
            String $r29 = parcel.readString();
            String $r30 = parcel.readString();
            String $r31 = parcel.readString();
            String $r32 = parcel.readString();
            String $r33 = parcel.readString();
            String $r34 = parcel.readString();
            String $r35 = parcel.readString();
            String $r36 = parcel.readString();
            String $r37 = parcel.readString();
            String $r38 = parcel.readString();
            int $i04 = parcel.readInt();
            IssueTypeModel $r2 = new IssueTypeModel($r3, $r4, $r5, $r6, $r7, $r8, $r9, $r10, $r11, $r12, $r13, $r14, $r15, $r16, $r17, $r18, $r19, $r20, z, $r21, $r22, $r23, $r25, $r26, $r27, $r28, $r29, $r30, $r31, $r32, $r33, $r34, $r35, $r36, $r37, $r38, $i04 != 0);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ IssueTypeModel createFromParcel(Parcel parcel) {
            IssueTypeModel $r1 = createFromParcel(parcel);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IssueTypeModel[] newArray(int i) {
            IssueTypeModel[] $r1 = new IssueTypeModel[i];
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ IssueTypeModel[] newArray(int i) {
            IssueTypeModel[] $r1 = newArray(i);
            return $r1;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        Creator $r0 = new Creator();
        CREATOR = $r0;
    }

    public IssueTypeModel() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -1, 31, null);
    }

    public IssueTypeModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Boolean bool, String str16, String str17, boolean z, String str18, List list, List list2, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, boolean z2) {
        Log_OC.getArray(list, "imgUrls");
        Log_OC.getArray(list2, "defaultUrls");
        Log_OC.getArray(str28, "label");
        this.title = str;
        this.description = str2;
        this.transactionId = str3;
        this.amount = str4;
        this.type = str5;
        this.issueId = str6;
        this.transactionDate = str7;
        this.transactionValue = str8;
        this.author = str9;
        this.firstSixDigit = str10;
        this.lastFourDigit = str11;
        this.terminalId = str12;
        this.customerName = str13;
        this.customerPhoneNumber = str14;
        this.customerBank = str15;
        this.shouldSettleCustomer = bool;
        this.customerAccountNumber = str16;
        this.transactionType = str17;
        this.shouldSkipInfo = z;
        this.transactionvalue = str18;
        this.imgUrls = list;
        this.defaultUrls = list2;
        this.sendersBank = str19;
        this.depositorsName = str20;
        this.sendersName = str21;
        this.prettyName = str22;
        this.senderBank = str23;
        this.transferRoute = str24;
        this.depositorName = str25;
        this.pickUpAddress = str26;
        this.maxedPan = str27;
        this.label = str28;
        this.ticketResolved = str29;
        this.ticketId = str30;
        this.typeSlug = str31;
        this.body = str32;
        this.isFromTransactionPage = z2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ IssueTypeModel(java.lang.String r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, java.lang.String r54, java.lang.String r55, java.lang.String r56, java.lang.String r57, java.lang.String r58, java.lang.String r59, java.lang.String r60, java.lang.String r61, java.lang.Boolean r62, java.lang.String r63, java.lang.String r64, boolean r65, java.lang.String r66, java.util.List r67, java.util.List r68, java.lang.String r69, java.lang.String r70, java.lang.String r71, java.lang.String r72, java.lang.String r73, java.lang.String r74, java.lang.String r75, java.lang.String r76, java.lang.String r77, java.lang.String r78, java.lang.String r79, java.lang.String r80, java.lang.String r81, java.lang.String r82, boolean r83, int r84, int r85, kotlin.p483e0.p485d.DBUtils$1 r86) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.issues.viewmodels.model.IssueTypeModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, boolean, java.lang.String, java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int, int, kotlin.e0.d.DBUtils$1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static /* synthetic */ IssueTypeModel copy$default(IssueTypeModel issueTypeModel, String $r2, String $r3, String $r4, String $r5, String $r6, String $r7, String $r8, String $r9, String $r10, String $r11, String $r12, String $r13, String $r14, String $r15, String $r16, Boolean $r17, String $r18, String $r19, boolean $z0, String $r20, List $r21, List $r22, String $r23, String $r24, String $r25, String $r26, String $r27, String $r28, String $r29, String $r30, String $r31, String $r32, String $r33, String $r34, String $r35, String $r36, boolean $z1, int $i2, int i, Object obj) {
        if (($i2 & 1) != 0) {
            $r2 = issueTypeModel.title;
        }
        if (($i2 & 2) != 0) {
            $r3 = issueTypeModel.description;
        }
        if (($i2 & 4) != 0) {
            $r4 = issueTypeModel.transactionId;
        }
        if (($i2 & 8) != 0) {
            $r5 = issueTypeModel.amount;
        }
        if (($i2 & 16) != 0) {
            $r6 = issueTypeModel.type;
        }
        if (($i2 & 32) != 0) {
            $r7 = issueTypeModel.issueId;
        }
        if (($i2 & 64) != 0) {
            $r8 = issueTypeModel.transactionDate;
        }
        if (($i2 & 128) != 0) {
            $r9 = issueTypeModel.transactionValue;
        }
        if (($i2 & 256) != 0) {
            $r10 = issueTypeModel.author;
        }
        if (($i2 & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) != 0) {
            $r11 = issueTypeModel.firstSixDigit;
        }
        if (($i2 & 1024) != 0) {
            $r12 = issueTypeModel.lastFourDigit;
        }
        if (($i2 & IjkMediaMeta.FF_PROFILE_H264_INTRA) != 0) {
            $r13 = issueTypeModel.terminalId;
        }
        if (($i2 & 4096) != 0) {
            String $r142 = issueTypeModel.customerName;
            $r14 = $r142;
        }
        if (($i2 & 8192) != 0) {
            String $r152 = issueTypeModel.customerPhoneNumber;
            $r15 = $r152;
        }
        if (($i2 & 16384) != 0) {
            String $r162 = issueTypeModel.customerBank;
            $r16 = $r162;
        }
        if (($i2 & 32768) != 0) {
            Boolean $r172 = issueTypeModel.shouldSettleCustomer;
            $r17 = $r172;
        }
        if (($i2 & 65536) != 0) {
            String $r182 = issueTypeModel.customerAccountNumber;
            $r18 = $r182;
        }
        if (($i2 & 131072) != 0) {
            String $r192 = issueTypeModel.transactionType;
            $r19 = $r192;
        }
        if (($i2 & 262144) != 0) {
            boolean $z02 = issueTypeModel.shouldSkipInfo;
            $z0 = $z02;
        }
        if (($i2 & 524288) != 0) {
            String $r202 = issueTypeModel.transactionvalue;
            $r20 = $r202;
        }
        if (($i2 & 1048576) != 0) {
            $r21 = issueTypeModel.imgUrls;
        }
        if (($i2 & 2097152) != 0) {
            $r22 = issueTypeModel.defaultUrls;
        }
        if (($i2 & 4194304) != 0) {
            String $r232 = issueTypeModel.sendersBank;
            $r23 = $r232;
        }
        if (($i2 & 8388608) != 0) {
            String $r242 = issueTypeModel.depositorsName;
            $r24 = $r242;
        }
        if (($i2 & 16777216) != 0) {
            String $r252 = issueTypeModel.sendersName;
            $r25 = $r252;
        }
        if (($i2 & 33554432) != 0) {
            String $r262 = issueTypeModel.prettyName;
            $r26 = $r262;
        }
        if (($i2 & 67108864) != 0) {
            String $r272 = issueTypeModel.senderBank;
            $r27 = $r272;
        }
        if (($i2 & 134217728) != 0) {
            String $r282 = issueTypeModel.transferRoute;
            $r28 = $r282;
        }
        if (($i2 & 268435456) != 0) {
            String $r292 = issueTypeModel.depositorName;
            $r29 = $r292;
        }
        if (($i2 & 536870912) != 0) {
            String $r302 = issueTypeModel.pickUpAddress;
            $r30 = $r302;
        }
        if (($i2 & 1073741824) != 0) {
            String $r312 = issueTypeModel.maxedPan;
            $r31 = $r312;
        }
        int $i0 = $i2 & Integer.MIN_VALUE;
        if ($i0 != 0) {
            String $r322 = issueTypeModel.label;
            $r32 = $r322;
        }
        int $i02 = i & 1;
        if ($i02 != 0) {
            String $r332 = issueTypeModel.ticketResolved;
            $r33 = $r332;
        }
        int $i03 = i & 2;
        if ($i03 != 0) {
            String $r342 = issueTypeModel.ticketId;
            $r34 = $r342;
        }
        int $i04 = i & 4;
        if ($i04 != 0) {
            String $r352 = issueTypeModel.typeSlug;
            $r35 = $r352;
        }
        int $i05 = i & 8;
        if ($i05 != 0) {
            String $r362 = issueTypeModel.body;
            $r36 = $r362;
        }
        int $i06 = i & 16;
        if ($i06 != 0) {
            boolean $z12 = issueTypeModel.isFromTransactionPage;
            $z1 = $z12;
        }
        IssueTypeModel $r0 = issueTypeModel.copy($r2, $r3, $r4, $r5, $r6, $r7, $r8, $r9, $r10, $r11, $r12, $r13, $r14, $r15, $r16, $r17, $r18, $r19, $z0, $r20, $r21, $r22, $r23, $r24, $r25, $r26, $r27, $r28, $r29, $r30, $r31, $r32, $r33, $r34, $r35, $r36, $z1);
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String component1() {
        String r1 = this.title;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String component10() {
        String r1 = this.firstSixDigit;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String component11() {
        String r1 = this.lastFourDigit;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String component12() {
        String r1 = this.terminalId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String component13() {
        String r1 = this.customerName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String component14() {
        String r1 = this.customerPhoneNumber;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String component15() {
        String r1 = this.customerBank;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final Boolean component16() {
        Boolean r1 = this.shouldSettleCustomer;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String component17() {
        String r1 = this.customerAccountNumber;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String component18() {
        String r1 = this.transactionType;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final boolean component19() {
        boolean z0 = this.shouldSkipInfo;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String component2() {
        String r1 = this.description;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String component20() {
        String r1 = this.transactionvalue;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final List component21() {
        List r1 = this.imgUrls;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final List component22() {
        List r1 = this.defaultUrls;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String component23() {
        String r1 = this.sendersBank;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String component24() {
        String r1 = this.depositorsName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String component25() {
        String r1 = this.sendersName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String component26() {
        String r1 = this.prettyName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String component27() {
        String r1 = this.senderBank;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String component28() {
        String r1 = this.transferRoute;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String component29() {
        String r1 = this.depositorName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String component3() {
        String r1 = this.transactionId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String component30() {
        String r1 = this.pickUpAddress;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String component31() {
        String r1 = this.maxedPan;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String component32() {
        String r1 = this.label;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String component33() {
        String r1 = this.ticketResolved;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String component34() {
        String r1 = this.ticketId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String component35() {
        String r1 = this.typeSlug;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String component36() {
        String r1 = this.body;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final boolean component37() {
        boolean z0 = this.isFromTransactionPage;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String component4() {
        String r1 = this.amount;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String component5() {
        String r1 = this.type;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String component6() {
        String r1 = this.issueId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String component7() {
        String r1 = this.transactionDate;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String component8() {
        String r1 = this.transactionValue;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String component9() {
        String r1 = this.author;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final IssueTypeModel copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Boolean bool, String str16, String str17, boolean z, String str18, List list, List list2, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, boolean z2) {
        Log_OC.getArray(list, "imgUrls");
        Log_OC.getArray(list2, "defaultUrls");
        Log_OC.getArray(str28, "label");
        IssueTypeModel $r0 = new IssueTypeModel(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, bool, str16, str17, z, str18, list, list2, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, z2);
        return $r0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean $z0 = obj instanceof IssueTypeModel;
        if ($z0) {
            IssueTypeModel $r2 = (IssueTypeModel) obj;
            String $r3 = this.title;
            String $r4 = $r2.title;
            boolean $z02 = Log_OC.append($r3, $r4);
            if ($z02) {
                String $r32 = this.description;
                String $r42 = $r2.description;
                boolean $z03 = Log_OC.append($r32, $r42);
                if ($z03) {
                    String $r33 = this.transactionId;
                    String $r43 = $r2.transactionId;
                    boolean $z04 = Log_OC.append($r33, $r43);
                    if ($z04) {
                        String $r34 = this.amount;
                        String $r44 = $r2.amount;
                        boolean $z05 = Log_OC.append($r34, $r44);
                        if ($z05) {
                            String $r35 = this.type;
                            String $r45 = $r2.type;
                            boolean $z06 = Log_OC.append($r35, $r45);
                            if ($z06) {
                                String $r36 = this.issueId;
                                String $r46 = $r2.issueId;
                                boolean $z07 = Log_OC.append($r36, $r46);
                                if ($z07) {
                                    String $r37 = this.transactionDate;
                                    String $r47 = $r2.transactionDate;
                                    boolean $z08 = Log_OC.append($r37, $r47);
                                    if ($z08) {
                                        String $r38 = this.transactionValue;
                                        String $r48 = $r2.transactionValue;
                                        boolean $z09 = Log_OC.append($r38, $r48);
                                        if ($z09) {
                                            String $r39 = this.author;
                                            String $r49 = $r2.author;
                                            boolean $z010 = Log_OC.append($r39, $r49);
                                            if ($z010) {
                                                String $r310 = this.firstSixDigit;
                                                String $r410 = $r2.firstSixDigit;
                                                boolean $z011 = Log_OC.append($r310, $r410);
                                                if ($z011) {
                                                    String $r311 = this.lastFourDigit;
                                                    String $r411 = $r2.lastFourDigit;
                                                    boolean $z012 = Log_OC.append($r311, $r411);
                                                    if ($z012) {
                                                        String $r312 = this.terminalId;
                                                        String $r412 = $r2.terminalId;
                                                        boolean $z013 = Log_OC.append($r312, $r412);
                                                        if ($z013) {
                                                            String $r313 = this.customerName;
                                                            String $r413 = $r2.customerName;
                                                            boolean $z014 = Log_OC.append($r313, $r413);
                                                            if ($z014) {
                                                                String $r314 = this.customerPhoneNumber;
                                                                String $r414 = $r2.customerPhoneNumber;
                                                                boolean $z015 = Log_OC.append($r314, $r414);
                                                                if ($z015) {
                                                                    String $r315 = this.customerBank;
                                                                    String $r415 = $r2.customerBank;
                                                                    boolean $z016 = Log_OC.append($r315, $r415);
                                                                    if ($z016) {
                                                                        Boolean $r5 = this.shouldSettleCustomer;
                                                                        Boolean $r6 = $r2.shouldSettleCustomer;
                                                                        boolean $z017 = Log_OC.append($r5, $r6);
                                                                        if ($z017) {
                                                                            String $r316 = this.customerAccountNumber;
                                                                            String $r416 = $r2.customerAccountNumber;
                                                                            boolean $z018 = Log_OC.append($r316, $r416);
                                                                            if ($z018) {
                                                                                String $r317 = this.transactionType;
                                                                                String $r417 = $r2.transactionType;
                                                                                boolean $z019 = Log_OC.append($r317, $r417);
                                                                                if ($z019) {
                                                                                    boolean $z020 = this.shouldSkipInfo;
                                                                                    boolean $z1 = $r2.shouldSkipInfo;
                                                                                    if ($z020 != $z1) {
                                                                                        return false;
                                                                                    }
                                                                                    String $r318 = this.transactionvalue;
                                                                                    String $r418 = $r2.transactionvalue;
                                                                                    boolean $z021 = Log_OC.append($r318, $r418);
                                                                                    if ($z021) {
                                                                                        List $r7 = this.imgUrls;
                                                                                        List $r8 = $r2.imgUrls;
                                                                                        boolean $z022 = Log_OC.append($r7, $r8);
                                                                                        if ($z022) {
                                                                                            List $r72 = this.defaultUrls;
                                                                                            List $r82 = $r2.defaultUrls;
                                                                                            boolean $z023 = Log_OC.append($r72, $r82);
                                                                                            if ($z023) {
                                                                                                String $r319 = this.sendersBank;
                                                                                                String $r419 = $r2.sendersBank;
                                                                                                boolean $z024 = Log_OC.append($r319, $r419);
                                                                                                if ($z024) {
                                                                                                    String $r320 = this.depositorsName;
                                                                                                    String $r420 = $r2.depositorsName;
                                                                                                    boolean $z025 = Log_OC.append($r320, $r420);
                                                                                                    if ($z025) {
                                                                                                        String $r321 = this.sendersName;
                                                                                                        String $r421 = $r2.sendersName;
                                                                                                        boolean $z026 = Log_OC.append($r321, $r421);
                                                                                                        if ($z026) {
                                                                                                            String $r322 = this.prettyName;
                                                                                                            String $r422 = $r2.prettyName;
                                                                                                            boolean $z027 = Log_OC.append($r322, $r422);
                                                                                                            if ($z027) {
                                                                                                                String $r323 = this.senderBank;
                                                                                                                String $r423 = $r2.senderBank;
                                                                                                                boolean $z028 = Log_OC.append($r323, $r423);
                                                                                                                if ($z028) {
                                                                                                                    String $r324 = this.transferRoute;
                                                                                                                    String $r424 = $r2.transferRoute;
                                                                                                                    boolean $z029 = Log_OC.append($r324, $r424);
                                                                                                                    if ($z029) {
                                                                                                                        String $r325 = this.depositorName;
                                                                                                                        String $r425 = $r2.depositorName;
                                                                                                                        boolean $z030 = Log_OC.append($r325, $r425);
                                                                                                                        if ($z030) {
                                                                                                                            String $r326 = this.pickUpAddress;
                                                                                                                            String $r426 = $r2.pickUpAddress;
                                                                                                                            boolean $z031 = Log_OC.append($r326, $r426);
                                                                                                                            if ($z031) {
                                                                                                                                String $r327 = this.maxedPan;
                                                                                                                                String $r427 = $r2.maxedPan;
                                                                                                                                boolean $z032 = Log_OC.append($r327, $r427);
                                                                                                                                if ($z032) {
                                                                                                                                    String $r328 = this.label;
                                                                                                                                    String $r428 = $r2.label;
                                                                                                                                    boolean $z033 = Log_OC.append($r328, $r428);
                                                                                                                                    if ($z033) {
                                                                                                                                        String $r329 = this.ticketResolved;
                                                                                                                                        String $r429 = $r2.ticketResolved;
                                                                                                                                        boolean $z034 = Log_OC.append($r329, $r429);
                                                                                                                                        if ($z034) {
                                                                                                                                            String $r330 = this.ticketId;
                                                                                                                                            String $r430 = $r2.ticketId;
                                                                                                                                            boolean $z035 = Log_OC.append($r330, $r430);
                                                                                                                                            if ($z035) {
                                                                                                                                                String $r331 = this.typeSlug;
                                                                                                                                                String $r431 = $r2.typeSlug;
                                                                                                                                                boolean $z036 = Log_OC.append($r331, $r431);
                                                                                                                                                if ($z036) {
                                                                                                                                                    String $r332 = this.body;
                                                                                                                                                    String $r432 = $r2.body;
                                                                                                                                                    boolean $z037 = Log_OC.append($r332, $r432);
                                                                                                                                                    if ($z037) {
                                                                                                                                                        boolean $z038 = this.isFromTransactionPage;
                                                                                                                                                        boolean $z12 = $r2.isFromTransactionPage;
                                                                                                                                                        return $z038 == $z12;
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
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getAmount() {
        String r1 = this.amount;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getBody() {
        String r1 = this.body;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getCustomerAccountNumber() {
        String r1 = this.customerAccountNumber;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getCustomerBank() {
        String r1 = this.customerBank;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getCustomerName() {
        String r1 = this.customerName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getCustomerPhoneNumber() {
        String r1 = this.customerPhoneNumber;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final List getDefaultUrls() {
        List r1 = this.defaultUrls;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getDepositorName() {
        String r1 = this.depositorName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getDepositorsName() {
        String r1 = this.depositorsName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getDescription() {
        String r1 = this.description;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getFirstSixDigit() {
        String r1 = this.firstSixDigit;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final List getImgUrls() {
        List r1 = this.imgUrls;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getIssueId() {
        String r1 = this.issueId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getLabel() {
        String r1 = this.label;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getLastFourDigit() {
        String r1 = this.lastFourDigit;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getMaxedPan() {
        String r1 = this.maxedPan;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getPickUpAddress() {
        String r1 = this.pickUpAddress;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getPrettyName() {
        String r1 = this.prettyName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getRrn() {
        String r1 = this.author;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // ai.kudi.agent.register.adapter.DynamicSearchAdapter.Searchable
    public String getSearchCriteria() {
        String $r1 = this.title;
        return $r1 == null ? "" : $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getSenderBank() {
        String r1 = this.senderBank;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getSendersBank() {
        String r1 = this.sendersBank;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getSendersName() {
        String r1 = this.sendersName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final Boolean getShouldSettleCustomer() {
        Boolean r1 = this.shouldSettleCustomer;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final boolean getShouldSkipInfo() {
        boolean z0 = this.shouldSkipInfo;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getTerminalId() {
        String r1 = this.terminalId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getTicketId() {
        String r1 = this.ticketId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getTicketResolved() {
        String r1 = this.ticketResolved;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getTitle() {
        String r1 = this.title;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getTransactionDate() {
        String r1 = this.transactionDate;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getTransactionId() {
        String r1 = this.transactionId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getTransactionType() {
        String r1 = this.transactionType;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getTransactionValue() {
        String r1 = this.transactionValue;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getTransactionvalue() {
        String r1 = this.transactionvalue;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getTransferRoute() {
        String r1 = this.transferRoute;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getType() {
        String r1 = this.type;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final String getTypeSlug() {
        String r1 = this.typeSlug;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String $r1 = this.title;
        int $i1 = $r1 == null ? 0 : $r1.hashCode();
        int $i12 = $i1 * 31;
        String $r12 = this.description;
        int $i2 = $r12 == null ? 0 : $r12.hashCode();
        int $i13 = ($i12 + $i2) * 31;
        String $r13 = this.transactionId;
        int $i22 = $r13 == null ? 0 : $r13.hashCode();
        int $i14 = ($i13 + $i22) * 31;
        String $r14 = this.amount;
        int $i23 = $r14 == null ? 0 : $r14.hashCode();
        int $i15 = ($i14 + $i23) * 31;
        String $r15 = this.type;
        int $i24 = $r15 == null ? 0 : $r15.hashCode();
        int $i16 = ($i15 + $i24) * 31;
        String $r16 = this.issueId;
        int $i25 = $r16 == null ? 0 : $r16.hashCode();
        int $i17 = ($i16 + $i25) * 31;
        String $r17 = this.transactionDate;
        int $i26 = $r17 == null ? 0 : $r17.hashCode();
        int $i18 = ($i17 + $i26) * 31;
        String $r18 = this.transactionValue;
        int $i27 = $r18 == null ? 0 : $r18.hashCode();
        int $i19 = ($i18 + $i27) * 31;
        String $r19 = this.author;
        int $i28 = $r19 == null ? 0 : $r19.hashCode();
        int $i110 = ($i19 + $i28) * 31;
        String $r110 = this.firstSixDigit;
        int $i29 = $r110 == null ? 0 : $r110.hashCode();
        int $i111 = ($i110 + $i29) * 31;
        String $r111 = this.lastFourDigit;
        int $i210 = $r111 == null ? 0 : $r111.hashCode();
        int $i112 = ($i111 + $i210) * 31;
        String $r112 = this.terminalId;
        int $i211 = $r112 == null ? 0 : $r112.hashCode();
        int $i113 = ($i112 + $i211) * 31;
        String $r113 = this.customerName;
        int $i212 = $r113 == null ? 0 : $r113.hashCode();
        int $i114 = ($i113 + $i212) * 31;
        String $r114 = this.customerPhoneNumber;
        int $i213 = $r114 == null ? 0 : $r114.hashCode();
        int $i115 = ($i114 + $i213) * 31;
        String $r115 = this.customerBank;
        int $i214 = $r115 == null ? 0 : $r115.hashCode();
        int $i116 = ($i115 + $i214) * 31;
        Boolean $r2 = this.shouldSettleCustomer;
        int $i215 = $r2 == null ? 0 : $r2.hashCode();
        int $i117 = ($i116 + $i215) * 31;
        String $r116 = this.customerAccountNumber;
        int $i216 = $r116 == null ? 0 : $r116.hashCode();
        int $i118 = ($i117 + $i216) * 31;
        String $r117 = this.transactionType;
        int $i217 = $r117 == null ? 0 : $r117.hashCode();
        int $i119 = ($i118 + $i217) * 31;
        boolean $z0 = this.shouldSkipInfo;
        int i = $z0;
        if ($z0 != 0) {
            i = 1;
        }
        int $i218 = i;
        int $i120 = ($i119 + $i218) * 31;
        String $r118 = this.transactionvalue;
        int $i219 = $r118 == null ? 0 : $r118.hashCode();
        List $r3 = this.imgUrls;
        int $i220 = $r3.hashCode();
        List $r32 = this.defaultUrls;
        int $i221 = $r32.hashCode();
        int $i121 = ((((($i120 + $i219) * 31) + $i220) * 31) + $i221) * 31;
        String $r119 = this.sendersBank;
        int $i222 = $r119 == null ? 0 : $r119.hashCode();
        int $i122 = ($i121 + $i222) * 31;
        String $r120 = this.depositorsName;
        int $i223 = $r120 == null ? 0 : $r120.hashCode();
        int $i123 = ($i122 + $i223) * 31;
        String $r121 = this.sendersName;
        int $i224 = $r121 == null ? 0 : $r121.hashCode();
        int $i124 = ($i123 + $i224) * 31;
        String $r122 = this.prettyName;
        int $i225 = $r122 == null ? 0 : $r122.hashCode();
        int $i125 = ($i124 + $i225) * 31;
        String $r123 = this.senderBank;
        int $i226 = $r123 == null ? 0 : $r123.hashCode();
        int $i126 = ($i125 + $i226) * 31;
        String $r124 = this.transferRoute;
        int $i227 = $r124 == null ? 0 : $r124.hashCode();
        int $i127 = ($i126 + $i227) * 31;
        String $r125 = this.depositorName;
        int $i228 = $r125 == null ? 0 : $r125.hashCode();
        int $i128 = ($i127 + $i228) * 31;
        String $r126 = this.pickUpAddress;
        int $i229 = $r126 == null ? 0 : $r126.hashCode();
        int $i129 = ($i128 + $i229) * 31;
        String $r127 = this.maxedPan;
        int $i230 = $r127 == null ? 0 : $r127.hashCode();
        int $i231 = this.label.hashCode();
        int $i130 = ((($i129 + $i230) * 31) + $i231) * 31;
        String $r128 = this.ticketResolved;
        int $i232 = $r128 == null ? 0 : $r128.hashCode();
        int $i131 = ($i130 + $i232) * 31;
        String $r129 = this.ticketId;
        int $i233 = $r129 == null ? 0 : $r129.hashCode();
        int $i132 = ($i131 + $i233) * 31;
        String $r130 = this.typeSlug;
        int $i234 = $r130 == null ? 0 : $r130.hashCode();
        int $i133 = ($i132 + $i234) * 31;
        String $r131 = this.body;
        int $i0 = $r131 != null ? $r131.hashCode() : 0;
        int $i02 = ($i133 + $i0) * 31;
        boolean $z02 = this.isFromTransactionPage;
        int $i134 = $z02 ? 1 : $z02 ? 1 : 0;
        return $i02 + $i134;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public final boolean isFromTransactionPage() {
        boolean z0 = this.isFromTransactionPage;
        return z0;
    }

    public final void setAmount(String str) {
        this.amount = str;
    }

    public final void setBody(String str) {
        this.body = str;
    }

    public final void setCustomerAccountNumber(String str) {
        this.customerAccountNumber = str;
    }

    public final void setCustomerBank(String str) {
        this.customerBank = str;
    }

    public final void setCustomerName(String str) {
        this.customerName = str;
    }

    public final void setCustomerPhoneNumber(String str) {
        this.customerPhoneNumber = str;
    }

    public final void setDefaultUrls(List list) {
        Log_OC.getArray(list, "<set-?>");
        this.defaultUrls = list;
    }

    public final void setDepositorName(String str) {
        this.depositorName = str;
    }

    public final void setDepositorsName(String str) {
        this.depositorsName = str;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setFirstSixDigit(String str) {
        this.firstSixDigit = str;
    }

    public final void setFromTransactionPage(boolean z) {
        this.isFromTransactionPage = z;
    }

    public final void setImgUrls(List list) {
        Log_OC.getArray(list, "<set-?>");
        this.imgUrls = list;
    }

    public final void setIssueId(String str) {
        this.issueId = str;
    }

    public final void setLabel(String str) {
        Log_OC.getArray(str, "<set-?>");
        this.label = str;
    }

    public final void setLastFourDigit(String str) {
        this.lastFourDigit = str;
    }

    public final void setMaxedPan(String str) {
        this.maxedPan = str;
    }

    public final void setPickUpAddress(String str) {
        this.pickUpAddress = str;
    }

    public final void setPrettyName(String str) {
        this.prettyName = str;
    }

    public final void setRrn(String str) {
        this.author = str;
    }

    public final void setSenderBank(String str) {
        this.senderBank = str;
    }

    public final void setSendersBank(String str) {
        this.sendersBank = str;
    }

    public final void setSendersName(String str) {
        this.sendersName = str;
    }

    public final void setShouldSettleCustomer(Boolean bool) {
        this.shouldSettleCustomer = bool;
    }

    public final void setShouldSkipInfo(boolean z) {
        this.shouldSkipInfo = z;
    }

    public final void setTerminalId(String str) {
        this.terminalId = str;
    }

    public final void setTicketId(String str) {
        this.ticketId = str;
    }

    public final void setTicketResolved(String str) {
        this.ticketResolved = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setTransactionDate(String str) {
        this.transactionDate = str;
    }

    public final void setTransactionId(String str) {
        this.transactionId = str;
    }

    public final void setTransactionType(String str) {
        this.transactionType = str;
    }

    public final void setTransactionValue(String str) {
        this.transactionValue = str;
    }

    public final void setTransactionvalue(String str) {
        this.transactionvalue = str;
    }

    public final void setTransferRoute(String str) {
        this.transferRoute = str;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setTypeSlug(String str) {
        this.typeSlug = str;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("IssueTypeModel(title=");
        String $r1 = this.title;
        $r2.append((Object) $r1);
        $r2.append(", description=");
        String $r12 = this.description;
        $r2.append((Object) $r12);
        $r2.append(", transactionId=");
        String $r13 = this.transactionId;
        $r2.append((Object) $r13);
        $r2.append(", amount=");
        String $r14 = this.amount;
        $r2.append((Object) $r14);
        $r2.append(", type=");
        String $r15 = this.type;
        $r2.append((Object) $r15);
        $r2.append(", issueId=");
        String $r16 = this.issueId;
        $r2.append((Object) $r16);
        $r2.append(", transactionDate=");
        String $r17 = this.transactionDate;
        $r2.append((Object) $r17);
        $r2.append(", transactionValue=");
        String $r18 = this.transactionValue;
        $r2.append((Object) $r18);
        $r2.append(", rrn=");
        String $r19 = this.author;
        $r2.append((Object) $r19);
        $r2.append(", firstSixDigit=");
        String $r110 = this.firstSixDigit;
        $r2.append((Object) $r110);
        $r2.append(", lastFourDigit=");
        String $r111 = this.lastFourDigit;
        $r2.append((Object) $r111);
        $r2.append(", terminalId=");
        String $r112 = this.terminalId;
        $r2.append((Object) $r112);
        $r2.append(", customerName=");
        String $r113 = this.customerName;
        $r2.append((Object) $r113);
        $r2.append(", customerPhoneNumber=");
        String $r114 = this.customerPhoneNumber;
        $r2.append((Object) $r114);
        $r2.append(", customerBank=");
        String $r115 = this.customerBank;
        $r2.append((Object) $r115);
        $r2.append(", shouldSettleCustomer=");
        Boolean $r3 = this.shouldSettleCustomer;
        $r2.append($r3);
        $r2.append(", customerAccountNumber=");
        String $r116 = this.customerAccountNumber;
        $r2.append((Object) $r116);
        $r2.append(", transactionType=");
        String $r117 = this.transactionType;
        $r2.append((Object) $r117);
        $r2.append(", shouldSkipInfo=");
        boolean $z0 = this.shouldSkipInfo;
        $r2.append($z0);
        $r2.append(", transactionvalue=");
        String $r118 = this.transactionvalue;
        $r2.append((Object) $r118);
        $r2.append(", imgUrls=");
        List $r4 = this.imgUrls;
        $r2.append($r4);
        $r2.append(", defaultUrls=");
        List $r42 = this.defaultUrls;
        $r2.append($r42);
        $r2.append(", sendersBank=");
        String $r119 = this.sendersBank;
        $r2.append((Object) $r119);
        $r2.append(", depositorsName=");
        String $r120 = this.depositorsName;
        $r2.append((Object) $r120);
        $r2.append(", sendersName=");
        String $r121 = this.sendersName;
        $r2.append((Object) $r121);
        $r2.append(", prettyName=");
        String $r122 = this.prettyName;
        $r2.append((Object) $r122);
        $r2.append(", senderBank=");
        String $r123 = this.senderBank;
        $r2.append((Object) $r123);
        $r2.append(", transferRoute=");
        String $r124 = this.transferRoute;
        $r2.append((Object) $r124);
        $r2.append(", depositorName=");
        String $r125 = this.depositorName;
        $r2.append((Object) $r125);
        $r2.append(", pickUpAddress=");
        String $r126 = this.pickUpAddress;
        $r2.append((Object) $r126);
        $r2.append(", maxedPan=");
        String $r127 = this.maxedPan;
        $r2.append((Object) $r127);
        $r2.append(", label=");
        String $r128 = this.label;
        $r2.append($r128);
        $r2.append(", ticketResolved=");
        String $r129 = this.ticketResolved;
        $r2.append((Object) $r129);
        $r2.append(", ticketId=");
        String $r130 = this.ticketId;
        $r2.append((Object) $r130);
        $r2.append(", typeSlug=");
        String $r131 = this.typeSlug;
        $r2.append((Object) $r131);
        $r2.append(", body=");
        String $r132 = this.body;
        $r2.append((Object) $r132);
        $r2.append(", isFromTransactionPage=");
        boolean $z02 = this.isFromTransactionPage;
        $r2.append($z02);
        $r2.append(')');
        String $r133 = $r2.toString();
        return $r133;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* JADX WARN: Incorrect condition in loop: B:9:0x008e */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void writeToParcel(android.os.Parcel r11, int r12) {
        /*
            r10 = this;
            java.lang.String r0 = "out"
            kotlin.p483e0.p485d.Log_OC.getArray(r11, r0)
            java.lang.String r1 = r10.title
            r11.writeString(r1)
            java.lang.String r1 = r10.description
            r11.writeString(r1)
            java.lang.String r1 = r10.transactionId
            r11.writeString(r1)
            java.lang.String r1 = r10.amount
            r11.writeString(r1)
            java.lang.String r1 = r10.type
            r11.writeString(r1)
            java.lang.String r1 = r10.issueId
            r11.writeString(r1)
            java.lang.String r1 = r10.transactionDate
            r11.writeString(r1)
            java.lang.String r1 = r10.transactionValue
            r11.writeString(r1)
            java.lang.String r1 = r10.author
            r11.writeString(r1)
            java.lang.String r1 = r10.firstSixDigit
            r11.writeString(r1)
            java.lang.String r1 = r10.lastFourDigit
            r11.writeString(r1)
            java.lang.String r1 = r10.terminalId
            r11.writeString(r1)
            java.lang.String r1 = r10.customerName
            r11.writeString(r1)
            java.lang.String r1 = r10.customerPhoneNumber
            r11.writeString(r1)
            java.lang.String r1 = r10.customerBank
            r11.writeString(r1)
            java.lang.Boolean r2 = r10.shouldSettleCustomer
            if (r2 != 0) goto L5a
            r3 = 0
        L55:
            r12 = r3
            r11.writeInt(r12)
            goto L63
        L5a:
            r4 = 1
            r11.writeInt(r4)
            boolean r3 = r2.booleanValue()
            goto L55
        L63:
            java.lang.String r1 = r10.customerAccountNumber
            r11.writeString(r1)
            java.lang.String r1 = r10.transactionType
            r11.writeString(r1)
            boolean r3 = r10.shouldSkipInfo
            r12 = r3
            r11.writeInt(r12)
            java.lang.String r1 = r10.transactionvalue
            r11.writeString(r1)
            java.util.List<java.lang.String> r5 = r10.imgUrls
            r11.writeStringList(r5)
            java.util.List<java.io.File> r5 = r10.defaultUrls
            int r12 = r5.size()
            r11.writeInt(r12)
            java.util.Iterator r6 = r5.iterator()
        L8a:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L9c
            java.lang.Object r7 = r6.next()
            r9 = r7
            java.io.Serializable r9 = (java.io.Serializable) r9
            r8 = r9
            r11.writeSerializable(r8)
            goto L8a
        L9c:
            java.lang.String r1 = r10.sendersBank
            r11.writeString(r1)
            java.lang.String r1 = r10.depositorsName
            r11.writeString(r1)
            java.lang.String r1 = r10.sendersName
            r11.writeString(r1)
            java.lang.String r1 = r10.prettyName
            r11.writeString(r1)
            java.lang.String r1 = r10.senderBank
            r11.writeString(r1)
            java.lang.String r1 = r10.transferRoute
            r11.writeString(r1)
            java.lang.String r1 = r10.depositorName
            r11.writeString(r1)
            java.lang.String r1 = r10.pickUpAddress
            r11.writeString(r1)
            java.lang.String r1 = r10.maxedPan
            r11.writeString(r1)
            java.lang.String r1 = r10.label
            r11.writeString(r1)
            java.lang.String r1 = r10.ticketResolved
            r11.writeString(r1)
            java.lang.String r1 = r10.ticketId
            r11.writeString(r1)
            java.lang.String r1 = r10.typeSlug
            r11.writeString(r1)
            java.lang.String r1 = r10.body
            r11.writeString(r1)
            boolean r3 = r10.isFromTransactionPage
            r12 = r3
            r11.writeInt(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.issues.viewmodels.model.IssueTypeModel.writeToParcel(android.os.Parcel, int):void");
    }
}
