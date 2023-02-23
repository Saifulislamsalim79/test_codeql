package ai.kudi.agent.core.util;

import android.text.TextPaint;
import android.text.style.URLSpan;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* compiled from: URLSpanNoUnderline.kt */
@Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/core/util/URLSpanNoUnderline;", "Landroid/text/style/URLSpan;", IjkMediaPlayer.OnNativeInvokeListener.ARG_URL, "", "(Ljava/lang/String;)V", "updateDrawState", "", "ds", "Landroid/text/TextPaint;", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class URLSpanNoUnderline extends URLSpan {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public URLSpanNoUnderline(String str) {
        super(str);
        Log_OC.getArray(str, IjkMediaPlayer.OnNativeInvokeListener.ARG_URL);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        Log_OC.getArray(textPaint, "ds");
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
