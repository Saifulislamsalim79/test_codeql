package org.org.org.org.org.core.p600xy;

import android.media.MediaCodecInfo;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import java.util.LinkedList;
import java.util.List;
import org.org.org.org.asm.parser.Object;
import org.org.org.org.asm.parser.System;
/* renamed from: org.org.org.org.org.core.xy.g */
/* loaded from: classes.dex */
public abstract class AbstractC14688g {

    /* renamed from: a */
    public static final String f32710a = "a";

    /* renamed from: b */
    public static final List<String> f32711b;

    /* renamed from: c */
    public static final List<String> f32712c = new LinkedList();

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (r2 == false) goto L19;
     */
    static {
        /*
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            org.org.org.org.org.core.p600xy.AbstractC14688g.f32712c = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            org.org.org.org.org.core.p600xy.AbstractC14688g.f32711b = r0
            java.lang.String r1 = android.os.Build.HARDWARE
            java.lang.String r3 = "ranchu"
            boolean r2 = r1.equals(r3)
            if (r2 == 0) goto L22
            java.lang.String r4 = android.os.Build.BRAND
            java.lang.String r3 = "google"
            boolean r2 = r4.equals(r3)
            if (r2 != 0) goto L2c
        L22:
            java.lang.String r3 = "omx.google"
            r0.add(r3)
            java.lang.String r3 = "AVCEncoder"
            r0.add(r3)
        L2c:
            java.lang.String r3 = "OMX.ffmpeg"
            r0.add(r3)
            java.lang.String r3 = "OMX.qcom.video.encoder.hevcswvdec"
            r0.add(r3)
            java.lang.String r3 = "OMX.SEC.hevc.sw.dec"
            r0.add(r3)
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.lang.String r3 = "ranchu"
            boolean r2 = r1.equals(r3)
            if (r2 == 0) goto L57
            java.lang.String r1 = android.os.Build.BRAND
            java.lang.String r3 = "google"
            boolean r2 = r1.equals(r3)
            if (r2 == 0) goto L57
            java.lang.String r3 = "omx.google"
            r0.add(r3)
        L57:
            java.lang.String r3 = "omx.exynos"
            r0.add(r3)
            java.lang.String r3 = "OMX.qcom"
            r0.add(r3)
            java.lang.String r1 = android.os.Build.DEVICE
            java.lang.String r3 = "darcy"
            boolean r2 = r1.equalsIgnoreCase(r3)
            if (r2 == 0) goto L70
            java.lang.String r3 = "omx.nvidia"
            r0.add(r3)
        L70:
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r3 = "Amazon"
            boolean r2 = r1.equalsIgnoreCase(r3)
            if (r2 == 0) goto L84
            java.lang.String r3 = "omx.mtk"
            r0.add(r3)
            java.lang.String r3 = "omx.amlogic"
            r0.add(r3)
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.core.p600xy.AbstractC14688g.<clinit>():void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x000a */
    /* JADX WARN: Incorrect condition in loop: B:7:0x0020 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.media.MediaCodecInfo m772a() {
        /*
            java.util.List<java.lang.String> r0 = org.org.org.org.org.core.p600xy.AbstractC14688g.f32712c
            java.util.Iterator r1 = r0.iterator()
        L6:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L48
            java.lang.Object r3 = r1.next()
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5
            r4 = r5
            java.util.LinkedList r6 = build()
            java.util.Iterator r7 = r6.iterator()
        L1c:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L6
            java.lang.Object r3 = r7.next()
            r9 = r3
            android.media.MediaCodecInfo r9 = (android.media.MediaCodecInfo) r9
            r8 = r9
            boolean r2 = r8.isEncoder()
            if (r2 != 0) goto L31
            goto L1c
        L31:
            java.lang.String r10 = r8.getName()
            boolean r2 = r4.equalsIgnoreCase(r10)
            if (r2 == 0) goto L1c
            com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect r11 = com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect.VIDEO_ENCODING
            java.lang.String r4 = org.org.org.org.org.core.p600xy.AbstractC14688g.f32710a
            org.org.org.org.org.core.xy.j r12 = new org.org.org.org.org.core.xy.j
            r12.<init>()
            org.org.org.org.asm.parser.System.m1063a(r11, r4, r12)
            return r8
        L48:
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.core.p600xy.AbstractC14688g.m772a():android.media.MediaCodecInfo");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static MediaCodecInfo m771a(int i) {
        LogAspect $r0 = LogAspect.VIDEO_ENCODING;
        String $r1 = f32710a;
        ClassWriter $r3 = ClassWriter.f32701b;
        System.m1063a($r0, $r1, $r3);
        MediaCodecInfo $r4 = m760c("video/avc", i);
        MediaCodecInfo $r5 = $r4;
        if ($r4 == null) {
            C14683b $r6 = C14683b.f32705c;
            System.m1063a($r0, $r1, $r6);
            $r5 = m769a("video/avc");
        }
        if ($r5 == null) {
            C14684c $r7 = C14684c.f32706d;
            System.m1063a($r0, $r1, $r7);
            return $r5;
        }
        final String $r8 = $r5.getName();
        final String $r9 = $r5.toString();
        System.m1063a($r0, $r1, new Object() { // from class: org.org.org.org.org.core.xy.x
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // org.org.org.org.asm.parser.Object
            /* renamed from: a */
            public final String mo759a() {
                String $r2 = $r8;
                String $r12 = $r9;
                return AbstractC14688g.m763b($r2, $r12);
            }
        });
        return $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x000c */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.media.MediaCodecInfo m769a(java.lang.String r15) {
        /*
            java.util.LinkedList r0 = build()
            java.util.Iterator r1 = r0.iterator()
        L8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L56
            java.lang.Object r3 = r1.next()
            r5 = r3
            android.media.MediaCodecInfo r5 = (android.media.MediaCodecInfo) r5
            r4 = r5
            boolean r2 = r4.isEncoder()
            if (r2 != 0) goto L1d
            goto L8
        L1d:
            java.util.List<java.lang.String> r6 = org.org.org.org.org.core.p600xy.AbstractC14688g.f32711b
            java.lang.String r7 = r4.getName()
            boolean r2 = m766a(r6, r7)
            if (r2 == 0) goto L36
            com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect r8 = com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect.VIDEO_ENCODING
            java.lang.String r7 = org.org.org.org.org.core.p600xy.AbstractC14688g.f32710a
            org.org.org.org.org.core.xy.d r9 = new org.org.org.org.org.core.xy.d
            r9.<init>()
            org.org.org.org.asm.parser.System.m1063a(r8, r7, r9)
            goto L8
        L36:
            java.lang.String[] r10 = r4.getSupportedTypes()
            int r11 = r10.length
            r12 = 0
        L3c:
            if (r12 >= r11) goto L8
            r7 = r10[r12]
            boolean r2 = r7.equalsIgnoreCase(r15)
            if (r2 == 0) goto L53
            com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect r8 = com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect.VIDEO_ENCODING
            java.lang.String r15 = org.org.org.org.org.core.p600xy.AbstractC14688g.f32710a
            org.org.org.org.org.core.xy.w r13 = new org.org.org.org.org.core.xy.w
            r13.<init>()
            org.org.org.org.asm.parser.System.m1063a(r8, r15, r13)
            return r4
        L53:
            int r12 = r12 + 1
            goto L3c
        L56:
            r14 = 0
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.core.p600xy.AbstractC14688g.m769a(java.lang.String):android.media.MediaCodecInfo");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x000c */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.media.MediaCodecInfo m768a(java.lang.String r27, int r28) throws java.lang.Exception {
        /*
            java.util.LinkedList r2 = build()
            java.util.Iterator r3 = r2.iterator()
        L8:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lac
            java.lang.Object r5 = r3.next()
            r7 = r5
            android.media.MediaCodecInfo r7 = (android.media.MediaCodecInfo) r7
            r6 = r7
            boolean r4 = r6.isEncoder()
            if (r4 != 0) goto L1d
            goto L8
        L1d:
            java.util.List<java.lang.String> r8 = org.org.org.org.org.core.p600xy.AbstractC14688g.f32711b
            java.lang.String r9 = r6.getName()
            boolean r4 = m766a(r8, r9)
            if (r4 == 0) goto L36
            com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect r10 = com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect.VIDEO_ENCODING
            java.lang.String r9 = org.org.org.org.org.core.p600xy.AbstractC14688g.f32710a
            org.org.org.org.org.core.xy.l r11 = new org.org.org.org.org.core.xy.l
            r11.<init>()
            org.org.org.org.asm.parser.System.m1063a(r10, r9, r11)
            goto L8
        L36:
            java.lang.String[] r12 = r6.getSupportedTypes()
            int r13 = r12.length
            r14 = 0
        L3c:
            if (r14 >= r13) goto L8
            r9 = r12[r14]
            r0 = r27
            boolean r4 = r9.equalsIgnoreCase(r0)
            if (r4 == 0) goto La9
            com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect r10 = com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect.VIDEO_ENCODING
            java.lang.String r15 = org.org.org.org.org.core.p600xy.AbstractC14688g.f32710a
            org.org.org.org.org.core.xy.h r16 = new org.org.org.org.org.core.xy.h
            r0 = r16
            r0.<init>()
            r0 = r16
            org.org.org.org.asm.parser.System.m1063a(r10, r15, r0)
            android.media.MediaCodecInfo$CodecCapabilities r17 = r6.getCapabilitiesForType(r9)
            r18 = -1
            r0 = r28
            r1 = r18
            if (r0 == r1) goto La8
            r0 = r17
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r0.profileLevels
            r19 = r0
            int r0 = r0.length
            r20 = r0
            r21 = 0
        L6f:
            r0 = r21
            r1 = r20
            if (r0 >= r1) goto L97
            r22 = r19[r21]
            r0 = r22
            int r0 = r0.profile
            r23 = r0
            r1 = r28
            if (r0 != r1) goto L94
            com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect r10 = com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect.VIDEO_ENCODING
            java.lang.String r27 = org.org.org.org.org.core.p600xy.AbstractC14688g.f32710a
            org.org.org.org.org.core.xy.a r24 = new org.org.org.org.org.core.xy.a
            r0 = r24
            r0.<init>()
            r0 = r27
            r1 = r24
            org.org.org.org.asm.parser.System.m1063a(r10, r0, r1)
            return r6
        L94:
            int r21 = r21 + 1
            goto L6f
        L97:
            com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect r10 = com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect.VIDEO_ENCODING
            java.lang.String r9 = org.org.org.org.org.core.p600xy.AbstractC14688g.f32710a
            org.org.org.org.org.core.xy.e r25 = new org.org.org.org.org.core.xy.e
            r0 = r25
            r0.<init>()
            r0 = r25
            org.org.org.org.asm.parser.System.m1063a(r10, r9, r0)
            goto La9
        La8:
            return r6
        La9:
            int r14 = r14 + 1
            goto L3c
        Lac:
            r26 = 0
            return r26
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.core.p600xy.AbstractC14688g.m768a(java.lang.String, int):android.media.MediaCodecInfo");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0008 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m766a(java.util.List r9, java.lang.String r10) {
        /*
            java.util.Iterator r0 = r9.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r2 = r0.next()
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            r3 = r4
            int r5 = r10.length()
            int r6 = r3.length()
            if (r5 < r6) goto L4
            int r5 = r3.length()
            r8 = 0
            java.lang.String r7 = r10.substring(r8, r5)
            boolean r1 = r7.equalsIgnoreCase(r3)
            if (r1 == 0) goto L4
            r8 = 1
            return r8
        L2d:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.core.p600xy.AbstractC14688g.m766a(java.util.List, java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public static /* synthetic */ String m763b(String str, String str2) {
        String $r2 = "Find avc encoder returning: encoderName = " + str + ", encoderToString = " + str2;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:7:0x001e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.LinkedList build() {
        /*
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 0
            r3 = 21
            if (r1 < r3) goto L1a
            android.media.MediaCodecList r4 = new android.media.MediaCodecList
            r3 = 0
            r4.<init>(r3)
            android.media.MediaCodecInfo[] r5 = r4.getCodecInfos()
            java.util.Collections.addAll(r0, r5)
            return r0
        L1a:
            int r1 = android.media.MediaCodecList.getCodecCount()
            if (r2 >= r1) goto L2a
            android.media.MediaCodecInfo r6 = android.media.MediaCodecList.getCodecInfoAt(r2)
            r0.add(r6)
            int r2 = r2 + 1
            goto L1a
        L2a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.core.p600xy.AbstractC14688g.build():java.util.LinkedList");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    private static MediaCodecInfo m760c(String str, int i) {
        MediaCodecInfo $r2 = m772a();
        if ($r2 != null) {
            return $r2;
        }
        try {
            return m768a(str, i);
        } catch (Exception e) {
            return m769a(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ String format(MediaCodecInfo mediaCodecInfo) {
        StringBuilder $r0 = new StringBuilder();
        $r0.append("Skipping blacklisted encoder: codecName = ");
        String $r2 = mediaCodecInfo.getName();
        $r0.append($r2);
        String $r22 = $r0.toString();
        return $r22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ String get(MediaCodecInfo mediaCodecInfo) {
        StringBuilder $r0 = new StringBuilder();
        $r0.append("First encoder choice: codecName = ");
        String $r2 = mediaCodecInfo.getName();
        $r0.append($r2);
        String $r22 = $r0.toString();
        return $r22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ String getEntry(MediaCodecInfo mediaCodecInfo) {
        StringBuilder $r0 = new StringBuilder();
        $r0.append("Preferred encoder choice is: codecName = ");
        String $r2 = mediaCodecInfo.getName();
        $r0.append($r2);
        String $r22 = $r0.toString();
        return $r22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String getId() {
        return "Find avc encoder: encoder null -> find first";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ String getId(MediaCodecInfo mediaCodecInfo) {
        StringBuilder $r0 = new StringBuilder();
        $r0.append("Examining encoder capabilities: codecName = ");
        String $r2 = mediaCodecInfo.getName();
        $r0.append($r2);
        String $r22 = $r0.toString();
        return $r22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String getString() {
        return "Find avc encoder: encoder null -> did not find anything";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ String getText(MediaCodecInfo mediaCodecInfo) {
        StringBuilder $r0 = new StringBuilder();
        $r0.append("Encoder ");
        String $r2 = mediaCodecInfo.getName();
        $r0.append($r2);
        $r0.append(" does NOT support required profile");
        String $r22 = $r0.toString();
        return $r22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ String replace(MediaCodecInfo mediaCodecInfo) {
        StringBuilder $r0 = new StringBuilder();
        $r0.append("Skipping blacklisted encoder: codecName = ");
        String $r2 = mediaCodecInfo.getName();
        $r0.append($r2);
        String $r22 = $r0.toString();
        return $r22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String substring() {
        return "Starting findAvcEncoder() ";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ String wrap(MediaCodecInfo mediaCodecInfo) {
        StringBuilder $r0 = new StringBuilder();
        $r0.append("Encoder ");
        String $r2 = mediaCodecInfo.getName();
        $r0.append($r2);
        $r0.append(" supports required profile");
        String $r22 = $r0.toString();
        return $r22;
    }
}
