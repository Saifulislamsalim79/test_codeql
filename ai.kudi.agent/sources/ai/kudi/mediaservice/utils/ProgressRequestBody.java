package ai.kudi.mediaservice.utils;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
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
/* compiled from: ProgressRequestBody.kt */
@Metadata(m10422d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0003\u0014\u0015\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0014\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m10421d2 = {"Lai/kudi/mediaservice/utils/ProgressRequestBody;", "Lokhttp3/RequestBody;", "mFile", "Ljava/io/File;", "mListener", "Lai/kudi/mediaservice/utils/ProgressRequestBody$UploadCallbacks;", "(Ljava/io/File;Lai/kudi/mediaservice/utils/ProgressRequestBody$UploadCallbacks;)V", "contentLength", "", "contentType", "Lokhttp3/MediaType;", "writeTo", "", "sink", "Lokio/BufferedSink;", "getFileName", "", "Landroid/content/ContentResolver;", "fileUri", "Landroid/net/Uri;", "Companion", "ProgressUpdater", "UploadCallbacks", "mediaservice_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ProgressRequestBody extends AbstractC14120b0 {
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_BUFFER_SIZE = IjkMediaMeta.FF_PROFILE_H264_INTRA;
    private final File mFile;
    private final UploadCallbacks mListener;

    /* compiled from: ProgressRequestBody.kt */
    @Metadata(m10422d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m10421d2 = {"Lai/kudi/mediaservice/utils/ProgressRequestBody$Companion;", "", "()V", "DEFAULT_BUFFER_SIZE", "", "mediaservice_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    /* compiled from: ProgressRequestBody.kt */
    @Metadata(m10422d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m10421d2 = {"Lai/kudi/mediaservice/utils/ProgressRequestBody$ProgressUpdater;", "Ljava/lang/Runnable;", "mUploaded", "", "mTotal", "(Lai/kudi/mediaservice/utils/ProgressRequestBody;JJ)V", "run", "", "mediaservice_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    private final class ProgressUpdater implements Runnable {
        private final long mTotal;
        private final long mUploaded;
        final /* synthetic */ ProgressRequestBody this$0;

        public ProgressUpdater(ProgressRequestBody progressRequestBody, long j, long j2) {
            l.f(progressRequestBody, "this$0");
            this.this$0 = progressRequestBody;
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

    /* compiled from: ProgressRequestBody.kt */
    @Metadata(m10422d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/mediaservice/utils/ProgressRequestBody$UploadCallbacks;", "", "onProgressUpdate", "", "percentage", "", "mediaservice_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public interface UploadCallbacks {
        void onProgressUpdate(int i);
    }

    public ProgressRequestBody(File file, UploadCallbacks uploadCallbacks) {
        l.f(file, "mFile");
        this.mFile = file;
        this.mListener = uploadCallbacks;
    }

    private final String getFileName(ContentResolver contentResolver, Uri uri) {
        Cursor query = contentResolver.query(uri, null, null, null, null);
        if (query != null) {
            int columnIndex = query.getColumnIndex("_display_name");
            query.moveToFirst();
            String string = query.getString(columnIndex);
            l.e(string, "returnCursor.getString(nameIndex)");
            query.close();
            return string;
        }
        return "";
    }

    @Override // p565l.AbstractC14120b0
    public long contentLength() throws IOException {
        return this.mFile.length();
    }

    @Override // p565l.AbstractC14120b0
    public C14235v contentType() {
        return C14235v.m2474d("image/*");
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
