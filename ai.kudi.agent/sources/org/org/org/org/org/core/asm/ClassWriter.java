package org.org.org.org.org.core.asm;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaCodec;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import e.a.a.a.c.o.f.t;
import e.a.a.a.f.u.o;
import java.io.File;
import java.util.ArrayList;
import org.org.org.org.asm.asm.C14586c;
import org.org.org.org.asm.parser.Log;
import org.org.org.org.asm.parser.Object;
import org.org.org.org.asm.parser.System;
import org.org.org.org.org.initializer.C14708f;
import org.org.org.org.org.menu.C14714h;
import org.org.org.org.xml.core.util.Context;
/* loaded from: classes.dex */
public class ClassWriter extends Item {

    /* renamed from: a */
    public static final String f32592a = "a";

    /* renamed from: h */
    public static boolean f32593h;

    /* renamed from: i */
    public static int f32594i;

    /* renamed from: y */
    public static int f32595y;

    /* renamed from: E */
    public String f32596E;

    /* renamed from: b */
    public InterfaceC14659i f32597b;

    /* renamed from: c */
    public ArrayList<o> f32598c;

    /* renamed from: e */
    public long f32599e;

    /* renamed from: k */
    public org.org.org.org.org.data.Label f32600k;

    /* renamed from: l */
    public String f32601l;

    /* renamed from: m */
    public Context f32602m;

    /* renamed from: n */
    public C14714h f32603n;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        String $r2 = t.class.getSimpleName();
        C14708f $r3 = C14708f.f32807a;
        org.org.org.org.org.data.Label $r4 = $r3.size();
        int $i0 = $r4.getColor();
        f32595y = $i0;
        LogAspect $r5 = LogAspect.VIDEO_ENCODING;
        Direction $r0 = Direction.f32604E;
        System.add($r5, $r2, $r0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ClassWriter(Context context, InterfaceC14659i interfaceC14659i) {
        ArrayList $r3 = new ArrayList();
        this.f32598c = $r3;
        C14714h $r4 = C14708f.findItem();
        this.f32603n = $r4;
        org.org.org.org.org.data.Label $r5 = C14708f.addIntentOptions();
        this.f32600k = $r5;
        this.f32602m = context;
        this.f32597b = interfaceC14659i;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private long m886a(final int i) {
        final long $l1 = 0;
        if (i == 0) {
            this.f32599e = 0L;
        } else {
            ArrayList $r2 = this.f32598c;
            Object $r3 = $r2.get(i);
            C14586c $r4 = (C14586c) $r3;
            long $l2 = $r4.m1130b();
            long $l12 = this.f32599e;
            $l1 = ($l2 * 1000) + $l12;
            this.f32599e = $l1;
        }
        LogAspect $r5 = LogAspect.VIDEO_ENCODING;
        String $r1 = f32592a;
        System.m1063a($r5, $r1, new Object() { // from class: org.org.org.org.org.core.asm.e
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // org.org.org.org.asm.parser.Object
            /* renamed from: a */
            public final String mo759a() {
                int $i1 = i;
                long $l0 = $l1;
                String $r12 = ClassWriter.m873b($i1, $l0);
                return $r12;
            }
        });
        return $l1;
    }

    /* renamed from: a */
    public static void m884a(int i, Integer num) {
        m880a(num);
        visitInnerClass(i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private static void m880a(final Integer num) {
        boolean $z0 = f32593h;
        if (!$z0 || num == null) {
            return;
        }
        int $i0 = num.intValue();
        f32594i = $i0;
        LogAspect $r3 = LogAspect.VIDEO_ENCODING;
        String $r1 = f32592a;
        System.add($r3, $r1, new Object() { // from class: org.org.org.org.org.core.asm.w
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // org.org.org.org.asm.parser.Object
            /* renamed from: a */
            public final String mo759a() {
                Integer $r2 = num;
                String $r12 = ClassWriter.format($r2);
                return $r12;
            }
        });
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static void m879a(Integer num, Integer num2) {
        if (num == null) {
            f32593h = true;
            int $i0 = num2.intValue();
            f32594i = $i0;
        } else {
            f32593h = false;
            int $i02 = num.intValue();
            f32594i = $i02;
        }
        LogAspect $r3 = LogAspect.VIDEO_ENCODING;
        String $r4 = f32592a;
        Type $r0 = Type.TOP;
        System.add($r3, $r4, $r0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03db  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m876a(java.io.File[] r68, int r69, int r70, java.lang.String r71) {
        /*
            Method dump skipped, instructions count: 1037
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.core.asm.ClassWriter.m876a(java.io.File[], int, int, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public static /* synthetic */ String m873b(int i, long j) {
        String $r1 = "Computed presentation time: frameIndex = " + i + ", presentationTime = " + j;
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public static /* synthetic */ String m872b(int i, C14586c c14586c) {
        StringBuilder $r1 = new StringBuilder();
        $r1.append("Loaded video setting : ");
        $r1.append(i);
        $r1.append(" ");
        long $l1 = c14586c.m1130b();
        $r1.append($l1);
        String $r2 = $r1.toString();
        return $r2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public static /* synthetic */ String m866c(MediaCodec.BufferInfo bufferInfo) {
        StringBuilder $r0 = new StringBuilder();
        $r0.append("Muxer write: presentationTimeUs = ");
        long $l0 = bufferInfo.presentationTimeUs;
        $r0.append($l0);
        String $r1 = $r0.toString();
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public static /* synthetic */ String m865c(File file) {
        String $r1 = "sessionRecordingResponseFiles : " + file;
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public static /* synthetic */ String m864c(Exception exc) {
        StringBuilder $r0 = new StringBuilder();
        $r0.append("startRenderingTask failed on exception = ");
        String $r2 = Log.remove(exc);
        $r0.append($r2);
        String $r22 = $r0.toString();
        return $r22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public static /* synthetic */ String m863c(String str) {
        String $r1 = "Codec found finalCodecName = " + str;
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public static /* synthetic */ String m861d() {
        StringBuilder $r0 = new StringBuilder();
        $r0.append("Frame rate setup: frameRate = ");
        int $i0 = f32594i;
        $r0.append($i0);
        $r0.append(", allowFrameRateChange = ");
        boolean $z0 = f32593h;
        String $r1 = Boolean.toString($z0);
        $r0.append($r1);
        String $r12 = $r0.toString();
        return $r12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* synthetic */ String format() {
        StringBuilder $r1 = new StringBuilder();
        $r1.append("startRenderingTask failed on ");
        Context $r2 = this.f32602m;
        String $r3 = $r2.getName();
        $r1.append($r3);
        String $r32 = $r1.toString();
        return $r32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ String format(int i) {
        String $r1 = "sessionRecordingResponseFiles.length : " + i;
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ String format(Integer num) {
        String $r1 = "Set new framerate: frameRate = " + num;
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private static Bitmap get(String str, int i, int i2) {
        Bitmap $r1 = getBitmap(str, i, i2);
        int $i2 = $r1.getWidth();
        if ($i2 == i) {
            int $i22 = $r1.getHeight();
            if ($i22 == i2) {
                return $r1;
            }
        }
        Bitmap $r2 = Bitmap.createScaledBitmap($r1, i, i2, false);
        $r1.recycle();
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private static Bitmap getBitmap(String str, int i, int i2) {
        BitmapFactory.Options $r0 = new BitmapFactory.Options();
        $r0.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, $r0);
        int $i1 = getScale($r0, i, i2);
        $r0.inSampleSize = $i1;
        $r0.inJustDecodeBounds = false;
        Bitmap.Config $r2 = Bitmap.Config.RGB_565;
        $r0.inPreferredConfig = $r2;
        $r0.inDither = true;
        Bitmap $r3 = BitmapFactory.decodeFile(str, $r0);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:7:0x000f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int getScale(android.graphics.BitmapFactory.Options r5, int r6, int r7) {
        /*
            int r0 = r5.outHeight
            int r1 = r5.outWidth
            r2 = 1
            if (r0 > r7) goto L9
            if (r1 <= r6) goto L18
        L9:
            int r0 = r0 / 2
            int r1 = r1 / 2
        Ld:
            int r3 = r0 / r2
            if (r3 <= r7) goto L1a
            int r3 = r1 / r2
            if (r3 <= r6) goto L1a
            int r2 = r2 * 2
            goto Ld
        L18:
            r4 = 1
            return r4
        L1a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.core.asm.ClassWriter.getScale(android.graphics.BitmapFactory$Options, int, int):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ String getStackTrace(String str) {
        String $r1 = "Adding frame at path = " + str;
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String getString() {
        return "No output from encoder available";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String getSubscription() {
        return " Ignoring BUFFER_FLAG_CODEC_CONFIG";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String getText() {
        return "Encoder output buffers changed";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* synthetic */ String put() {
        StringBuilder $r1 = new StringBuilder();
        $r1.append("startRenderingTask on session ");
        Context $r2 = this.f32602m;
        String $r3 = $r2.getName();
        $r1.append($r3);
        $r1.append(" recordIndex ");
        Context $r22 = this.f32602m;
        int $i0 = $r22.m449a();
        $r1.append($i0);
        String $r32 = $r1.toString();
        return $r32;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private static void put(String str) {
        RuntimeException $r1 = new RuntimeException(str);
        throw $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* synthetic */ String read() {
        StringBuilder $r1 = new StringBuilder();
        $r1.append("startRenderingTask failed, no config is saved for this recordIndex ");
        Context $r2 = this.f32602m;
        int $i0 = $r2.m449a();
        $r1.append($i0);
        $r1.append(" session ");
        Context $r22 = this.f32602m;
        String $r3 = $r22.getName();
        $r1.append($r3);
        String $r32 = $r1.toString();
        return $r32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public /* synthetic */ String replace() {
        StringBuilder $r1 = new StringBuilder();
        $r1.append("startRenderingTask finished successfully on ");
        Context $r2 = this.f32602m;
        String $r3 = $r2.getName();
        $r1.append($r3);
        String $r32 = $r1.toString();
        return $r32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ String replace(int i) {
        String $r1 = "Set new bitrate: bitrate = " + i;
        return $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ String substring() {
        StringBuilder $r1 = new StringBuilder();
        $r1.append("Bitrate setup: bitrate = ");
        int $i0 = f32595y;
        $r1.append($i0);
        String $r0 = $r1.toString();
        return $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private static void visitInnerClass(final int i) {
        LogAspect $r0 = LogAspect.VIDEO_ENCODING;
        String $r1 = f32592a;
        System.add($r0, $r1, new Object() { // from class: org.org.org.org.org.core.asm.FieldWriter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // org.org.org.org.asm.parser.Object
            /* renamed from: a */
            public final String mo759a() {
                int $i0 = i;
                String $r12 = ClassWriter.replace($i0);
                return $r12;
            }
        });
        f32595y = i;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:53:0x0198 */
    /* JADX WARN: Incorrect condition in loop: B:73:0x0264 */
    /* JADX WARN: Removed duplicated region for block: B:62:0x021f  */
    @Override // org.org.org.org.org.core.asm.Item
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo860a() {
        /*
            Method dump skipped, instructions count: 836
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.core.asm.ClassWriter.mo860a():void");
    }
}
