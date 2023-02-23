package org.org.org.org.org.core.internal.asm;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.VideoView;
import java.util.List;
import kotlin.C13218k;
import kotlin.InterfaceC11824h;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13722p;
import org.org.org.org.asm.util.C14619f;
import org.org.org.org.org.p602ui.asm.ClassReader;
import org.org.org.org.org.p602ui.asm.Handle;
/* loaded from: classes.dex */
public final class Plot extends Label {

    /* renamed from: a */
    public final InterfaceC11824h f32643a;

    /* renamed from: b */
    public final InterfaceC11824h f32644b;

    /* renamed from: e */
    public final boolean f32645e;

    /* renamed from: f */
    public final InterfaceC11824h f32646f;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Plot(boolean z) {
        InterfaceC11824h $r2;
        InterfaceC11824h $r22;
        InterfaceC11824h $r23;
        this.f32645e = z;
        C14668c $r1 = C14668c.f32651a;
        $r2 = C13218k.m5625b($r1);
        this.f32646f = $r2;
        Vector3D $r3 = Vector3D.f32648x;
        $r22 = C13218k.m5625b($r3);
        this.f32643a = $r22;
        C14667b $r4 = C14667b.f32650a;
        $r23 = C13218k.m5625b($r4);
        this.f32644b = $r23;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final Paint m830a() {
        InterfaceC11824h $r2 = this.f32643a;
        Object $r1 = $r2.getValue();
        Paint $r3 = (Paint) $r1;
        return $r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final boolean m829a(View view) {
        try {
            boolean $z0 = view instanceof WebView;
            if ($z0) {
                return true;
            }
            boolean $z02 = view instanceof Button;
            if ($z02) {
                return true;
            }
            boolean $z03 = view instanceof TextView;
            if ($z03) {
                return true;
            }
            boolean $z04 = view instanceof ImageView;
            if ($z04) {
                return true;
            }
            boolean $z05 = view instanceof EditText;
            if ($z05) {
                return true;
            }
            boolean $z06 = view instanceof Switch;
            if ($z06) {
                return true;
            }
            boolean $z07 = view instanceof DatePicker;
            if ($z07) {
                return true;
            }
            boolean $z08 = view instanceof TimePicker;
            if ($z08) {
                return true;
            }
            boolean $z09 = view instanceof ProgressBar;
            if ($z09) {
                return true;
            }
            boolean $z010 = view instanceof VideoView;
            if ($z010) {
                return true;
            }
            boolean $z011 = view instanceof TextureView;
            if ($z011) {
                return true;
            }
            boolean $z012 = view instanceof SurfaceView;
            if ($z012) {
                return true;
            }
            boolean $z013 = view instanceof CalendarView;
            if ($z013) {
                return true;
            }
            boolean $z014 = view instanceof RatingBar;
            if ($z014) {
                return true;
            }
            boolean $z015 = view instanceof ImageButton;
            if ($z015) {
                return true;
            }
            boolean $z016 = view instanceof Spinner;
            if ($z016) {
                return true;
            }
            boolean $z017 = view instanceof WebView;
            if ($z017) {
                return true;
            }
            boolean $z018 = C14619f.m1033d(view);
            if ($z018) {
                return true;
            }
            boolean $z019 = C14619f.remove(view);
            if ($z019) {
                return true;
            }
            boolean $z020 = C14619f.m1032e(view);
            if ($z020) {
                return true;
            }
            boolean $z021 = C14619f.add(view);
            if ($z021) {
                return true;
            }
            boolean $z022 = C14619f.m1030i(view);
            return $z022;
        } catch (Throwable th) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public final Paint m826b() {
        InterfaceC11824h $r2 = this.f32646f;
        Object $r1 = $r2.getValue();
        Paint $r3 = (Paint) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final Paint getBorderPaint() {
        InterfaceC11824h $r2 = this.f32644b;
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
        Object $r4 = C13722p.m3954R(list);
        Handle $r5 = (Handle) $r4;
        org.org.org.org.org.p602ui.asm.Label $r6 = $r5.m523a();
        Rect $r7 = $r6.m522a();
        Paint $r8 = z ? m830a() : getBorderPaint();
        canvas.drawRect($r7, $r8);
        AnnotationWriter $r9 = new AnnotationWriter(this, canvas);
        ClassReader.m527a(list, $r9);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.core.internal.asm.Label
    /* renamed from: c */
    public InterfaceC14676x mo796c() {
        C14672g $r1 = new C14672g(this);
        return $r1;
    }
}
