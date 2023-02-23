package ai.kudi.agent.custom.views;

import ai.kudi.agent.core.C0038R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C1335a;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: CustomBgTextview.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m10421d2 = {"Lai/kudi/agent/custom/views/CustomBgTextview;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bgColor", "", "getBgColor", "()I", "cornerRadius", "", "getCornerRadius", "()F", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class CustomBgTextview extends AppCompatTextView {
    private final int bgColor;
    private final float cornerRadius;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public CustomBgTextview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Log_OC.getArray(context, "context");
        Log_OC.getArray(attributeSet, "attrs");
        int $i0 = C0038R.C0041layout.custom_bg_textview;
        View.inflate(context, $i0, null);
        CustomBgTextview r11 = this;
        Context $r4 = r11.getContext();
        int[] $r5 = C0038R.styleable.CustomBgTextview;
        TypedArray $r6 = $r4.obtainStyledAttributes(attributeSet, $r5);
        Log_OC.loadImage($r6, "getContext().obtainStyledAttributes(attrs, R.styleable.CustomBgTextview)");
        int $i02 = C0038R.styleable.CustomBgTextview_cornerRadius;
        float $f0 = $r6.getDimension($i02, 3.0f);
        this.cornerRadius = $f0;
        int $i03 = C0038R.styleable.CustomBgTextview_bgColor;
        int $i1 = C0038R.color.colorPrimary;
        this.bgColor = $r6.getColor($i03, C1335a.m36324d(context, $i1));
        $r6.recycle();
        int $i04 = C0038R.C0039drawable.curved_kudi_accent_fill;
        Drawable $r7 = C1335a.m36322f(context, $i04);
        Drawable $r3 = $r7 != null ? $r7.mutate() : null;
        if ($r3 == null) {
            NullPointerException r10 = new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
            throw r10;
        }
        GradientDrawable $r8 = (GradientDrawable) $r3;
        int $i05 = this.bgColor;
        $r8.setColor($i05);
        float $f02 = this.cornerRadius;
        $r8.setCornerRadius($f02);
        CustomBgTextview r112 = this;
        r112.setBackground($r8);
        $r8.mutate();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getBgColor() {
        int i0 = this.bgColor;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final float getCornerRadius() {
        float f0 = this.cornerRadius;
        return f0;
    }
}
