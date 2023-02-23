package androidx.core.app;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* compiled from: FrameMetricsAggregator.java */
/* renamed from: androidx.core.app.h */
/* loaded from: classes2.dex */
public class C1308h {

    /* renamed from: a */
    private C1311b f4085a;

    /* compiled from: FrameMetricsAggregator.java */
    /* renamed from: androidx.core.app.h$a */
    /* loaded from: classes2.dex */
    private static class C1309a extends C1311b {

        /* renamed from: e */
        private static HandlerThread f4086e;

        /* renamed from: f */
        private static Handler f4087f;

        /* renamed from: a */
        int f4088a;

        /* renamed from: b */
        SparseIntArray[] f4089b = new SparseIntArray[9];

        /* renamed from: c */
        private ArrayList<WeakReference<Activity>> f4090c = new ArrayList<>();

        /* renamed from: d */
        Window.OnFrameMetricsAvailableListener f4091d = new Window$OnFrameMetricsAvailableListenerC1310a();

        /* compiled from: FrameMetricsAggregator.java */
        /* renamed from: androidx.core.app.h$a$a */
        /* loaded from: classes2.dex */
        class Window$OnFrameMetricsAvailableListenerC1310a implements Window.OnFrameMetricsAvailableListener {
            Window$OnFrameMetricsAvailableListenerC1310a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                C1309a c1309a = C1309a.this;
                if ((c1309a.f4088a & 1) != 0) {
                    c1309a.m36436c(c1309a.f4089b[0], frameMetrics.getMetric(8));
                }
                C1309a c1309a2 = C1309a.this;
                if ((c1309a2.f4088a & 2) != 0) {
                    c1309a2.m36436c(c1309a2.f4089b[1], frameMetrics.getMetric(1));
                }
                C1309a c1309a3 = C1309a.this;
                if ((c1309a3.f4088a & 4) != 0) {
                    c1309a3.m36436c(c1309a3.f4089b[2], frameMetrics.getMetric(3));
                }
                C1309a c1309a4 = C1309a.this;
                if ((c1309a4.f4088a & 8) != 0) {
                    c1309a4.m36436c(c1309a4.f4089b[3], frameMetrics.getMetric(4));
                }
                C1309a c1309a5 = C1309a.this;
                if ((c1309a5.f4088a & 16) != 0) {
                    c1309a5.m36436c(c1309a5.f4089b[4], frameMetrics.getMetric(5));
                }
                C1309a c1309a6 = C1309a.this;
                if ((c1309a6.f4088a & 64) != 0) {
                    c1309a6.m36436c(c1309a6.f4089b[6], frameMetrics.getMetric(7));
                }
                C1309a c1309a7 = C1309a.this;
                if ((c1309a7.f4088a & 32) != 0) {
                    c1309a7.m36436c(c1309a7.f4089b[5], frameMetrics.getMetric(6));
                }
                C1309a c1309a8 = C1309a.this;
                if ((c1309a8.f4088a & 128) != 0) {
                    c1309a8.m36436c(c1309a8.f4089b[7], frameMetrics.getMetric(0));
                }
                C1309a c1309a9 = C1309a.this;
                if ((c1309a9.f4088a & 256) != 0) {
                    c1309a9.m36436c(c1309a9.f4089b[8], frameMetrics.getMetric(2));
                }
            }
        }

        C1309a(int i) {
            this.f4088a = i;
        }

        @Override // androidx.core.app.C1308h.C1311b
        /* renamed from: a */
        public void mo36435a(Activity activity) {
            if (f4086e == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f4086e = handlerThread;
                handlerThread.start();
                f4087f = new Handler(f4086e.getLooper());
            }
            for (int i = 0; i <= 8; i++) {
                SparseIntArray[] sparseIntArrayArr = this.f4089b;
                if (sparseIntArrayArr[i] == null && (this.f4088a & (1 << i)) != 0) {
                    sparseIntArrayArr[i] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f4091d, f4087f);
            this.f4090c.add(new WeakReference<>(activity));
        }

        @Override // androidx.core.app.C1308h.C1311b
        /* renamed from: b */
        public SparseIntArray[] mo36434b() {
            SparseIntArray[] sparseIntArrayArr = this.f4089b;
            this.f4089b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        /* renamed from: c */
        void m36436c(SparseIntArray sparseIntArray, long j) {
            if (sparseIntArray != null) {
                int i = (int) ((500000 + j) / 1000000);
                if (j >= 0) {
                    sparseIntArray.put(i, sparseIntArray.get(i) + 1);
                }
            }
        }
    }

    /* compiled from: FrameMetricsAggregator.java */
    /* renamed from: androidx.core.app.h$b */
    /* loaded from: classes2.dex */
    private static class C1311b {
        C1311b() {
        }

        /* renamed from: a */
        public void mo36435a(Activity activity) {
        }

        /* renamed from: b */
        public SparseIntArray[] mo36434b() {
            return null;
        }
    }

    public C1308h() {
        this(1);
    }

    /* renamed from: a */
    public void m36438a(Activity activity) {
        this.f4085a.mo36435a(activity);
    }

    /* renamed from: b */
    public SparseIntArray[] m36437b() {
        return this.f4085a.mo36434b();
    }

    public C1308h(int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f4085a = new C1309a(i);
        } else {
            this.f4085a = new C1311b();
        }
    }
}
