package pl.droidsonroids.gif;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import java.io.FileDescriptor;
import java.io.IOException;
/* loaded from: classes3.dex */
final class GifInfoHandle {

    /* renamed from: a */
    private volatile long f32961a;

    static {
        C14754h.m393b();
    }

    GifInfoHandle(String str) throws GifIOException {
        this.f32961a = openFile(str);
    }

    static native int createTempNativeFileDescriptor() throws GifIOException;

    static native int extractNativeFileDescriptor(FileDescriptor fileDescriptor, boolean z) throws GifIOException;

    private static native void free(long j);

    private static native int getCurrentFrameIndex(long j);

    private static native int getCurrentLoop(long j);

    private static native int getCurrentPosition(long j);

    private static native int getDuration(long j);

    private static native int getHeight(long j);

    private static native int getLoopCount(long j);

    private static native int getNativeErrorCode(long j);

    private static native int getNumberOfFrames(long j);

    private static native long[] getSavedState(long j);

    private static native int getWidth(long j);

    /* renamed from: h */
    private static int m435h(FileDescriptor fileDescriptor, boolean z) throws GifIOException, ErrnoException {
        try {
            int createTempNativeFileDescriptor = createTempNativeFileDescriptor();
            Os.dup2(fileDescriptor, createTempNativeFileDescriptor);
            return createTempNativeFileDescriptor;
        } finally {
            if (z) {
                Os.close(fileDescriptor);
            }
        }
    }

    private static native boolean isOpaque(long j);

    /* renamed from: n */
    private static long m429n(FileDescriptor fileDescriptor, long j, boolean z) throws GifIOException {
        int m435h;
        if (Build.VERSION.SDK_INT > 27) {
            try {
                m435h = m435h(fileDescriptor, z);
            } catch (Exception e) {
                throw new GifIOException(EnumC14744c.OPEN_FAILED.f33007d, e.getMessage());
            }
        } else {
            m435h = extractNativeFileDescriptor(fileDescriptor, z);
        }
        return openNativeFileDescriptor(m435h, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static GifInfoHandle m428o(ContentResolver contentResolver, Uri uri) throws IOException {
        if ("file".equals(uri.getScheme())) {
            return new GifInfoHandle(uri.getPath());
        }
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return new GifInfoHandle(openAssetFileDescriptor);
        }
        throw new IOException("Could not open AssetFileDescriptor for " + uri);
    }

    static native long openFile(String str) throws GifIOException;

    static native long openNativeFileDescriptor(int i, long j) throws GifIOException;

    private static native long renderFrame(long j, Bitmap bitmap);

    private static native boolean reset(long j);

    private static native long restoreRemainder(long j);

    private static native int restoreSavedState(long j, long[] jArr, Bitmap bitmap);

    private static native void saveRemainder(long j);

    private static native void seekToTime(long j, int i, Bitmap bitmap);

    private static native void setLoopCount(long j, char c);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized int m442a() {
        return getCurrentFrameIndex(this.f32961a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized int m441b() {
        return getCurrentLoop(this.f32961a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized int m440c() {
        return getCurrentPosition(this.f32961a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized int m439d() {
        return getDuration(this.f32961a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized int m438e() {
        return getHeight(this.f32961a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized int m437f() {
        return getLoopCount(this.f32961a);
    }

    protected void finalize() throws Throwable {
        try {
            m427p();
        } finally {
            super.finalize();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public synchronized int m436g() {
        return getNativeErrorCode(this.f32961a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public synchronized int m434i() {
        return getNumberOfFrames(this.f32961a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public synchronized long[] m433j() {
        return getSavedState(this.f32961a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public synchronized int m432k() {
        return getWidth(this.f32961a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public synchronized boolean m431l() {
        return isOpaque(this.f32961a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public synchronized boolean m430m() {
        return this.f32961a == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public synchronized void m427p() {
        free(this.f32961a);
        this.f32961a = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public synchronized long m426q(Bitmap bitmap) {
        return renderFrame(this.f32961a, bitmap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public synchronized boolean m425r() {
        return reset(this.f32961a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public synchronized long m424s() {
        return restoreRemainder(this.f32961a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public synchronized int m423t(long[] jArr, Bitmap bitmap) {
        return restoreSavedState(this.f32961a, jArr, bitmap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public synchronized void m422u() {
        saveRemainder(this.f32961a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public synchronized void m421v(int i, Bitmap bitmap) {
        seekToTime(this.f32961a, i, bitmap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m420w(int i) {
        if (i >= 0 && i <= 65535) {
            synchronized (this) {
                setLoopCount(this.f32961a, (char) i);
            }
            return;
        }
        throw new IllegalArgumentException("Loop count of range <0, 65535>");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GifInfoHandle(AssetFileDescriptor assetFileDescriptor) throws IOException {
        try {
            this.f32961a = m429n(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), false);
        } finally {
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }
}
