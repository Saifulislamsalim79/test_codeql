package io.intercom.android.sdk.package_2;

import io.intercom.android.sdk.conversation.UploadProgressListener;
import io.intercom.okhttp3.MediaType;
import io.intercom.okhttp3.RequestBody;
import io.intercom.okhttp3.internal.Util;
import java.io.File;
import java.io.IOException;
import p425j.p429b.p433b.C11146c;
import p425j.p429b.p433b.C11158l;
import p425j.p429b.p433b.InterfaceC11150d;
import p425j.p429b.p433b.InterfaceC11170s;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ProgressRequestBody extends RequestBody {
    private static final int SEGMENT_SIZE = 2048;
    private final MediaType contentType;
    private final File file;
    private final UploadProgressListener listener;

    public ProgressRequestBody(MediaType mediaType, File file, UploadProgressListener uploadProgressListener) {
        this.contentType = mediaType;
        this.file = file;
        this.listener = uploadProgressListener;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.okhttp3.RequestBody
    public long contentLength() {
        File $r1 = this.file;
        long $l0 = $r1.length();
        return $l0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.okhttp3.RequestBody
    public MediaType contentType() {
        MediaType r1 = this.contentType;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.okhttp3.RequestBody
    public void writeTo(InterfaceC11150d interfaceC11150d) throws IOException {
        InterfaceC11170s $r2 = null;
        try {
            File $r3 = this.file;
            InterfaceC11170s $r4 = C11158l.m11520j($r3);
            $r2 = $r4;
            long $l1 = 0;
            while (true) {
                C11146c $r5 = interfaceC11150d.mo11496d();
                long $l2 = $r4.read($r5, 2048L);
                if ($l2 == -1) {
                    InterfaceC11170s r8 = $r4;
                    Util.closeQuietly(r8);
                    return;
                }
                $l1 += $l2;
                interfaceC11150d.flush();
                UploadProgressListener $r6 = this.listener;
                long $l22 = 100 * $l1;
                File $r32 = this.file;
                long $l3 = $r32.length();
                double $d0 = $l22 / $l3;
                Double.isNaN($d0);
                int $i4 = (int) (($d0 * 0.8d) + 10.0d);
                byte $b0 = (byte) $i4;
                $r6.uploadNotice($b0);
            }
        } catch (Throwable $r7) {
            InterfaceC11170s r82 = $r2;
            Util.closeQuietly(r82);
            throw $r7;
        }
    }
}
