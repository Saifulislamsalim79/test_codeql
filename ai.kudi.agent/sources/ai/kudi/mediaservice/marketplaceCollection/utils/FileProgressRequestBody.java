package ai.kudi.mediaservice.marketplaceCollection.utils;

import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import p565l.AbstractC14120b0;
import p565l.C14235v;
import p576m.InterfaceC14345d;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* compiled from: FileProgressRequestBody.kt */
@Metadata(m10422d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0003\u000f\u0010\u0011B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m10421d2 = {"Lai/kudi/mediaservice/marketplaceCollection/utils/FileProgressRequestBody;", "Lokhttp3/RequestBody;", "mFile", "Ljava/io/File;", "mListener", "Lai/kudi/mediaservice/marketplaceCollection/utils/FileProgressRequestBody$UploadCallbacks;", "(Ljava/io/File;Lai/kudi/mediaservice/marketplaceCollection/utils/FileProgressRequestBody$UploadCallbacks;)V", "contentLength", "", "contentType", "Lokhttp3/MediaType;", "writeTo", "", "sink", "Lokio/BufferedSink;", "Companion", "ProgressUpdater", "UploadCallbacks", "mediaservice_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class FileProgressRequestBody extends AbstractC14120b0 {
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_BUFFER_SIZE = IjkMediaMeta.FF_PROFILE_H264_INTRA;
    private final File mFile;
    private final UploadCallbacks mListener;

    /* compiled from: FileProgressRequestBody.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/mediaservice/marketplaceCollection/utils/FileProgressRequestBody$Companion;", "", "()V", "DEFAULT_BUFFER_SIZE", "", "mediaservice_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    /* compiled from: FileProgressRequestBody.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m10421d2 = {"Lai/kudi/mediaservice/marketplaceCollection/utils/FileProgressRequestBody$ProgressUpdater;", "Ljava/lang/Runnable;", "mUploaded", "", "mTotal", "(Lai/kudi/mediaservice/marketplaceCollection/utils/FileProgressRequestBody;JJ)V", "run", "", "mediaservice_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    private final class ProgressUpdater implements Runnable {
        private final long mTotal;
        private final long mUploaded;
        final /* synthetic */ FileProgressRequestBody this$0;

        public ProgressUpdater(FileProgressRequestBody fileProgressRequestBody, long j, long j2) {
            l.f(fileProgressRequestBody, "this$0");
            this.this$0 = fileProgressRequestBody;
            this.mUploaded = j;
            this.mTotal = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = (int) (((float) (100 * this.mUploaded)) / ((float) this.mTotal));
            UploadCallbacks uploadCallbacks = this.this$0.mListener;
            if (uploadCallbacks == null) {
                return;
            }
            uploadCallbacks.onProgressUpdate(i);
        }
    }

    /* compiled from: FileProgressRequestBody.kt */
    @Metadata(m10422d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/mediaservice/marketplaceCollection/utils/FileProgressRequestBody$UploadCallbacks;", "", "onProgressUpdate", "", "percentage", "", "mediaservice_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public interface UploadCallbacks {
        void onProgressUpdate(int i);
    }

    public FileProgressRequestBody(File file, UploadCallbacks uploadCallbacks) {
        l.f(file, "mFile");
        this.mFile = file;
        this.mListener = uploadCallbacks;
    }

    @Override // p565l.AbstractC14120b0
    public long contentLength() throws IOException {
        return this.mFile.length();
    }

    @Override // p565l.AbstractC14120b0
    public C14235v contentType() {
        return C14235v.m2474d("*/*");
    }

    @Override // p565l.AbstractC14120b0
    public void writeTo(InterfaceC14345d interfaceC14345d) throws IOException {
        l.f(interfaceC14345d, "sink");
        long length = this.mFile.length();
        byte[] bArr = new byte[DEFAULT_BUFFER_SIZE];
        FileInputStream fileInputStream = new FileInputStream(this.mFile);
        try {
            Handler handler = new Handler(Looper.getMainLooper());
            int read = fileInputStream.read(bArr);
            long j = 0;
            while (read != -1) {
                handler.post(new ProgressUpdater(this, j, length));
                j += read;
                interfaceC14345d.mo2008b(bArr, 0, read);
                read = fileInputStream.read(bArr);
            }
        } finally {
            fileInputStream.close();
        }
    }
}
