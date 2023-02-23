package ai.kudi.dip.library.button;

import ai.kudi.dip.library.C0756b;
import ai.kudi.dip.library.C0786e;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.C1129o;
import androidx.core.content.C1335a;
import kotlin.Metadata;
import kotlin.e0.d.l;
/* compiled from: KudiRadioButton.kt */
@Metadata(m10422d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¨\u0006\n"}, m10421d2 = {"Lai/kudi/dip/library/button/KudiRadioButton;", "Landroidx/appcompat/widget/AppCompatRadioButton;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "toInt", "", "value", "kudi-dip-library_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class KudiRadioButton extends C1129o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KudiRadioButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        l.f(attributeSet, "attributeSet");
        View.inflate(context, C0786e.kudi_radio_button, null);
        setBackgroundResource(C0756b.shape_rect);
        setButtonDrawable((Drawable) null);
        int m38031a = m38031a(20);
        setPadding(m38031a, m38031a, m38031a, m38031a);
        setCompoundDrawablesWithIntrinsicBounds(C1335a.m36322f(context, C0756b.drawable_kudi_radio_button), (Drawable) null, (Drawable) null, (Drawable) null);
    }

    /* renamed from: a */
    public final int m38031a(int i) {
        return (int) ((i * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }
}
