package ai.kudi.dip.library.button;

import ai.kudi.dip.library.C0755a;
import ai.kudi.dip.library.C0799g;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C1335a;
import androidx.core.graphics.drawable.C1365a;
import kotlin.Metadata;
import kotlin.e0.d.l;
import kotlin.p557z.C13706j;
/* compiled from: KudiTextView.kt */
@Metadata(m10422d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/dip/library/button/KudiTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "drawableTint", "", "hoverColor", "kudi-dip-library_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class KudiTextView extends AppCompatTextView {

    /* renamed from: c */
    private final int f2157c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KudiTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        l.f(attributeSet, "attributeSet");
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0799g.KudiTextView);
        this.f2157c = obtainStyledAttributes.getColor(C0799g.KudiTextView_drawableTint, C1335a.m36324d(context, C0755a.kudiButtonDrawableColor));
        obtainStyledAttributes.getColor(C0799g.KudiTextView_pressedColor, C1335a.m36324d(context, C0755a.kudiButtonDrawableColor));
        obtainStyledAttributes.recycle();
        Drawable[] compoundDrawables = getCompoundDrawables();
        l.e(compoundDrawables, "compoundDrawables");
        Drawable drawable = (Drawable) C13706j.m4114B(compoundDrawables, 0);
        if (drawable != null) {
            C1365a.m36188n(drawable.mutate(), this.f2157c);
        }
        setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }
}
