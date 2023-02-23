package org.org.org.org.org.core.base;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import com.smartlook.sdk.smartlook.C7206R;
import com.smartlook.sdk.smartlook.core.video.sensitivity.model.RecordingMask;
import com.smartlook.sdk.smartlook.core.video.sensitivity.model.SmartlookSensitivity;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13727r0;
import org.org.org.org.asm.asm.C14588f;
import org.org.org.org.asm.digests.C14596c;
/* renamed from: org.org.org.org.org.core.base.f */
/* loaded from: classes.dex */
public final class C14665f {

    /* renamed from: c */
    public Integer f32622c;

    /* renamed from: d */
    public C14596c f32623d;

    /* renamed from: i */
    public RecordingMask f32624i;

    /* renamed from: l */
    public final e.a.a.a.f.u.f<Boolean> f32625l;

    /* renamed from: m */
    public final WeakHashMap<View, Boolean> f32626m;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public C14665f() {
        WeakHashMap $r2 = new WeakHashMap();
        this.f32626m = $r2;
        C14588f $r1 = m849e();
        this.f32625l = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final Boolean m857a(View view) {
        WeakHashMap $r2 = this.f32626m;
        Object $r3 = $r2.get(view);
        Boolean $r4 = (Boolean) $r3;
        e.a.a.a.f.u.f<Boolean> fVar = this.f32625l;
        Class $r6 = view.getClass();
        Object $r32 = fVar.m1127a($r6);
        Boolean $r7 = (Boolean) $r32;
        Boolean $r8 = Boolean.FALSE;
        boolean $z0 = Log_OC.append($r4, $r8);
        if ($z0) {
            return $r8;
        }
        Boolean $r9 = Boolean.TRUE;
        boolean $z02 = Log_OC.append($r4, $r9);
        if ($z02) {
            return $r9;
        }
        boolean $z03 = m851c(view);
        if ($z03) {
            return $r8;
        }
        boolean $z04 = m848f(view);
        if ($z04) {
            return $r9;
        }
        boolean $z05 = Log_OC.append($r7, $r8);
        if ($z05) {
            return $r8;
        }
        boolean $z06 = Log_OC.append($r7, $r9);
        if ($z06) {
            return $r9;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:16:0x0051 */
    /* JADX WARN: Incorrect condition in loop: B:8:0x001a */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List m859a() {
        /*
            r27 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = r2
            r2.<init>()
            r0 = r27
            com.smartlook.sdk.smartlook.core.video.sensitivity.model.RecordingMask r4 = r0.f32624i
            if (r4 == 0) goto L8a
            java.util.List r5 = r4.getElements()
            if (r5 == 0) goto L91
            java.util.Iterator r6 = r5.iterator()
        L16:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L98
            java.lang.Object r8 = r6.next()
            r10 = r8
            com.smartlook.sdk.smartlook.core.video.sensitivity.model.RecordingMaskElement r10 = (com.smartlook.sdk.smartlook.core.video.sensitivity.model.RecordingMaskElement) r10
            r9 = r10
            com.smartlook.sdk.smartlook.core.video.sensitivity.model.RecordingMaskElementType r11 = r9.getType()
            r13 = r11
            java.lang.Enum r13 = (java.lang.Enum) r13
            r12 = r13
            int r14 = r12.ordinal()
            if (r14 == 0) goto L7a
            r15 = 1
            if (r14 == r15) goto L36
            goto L16
        L36:
            java.util.ArrayList r16 = new java.util.ArrayList
            r2 = r16
            r0 = r16
            r0.<init>()
            r18 = r3
            java.lang.Iterable r18 = (java.lang.Iterable) r18
            r17 = r18
            r0 = r17
            java.util.Iterator r19 = r0.iterator()
        L4b:
            r0 = r19
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L71
            r0 = r19
            java.lang.Object r3 = r0.next()
            r21 = r3
            android.graphics.Rect r21 = (android.graphics.Rect) r21
            r20 = r21
            android.graphics.Rect r22 = r9.getRect()
            r0 = r20
            r1 = r22
            java.util.List r5 = org.org.org.org.asm.util.C14621l.m1029a(r0, r1)
            if (r5 == 0) goto L4b
            r2.add(r5)
            goto L4b
        L71:
            java.util.List r5 = kotlin.p557z.C13722p.m3917r(r2)
            java.util.List r3 = kotlin.p557z.C13722p.m3970D0(r5)
            goto L16
        L7a:
            android.graphics.Rect r20 = r9.getRect()
            r23 = r3
            java.util.List r23 = (java.util.List) r23
            r5 = r23
            r0 = r20
            r5.add(r0)
            goto L16
        L8a:
            r24 = r3
            java.util.List r24 = (java.util.List) r24
            r5 = r24
            return r5
        L91:
            r25 = r3
            java.util.List r25 = (java.util.List) r25
            r5 = r25
            return r5
        L98:
            r26 = r3
            java.util.List r26 = (java.util.List) r26
            r5 = r26
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.core.base.C14665f.m859a():java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final void m858a(Canvas canvas, Rect rect) {
        if (this.f32623d == null) {
            Integer $r3 = this.f32622c;
            this.f32623d = new C14596c(28.0f, $r3);
        }
        C14596c $r4 = this.f32623d;
        if ($r4 != null) {
            this.f32623d = $r4;
            canvas.drawRect(rect, $r4);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:24:0x00c6 */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0027 */
    /* JADX WARN: Incorrect condition in loop: B:8:0x0043 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m856a(android.view.ViewGroup r37, java.util.Map r38) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.core.base.C14665f.m856a(android.view.ViewGroup, java.util.Map):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    private final boolean m851c(View view) {
        int $i0 = C7206R.C7208id.smartlook_whitelisted_view;
        Object $r2 = view.getTag($i0);
        if ($r2 == null) {
            int $i02 = C7206R.C7208id.smartlook_sensitive;
            Object $r22 = view.getTag($i02);
            Boolean $r3 = Boolean.FALSE;
            boolean $z0 = Log_OC.append($r22, $r3);
            return $z0;
        }
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    private final C14588f m849e() {
        C14588f $r1 = new C14588f();
        Boolean $r2 = Boolean.TRUE;
        $r1.m1126a(EditText.class, $r2);
        boolean $z0 = Log_OC.append("nativeapp", "cordova");
        if (!$z0) {
            $r1.m1126a(WebView.class, $r2);
        }
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:19:0x00ab */
    /* JADX WARN: Incorrect condition in loop: B:28:0x00e3 */
    /* JADX WARN: Incorrect condition in loop: B:34:0x00fe */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0018 */
    /* JADX WARN: Incorrect condition in loop: B:7:0x0030 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List execute(java.util.Map r31, java.util.Map r32) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.core.base.C14665f.execute(java.util.Map, java.util.Map):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: f */
    private final boolean m848f(View view) {
        int $i0 = C7206R.C7208id.smartlook_blacklisted_view;
        Object $r2 = view.getTag($i0);
        if ($r2 == null) {
            int $i02 = C7206R.C7208id.smartlook_sensitive;
            Object $r22 = view.getTag($i02);
            Boolean $r3 = Boolean.TRUE;
            boolean $z0 = Log_OC.append($r22, $r3);
            return $z0;
        }
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final SmartlookSensitivity m853a(Class cls) {
        Log_OC.getArray(cls, "clazz");
        Object $r1 = this.f32625l.m1127a(cls);
        Boolean $r4 = (Boolean) $r1;
        if ($r4 != null) {
            $r4.booleanValue();
            SmartlookSensitivity r5 = SmartlookSensitivity.DEFAULT;
            return r5;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m855a(SmartlookSensitivity smartlookSensitivity, View[] viewArr) {
        Log_OC.getArray(smartlookSensitivity, "sensitivity");
        Log_OC.getArray(viewArr, "views");
        for (View $r3 : viewArr) {
            SmartlookSensitivity r6 = smartlookSensitivity;
            int $i0 = r6.ordinal();
            if ($i0 == 0) {
                WeakHashMap $r4 = this.f32626m;
                Boolean $r5 = Boolean.TRUE;
                $r4.put($r3, $r5);
            } else if ($i0 == 1) {
                WeakHashMap $r42 = this.f32626m;
                Boolean $r52 = Boolean.FALSE;
                $r42.put($r3, $r52);
            } else if ($i0 == 2) {
                WeakHashMap $r43 = this.f32626m;
                $r43.remove($r3);
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m854a(SmartlookSensitivity smartlookSensitivity, Class[] clsArr) {
        Log_OC.getArray(smartlookSensitivity, "sensitivity");
        Log_OC.getArray(clsArr, "classes");
        for (Class $r3 : clsArr) {
            SmartlookSensitivity r6 = smartlookSensitivity;
            int $i0 = r6.ordinal();
            if ($i0 == 0) {
                e.a.a.a.f.u.f<Boolean> fVar = this.f32625l;
                Boolean $r5 = Boolean.TRUE;
                fVar.m1126a($r3, $r5);
            } else if ($i0 == 1) {
                e.a.a.a.f.u.f<Boolean> fVar2 = this.f32625l;
                Boolean $r52 = Boolean.FALSE;
                fVar2.m1126a($r3, $r52);
            } else if ($i0 == 2) {
                this.f32625l.add($r3);
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m852a(Integer num) {
        C14596c $r2 = new C14596c(28.0f, num);
        this.f32623d = $r2;
        this.f32622c = num;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final SmartlookSensitivity add(View view) {
        Log_OC.getArray(view, "view");
        WeakHashMap $r3 = this.f32626m;
        Object $r1 = $r3.get(view);
        Boolean $r4 = (Boolean) $r1;
        if ($r4 != null) {
            SmartlookSensitivity r5 = SmartlookSensitivity.DEFAULT;
            return r5;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Map add(ViewGroup viewGroup) {
        Map $r1;
        Log_OC.getArray(viewGroup, "rootView");
        LinkedHashMap $r3 = new LinkedHashMap();
        m856a(viewGroup, $r3);
        $r1 = C13727r0.m3870v($r3);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x002a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void add(android.graphics.Canvas r9, java.util.Map r10, java.util.Map r11) {
        /*
            r8 = this;
            java.lang.String r0 = "frame"
            kotlin.p483e0.p485d.Log_OC.getArray(r9, r0)
            java.lang.String r0 = "preDrawSensitiveViews"
            kotlin.p483e0.p485d.Log_OC.getArray(r10, r0)
            java.lang.String r0 = "afterDrawSensitiveViews"
            kotlin.p483e0.p485d.Log_OC.getArray(r11, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r2 = r8.execute(r10, r11)
            r1.addAll(r2)
            java.util.List r2 = r8.m859a()
            r1.addAll(r2)
            java.util.Iterator r3 = r1.iterator()
        L26:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L38
            java.lang.Object r5 = r3.next()
            r7 = r5
            android.graphics.Rect r7 = (android.graphics.Rect) r7
            r6 = r7
            r8.m858a(r9, r6)
            goto L26
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.core.base.C14665f.add(android.graphics.Canvas, java.util.Map, java.util.Map):void");
    }

    /* renamed from: c */
    public final void m850c(RecordingMask recordingMask) {
        this.f32624i = recordingMask;
    }
}
