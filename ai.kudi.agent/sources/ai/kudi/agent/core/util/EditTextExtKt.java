package ai.kudi.agent.core.util;

import android.widget.TextView;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p368e.p369a.AbstractC9419a;
import p272h.p368e.p369a.p371c.C9421a;
import p425j.p444e.AbstractC11688p;
import p425j.p444e.Item;
import p425j.p444e.p445b0.p447c.ContextUtils;
/* compiled from: EditTextExt.kt */
@Metadata(m10422d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m10421d2 = {"textChanges", "Lio/reactivex/Observable;", "", "Landroid/widget/TextView;", "getTextChanges", "(Landroid/widget/TextView;)Lio/reactivex/Observable;", "core_release"}, k = 2, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class EditTextExtKt {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final AbstractC11688p getTextChanges(TextView textView) {
        Log_OC.getArray(textView, "<this>");
        AbstractC9419a $r1 = C9421a.m14785a(textView);
        Log_OC.m10360a($r1, "RxTextView.textChanges(this)");
        TimeUnit $r2 = TimeUnit.MILLISECONDS;
        AbstractC11688p $r3 = $r1.m10492r(150L, $r2);
        AbstractC11688p $r32 = $r3.m10523W();
        Item $r4 = ContextUtils.LogError();
        AbstractC11688p $r33 = $r32.R($r4);
        Log_OC.loadImage($r33, "<get-textChanges>");
        return $r33;
    }
}
