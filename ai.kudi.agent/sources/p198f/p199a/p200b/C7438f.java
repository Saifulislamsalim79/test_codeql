package p198f.p199a.p200b;

import ai.kudi.agent.dashboard.domain.model.TransactionBreakDownItemType;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.util.Log;
import com.google.android.gms.tasks.C4467l;
import com.google.android.gms.tasks.InterfaceC4458g;
import com.google.android.gms.tasks.j;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.e0.d.l;
import o.a.a;
import p272h.p286c.p360e.p361a.p362a.C9395a;
import p272h.p286c.p360e.p361a.p363b.C9397a;
import p272h.p286c.p360e.p361a.p363b.C9399c;
import p272h.p286c.p360e.p361a.p363b.C9401e;
import p272h.p286c.p360e.p361a.p363b.InterfaceC9400d;
/* compiled from: FaceDetectionProcessor.kt */
/* renamed from: f.a.b.f */
/* loaded from: classes2.dex */
public final class C7438f {

    /* renamed from: a */
    private final InterfaceC7440b f17625a;

    /* renamed from: b */
    private final InterfaceC9400d f17626b;

    /* renamed from: c */
    private boolean f17627c;

    /* renamed from: d */
    private ByteBuffer f17628d;

    /* renamed from: e */
    private C7442g f17629e;

    /* renamed from: f */
    private final ExecutorC7444i f17630f;

    /* renamed from: g */
    private EnumC7439a f17631g;

    /* renamed from: h */
    private Integer f17632h;

    /* renamed from: i */
    private boolean f17633i;

    /* renamed from: j */
    private boolean f17634j;

    /* compiled from: FaceDetectionProcessor.kt */
    /* renamed from: f.a.b.f$a */
    /* loaded from: classes2.dex */
    public enum EnumC7439a {
        DETECT_BLINK,
        DETECT_BLINK_AGAIN,
        DETECT_SMILE,
        CAPTURE
    }

    /* compiled from: FaceDetectionProcessor.kt */
    /* renamed from: f.a.b.f$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC7440b {
        void onCaptured(Bitmap bitmap);

        void onError(String str);

        void onEyeBlink();

        void onFacesNotMatching();

        void onSmile();
    }

    /* compiled from: FaceDetectionProcessor.kt */
    /* renamed from: f.a.b.f$c */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C7441c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17640a;

        static {
            int[] iArr = new int[EnumC7439a.values().length];
            iArr[EnumC7439a.DETECT_BLINK.ordinal()] = 1;
            iArr[EnumC7439a.DETECT_BLINK_AGAIN.ordinal()] = 2;
            iArr[EnumC7439a.DETECT_SMILE.ordinal()] = 3;
            iArr[EnumC7439a.CAPTURE.ordinal()] = 4;
            f17640a = iArr;
        }
    }

    public C7438f(InterfaceC7440b interfaceC7440b) {
        l.f(interfaceC7440b, "callBack");
        this.f17625a = interfaceC7440b;
        Executor executor = C4467l.f10891a;
        l.e(executor, "MAIN_THREAD");
        this.f17630f = new ExecutorC7444i(executor);
        this.f17631g = EnumC7439a.DETECT_BLINK;
        C9401e.C9402a c9402a = new C9401e.C9402a();
        c9402a.m14823c(2);
        c9402a.m14824b();
        C9401e m14825a = c9402a.m14825a();
        l.e(m14825a, "Builder()\n            .setClassificationMode(FaceDetectorOptions.CLASSIFICATION_MODE_ALL)\n            .enableTracking()\n            .build()");
        InterfaceC9400d m14834a = C9399c.m14834a(m14825a);
        l.e(m14834a, "getClient(options)");
        this.f17626b = m14834a;
    }

    /* renamed from: a */
    private final void m18730a(List<? extends C9397a> list) {
        if (list.size() != 1) {
            return;
        }
        C9397a c9397a = list.get(0);
        EnumC7439a enumC7439a = this.f17631g;
        int i = enumC7439a == null ? -1 : C7441c.f17640a[enumC7439a.ordinal()];
        if (i == 1) {
            this.f17632h = c9397a.m14840g();
            m18729b(c9397a);
        } else if (i == 2) {
            if (!l.b(this.f17632h, c9397a.m14840g())) {
                this.f17625a.onFacesNotMatching();
            } else {
                m18729b(c9397a);
            }
        } else if (i == 3) {
            if (!l.b(this.f17632h, c9397a.m14840g())) {
                this.f17625a.onFacesNotMatching();
            } else {
                m18728c(c9397a);
            }
        } else if (i != 4) {
        } else {
            if (!l.b(this.f17632h, c9397a.m14840g())) {
                this.f17625a.onFacesNotMatching();
                return;
            }
            ByteBuffer byteBuffer = this.f17628d;
            l.d(byteBuffer);
            C7442g c7442g = this.f17629e;
            l.d(c7442g);
            Bitmap m18727d = m18727d(byteBuffer, c7442g);
            if (m18727d != null) {
                this.f17625a.onCaptured(m18727d);
            } else {
                this.f17625a.onError("Bitmap value is null.");
            }
        }
    }

    /* renamed from: b */
    private final void m18729b(C9397a c9397a) {
        Float m14843d = c9397a.m14843d();
        Float m14842e = c9397a.m14842e();
        if (this.f17633i) {
            if (m14843d == null || m14843d.floatValue() <= 0.6d || m14842e == null || m14842e.floatValue() <= 0.6d) {
                return;
            }
            this.f17633i = false;
            this.f17625a.onEyeBlink();
        } else if (m14843d == null || m14843d.floatValue() >= 0.4d || m14842e == null || m14842e.floatValue() >= 0.4d) {
        } else {
            this.f17633i = true;
        }
    }

    /* renamed from: c */
    private final void m18728c(C9397a c9397a) {
        Float m14841f = c9397a.m14841f();
        if (m14841f == null || m14841f.floatValue() <= 0.6d) {
            return;
        }
        this.f17625a.onSmile();
    }

    /* renamed from: d */
    private final Bitmap m18727d(ByteBuffer byteBuffer, C7442g c7442g) {
        byteBuffer.rewind();
        int limit = byteBuffer.limit();
        byte[] bArr = new byte[limit];
        byteBuffer.get(bArr, 0, limit);
        try {
            YuvImage yuvImage = new YuvImage(bArr, 17, c7442g.m18714c(), c7442g.m18716a(), null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            yuvImage.compressToJpeg(new Rect(0, 0, c7442g.m18714c(), c7442g.m18716a()), 80, byteArrayOutputStream);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
            byteArrayOutputStream.close();
            l.e(decodeByteArray, "bmp");
            return m18720k(decodeByteArray, c7442g.m18715b());
        } catch (Exception e) {
            Log.e("VisionProcessorBase", l.m("Error: ", e.getMessage()));
            return null;
        }
    }

    /* renamed from: h */
    private final void m18723h() {
        ByteBuffer byteBuffer = this.f17628d;
        if (byteBuffer == null || this.f17629e == null || this.f17634j) {
            return;
        }
        this.f17627c = true;
        l.d(byteBuffer);
        C7442g c7442g = this.f17629e;
        l.d(c7442g);
        int m18714c = c7442g.m18714c();
        C7442g c7442g2 = this.f17629e;
        l.d(c7442g2);
        int m18716a = c7442g2.m18716a();
        C7442g c7442g3 = this.f17629e;
        l.d(c7442g3);
        C9395a m14859a = C9395a.m14859a(byteBuffer, m18714c, m18716a, c7442g3.m18715b(), 17);
        l.e(m14859a, "fromByteBuffer(\n                latestImage!!,\n                latestMetaData!!.width,\n                latestMetaData!!.height,\n                latestMetaData!!.rotation,\n                InputImage.IMAGE_FORMAT_NV21\n            )");
        j<List<C9397a>> mo14833a0 = this.f17626b.mo14833a0(m14859a);
        mo14833a0.g(this.f17630f, new InterfaceC4458g() { // from class: f.a.b.c
            @Override // com.google.android.gms.tasks.InterfaceC4458g
            /* renamed from: c */
            public final void mo18742c(Object obj) {
                C7438f.m18722i(C7438f.this, (List) obj);
            }
        });
        mo14833a0.d(C7434b.f17610a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m18722i(C7438f c7438f, List list) {
        l.f(c7438f, "this$0");
        l.e(list, "results");
        c7438f.m18730a(list);
        c7438f.f17627c = false;
        c7438f.m18723h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m18721j(Exception exc) {
        l.f(exc, "it");
        a.d(exc);
    }

    /* renamed from: k */
    private final Bitmap m18720k(Bitmap bitmap, int i) {
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        matrix.postScale(1.0f, 1.0f);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        if (!l.b(createBitmap, bitmap)) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    /* renamed from: g */
    public final void m18724g(ByteBuffer byteBuffer, C7442g c7442g) {
        l.f(byteBuffer, TransactionBreakDownItemType.DATA);
        l.f(c7442g, "frameMetadata");
        this.f17628d = byteBuffer;
        this.f17629e = c7442g;
        if (this.f17627c) {
            return;
        }
        m18723h();
    }

    /* renamed from: l */
    public final void m18719l(EnumC7439a enumC7439a) {
        this.f17631g = enumC7439a;
    }

    /* renamed from: m */
    public final void m18718m() {
        this.f17630f.shutdown();
        this.f17634j = true;
    }
}
