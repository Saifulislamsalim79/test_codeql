package org.org.org.org.android.util;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.smartlook.sdk.smartlook.core.api.annotation.CrashTrackingMode;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.android.util.common.C14554f;
import org.org.org.org.android.util.common.C14555i;
import org.org.org.org.android.util.common.net.Attribute;
import org.org.org.org.android.util.common.net.C14557h;
import org.org.org.org.android.util.menu.EnumC14571f;
import org.org.org.org.asm.Activity.Settings;
import org.org.org.org.asm.Item;
import org.org.org.org.asm.Type;
import org.org.org.org.asm.asm.C14585b;
import org.org.org.org.asm.parser.Log;
import org.org.org.org.asm.parser.System;
import org.org.org.org.asm.parser.TopLevel$NativeErrors;
import org.org.org.org.org.asm.InterfaceC14636g;
import org.org.org.org.org.asm.commons.JSONObject;
import org.org.org.org.org.common.Logger;
/* renamed from: org.org.org.org.android.util.f */
/* loaded from: classes.dex */
public final class C14559f implements InterfaceC14636g {

    /* renamed from: B */
    public EnumC14571f f32190B;

    /* renamed from: a */
    public final AtomicBoolean f32191a;

    /* renamed from: b */
    public boolean f32192b;

    /* renamed from: c */
    public final C14555i f32193c;

    /* renamed from: d */
    public final C14554f f32194d;

    /* renamed from: e */
    public Long f32195e;

    /* renamed from: f */
    public ViewTreeObserver.OnGlobalFocusChangeListener f32196f;

    /* renamed from: g */
    public final C14557h f32197g;
    public ScheduledThreadPoolExecutor header;

    /* renamed from: l */
    public final AtomicBoolean f32198l;

    /* renamed from: m */
    public final HashMap<String, WeakReference<View>> f32199m;

    /* renamed from: n */
    public WeakReference<Activity> f32200n;

    /* renamed from: r */
    public final Attribute f32201r;
    public final Map<Integer, e.a.a.a.a.b.e.a> this$0;

    /* renamed from: v */
    public final Logger f32202v;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public C14559f(Logger logger, C14555i c14555i, Attribute attribute, C14557h c14557h, C14554f c14554f) {
        Log_OC.getArray(logger, "sessionEventHandler");
        Log_OC.getArray(c14555i, "keyboardVisibilityHandler");
        Log_OC.getArray(attribute, "crashTrackingHandler");
        Log_OC.getArray(c14557h, "anrTrackingHandler");
        Log_OC.getArray(c14554f, "connectionTrackingHandler");
        this.f32202v = logger;
        this.f32193c = c14555i;
        this.f32201r = attribute;
        this.f32197g = c14557h;
        this.f32194d = c14554f;
        Settings $r7 = Settings.this$0;
        ScheduledThreadPoolExecutor $r3 = $r7.get(2, "touch");
        this.header = $r3;
        HashMap $r8 = new HashMap();
        this.f32199m = $r8;
        LinkedHashMap $r9 = new LinkedHashMap();
        this.this$0 = $r9;
        AtomicBoolean $r10 = new AtomicBoolean(false);
        this.f32198l = $r10;
        AtomicBoolean $r102 = new AtomicBoolean(false);
        this.f32191a = $r102;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x000d */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List m1257a(java.util.List r15) {
        /*
            r14 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r15.iterator()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L52
            java.lang.Object r3 = r1.next()
            r5 = r3
            org.org.org.org.asm.asm.b r5 = (org.org.org.org.asm.asm.C14585b) r5
            r4 = r5
            java.lang.Object r3 = r4.m1132b()
            boolean r2 = r3 instanceof android.view.Window
            if (r2 == 0) goto L34
            org.org.org.org.android.util.lib.app.l r6 = new org.org.org.org.android.util.lib.app.l
            java.lang.Object r3 = r4.m1132b()
            r8 = r3
            android.view.Window r8 = (android.view.Window) r8
            r7 = r8
            android.view.View r9 = r4.m1133a()
            r6.<init>(r7, r9)
            r0.add(r6)
            goto L9
        L34:
            boolean r2 = r3 instanceof android.widget.PopupWindow
            if (r2 == 0) goto L4d
            org.org.org.org.android.util.lib.ui.f r10 = new org.org.org.org.android.util.lib.ui.f
            java.lang.Object r3 = r4.m1132b()
            r12 = r3
            android.widget.PopupWindow r12 = (android.widget.PopupWindow) r12
            r11 = r12
            android.view.View r9 = r4.m1133a()
            r10.<init>(r11, r9)
            r0.add(r10)
            goto L9
        L4d:
            r13 = 0
            r0.add(r13)
            goto L9
        L52:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.android.util.C14559f.m1257a(java.util.List):java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final C14558d m1261a() {
        C14558d $r1 = new C14558d(this);
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m1260a(Activity activity) {
        ViewTreeObserver.OnGlobalFocusChangeListener $r3 = this.f32196f;
        if ($r3 != null) {
            ViewTreeObserver $r1 = getView(activity);
            ViewTreeObserver.OnGlobalFocusChangeListener $r32 = this.f32196f;
            $r1.removeOnGlobalFocusChangeListener($r32);
            this.f32196f = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m1259a(final View view) {
        Type $r3 = Type.f32312c;
        WeakReference $r2 = this.f32200n;
        if ($r2 != null) {
            Object $r4 = $r2.get();
            Activity $r5 = (Activity) $r4;
            if ($r5 != null) {
                String $r6 = $r3.getType($r5);
                long $l0 = System.currentTimeMillis();
                Long $r7 = Long.valueOf($l0);
                this.f32195e = $r7;
                HashMap $r8 = this.f32199m;
                $r8.put($r6, new WeakReference(view));
                view.post(new Runnable() { // from class: org.org.org.org.android.util.Plot$a
                    /* JADX WARN: Can't parse signature for local variable: 
                    java.lang.NullPointerException
                     */
                    @Override // java.lang.Runnable
                    public final void run() {
                        Item $r1 = Item.f32307h;
                        View $r22 = view;
                        C14559f $r32 = C14559f.this;
                        WeakReference $r42 = $r32.f32200n;
                        org.org.org.org.android.util.asm.Item $r52 = $r1.m1158a($r22, $r42);
                        if ($r52 != null) {
                            C14559f $r33 = C14559f.this;
                            Logger $r62 = $r33.f32202v;
                            $r62.get($r52);
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m1258a(View view, List list) {
        View $r5;
        Iterator $r3 = list.iterator();
        while (true) {
            boolean $z0 = $r3.hasNext();
            if (!$z0) {
                $r5 = null;
                break;
            }
            Object $r4 = $r3.next();
            $r5 = (View) $r4;
            boolean $z02 = Log_OC.append(view, $r5);
            if ($z02) {
                break;
            }
        }
        if ($r5 != null) {
            list.remove($r5);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static /* synthetic */ void m1254a(C14559f c14559f, Activity $r2, int i, Object obj) {
        int $i0 = i & 1;
        if ($i0 != 0) {
            $r2 = null;
        }
        c14559f.clear($r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean add() {
        AtomicBoolean $r1 = this.f32198l;
        boolean $z0 = $r1.get();
        if ($z0) {
            AtomicBoolean $r12 = this.f32191a;
            boolean $z02 = $r12.get();
            return !$z02;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public final void m1249b(View view) {
        Type $r3 = Type.f32312c;
        WeakReference $r4 = this.f32200n;
        if ($r4 != null) {
            Object $r5 = $r4.get();
            Activity $r6 = (Activity) $r5;
            if ($r6 != null) {
                Object $r7 = $r3.getType($r6);
                boolean $z0 = this.f32192b;
                if (!$z0) {
                    HashMap $r8 = this.f32199m;
                    $r8.remove($r7);
                }
                Item $r9 = Item.f32307h;
                WeakReference $r42 = this.f32200n;
                Long $r1 = this.f32195e;
                org.org.org.org.android.util.asm.Item $r10 = $r9.m1157a(view, $r42, $r1);
                if ($r10 != null) {
                    Logger $r11 = this.f32202v;
                    $r11.get($r10);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public final void m1248c(Activity activity) {
        ViewTreeObserver.OnGlobalFocusChangeListener $r2 = getString();
        this.f32196f = $r2;
        ViewTreeObserver $r3 = getView(activity);
        ViewTreeObserver.OnGlobalFocusChangeListener $r22 = this.f32196f;
        $r3.addOnGlobalFocusChangeListener($r22);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void clear(Activity activity) {
        close();
        Attribute $r2 = this.f32201r;
        $r2.read();
        C14554f $r3 = this.f32194d;
        $r3.m1280c();
        if (activity != null) {
            C14555i $r4 = this.f32193c;
            $r4.m1278a(activity);
            close(activity);
        }
        AtomicBoolean $r5 = this.f32191a;
        $r5.set(false);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void close() {
        ScheduledThreadPoolExecutor $r1 = this.header;
        boolean $z0 = $r1.isShutdown();
        if ($z0) {
            return;
        }
        ScheduledThreadPoolExecutor $r12 = this.header;
        $r12.shutdown();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void close(Activity activity) {
        System $r2 = System.f32375c;
        LogAspect $r3 = LogAspect.ORIENTATION_CHANGES;
        LogSeverity $r4 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r2.get($r3, false, $r4);
        if ($r5.ordinal() == 0) {
            StringBuilder $r6 = new StringBuilder();
            StringBuilder $r7 = new StringBuilder();
            $r7.append("unregisterOrientationChangeListener() called with: activity = ");
            String $r8 = Log.get(activity, false, 2, null);
            $r7.append($r8);
            String $r82 = $r7.toString();
            $r6.append($r82);
            $r6.append(", [logAspect: ");
            $r6.append($r3);
            $r6.append(']');
            String $r83 = $r6.toString();
            $r2.size($r3, $r4, "AutomaticEventDetectionHandler", $r83);
        }
        int $i0 = activity.hashCode();
        Map $r9 = this.this$0;
        try {
            Integer $r10 = Integer.valueOf($i0);
            boolean $z0 = $r9.containsKey($r10);
            if (!$z0) {
                TopLevel$NativeErrors $r52 = $r2.get($r3, false, $r4);
                int $i1 = $r52.ordinal();
                if ($i1 != 0) {
                    return;
                }
                StringBuilder $r62 = new StringBuilder();
                String $r84 = "unregisterOrientationChangeListener() unregistering failed: key = " + $i0;
                $r62.append($r84);
                $r62.append(", [logAspect: ");
                $r62.append($r3);
                $r62.append(']');
                String $r85 = $r62.toString();
                $r2.size($r3, $r4, "AutomaticEventDetectionHandler", $r85);
                return;
            }
            Map $r92 = this.this$0;
            Integer $r102 = Integer.valueOf($i0);
            Object $r11 = $r92.get($r102);
            org.org.org.org.android.util.function.Log $r12 = (org.org.org.org.android.util.function.Log) $r11;
            if ($r12 != null) {
                $r12.disable();
            }
            Map $r93 = this.this$0;
            Integer $r103 = Integer.valueOf($i0);
            $r93.remove($r103);
            TopLevel$NativeErrors $r53 = $r2.get($r3, false, $r4);
            int $i12 = $r53.ordinal();
            if ($i12 != 0) {
                return;
            }
            StringBuilder $r63 = new StringBuilder();
            String $r86 = "unregisterOrientationChangeListener() unregistered successfully: key = " + $i0;
            $r63.append($r86);
            $r63.append(", [logAspect: ");
            $r63.append($r3);
            $r63.append(']');
            String $r87 = $r63.toString();
            $r2.size($r3, $r4, "AutomaticEventDetectionHandler", $r87);
        } catch (Exception $r13) {
            System $r22 = System.f32375c;
            LogAspect $r32 = LogAspect.ORIENTATION_CHANGES;
            LogSeverity $r42 = LogSeverity.DEBUG;
            TopLevel$NativeErrors $r54 = $r22.get($r32, false, $r42);
            if ($r54.ordinal() != 0) {
                return;
            }
            StringBuilder $r64 = new StringBuilder();
            StringBuilder $r72 = new StringBuilder();
            $r72.append("unregisterOrientationChangeListener() exception = ");
            String $r88 = Log.get($r13, false, 2, null);
            $r72.append($r88);
            String $r89 = $r72.toString();
            $r64.append($r89);
            $r64.append(", [logAspect: ");
            $r64.append($r32);
            $r64.append(']');
            String $r810 = $r64.toString();
            $r22.size($r32, $r42, "AutomaticEventDetectionHandler", $r810);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    private final void m1244d(Activity activity) {
        C14555i $r3 = this.f32193c;
        C14563i $r4 = m1237p();
        int $i0 = $r3.m1277a(activity, $r4);
        System $r5 = System.f32375c;
        LogAspect $r6 = LogAspect.AUTOMATIC_EVENT_DETECTION;
        LogSeverity $r7 = $i0 == 0 ? LogSeverity.VERBOSE : LogSeverity.DEBUG;
        TopLevel$NativeErrors $r8 = $r5.get($r6, true, $r7);
        int $i1 = $r8.ordinal();
        if ($i1 != 0) {
            return;
        }
        StringBuilder $r9 = new StringBuilder();
        StringBuilder $r1 = new StringBuilder();
        $r1.append("registerKeyboardCallback() called with: ");
        $r1.append("registerResult = ");
        org.org.org.org.asm.parser.Attribute $r10 = org.org.org.org.asm.parser.Attribute.f32368a;
        String $r11 = $r10.m1079a($i0);
        $r1.append($r11);
        String $r112 = $r1.toString();
        $r9.append($r112);
        $r9.append(", [logAspect: ");
        $r9.append($r6);
        $r9.append(']');
        String $r113 = $r9.toString();
        $r5.size($r6, $r7, "AutomaticEventDetectionHandler", $r113);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void execute(Activity activity) {
        System $r3 = System.f32375c;
        LogAspect $r4 = LogAspect.ORIENTATION_CHANGES;
        LogSeverity $r5 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r6 = $r3.get($r4, false, $r5);
        int $i0 = $r6.ordinal();
        if ($i0 == 0) {
            StringBuilder $r2 = new StringBuilder();
            StringBuilder $r7 = new StringBuilder();
            $r7.append("registerOrientationChangeListener() called with: activity = ");
            String $r8 = Log.get(activity, false, 2, null);
            $r7.append($r8);
            String $r82 = $r7.toString();
            $r2.append($r82);
            $r2.append(", [logAspect: ");
            $r2.append($r4);
            $r2.append(']');
            String $r83 = $r2.toString();
            $r3.size($r4, $r5, "AutomaticEventDetectionHandler", $r83);
        }
        Map $r9 = this.this$0;
        int $i02 = activity.hashCode();
        Integer $r10 = Integer.valueOf($i02);
        Frame $r11 = new Frame(this, activity, activity);
        try {
            $r11.enable();
        } catch (Exception $r12) {
            System $r32 = System.f32375c;
            LogAspect $r42 = LogAspect.ORIENTATION_CHANGES;
            LogSeverity $r52 = LogSeverity.DEBUG;
            TopLevel$NativeErrors $r62 = $r32.get($r42, false, $r52);
            int $i03 = $r62.ordinal();
            if ($i03 == 0) {
                StringBuilder $r72 = new StringBuilder();
                StringBuilder $r22 = new StringBuilder();
                $r22.append("registerOrientationChangeListener() exception = ");
                String $r84 = Log.get($r12, false, 2, null);
                $r22.append($r84);
                String $r85 = $r22.toString();
                $r72.append($r85);
                $r72.append(", [logAspect: ");
                $r72.append($r42);
                $r72.append(']');
                String $r86 = $r72.toString();
                $r32.size($r42, $r52, "AutomaticEventDetectionHandler", $r86);
            }
        }
        $r9.put($r10, $r11);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean get() {
        Attribute $r1 = this.f32201r;
        CrashTrackingMode $r2 = $r1.add();
        CrashTrackingMode $r3 = CrashTrackingMode.DISABLE;
        if ($r2 != $r3) {
            CrashTrackingMode $r32 = CrashTrackingMode.FORCE;
            if ($r2 != $r32) {
                org.org.org.org.android.util.common.net.Logger $r4 = Attribute.logger;
                boolean $z0 = $r4.isWarnEnabled();
                return !$z0;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final ViewTreeObserver.OnGlobalFocusChangeListener getString() {
        MimeType $r1 = new MimeType(this);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final ViewTreeObserver getView(Activity activity) {
        Window $r2 = activity.getWindow();
        Log_OC.loadImage($r2, "activity.window");
        View $r3 = $r2.getDecorView();
        Log_OC.loadImage($r3, "activity.window.decorView");
        ViewTreeObserver $r4 = $r3.getViewTreeObserver();
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final Runnable init(final Activity activity) {
        return new Runnable() { // from class: org.org.org.org.android.util.NumberPicker$PressedStateHelper
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Incorrect condition in loop: B:12:0x0073 */
            /* JADX WARN: Incorrect condition in loop: B:4:0x0035 */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r19 = this;
                    org.org.org.org.asm.Type r1 = org.org.org.org.asm.Type.f32312c
                    r0 = r19
                    android.app.Activity r2 = r2
                    java.util.List r3 = r1.add(r2)
                    r0 = r19
                    org.org.org.org.android.util.f r4 = org.org.org.org.android.util.C14559f.this
                    r0 = r19
                    android.app.Activity r2 = r2
                    android.view.Window r5 = r2.getWindow()
                    android.view.View r6 = r5.peekDecorView()
                    java.lang.String r7 = "activity.window.peekDecorView()"
                    kotlin.p483e0.p485d.Log_OC.loadImage(r6, r7)
                    org.org.org.org.android.util.C14559f.m1252a(r4, r6, r3)
                    java.util.ArrayList r8 = new java.util.ArrayList
                    r10 = 10
                    int r9 = kotlin.p557z.C13722p.m3921o(r3, r10)
                    r8.<init>(r9)
                    java.util.Iterator r11 = r3.iterator()
                L31:
                    boolean r12 = r11.hasNext()
                    if (r12 == 0) goto L5a
                    java.lang.Object r13 = r11.next()
                    r14 = r13
                    android.view.View r14 = (android.view.View) r14
                    r6 = r14
                    org.org.org.org.asm.Attribute r15 = org.org.org.org.asm.Attribute.f32301a
                    android.view.Window r5 = r15.m1168a(r6)
                    r13 = r5
                    if (r5 == 0) goto L49
                    goto L4d
                L49:
                    android.widget.PopupWindow r13 = r15.get(r6)
                L4d:
                    org.org.org.org.asm.asm.b r16 = new org.org.org.org.asm.asm.b
                    r0 = r16
                    r0.<init>(r6, r13)
                    r0 = r16
                    r8.add(r0)
                    goto L31
                L5a:
                    java.util.List r3 = kotlin.p557z.C13722p.m3970D0(r8)
                    org.org.org.org.org.core.internal.f r17 = org.org.org.org.org.core.internal.C14679f.f32684b
                    java.util.ArrayList r8 = new java.util.ArrayList
                    r10 = 10
                    int r9 = kotlin.p557z.C13722p.m3921o(r3, r10)
                    r8.<init>(r9)
                    java.util.Iterator r11 = r3.iterator()
                L6f:
                    boolean r12 = r11.hasNext()
                    if (r12 == 0) goto L89
                    java.lang.Object r13 = r11.next()
                    r18 = r13
                    org.org.org.org.asm.asm.b r18 = (org.org.org.org.asm.asm.C14585b) r18
                    r16 = r18
                    r0 = r16
                    java.lang.Object r13 = r0.m1132b()
                    r8.add(r13)
                    goto L6f
                L89:
                    r0 = r17
                    r0.m785a(r8)
                    org.org.org.org.asm.asm.b r16 = new org.org.org.org.asm.asm.b
                    org.org.org.org.asm.Type r1 = org.org.org.org.asm.Type.f32312c
                    r0 = r19
                    android.app.Activity r2 = r2
                    android.view.View r6 = r1.get(r2)
                    r0 = r19
                    android.app.Activity r2 = r2
                    android.view.Window r5 = r2.getWindow()
                    r0 = r16
                    r0.<init>(r6, r5)
                    r10 = 0
                    r0 = r16
                    r3.add(r10, r0)
                    r0 = r19
                    org.org.org.org.android.util.f r4 = org.org.org.org.android.util.C14559f.this
                    org.org.org.org.android.util.C14559f.m1251a(r4, r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.android.util.NumberPicker$PressedStateHelper.run():void");
            }
        };
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final Shell isConnected() {
        Shell $r1 = new Shell(this);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final PriorityQueue length() {
        PriorityQueue $r1 = new PriorityQueue();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void onCreate(Activity activity) {
        boolean $z0 = get();
        if ($z0) {
            Attribute $r2 = this.f32201r;
            $r2.close();
            C14557h $r3 = this.f32197g;
            $r3.m1266a();
        }
        C14554f $r4 = this.f32194d;
        $r4.m1283a();
        Runnable $r5 = init(activity);
        reset($r5);
        m1244d(activity);
        execute(activity);
        AtomicBoolean $r6 = this.f32191a;
        $r6.set(true);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: p */
    private final C14563i m1237p() {
        C14563i $r1 = new C14563i(this);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void reset(Runnable runnable) {
        close();
        Settings $r4 = Settings.this$0;
        ScheduledThreadPoolExecutor $r3 = $r4.get(2, "touch");
        TimeUnit $r2 = TimeUnit.MILLISECONDS;
        $r3.scheduleAtFixedRate(runnable, 0L, 100L, $r2);
        this.header = $r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void write(List list) {
        List $r3 = m1257a(list);
        int $i0 = $r3.size();
        for (int $i1 = 0; $i1 < $i0; $i1++) {
            int $i2 = 3;
            Object $r4 = $r3.get($i1);
            org.org.org.org.android.util.lib.Type $r5 = (org.org.org.org.android.util.lib.Type) $r4;
            if ($r5 != null) {
                Shell $r6 = isConnected();
                C14558d $r7 = m1261a();
                PriorityQueue $r8 = length();
                $i2 = $r5.mo1202a($r6, $r7, $r8);
            }
            System $r9 = System.f32375c;
            LogAspect $r10 = LogAspect.AUTOMATIC_EVENT_DETECTION;
            LogSeverity $r11 = $i2 == 1 ? LogSeverity.VERBOSE : LogSeverity.DEBUG;
            TopLevel$NativeErrors $r12 = $r9.get($r10, true, $r11);
            int $i3 = $r12.ordinal();
            if ($i3 == 0) {
                StringBuilder $r13 = new StringBuilder();
                StringBuilder $r2 = new StringBuilder();
                $r2.append("registerEventCallbacks() registering window event callbacks ");
                $r2.append("rootView = ");
                Object $r42 = list.get($i1);
                C14585b $r14 = (C14585b) $r42;
                View $r15 = $r14.m1133a();
                String $r16 = Log.get($r15, false, 2, null);
                $r2.append($r16);
                $r2.append(", ");
                $r2.append("state = ");
                org.org.org.org.asm.parser.Attribute $r17 = org.org.org.org.asm.parser.Attribute.f32368a;
                String $r162 = $r17.getString($i2);
                $r2.append($r162);
                String $r163 = $r2.toString();
                $r13.append($r163);
                $r13.append(", [logAspect: ");
                $r13.append($r10);
                $r13.append(']');
                String $r164 = $r13.toString();
                $r9.size($r10, $r11, "AutomaticEventDetectionHandler", $r164);
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m1250a(EnumC14571f enumC14571f) {
        Log_OC.getArray(enumC14571f, "orientation");
        Logger $r2 = this.f32202v;
        $r2.m938d(enumC14571f);
        this.f32190B = enumC14571f;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.asm.InterfaceC14636g
    /* renamed from: c */
    public JSONObject mo814c() {
        C14536a $r1 = new C14536a(this);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1245d() {
        /*
            r17 = this;
            r0 = r17
            java.lang.ref.WeakReference<android.app.Activity> r1 = r0.f32200n
            r17 = r0
            if (r1 == 0) goto L17
            java.lang.Object r2 = r1.get()
            r4 = r2
            android.app.Activity r4 = (android.app.Activity) r4
            r3 = r4
            if (r3 == 0) goto L17
            org.org.org.org.android.util.menu.f r5 = org.org.org.org.asm.util.Iterator.m1050a(r3)
            goto L18
        L17:
            r5 = 0
        L18:
            r0 = r17
            org.org.org.org.android.util.menu.f r6 = r0.f32190B
            if (r6 != 0) goto L22
            r0 = r17
            r0.f32190B = r5
        L22:
            r0 = r17
            org.org.org.org.android.util.menu.f r6 = r0.f32190B
            if (r6 == 0) goto L8c
            if (r5 == 0) goto L8c
            if (r5 == r6) goto L8c
            org.org.org.org.asm.parser.System r7 = org.org.org.org.asm.parser.System.f32375c
            com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect r8 = com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect.ORIENTATION_CHANGES
            com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity r9 = com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity.DEBUG
            r11 = 0
            org.org.org.org.asm.parser.TopLevel$NativeErrors r10 = r7.get(r8, r11, r9)
            int r12 = r10.ordinal()
            if (r12 == 0) goto L3e
            goto L87
        L3e:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "checkOrientationChange() tracking manually detected orientation change: "
            r14.append(r15)
            java.lang.String r15 = "activityOrientation = "
            r14.append(r15)
            r14.append(r5)
            java.lang.String r15 = ", "
            r14.append(r15)
            java.lang.String r15 = "lastTrackedOrientation = "
            r14.append(r15)
            r0 = r17
            org.org.org.org.android.util.menu.f r6 = r0.f32190B
            r14.append(r6)
            java.lang.String r16 = r14.toString()
            r0 = r16
            r13.append(r0)
            java.lang.String r15 = ", [logAspect: "
            r13.append(r15)
            r13.append(r8)
            r11 = 93
            r13.append(r11)
            java.lang.String r16 = r13.toString()
            java.lang.String r15 = "AutomaticEventDetectionHandler"
            r0 = r16
            r7.size(r8, r9, r15, r0)
        L87:
            r0 = r17
            r0.m1250a(r5)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.android.util.C14559f.m1245d():void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.org.asm.InterfaceC14636g
    /* renamed from: e */
    public String mo812e() {
        String $r1 = e.a.a.a.a.b.a.class.getCanonicalName();
        return $r1 != null ? $r1 : "";
    }
}
