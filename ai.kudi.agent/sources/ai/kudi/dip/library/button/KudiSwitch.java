package ai.kudi.dip.library.button;

import ai.kudi.dip.library.C0799g;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import p201g.p202a.C7461j;
/* compiled from: KudiSwitch.kt */
@Metadata(m10422d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ&\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u0003J\u001a\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000f0\u0012J\b\u0010\u0014\u001a\u00020\u000fH\u0002R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m10421d2 = {"Lai/kudi/dip/library/button/KudiSwitch;", "Landroidx/appcompat/widget/SwitchCompat;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "offTrackTint", "thumbTint", "trackTint", "init", "", "setOnCheckedChangeListener", "onCheckedChanged", "Lkotlin/Function1;", "", "updateTint", "Companion", "kudi-dip-library_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class KudiSwitch extends SwitchCompat {

    /* renamed from: n0 */
    private static final String f2153n0 = "KudiSwitch";

    /* renamed from: k0 */
    private int f2154k0;

    /* renamed from: l0 */
    private int f2155l0;

    /* renamed from: m0 */
    private int f2156m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KudiSwitch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        l.f(attributeSet, "attributeSet");
        this.f2154k0 = Color.parseColor("#0F8CFF");
        this.f2155l0 = -7829368;
        this.f2156m0 = -1;
        m38029p(this, context, attributeSet, 0, 4, null);
    }

    /* renamed from: o */
    private final void m38030o(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0799g.SwitchCompat);
        l.e(obtainStyledAttributes, "getContext().obtainStyledAttributes(attributeSet, R.styleable.SwitchCompat)");
        this.f2154k0 = obtainStyledAttributes.getColor(C7461j.SwitchCompat_trackTint, Color.parseColor("#0F8CFF"));
        this.f2156m0 = obtainStyledAttributes.getColor(C7461j.SwitchCompat_thumbTint, -1);
        m38026s();
        obtainStyledAttributes.recycle();
    }

    /* renamed from: p */
    static /* synthetic */ void m38029p(KudiSwitch kudiSwitch, Context context, AttributeSet attributeSet, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        kudiSwitch.m38030o(context, attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final void m38027r(InterfaceC11767l interfaceC11767l, KudiSwitch kudiSwitch, CompoundButton compoundButton, boolean z) {
        l.f(interfaceC11767l, "$onCheckedChanged");
        l.f(kudiSwitch, "this$0");
        interfaceC11767l.invoke(Boolean.valueOf(z));
        kudiSwitch.m38026s();
    }

    /* renamed from: s */
    private final void m38026s() {
        int m38011b;
        int m38011b2;
        int m38011b3;
        int m38011b4;
        int m38011b5;
        int m38011b6;
        String str = f2153n0;
        StringBuilder sb = new StringBuilder();
        sb.append(isChecked());
        sb.append(' ');
        sb.append(isActivated());
        Log.d(str, sb.toString());
        int i = isChecked() ? this.f2154k0 : this.f2155l0;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i);
        m38011b = C0769h.m38011b(38);
        m38011b2 = C0769h.m38011b(30);
        gradientDrawable.setSize(m38011b, m38011b2);
        m38011b3 = C0769h.m38011b(20);
        gradientDrawable.setCornerRadius(m38011b3);
        setTrackDrawable(gradientDrawable);
        StateListDrawable stateListDrawable = new StateListDrawable();
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(this.f2156m0);
        m38011b4 = C0769h.m38011b(30);
        m38011b5 = C0769h.m38011b(17);
        gradientDrawable2.setSize(m38011b4, m38011b5);
        m38011b6 = C0769h.m38011b(5);
        gradientDrawable2.setStroke(m38011b6, i);
        stateListDrawable.addState(new int[0], gradientDrawable2);
        setThumbDrawable(stateListDrawable);
    }

    public final void setOnCheckedChangeListener(final InterfaceC11767l<? super Boolean, C13666w> interfaceC11767l) {
        l.f(interfaceC11767l, "onCheckedChanged");
        setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ai.kudi.dip.library.button.d
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                KudiSwitch.m38027r(InterfaceC11767l.this, this, compoundButton, z);
            }
        });
    }
}
