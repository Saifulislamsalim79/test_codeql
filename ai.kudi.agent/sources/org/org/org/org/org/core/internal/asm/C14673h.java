package org.org.org.org.org.core.internal.asm;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.webkit.WebView;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.Switch;
import android.widget.TimePicker;
import android.widget.VideoView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.List;
import kotlin.C13218k;
import kotlin.InterfaceC11824h;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13277t;
import org.org.org.org.asm.C14592c;
import org.org.org.org.asm.util.C14619f;
import org.org.org.org.asm.util.C14620i;
import org.org.org.org.org.p602ui.asm.C14720d;
import org.org.org.org.org.p602ui.asm.ClassReader;
/* renamed from: org.org.org.org.org.core.internal.asm.h */
/* loaded from: classes.dex */
public final class C14673h extends Label {

    /* renamed from: a */
    public final InterfaceC11824h f32670a;

    /* renamed from: b */
    public final InterfaceC11824h f32671b;

    /* renamed from: f */
    public final InterfaceC11824h f32672f;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public C14673h() {
        InterfaceC11824h $r2;
        InterfaceC11824h $r22;
        InterfaceC11824h $r23;
        Frame $r1 = Frame.f32642h;
        $r2 = C13218k.m5625b($r1);
        this.f32670a = $r2;
        CharDirectionality$Companion$directionalityMap$2 $r3 = CharDirectionality$Companion$directionalityMap$2.INSTANCE;
        $r22 = C13218k.m5625b($r3);
        this.f32672f = $r22;
        StringsKt__StringBuilderJVMKt$LINE_SEPARATOR$2 $r4 = StringsKt__StringBuilderJVMKt$LINE_SEPARATOR$2.INSTANCE;
        $r23 = C13218k.m5625b($r4);
        this.f32671b = $r23;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final Paint m808a() {
        InterfaceC11824h $r2 = this.f32670a;
        Object $r1 = $r2.getValue();
        Paint $r3 = (Paint) $r1;
        return $r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m806a(Canvas canvas, org.org.org.org.org.p602ui.asm.Label label) {
        View $r3 = label.getName();
        Drawable $r4 = $r3.getBackground();
        if ($r4 != null) {
            canvas.save();
            Rect $r5 = label.m522a();
            int $i0 = $r5.left;
            float $f0 = $i0;
            Rect $r52 = label.m522a();
            int $i02 = $r52.top;
            float $f1 = $i02;
            canvas.translate($f0, $f1);
            $r4.draw(canvas);
            canvas.restore();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m805a(Canvas canvas, C14720d c14720d, org.org.org.org.org.p602ui.asm.Label label) {
        C14592c $r4 = C14592c.f32345a;
        int $i0 = c14720d.m511d();
        View $r5 = label.getName();
        float $f0 = $r5.getAlpha();
        int $i02 = $r4.getColor($i0, $f0);
        boolean $z0 = c14720d.m513b();
        if (!$z0) {
            RectF $r6 = c14720d.m514a();
            Paint $r8 = m800b();
            $r8.setColor($i02);
            canvas.drawRect($r6, $r8);
            return;
        }
        RectF $r62 = c14720d.m514a();
        org.org.org.org.org.ClassWriter $r7 = org.org.org.org.org.ClassWriter.f32463b;
        float $f02 = $r7.put();
        float $f1 = $r7.put();
        Paint $r82 = m795f();
        $r82.setColor($i02);
        canvas.drawRoundRect($r62, $f02, $f1, $r82);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m802a(org.org.org.org.org.p602ui.asm.Label label, Bitmap bitmap, Canvas canvas) {
        Rect $r4 = label.m522a();
        Integer $r6 = C14620i.add(bitmap, label.m522a(), 3, 5, false, 8, null);
        int $i0 = $r6 != null ? $r6.intValue() : -1;
        C14592c $r7 = C14592c.f32345a;
        int $i02 = $r7.m1116a($i0);
        Paint $r8 = m808a();
        $r8.setColor($i02);
        canvas.drawRect($r4, $r8);
        int $i1 = $r4.width();
        float $f0 = $i1;
        org.org.org.org.org.ClassWriter $r9 = org.org.org.org.org.ClassWriter.f32463b;
        float $f1 = $r9.length();
        if ($f0 >= $f1) {
            int $i12 = $r4.height();
            float $f02 = $i12;
            float $f12 = $r9.length();
            if ($f02 < $f12) {
                return;
            }
            Rect $r5 = new Rect();
            float $f03 = $r9.length();
            int $i13 = (int) $f03;
            float $f04 = $r9.length();
            int $i3 = (int) $f04;
            Gravity.apply(17, $i13, $i3, $r4, $r5);
            m801a(label, $r5, $i02, canvas);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final void m801a(org.org.org.org.org.p602ui.asm.Label label, Rect rect, int i, Canvas canvas) {
        View $r4 = label.getName();
        Drawable $r5 = C14619f.m1031f($r4);
        if ($r5 != null) {
            $r5.setBounds(rect);
            org.org.org.org.asm.util.Type.m1045a($r5, i);
            $r5.draw(canvas);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final boolean m804a(View view) {
        boolean $z0;
        boolean $z02;
        try {
            boolean $z03 = view instanceof WebView;
            if ($z03) {
                return true;
            }
            boolean $z04 = view instanceof Switch;
            if ($z04) {
                return true;
            }
            boolean $z05 = view instanceof DatePicker;
            if ($z05) {
                return true;
            }
            boolean $z06 = view instanceof TimePicker;
            if ($z06) {
                return true;
            }
            boolean $z07 = view instanceof ProgressBar;
            if ($z07) {
                return true;
            }
            boolean $z08 = view instanceof VideoView;
            if ($z08) {
                return true;
            }
            boolean $z09 = view instanceof TextureView;
            if ($z09) {
                return true;
            }
            boolean $z010 = view instanceof SurfaceView;
            if ($z010) {
                return true;
            }
            boolean $z011 = view instanceof CalendarView;
            if ($z011) {
                return true;
            }
            boolean $z012 = view instanceof RatingBar;
            if ($z012) {
                return true;
            }
            Class $r5 = view.getClass();
            String $r6 = $r5.getSimpleName();
            Log_OC.loadImage($r6, "this.javaClass.simpleName");
            try {
                $z0 = C13277t.m5421J($r6, "AdView", false, 2, null);
                if ($z0) {
                    return true;
                }
                Class $r52 = view.getClass();
                String $r62 = $r52.getSimpleName();
                Log_OC.loadImage($r62, "this.javaClass.simpleName");
                try {
                    $z02 = C13277t.m5421J($r62, "MapView", false, 2, null);
                    if ($z02) {
                        return true;
                    }
                    boolean $z013 = view instanceof FloatingActionButton;
                    return $z013;
                } catch (Throwable th) {
                    return false;
                }
            } catch (Throwable th2) {
                return false;
            }
        } catch (Throwable th3) {
            return false;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    private final Paint m800b() {
        InterfaceC11824h $r2 = this.f32671b;
        Object $r1 = $r2.getValue();
        Paint $r3 = (Paint) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: f */
    private final Paint m795f() {
        InterfaceC11824h $r2 = this.f32672f;
        Object $r1 = $r2.getValue();
        Paint $r3 = (Paint) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.core.internal.asm.Label
    /* renamed from: a */
    public void mo807a(Bitmap bitmap, Canvas canvas, boolean z, List list) {
        Log_OC.getArray(bitmap, "bitmap");
        Log_OC.getArray(canvas, "canvas");
        Log_OC.getArray(list, "simplifiedRenderingItems");
        C14670e $r4 = new C14670e(this, canvas, bitmap);
        ClassReader.m527a(list, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.core.internal.asm.Label
    /* renamed from: c */
    public InterfaceC14676x mo796c() {
        C14675l $r1 = new C14675l(this);
        return $r1;
    }
}
