package lombok.org.libs.org.objectweb.asm;

import ai.kudi.agent.transactions.domain.dto.TransactionRequest;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p492io.C11843b;
import kotlin.p492io.C11857j;
import kotlin.p492io.C11860m;
import lombok.org.libs.org.objectweb.asm.asm.ByteVector;
import lombok.org.libs.org.objectweb.asm.asm.C14326a;
import lombok.org.libs.org.objectweb.asm.asm.Response;
import lombok.org.libs.org.objectweb.asm.asm.signature.AbstractC14331h;
import org.org.org.org.asm.Activity.Settings;
import org.org.org.org.asm.parser.System;
import org.org.org.org.asm.parser.TopLevel$NativeErrors;
import org.org.org.org.internal.C14627c;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
@Metadata(m10423bv = {1, 0, 3}, m10422d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\u0018\u0000:\u0005\u0002\u0017\u001c*(B\u001d\u0012\u0006\u00107\u001a\u00020\u000e\u0012\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001408¢\u0006\u0004\b=\u0010>J\u0011\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0002\u0010\tJ\u001f\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0002\u0010\u000bJ'\u0010\u0002\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0002\u0010\u0013J\u001b\u0010\u0002\u001a\u00020\b*\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0002\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0002\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0002\u0010\u001eJ'\u0010\u0002\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b\u0002\u0010$J\u001f\u0010\u0002\u001a\u00020\b2\u0006\u0010!\u001a\u00020 2\u0006\u0010%\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u0002\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010\u0017\u001a\u00020,2\u0006\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010-J\u0019\u0010\u0002\u001a\u0004\u0018\u00010,2\u0006\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0002\u0010-J\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u000e2\u0006\u0010.\u001a\u00020,H\u0002¢\u0006\u0004\b\u0002\u0010/J\u0015\u0010\u0002\u001a\u00020\b2\u0006\u00100\u001a\u00020\u0010¢\u0006\u0004\b\u0002\u00101J\r\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0017\u00102J\u001d\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u000203¢\u0006\u0004\b\u0002\u00104J\u001d\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0007\u001a\u000203¢\u0006\u0004\b\u0002\u00105R\u0016\u00107\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u00106R\u001c\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0014088\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00109R\u0018\u0010<\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010;¨\u0006?"}, m10421d2 = {"La/a/b/a/b/d/a;", "La/a/b/a/b/d/c;", "a", "()La/a/b/a/b/d/c;", "La/a/b/a/b/d/d/h/c;", TransactionRequest.TYPE_REQUEST, "La/a/b/a/b/d/a$b;", "callback", "", "(La/a/b/a/b/d/d/h/c;La/a/b/a/b/d/a$b;)V", "La/a/b/a/b/d/d/h/a;", "(La/a/b/a/b/d/d/h/a;La/a/b/a/b/d/a$b;)V", "Ljava/net/URL;", IjkMediaPlayer.OnNativeInvokeListener.ARG_URL, "", "method", "", "contentType", "Ljavax/net/ssl/HttpsURLConnection;", "(Ljava/net/URL;Ljava/lang/String;I)Ljavax/net/ssl/HttpsURLConnection;", "La/a/b/a/b/d/d/b;", "header", "(Ljavax/net/ssl/HttpsURLConnection;La/a/b/a/b/d/d/b;)V", "b", "(I)La/a/b/a/b/d/d/b;", "connection", "(Ljavax/net/ssl/HttpsURLConnection;La/a/b/a/b/d/d/h/c;)V", "La/a/b/a/b/d/a$e;", "c", "(Ljavax/net/ssl/HttpsURLConnection;)La/a/b/a/b/d/a$e;", "(Ljavax/net/ssl/HttpsURLConnection;La/a/b/a/b/d/d/h/a;)V", "out", "La/a/b/a/b/d/d/g/b;", "part", "", "isLast", "(La/a/b/a/b/d/a$e;La/a/b/a/b/d/d/g/b;Z)V", "outputStream", "(La/a/b/a/b/d/d/g/b;La/a/b/a/b/d/a$e;)V", "La/a/b/a/b/d/d/d;", "e", "(Ljavax/net/ssl/HttpsURLConnection;)La/a/b/a/b/d/d/d;", "d", "(Ljavax/net/ssl/HttpsURLConnection;)I", "Ljava/io/BufferedInputStream;", "(Ljavax/net/ssl/HttpsURLConnection;)Ljava/io/BufferedInputStream;", "inputStream", "(Ljava/io/BufferedInputStream;)Ljava/lang/String;", "server", "(I)V", "()V", "La/a/b/a/b/d/a$a;", "(La/a/b/a/b/d/d/h/c;La/a/b/a/b/d/a$a;)V", "(La/a/b/a/b/d/d/h/a;La/a/b/a/b/d/a$a;)V", "Ljava/lang/String;", "baseUrl", "", "Ljava/util/List;", "defaultHeaders", "La/a/b/a/b/d/c;", "requestExecutor", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "smartlooksdk_nativeappRelease"}, k = 1, m10420mv = {1, 1, 15}, pn = "", xi = 0, m10419xs = "")
/* loaded from: classes.dex */
public final class Attribute {
    public static final String header;

    /* renamed from: a */
    public final List<a.a.b.a.b.d.d.b> f31556a;

    /* renamed from: b */
    public String f31557b;
    public WrappingExecutorService state;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        UUID $r0 = UUID.randomUUID();
        String $r1 = $r0.toString();
        Log_OC.loadImage($r1, "UUID.randomUUID().toString()");
        header = $r1;
    }

    public Attribute(String str, List list) {
        Log_OC.getArray(str, "baseUrl");
        Log_OC.getArray(list, "defaultHeaders");
        this.f31557b = str;
        this.f31556a = list;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final String m2137a(BufferedInputStream bufferedInputStream) {
        InputStreamReader $r4 = new InputStreamReader(bufferedInputStream, "utf-8");
        BufferedReader $r1 = new BufferedReader($r4);
        try {
            String $r2 = C11860m.m10228c($r1);
            C11843b.m10259a($r1, null);
            return $r2;
        } finally {
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:7:0x003e */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final javax.net.ssl.HttpsURLConnection m2136a(java.net.URL r19, java.lang.String r20, int r21) throws lombok.org.libs.org.objectweb.asm.Type {
        /*
            r18 = this;
            r0 = r19
            java.net.URLConnection r2 = r0.openConnection()     // Catch: java.io.IOException -> L60
            java.lang.Object r3 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r2)     // Catch: java.io.IOException -> L60
            r4 = r3
            java.net.URLConnection r4 = (java.net.URLConnection) r4
            r2 = r4
            if (r2 == 0) goto L4f
            r6 = r2
            javax.net.ssl.HttpsURLConnection r6 = (javax.net.ssl.HttpsURLConnection) r6
            r5 = r6
            r0 = r20
            r5.setRequestMethod(r0)
            r7 = 1
            r5.setDoOutput(r7)
            r7 = 1
            r5.setDoInput(r7)
            r7 = 0
            r5.setChunkedStreamingMode(r7)
            r0 = r18
            r1 = r21
            lombok.org.libs.org.objectweb.asm.asm.Response r8 = r0.read(r1)
            r0 = r18
            r0.get(r5, r8)
            r0 = r18
            java.util.List<a.a.b.a.b.d.d.b> r9 = r0.f31556a
            java.util.Iterator r10 = r9.iterator()
        L3a:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L4e
            java.lang.Object r3 = r10.next()
            r12 = r3
            lombok.org.libs.org.objectweb.asm.asm.Response r12 = (lombok.org.libs.org.objectweb.asm.asm.Response) r12
            r8 = r12
            r0 = r18
            r0.get(r5, r8)
            goto L3a
        L4e:
            return r5
        L4f:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException
            java.lang.String r14 = "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection"
            r13.<init>(r14)     // Catch: java.io.IOException -> L62
            throw r13
        L57:
            lombok.org.libs.org.objectweb.asm.Type r15 = new lombok.org.libs.org.objectweb.asm.Type
            java.lang.String r14 = "I/O error occurred while trying to open connection"
            r15.<init>(r14)
            goto L5f
        L5f:
            throw r15
        L60:
            r16 = move-exception
            goto L57
        L62:
            r17 = move-exception
            goto L57
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.libs.org.objectweb.asm.Attribute.m2136a(java.net.URL, java.lang.String, int):javax.net.ssl.HttpsURLConnection");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final C14333c m2135a(HttpsURLConnection httpsURLConnection) throws Type {
        try {
            OutputStream $r3 = httpsURLConnection.getOutputStream();
            Log_OC.loadImage($r3, "connection.outputStream");
            C14333c $r2 = new C14333c($r3);
            return $r2;
        } catch (IOException $r4) {
            StringBuilder $r6 = new StringBuilder();
            $r6.append("I/O error occurred while creating the output stream: ");
            String $r7 = $r4.getMessage();
            $r6.append($r7);
            String $r72 = $r6.toString();
            Type $r5 = new Type($r72);
            throw $r5;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0017 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m2134a(javax.net.ssl.HttpsURLConnection r28, lombok.org.libs.org.objectweb.asm.asm.asm.Item r29) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.libs.org.objectweb.asm.Attribute.m2134a(javax.net.ssl.HttpsURLConnection, lombok.org.libs.org.objectweb.asm.asm.asm.Item):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f7  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2132a(lombok.org.libs.org.objectweb.asm.asm.asm.Item r26, lombok.org.libs.org.objectweb.asm.Label r27) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.libs.org.objectweb.asm.Attribute.m2132a(lombok.org.libs.org.objectweb.asm.asm.asm.Item, lombok.org.libs.org.objectweb.asm.Label):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final void m2131a(AbstractC14331h abstractC14331h, C14333c c14333c) {
        boolean $z0 = abstractC14331h.mo2110c();
        if ($z0) {
            File $r3 = abstractC14331h.mo2108f();
            byte[] $r4 = $r3 != null ? C11857j.m10240a($r3) : null;
            c14333c.m2099a($r4);
            return;
        }
        boolean $z02 = abstractC14331h.isEnabled();
        if ($z02) {
            String $r5 = abstractC14331h.mo2111b();
            c14333c.m2100a($r5);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final void m2130a(C14333c c14333c, AbstractC14331h abstractC14331h, boolean z) {
        try {
            StringBuilder $r4 = new StringBuilder();
            $r4.append("--");
            String $r1 = header;
            $r4.append($r1);
            $r4.append("\r\n");
            String $r5 = $r4.toString();
            c14333c.m2100a($r5);
            StringBuilder $r42 = new StringBuilder();
            C14332b $r6 = C14332b.f31591a;
            String $r52 = $r6.m2103d(abstractC14331h);
            $r42.append($r52);
            $r42.append("\r\n");
            String $r53 = $r42.toString();
            c14333c.m2100a($r53);
            boolean $z1 = abstractC14331h.isEnabled();
            if ($z1) {
                c14333c.m2100a("Content-Transfer-Encoding: binary\r\n");
            }
            StringBuilder $r43 = new StringBuilder();
            String $r54 = $r6.m2102e(abstractC14331h);
            $r43.append($r54);
            $r43.append("\r\n");
            String $r55 = $r43.toString();
            c14333c.m2100a($r55);
            StringBuilder $r44 = new StringBuilder();
            String $r56 = $r6.m2105a(abstractC14331h);
            $r44.append($r56);
            $r44.append("\r\n");
            String $r57 = $r44.toString();
            c14333c.m2100a($r57);
            c14333c.m2100a("\r\n");
            m2131a(abstractC14331h, c14333c);
            c14333c.m2100a("\r\n");
            if (z) {
                c14333c.m2100a("--" + $r1 + "--\r\n");
            }
        } catch (Exception $r7) {
            StringBuilder $r45 = new StringBuilder();
            $r45.append("Failed to write multipart body: ");
            String $r12 = $r7.getMessage();
            $r45.append($r12);
            String $r13 = $r45.toString();
            Type $r8 = new Type($r13);
            throw $r8;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void get(HttpsURLConnection httpsURLConnection, Response response) throws Type {
        try {
            String $r4 = response.getContentType();
            String $r5 = response.statusLine();
            httpsURLConnection.setRequestProperty($r4, $r5);
        } catch (IllegalStateException e) {
            StringBuilder $r7 = new StringBuilder();
            $r7.append("Cannot add header: ");
            String $r42 = response.getContentType();
            $r7.append($r42);
            $r7.append(" to request because HttpsURLConnection is already connected");
            String $r43 = $r7.toString();
            Type $r6 = new Type($r43);
            throw $r6;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final int getData(HttpsURLConnection httpsURLConnection) {
        try {
            int $i0 = httpsURLConnection.getResponseCode();
            return $i0;
        } catch (Exception e) {
            return -1;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final BufferedInputStream getInputStream(HttpsURLConnection httpsURLConnection) {
        InputStream $r1 = httpsURLConnection.getErrorStream();
        if ($r1 != null) {
            BufferedInputStream $r3 = new BufferedInputStream($r1);
            return $r3;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final WrappingExecutorService getString() {
        Settings $r3 = Settings.this$0;
        TimeUnit $r1 = TimeUnit.SECONDS;
        WrappingExecutorService $r2 = $r3.get(2, 6, 60L, $r1, "rest");
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final BufferedInputStream read(HttpsURLConnection httpsURLConnection) throws Type {
        try {
            InputStream $r4 = httpsURLConnection.getInputStream();
            BufferedInputStream $r3 = new BufferedInputStream($r4);
            return $r3;
        } catch (IOException $r5) {
            StringBuilder $r1 = new StringBuilder();
            $r1.append("I/O error occurred while creating the input stream: ");
            String $r7 = $r5.getMessage();
            $r1.append($r7);
            String $r72 = $r1.toString();
            Type $r6 = new Type($r72);
            throw $r6;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final Response read(int i) {
        if (i == 0) {
            ByteVector $r1 = new ByteVector("application/json; charset=utf-8");
            return $r1;
        } else if (i != 1) {
            String $r3 = "Cannot create header with unsupported Content-Type: " + i;
            Type $r4 = new Type($r3);
            throw $r4;
        } else {
            StringBuilder $r2 = new StringBuilder();
            $r2.append("multipart/form-data; boundary=");
            String $r32 = header;
            $r2.append($r32);
            String $r33 = $r2.toString();
            ByteVector $r12 = new ByteVector($r33);
            return $r12;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final C14326a write(HttpsURLConnection httpsURLConnection) throws Type {
        String $r8;
        int $i0 = getData(httpsURLConnection);
        System $r2 = System.f32375c;
        LogAspect $r3 = LogAspect.REST;
        LogSeverity $r4 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r2.get($r3, false, $r4);
        int $i1 = $r5.ordinal();
        if ($i1 == 0) {
            StringBuilder $r6 = new StringBuilder();
            $r6.append("Response with code: " + $i0);
            $r6.append(", [logAspect: ");
            $r6.append($r3);
            $r6.append(']');
            $r2.size($r3, $r4, "HttpClient", $r6.toString());
        }
        try {
            String $r10 = m2137a(read(httpsURLConnection));
            $r8 = $r10;
        } catch (Exception $r11) {
            BufferedInputStream $r9 = getInputStream(httpsURLConnection);
            $r8 = $r9 != null ? m2137a($r9) : null;
            System $r22 = System.f32375c;
            LogAspect $r32 = LogAspect.REST;
            LogSeverity $r42 = LogSeverity.INFO;
            TopLevel$NativeErrors $r52 = $r22.get($r32, false, $r42);
            int $i12 = $r52.ordinal();
            if ($i12 == 0) {
                StringBuilder $r62 = new StringBuilder();
                StringBuilder $r7 = new StringBuilder();
                $r7.append("Cannot read response: ");
                String $r102 = $r11.getMessage();
                $r7.append($r102);
                String $r103 = $r7.toString();
                $r62.append($r103);
                $r62.append(", [logAspect: ");
                $r62.append($r32);
                $r62.append(']');
                String $r104 = $r62.toString();
                $r22.size($r32, $r42, "HttpClient", $r104);
            }
        }
        System $r23 = System.f32375c;
        LogAspect $r33 = LogAspect.REST;
        LogSeverity $r43 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r53 = $r23.get($r33, false, $r43);
        int $i13 = $r53.ordinal();
        if ($i13 == 0) {
            StringBuilder $r63 = new StringBuilder();
            String $r105 = $r8 != null ? $r8 : "<empty response>";
            $r63.append($r105);
            $r63.append(", [logAspect: ");
            $r63.append($r33);
            $r63.append(']');
            String $r106 = $r63.toString();
            $r23.size($r33, $r43, "HttpClient", $r106);
        }
        C14326a $r12 = new C14326a($i0, $r8);
        return $r12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void write(HttpsURLConnection httpsURLConnection, lombok.org.libs.org.objectweb.asm.asm.asm.Type type) throws Type {
        C14333c $r4 = m2135a(httpsURLConnection);
        try {
            try {
                String $r5 = type.getValue();
                $r4.m2100a($r5);
                System $r6 = System.f32375c;
                LogAspect $r7 = LogAspect.REST;
                LogSeverity $r1 = LogSeverity.DEBUG;
                TopLevel$NativeErrors $r8 = $r6.get($r7, false, $r1);
                int $i0 = $r8.ordinal();
                if ($i0 == 0) {
                    StringBuilder r13 = new StringBuilder();
                    String $r52 = type.getValue();
                    r13.append($r52);
                    r13.append(", [logAspect: ");
                    r13.append($r7);
                    r13.append(']');
                    String $r53 = r13.toString();
                    $r6.size($r7, $r1, "HttpClient", $r53);
                }
            } catch (IOException $r11) {
                StringBuilder r132 = new StringBuilder();
                r132.append("I/O error occurred while writing to output stream: ");
                IOException r15 = (IOException) $r11;
                String $r54 = r15.getMessage();
                r132.append($r54);
                String $r55 = r132.toString();
                Type r14 = new Type($r55);
                throw r14;
            }
        } finally {
            $r4.m2101a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void write(lombok.org.libs.org.objectweb.asm.asm.asm.Type r26, lombok.org.libs.org.objectweb.asm.Label r27) throws java.net.MalformedURLException {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lombok.org.libs.org.objectweb.asm.Attribute.write(lombok.org.libs.org.objectweb.asm.asm.asm.Type, lombok.org.libs.org.objectweb.asm.Label):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m2138a(int i) {
        C14627c $r1 = new C14627c(i);
        String $r2 = $r1.format();
        this.f31557b = $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void read() {
        WrappingExecutorService $r1 = this.state;
        if ($r1 != null) {
            $r1.shutdown();
        }
        this.state = null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void read(lombok.org.libs.org.objectweb.asm.asm.asm.Item item, ClassReader classReader) {
        Log_OC.getArray(item, TransactionRequest.TYPE_REQUEST);
        Log_OC.getArray(classReader, "callback");
        Label $r6 = new Label(classReader);
        if (this.state == null) {
            this.state = getString();
        }
        WrappingExecutorService $r1 = this.state;
        if ($r1 == null) {
            Type $r7 = new Type("Could not enqueue post because executor is null");
            $r6.m2124e($r7);
            return;
        }
        Item $r2 = new Item(this, item, $r6);
        TimeUnit $r3 = TimeUnit.SECONDS;
        $r1.execute(classReader, $r2, 30L, $r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void read(final lombok.org.libs.org.objectweb.asm.asm.asm.Type type, ClassReader classReader) {
        Log_OC.getArray(type, TransactionRequest.TYPE_REQUEST);
        Log_OC.getArray(classReader, "callback");
        final Label $r6 = new Label(classReader);
        if (this.state == null) {
            this.state = getString();
        }
        WrappingExecutorService $r1 = this.state;
        if ($r1 == null) {
            Type $r7 = new Type("Could not enqueue post because executor is null");
            $r6.m2124e($r7);
            return;
        }
        Runnable runnable = new Runnable() { // from class: lombok.org.libs.org.objectweb.asm.EventInfoFragment$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.lang.Runnable
            public final void run() {
                Attribute $r12 = Attribute.this;
                lombok.org.libs.org.objectweb.asm.asm.asm.Type $r2 = type;
                Label $r3 = $r6;
                $r12.write($r2, $r3);
            }
        };
        TimeUnit $r3 = TimeUnit.SECONDS;
        $r1.execute(classReader, runnable, 30L, $r3);
    }
}
