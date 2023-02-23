package org.org.org.org.org.core.internal.asm;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.C13218k;
import kotlin.InterfaceC11824h;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13262h;
import kotlin.p549l0.C13276s;
import kotlin.p549l0.C13277t;
import org.org.org.org.asm.asm.C14590m;
import org.org.org.org.asm.parser.System;
/* loaded from: classes.dex */
public final class ClassWriter {

    /* renamed from: h */
    public static final WeakHashMap<View, Bitmap> f32631h;

    /* renamed from: B */
    public final org.org.org.org.org.data.Label f32632B;

    /* renamed from: a */
    public TextureView f32633a;

    /* renamed from: b */
    public final InterfaceC11824h f32634b;

    /* renamed from: c */
    public List<Rect> f32635c;

    /* renamed from: e */
    public C14590m f32636e;

    /* renamed from: f */
    public int f32637f;

    /* renamed from: g */
    public boolean f32638g;

    /* renamed from: i */
    public SurfaceView f32639i;

    /* renamed from: p */
    public Bitmap f32640p;

    /* renamed from: r */
    public View f32641r;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        WeakHashMap $r0 = new WeakHashMap();
        f32631h = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ClassWriter(org.org.org.org.org.data.Label label) {
        InterfaceC11824h $r1;
        Log_OC.getArray(label, "configurationHandler");
        this.f32632B = label;
        Buffer $r3 = Buffer.EVENTS;
        $r1 = C13218k.m5625b($r3);
        this.f32634b = $r1;
        ArrayList $r4 = new ArrayList();
        this.f32635c = $r4;
        this.f32637f = -1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final Paint m843a() {
        InterfaceC11824h $r2 = this.f32634b;
        Object $r1 = $r2.getValue();
        Paint $r3 = (Paint) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final Rect m841a(View view) throws Exception {
        ViewGroup.LayoutParams $r2 = view.getLayoutParams();
        if ($r2 == null) {
            NullPointerException $r13 = new NullPointerException("null cannot be cast to non-null type android.view.WindowManager.LayoutParams");
            throw $r13;
        }
        WindowManager.LayoutParams $r3 = (WindowManager.LayoutParams) $r2;
        Class[] $r4 = new Class[0];
        Method $r6 = WindowManager.LayoutParams.class.getMethod("toString", $r4);
        Object[] $r7 = new Object[0];
        Object $r8 = $r6.invoke($r3, $r7);
        if ($r8 == null) {
            NullPointerException $r132 = new NullPointerException("null cannot be cast to non-null type kotlin.String");
            throw $r132;
        }
        String[] $r10 = m837a((String) $r8);
        if ($r10 == null) {
            Rect $r11 = new Rect();
            return $r11;
        }
        String $r9 = $r10[0];
        Integer $r12 = Integer.valueOf($r9);
        Log_OC.loadImage($r12, "Integer.valueOf(surfaceInsets[LEFT])");
        int $i0 = $r12.intValue();
        String $r92 = $r10[1];
        Integer $r122 = Integer.valueOf($r92);
        Log_OC.loadImage($r122, "Integer.valueOf(surfaceInsets[TOP])");
        int $i1 = $r122.intValue();
        String $r93 = $r10[2];
        Integer $r123 = Integer.valueOf($r93);
        Log_OC.loadImage($r123, "Integer.valueOf(surfaceInsets[RIGHT])");
        int $i2 = $r123.intValue();
        String $r94 = $r10[3];
        Integer $r124 = Integer.valueOf($r94);
        Log_OC.loadImage($r124, "Integer.valueOf(surfaceInsets[BOTTOM])");
        int $i3 = $r124.intValue();
        Rect $r112 = new Rect($i0, $i1, $i2, $i3);
        return $r112;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final View m839a(View $r1, String str, boolean z, boolean z2) {
        ViewParent $r3 = $r1.getParent();
        if ($r3 != null) {
            ViewParent $r32 = $r1.getParent();
            boolean $z2 = $r32 instanceof ViewGroup;
            if ($z2) {
                ViewParent $r33 = $r1.getParent();
                if ($r33 != null) {
                    return m839a((View) $r33, str, z, z2);
                }
                NullPointerException $r4 = new NullPointerException("null cannot be cast to non-null type android.view.View");
                throw $r4;
            }
        }
        m840a($r1, str, 0, z, z2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final void m842a(SurfaceView surfaceView) {
        if (surfaceView != null) {
            int $i0 = Build.VERSION.SDK_INT;
            if ($i0 >= 24) {
                int $i02 = surfaceView.getVisibility();
                if ($i02 == 0) {
                    int $i03 = surfaceView.getWidth();
                    if ($i03 > 0) {
                        int $i04 = surfaceView.getHeight();
                        if ($i04 <= 0) {
                            return;
                        }
                        int $i05 = surfaceView.getWidth();
                        int $i1 = surfaceView.getHeight();
                        Bitmap.Config $r3 = Bitmap.Config.ARGB_8888;
                        Bitmap $r4 = Bitmap.createBitmap($i05, $i1, $r3);
                        HandlerThread $r5 = new HandlerThread("PixelCopier");
                        PixelCopy$OnPixelCopyFinishedListenerC14669d $r6 = new PixelCopy$OnPixelCopyFinishedListenerC14669d(this, $r4, $r5);
                        $r5.start();
                        Looper $r7 = $r5.getLooper();
                        Handler $r2 = new Handler($r7);
                        PixelCopy.request(surfaceView, $r4, $r6, $r2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final void m840a(View view, String str, int i, boolean z, boolean z2) {
        View $r11;
        View $r112;
        boolean $z2 = view instanceof ViewGroup;
        if ($z2) {
            ViewGroup $r3 = (ViewGroup) view;
            int $i1 = $r3.getChildCount();
            for (int $i2 = 0; $i2 < $i1; $i2++) {
                View $r1 = $r3.getChildAt($i2);
                if (z) {
                    if (z2) {
                        Class $r4 = $r1.getClass();
                        boolean $z22 = TextureView.class.isAssignableFrom($r4);
                        if (!$z22) {
                            Rect $r8 = new Rect();
                            Rect $r9 = new Rect();
                            TextureView $r6 = this.f32633a;
                            if ($r6 != null) {
                                $r6.getGlobalVisibleRect($r8);
                            }
                            $r1.getGlobalVisibleRect($r9);
                            boolean $z23 = $r8.intersect($r9);
                            if ($z23) {
                                Log_OC.loadImage($r1, "child");
                                boolean $z24 = $r1.isShown();
                                if ($z24) {
                                    C14590m $r10 = this.f32636e;
                                    if ($r10 != null && ($r112 = $r10.getName()) != null) {
                                        ViewGroup $r12 = (ViewGroup) $r112;
                                        int $i3 = $r8.left;
                                        int $i4 = $r8.right;
                                        int $i32 = ($i3 + $i4) / 2;
                                        int $i42 = $r8.top;
                                        int $i5 = $r8.bottom;
                                        m838a($r12, $i32, ($i42 + $i5) / 2, -1, false);
                                    }
                                    View $r113 = this.f32641r;
                                    Class $r42 = $r113 != null ? $r113.getClass() : null;
                                    TextureView $r62 = this.f32633a;
                                    Class $r5 = $r62 != null ? $r62.getClass() : null;
                                    boolean $z25 = Log_OC.append($r42, $r5);
                                    if (!$z25) {
                                        View $r114 = this.f32641r;
                                        Class $r43 = $r114 != null ? $r114.getClass() : null;
                                        Class $r52 = $r1.getClass();
                                        boolean $z26 = Log_OC.append($r43, $r52);
                                        if ($z26) {
                                            List $r13 = this.f32635c;
                                            $r13.add($r8);
                                        }
                                    }
                                    this.f32633a = null;
                                    this.f32641r = null;
                                    this.f32638g = false;
                                    this.f32637f = -1;
                                }
                            }
                        }
                    } else {
                        Class $r44 = $r1.getClass();
                        boolean $z27 = SurfaceView.class.isAssignableFrom($r44);
                        if (!$z27) {
                            Rect $r82 = new Rect();
                            Rect $r92 = new Rect();
                            SurfaceView $r7 = this.f32639i;
                            if ($r7 != null) {
                                $r7.getGlobalVisibleRect($r82);
                            }
                            $r1.getGlobalVisibleRect($r92);
                            boolean $z28 = $r82.intersect($r92);
                            if ($z28) {
                                Log_OC.loadImage($r1, "child");
                                boolean $z29 = $r1.isShown();
                                if ($z29) {
                                    C14590m $r102 = this.f32636e;
                                    if ($r102 != null && ($r11 = $r102.getName()) != null) {
                                        ViewGroup $r122 = (ViewGroup) $r11;
                                        int $i33 = $r82.left;
                                        int $i43 = $r82.right;
                                        int $i34 = ($i33 + $i43) / 2;
                                        int $i44 = $r82.top;
                                        int $i52 = $r82.bottom;
                                        m838a($r122, $i34, ($i44 + $i52) / 2, -1, false);
                                    }
                                    View $r115 = this.f32641r;
                                    Class $r45 = $r115 != null ? $r115.getClass() : null;
                                    SurfaceView $r72 = this.f32639i;
                                    Class $r53 = $r72 != null ? $r72.getClass() : null;
                                    boolean $z210 = Log_OC.append($r45, $r53);
                                    if (!$z210) {
                                        View $r116 = this.f32641r;
                                        Class $r46 = $r116 != null ? $r116.getClass() : null;
                                        Class $r54 = $r1.getClass();
                                        boolean $z211 = Log_OC.append($r46, $r54);
                                        if ($z211) {
                                            List $r132 = this.f32635c;
                                            $r132.add($r82);
                                        }
                                    }
                                    this.f32640p = null;
                                    this.f32641r = null;
                                    this.f32638g = false;
                                    this.f32637f = -1;
                                }
                            }
                        }
                    }
                } else if (z2) {
                    Class $r47 = $r1.getClass();
                    boolean $z212 = TextureView.class.isAssignableFrom($r47);
                    if ($z212) {
                        this.f32633a = (TextureView) $r1;
                    }
                } else {
                    Class $r48 = $r1.getClass();
                    boolean $z213 = SurfaceView.class.isAssignableFrom($r48);
                    if ($z213) {
                        SurfaceView $r73 = (SurfaceView) $r1;
                        this.f32639i = $r73;
                        m842a($r73);
                    }
                }
                Log_OC.loadImage($r1, "child");
                int $i35 = i + 1;
                m840a($r1, str, $i35, z, z2);
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final void m835a(C14590m c14590m, boolean z, boolean z2) {
        View $r1 = c14590m.getName();
        m839a($r1, "", z, z2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final String[] m837a(String str) {
        boolean $z0;
        int $i0;
        int $i02;
        int $i1;
        int $i12;
        String $r1;
        String $r12;
        $z0 = C13277t.m5421J(str, "surfaceInsets=Rect", false, 2, null);
        if ($z0) {
            $i0 = C13277t.m5404W(str, "surfaceInsets=Rect", 0, false, 6, null);
            $i02 = C13277t.m5405V(str, '(', $i0, false, 4, null);
            int $i03 = $i02 + 1;
            $i1 = C13277t.m5404W(str, "surfaceInsets=Rect", 0, false, 6, null);
            $i12 = C13277t.m5405V(str, ')', $i1, false, 4, null);
            if (str == null) {
                NullPointerException $r6 = new NullPointerException("null cannot be cast to non-null type java.lang.String");
                throw $r6;
            }
            String $r13 = str.substring($i03, $i12);
            Log_OC.loadImage($r13, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            $r1 = C13276s.m5451A($r13, ",", "", false, 4, null);
            $r12 = C13276s.m5451A($r1, "- ", "", false, 4, null);
            C13262h $r2 = new C13262h(" ");
            List $r3 = $r2.m5519h($r12, 0);
            String[] $r4 = new String[0];
            Object[] $r5 = $r3.toArray($r4);
            if ($r5 != null) {
                String[] $r42 = (String[]) $r5;
                return $r42;
            }
            NullPointerException $r62 = new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            throw $r62;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    private final Runnable m833c(final View view, final Canvas canvas, final CountDownLatch countDownLatch) {
        return new Runnable() { // from class: org.org.org.org.org.core.internal.asm.Futures$2$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.lang.Runnable
            public final void run() {
                Canvas $r3;
                View $r2 = view;
                try {
                    if ($r2 == null || ($r3 = canvas) == null) {
                        CountDownLatch $r4 = countDownLatch;
                        $r4.countDown();
                        System $r5 = System.f32375c;
                        LogAspect $r6 = LogAspect.SCREEN_CAPTURE;
                        LogSeverity $r7 = LogSeverity.VERBOSE;
                        org.org.org.org.asm.parser.TopLevel$NativeErrors $r8 = $r5.get($r6, true, $r7);
                        int $i0 = $r8.ordinal();
                        if ($i0 != 0) {
                            return;
                        }
                        String $r10 = "createDrawViewAwait() [FAILED] view or canvas is null, [logAspect: " + $r6 + ']';
                        $r5.size($r6, $r7, "NativeScreenshotHandler", $r10);
                        return;
                    }
                    $r2.draw($r3);
                    CountDownLatch $r42 = countDownLatch;
                    $r42.countDown();
                    System $r52 = System.f32375c;
                    LogAspect $r62 = LogAspect.SCREEN_CAPTURE;
                    LogSeverity $r72 = LogSeverity.VERBOSE;
                    org.org.org.org.asm.parser.TopLevel$NativeErrors $r82 = $r52.get($r62, true, $r72);
                    int $i02 = $r82.ordinal();
                    if ($i02 != 0) {
                        return;
                    }
                    String $r102 = "createDrawViewAwait() [OK] Successfully drawn, [logAspect: " + $r62 + ']';
                    $r52.size($r62, $r72, "NativeScreenshotHandler", $r102);
                } catch (Exception e) {
                    System $r53 = System.f32375c;
                    LogAspect $r63 = LogAspect.SCREEN_CAPTURE;
                    LogSeverity $r73 = LogSeverity.VERBOSE;
                    org.org.org.org.asm.parser.TopLevel$NativeErrors $r83 = $r53.get($r63, true, $r73);
                    int $i03 = $r83.ordinal();
                    if ($i03 == 0) {
                        String $r103 = "createDrawViewAwait() [FAILED] exception raised, [logAspect: " + $r63 + ']';
                        $r53.size($r63, $r73, "NativeScreenshotHandler", $r103);
                    }
                    CountDownLatch $r43 = countDownLatch;
                    $r43.countDown();
                }
            }
        };
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final Runnable commit(final CountDownLatch countDownLatch) {
        return new Runnable() { // from class: org.org.org.org.org.core.internal.asm.SelectorManager$SelectSet$3
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.lang.Runnable
            public final void run() {
                System $r3 = System.f32375c;
                LogAspect $r1 = LogAspect.SCREEN_CAPTURE;
                LogSeverity $r2 = LogSeverity.VERBOSE;
                org.org.org.org.asm.parser.TopLevel$NativeErrors $r4 = $r3.get($r1, true, $r2);
                int $i0 = $r4.ordinal();
                if ($i0 == 0) {
                    String $r6 = "createDrawViewAwaitTimeout() [FALLBACK] view post has timed out, [logAspect: " + $r1 + ']';
                    $r3.size($r1, $r2, "NativeScreenshotHandler", $r6);
                }
                CountDownLatch $r7 = countDownLatch;
                $r7.countDown();
            }
        };
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final Surface create(View view) throws Exception {
        Surface $r8;
        Class[] $r3 = new Class[0];
        Method $r4 = View.class.getMethod("getViewRootImpl", $r3);
        Object[] $r5 = new Object[0];
        Object $r6 = $r4.invoke(view, $r5);
        if ($r6 != null) {
            org.org.org.org.asm.ClassWriter $r7 = org.org.org.org.asm.ClassWriter.f32305c;
            $r8 = (Surface) $r7.get("mSurface", $r6);
        } else {
            $r8 = null;
        }
        if ($r8 != null) {
            boolean $z0 = $r8.isValid();
            if ($z0) {
                return $r8;
            }
        }
        IllegalArgumentException $r9 = new IllegalArgumentException("Window doesn't have a backing surface!");
        throw $r9;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final Bitmap get(final C14590m c14590m) {
        Bitmap $r8;
        Rect $r5 = c14590m.m1119d();
        int $i1 = $r5.right;
        Rect $r52 = c14590m.m1119d();
        int $i0 = $r52.left;
        int $i12 = $i1 - $i0;
        Rect $r53 = c14590m.m1119d();
        int $i02 = $r53.bottom;
        Rect $r54 = c14590m.m1119d();
        int $i2 = $r54.top;
        int $i22 = $i02 - $i2;
        final CountDownLatch $r1 = new CountDownLatch(1);
        final AtomicInteger $r2 = new AtomicInteger(1);
        int $i03 = Build.VERSION.SDK_INT;
        if ($i03 >= 24) {
            Bitmap.Config $r6 = Bitmap.Config.ARGB_8888;
            Bitmap $r7 = Bitmap.createBitmap($i12, $i22, $r6);
            $r8 = $r7;
            final HandlerThread $r9 = new HandlerThread("PixelCopier");
            PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener = new PixelCopy.OnPixelCopyFinishedListener($r9, this, $r2, $r1, c14590m) { // from class: org.org.org.org.org.core.internal.asm.AbstractSession$1
                public final /* synthetic */ AtomicInteger this$0;
                public final /* synthetic */ HandlerThread thread;
                public final /* synthetic */ CountDownLatch val$latch;

                {
                    this.this$0 = $r2;
                    this.val$latch = $r1;
                }

                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i) {
                    AtomicInteger $r12 = this.this$0;
                    $r12.set(i);
                    HandlerThread $r22 = this.thread;
                    $r22.quitSafely();
                    CountDownLatch $r3 = this.val$latch;
                    $r3.countDown();
                }
            };
            $r9.start();
            if ($i03 >= 28) {
                boolean $z0 = c14590m.m1120c() instanceof Window;
                if ($z0) {
                    try {
                        Object $r10 = c14590m.m1120c();
                        if ($r10 == null) {
                            NullPointerException $r14 = new NullPointerException("null cannot be cast to non-null type android.view.Window");
                            throw $r14;
                        }
                        Window $r11 = (Window) $r10;
                        Looper $r13 = $r9.getLooper();
                        Handler $r12 = new Handler($r13);
                        PixelCopy.request($r11, $r7, onPixelCopyFinishedListener, $r12);
                        $r1.await();
                    } catch (Exception $r15) {
                        org.org.org.org.asm.parser.Attribute $r16 = org.org.org.org.asm.parser.Attribute.f32368a;
                        LogAspect $r17 = LogAspect.SCREEN_CAPTURE;
                        $r16.m1069e($r17, false, "NativeScreenshotHandler", $r15);
                    }
                }
            }
            try {
                View $r18 = c14590m.getName();
                Surface $r19 = create($r18);
                if ($r19 == null) {
                    return null;
                }
                boolean $z02 = $r19.isValid();
                if (!$z02) {
                    return null;
                }
                View $r182 = c14590m.getName();
                Rect $r55 = get($r182);
                if ($i03 >= 26) {
                    Looper $r132 = $r9.getLooper();
                    Handler $r122 = new Handler($r132);
                    PixelCopy.request($r19, $r55, $r7, onPixelCopyFinishedListener, $r122);
                } else {
                    Rect $r20 = new Rect();
                    boolean $z03 = $r55.contains($r20);
                    if (!$z03) {
                        return null;
                    }
                    Looper $r133 = $r9.getLooper();
                    Handler $r123 = new Handler($r133);
                    PixelCopy.request($r19, $r7, onPixelCopyFinishedListener, $r123);
                }
                $r1.await();
            } catch (Exception $r21) {
                org.org.org.org.asm.parser.Attribute $r162 = org.org.org.org.asm.parser.Attribute.f32368a;
                LogAspect $r172 = LogAspect.SCREEN_CAPTURE;
                $r162.m1069e($r172, false, "NativeScreenshotHandler", $r21);
                return null;
            }
        } else {
            $r8 = null;
        }
        int $i13 = $r2.get();
        if ($i13 != 0) {
            return null;
        }
        return $r8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final Rect get(View view) throws Exception {
        Rect $r10;
        Object $r9;
        Class[] $r3 = new Class[0];
        Method $r5 = View.class.getMethod("getViewRootImpl", $r3);
        Object[] $r6 = new Object[0];
        Object $r7 = $r5.invoke(view, $r6);
        org.org.org.org.asm.ClassWriter $r8 = org.org.org.org.asm.ClassWriter.f32305c;
        try {
            Log_OC.loadImage($r7, "root");
            $r9 = $r8.get("mWindowAttributes", $r7);
        } catch (Exception e) {
            $r10 = m841a(view);
        }
        if ($r9 == null) {
            NoSuchFieldException $r12 = new NoSuchFieldException();
            throw $r12;
        }
        Object $r92 = $r8.get("surfaceInsets", $r9);
        if ($r92 == null) {
            NullPointerException $r11 = new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
            throw $r11;
        }
        $r10 = (Rect) $r92;
        org.org.org.org.asm.ClassWriter $r82 = org.org.org.org.asm.ClassWriter.f32305c;
        Log_OC.loadImage($r7, "root");
        Object $r93 = $r82.get("mWidth", $r7);
        if ($r93 == null) {
            NullPointerException $r112 = new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            throw $r112;
        }
        Integer $r13 = (Integer) $r93;
        int $i0 = $r13.intValue();
        Object $r72 = $r82.get("mHeight", $r7);
        if ($r72 == null) {
            NullPointerException $r113 = new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            throw $r113;
        }
        Integer $r132 = (Integer) $r72;
        int $i1 = $r132.intValue();
        int $i2 = $r10.left;
        int $i22 = $r10.top;
        Rect $r14 = new Rect($i2, $i22, $i0 + $i2, $i1 + $i22);
        return $r14;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void show(View view, Canvas canvas) throws InterruptedException {
        if (view == null || canvas == null) {
            return;
        }
        CountDownLatch $r1 = new CountDownLatch(1);
        Looper $r5 = Looper.getMainLooper();
        Handler $r4 = new Handler($r5);
        Runnable $r6 = commit($r1);
        $r4.postDelayed($r6, 300L);
        Runnable $r62 = m833c(view, canvas, $r1);
        view.post($r62);
        $r1.await();
        $r4.removeCallbacksAndMessages(null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final View m838a(ViewGroup viewGroup, int i, int i2, int i3, boolean z) {
        Log_OC.getArray(viewGroup, "viewGroup");
        int $i2 = i3 + 1;
        int $i3 = viewGroup.getChildCount();
        for (int $i4 = 0; $i4 < $i3; $i4++) {
            View $r2 = viewGroup.getChildAt($i4);
            boolean $z1 = $r2 instanceof ViewGroup;
            if ($z1) {
                int[] $r3 = new int[2];
                $r2.getLocationOnScreen($r3);
                ViewGroup $r4 = (ViewGroup) $r2;
                m838a($r4, i, i2, $i2, z);
            } else {
                org.org.org.org.asm.Type $r5 = org.org.org.org.asm.Type.f32312c;
                Log_OC.loadImage($r2, "child");
                Rect $r6 = $r5.get($r2);
                boolean $z12 = $r6.contains(i, i2);
                if ($z12) {
                    int $i5 = this.f32637f;
                    if ($i2 >= $i5) {
                        boolean $z13 = $r2.hasOnClickListeners();
                        if (!$z13) {
                            boolean $z14 = this.f32638g;
                            if ($z14) {
                            }
                        }
                        this.f32637f = $i2;
                        this.f32641r = $r2;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:59:0x02d5 */
    /* JADX WARN: Incorrect condition in loop: B:70:0x03d5 */
    /* JADX WARN: Removed duplicated region for block: B:54:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0366  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m836a(org.org.org.org.asm.asm.C14590m r44, boolean r45, android.graphics.Canvas r46, android.graphics.Bitmap r47) {
        /*
            Method dump skipped, instructions count: 1163
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.core.internal.asm.ClassWriter.m836a(org.org.org.org.asm.asm.m, boolean, android.graphics.Canvas, android.graphics.Bitmap):void");
    }
}
