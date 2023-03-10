package com.google.protobuf;

import ai.kudi.agent.core.util.printer.PrinterCommands;
import java.nio.ByteBuffer;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Utf8.java */
/* renamed from: com.google.protobuf.s1 */
/* loaded from: classes2.dex */
public final class C7110s1 {

    /* renamed from: a */
    private static final AbstractC7112b f16944a;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Utf8.java */
    /* renamed from: com.google.protobuf.s1$a */
    /* loaded from: classes2.dex */
    public static class C7111a {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public static void m19603h(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (!m19598m(b2) && (((b << PrinterCommands.OTHER_SYMBOL) + (b2 + 112)) >> 30) == 0 && !m19598m(b3) && !m19598m(b4)) {
                int m19593r = ((b & 7) << 18) | (m19593r(b2) << 12) | (m19593r(b3) << 6) | m19593r(b4);
                cArr[i] = m19599l(m19593r);
                cArr[i + 1] = m19594q(m19593r);
                return;
            }
            throw InvalidProtocolBufferException.m20254e();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public static void m19602i(byte b, char[] cArr, int i) {
            cArr[i] = (char) b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public static void m19601j(byte b, byte b2, byte b3, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (!m19598m(b2) && ((b != -32 || b2 >= -96) && ((b != -19 || b2 < -96) && !m19598m(b3)))) {
                cArr[i] = (char) (((b & 15) << 12) | (m19593r(b2) << 6) | m19593r(b3));
                return;
            }
            throw InvalidProtocolBufferException.m20254e();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public static void m19600k(byte b, byte b2, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (b >= -62 && !m19598m(b2)) {
                cArr[i] = (char) (((b & PrinterCommands.CEIL) << 6) | m19593r(b2));
                return;
            }
            throw InvalidProtocolBufferException.m20254e();
        }

        /* renamed from: l */
        private static char m19599l(int i) {
            return (char) ((i >>> 10) + 55232);
        }

        /* renamed from: m */
        private static boolean m19598m(byte b) {
            return b > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public static boolean m19597n(byte b) {
            return b >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public static boolean m19596o(byte b) {
            return b < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p */
        public static boolean m19595p(byte b) {
            return b < -32;
        }

        /* renamed from: q */
        private static char m19594q(int i) {
            return (char) ((i & 1023) + 56320);
        }

        /* renamed from: r */
        private static int m19593r(byte b) {
            return b & 63;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Utf8.java */
    /* renamed from: com.google.protobuf.s1$b */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC7112b {
        AbstractC7112b() {
        }

        /* renamed from: j */
        private static int m19587j(ByteBuffer byteBuffer, int i, int i2) {
            int m19619l = i + C7110s1.m19619l(byteBuffer, i, i2);
            while (m19619l < i2) {
                int i3 = m19619l + 1;
                byte b = byteBuffer.get(m19619l);
                if (b < 0) {
                    if (b < -32) {
                        if (i3 >= i2) {
                            return b;
                        }
                        if (b < -62 || byteBuffer.get(i3) > -65) {
                            return -1;
                        }
                        i3++;
                    } else if (b >= -16) {
                        if (i3 >= i2 - 2) {
                            return C7110s1.m19615p(byteBuffer, b, i3, i2 - i3);
                        }
                        int i4 = i3 + 1;
                        byte b2 = byteBuffer.get(i3);
                        if (b2 <= -65 && (((b << PrinterCommands.OTHER_SYMBOL) + (b2 + 112)) >> 30) == 0) {
                            int i5 = i4 + 1;
                            if (byteBuffer.get(i4) <= -65) {
                                i3 = i5 + 1;
                                if (byteBuffer.get(i5) > -65) {
                                }
                            }
                        }
                        return -1;
                    } else if (i3 >= i2 - 1) {
                        return C7110s1.m19615p(byteBuffer, b, i3, i2 - i3);
                    } else {
                        int i6 = i3 + 1;
                        byte b3 = byteBuffer.get(i3);
                        if (b3 > -65 || ((b == -32 && b3 < -96) || ((b == -19 && b3 >= -96) || byteBuffer.get(i6) > -65))) {
                            return -1;
                        }
                        m19619l = i6 + 1;
                    }
                }
                m19619l = i3;
            }
            return 0;
        }

        /* renamed from: a */
        final String m19592a(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            if (byteBuffer.hasArray()) {
                return mo19583b(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
            } else if (byteBuffer.isDirect()) {
                return mo19582d(byteBuffer, i, i2);
            } else {
                return m19591c(byteBuffer, i, i2);
            }
        }

        /* renamed from: b */
        abstract String mo19583b(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException;

        /* renamed from: c */
        final String m19591c(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (i < i3) {
                    byte b = byteBuffer.get(i);
                    if (!C7111a.m19597n(b)) {
                        break;
                    }
                    i++;
                    C7111a.m19602i(b, cArr, i4);
                    i4++;
                }
                int i5 = i4;
                while (i < i3) {
                    int i6 = i + 1;
                    byte b2 = byteBuffer.get(i);
                    if (C7111a.m19597n(b2)) {
                        int i7 = i5 + 1;
                        C7111a.m19602i(b2, cArr, i5);
                        while (i6 < i3) {
                            byte b3 = byteBuffer.get(i6);
                            if (!C7111a.m19597n(b3)) {
                                break;
                            }
                            i6++;
                            C7111a.m19602i(b3, cArr, i7);
                            i7++;
                        }
                        i = i6;
                        i5 = i7;
                    } else if (C7111a.m19595p(b2)) {
                        if (i6 < i3) {
                            C7111a.m19600k(b2, byteBuffer.get(i6), cArr, i5);
                            i = i6 + 1;
                            i5++;
                        } else {
                            throw InvalidProtocolBufferException.m20254e();
                        }
                    } else if (C7111a.m19596o(b2)) {
                        if (i6 < i3 - 1) {
                            int i8 = i6 + 1;
                            C7111a.m19601j(b2, byteBuffer.get(i6), byteBuffer.get(i8), cArr, i5);
                            i = i8 + 1;
                            i5++;
                        } else {
                            throw InvalidProtocolBufferException.m20254e();
                        }
                    } else if (i6 < i3 - 2) {
                        int i9 = i6 + 1;
                        byte b4 = byteBuffer.get(i6);
                        int i10 = i9 + 1;
                        C7111a.m19603h(b2, b4, byteBuffer.get(i9), byteBuffer.get(i10), cArr, i5);
                        i = i10 + 1;
                        i5 = i5 + 1 + 1;
                    } else {
                        throw InvalidProtocolBufferException.m20254e();
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }

        /* renamed from: d */
        abstract String mo19582d(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException;

        /* renamed from: e */
        abstract int mo19581e(CharSequence charSequence, byte[] bArr, int i, int i2);

        /* renamed from: f */
        final boolean m19590f(ByteBuffer byteBuffer, int i, int i2) {
            return m19588h(0, byteBuffer, i, i2) == 0;
        }

        /* renamed from: g */
        final boolean m19589g(byte[] bArr, int i, int i2) {
            return mo19580i(0, bArr, i, i2) == 0;
        }

        /* renamed from: h */
        final int m19588h(int i, ByteBuffer byteBuffer, int i2, int i3) {
            if (byteBuffer.hasArray()) {
                int arrayOffset = byteBuffer.arrayOffset();
                return mo19580i(i, byteBuffer.array(), i2 + arrayOffset, arrayOffset + i3);
            } else if (byteBuffer.isDirect()) {
                return mo19579l(i, byteBuffer, i2, i3);
            } else {
                return m19586k(i, byteBuffer, i2, i3);
            }
        }

        /* renamed from: i */
        abstract int mo19580i(int i, byte[] bArr, int i2, int i3);

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
            if (r8.get(r9) > (-65)) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x004c, code lost:
            if (r8.get(r9) > (-65)) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x008b, code lost:
            if (r8.get(r9) > (-65)) goto L51;
         */
        /* renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        final int m19586k(int r7, java.nio.ByteBuffer r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L8e
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1e
                r7 = -62
                if (r0 < r7) goto L1d
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
                goto L1d
            L1a:
                r9 = r7
                goto L8e
            L1d:
                return r2
            L1e:
                r4 = -16
                if (r0 >= r4) goto L4f
                int r7 = r7 >> 8
                r7 = r7 ^ r2
                byte r7 = (byte) r7
                if (r7 != 0) goto L38
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r7 < r10) goto L35
                int r7 = com.google.protobuf.C7110s1.m19630a(r0, r9)
                return r7
            L35:
                r5 = r9
                r9 = r7
                r7 = r5
            L38:
                if (r7 > r3) goto L4e
                r4 = -96
                if (r0 != r1) goto L40
                if (r7 < r4) goto L4e
            L40:
                r1 = -19
                if (r0 != r1) goto L46
                if (r7 >= r4) goto L4e
            L46:
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
            L4e:
                return r2
            L4f:
                int r1 = r7 >> 8
                r1 = r1 ^ r2
                byte r1 = (byte) r1
                r4 = 0
                if (r1 != 0) goto L65
                int r7 = r9 + 1
                byte r1 = r8.get(r9)
                if (r7 < r10) goto L63
                int r7 = com.google.protobuf.C7110s1.m19630a(r0, r1)
                return r7
            L63:
                r9 = r7
                goto L68
            L65:
                int r7 = r7 >> 16
                byte r4 = (byte) r7
            L68:
                if (r4 != 0) goto L78
                int r7 = r9 + 1
                byte r4 = r8.get(r9)
                if (r7 < r10) goto L77
                int r7 = com.google.protobuf.C7110s1.m19629b(r0, r1, r4)
                return r7
            L77:
                r9 = r7
            L78:
                if (r1 > r3) goto L8d
                int r7 = r0 << 28
                int r1 = r1 + 112
                int r7 = r7 + r1
                int r7 = r7 >> 30
                if (r7 != 0) goto L8d
                if (r4 > r3) goto L8d
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
            L8d:
                return r2
            L8e:
                int r7 = m19587j(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7110s1.AbstractC7112b.m19586k(int, java.nio.ByteBuffer, int, int):int");
        }

        /* renamed from: l */
        abstract int mo19579l(int i, ByteBuffer byteBuffer, int i2, int i3);
    }

    /* compiled from: Utf8.java */
    /* renamed from: com.google.protobuf.s1$c */
    /* loaded from: classes2.dex */
    static final class C7113c extends AbstractC7112b {
        C7113c() {
        }

        /* renamed from: m */
        private static int m19585m(byte[] bArr, int i, int i2) {
            while (i < i2 && bArr[i] >= 0) {
                i++;
            }
            if (i >= i2) {
                return 0;
            }
            return m19584n(bArr, i, i2);
        }

        /* renamed from: n */
        private static int m19584n(byte[] bArr, int i, int i2) {
            while (i < i2) {
                int i3 = i + 1;
                byte b = bArr[i];
                if (b < 0) {
                    if (b < -32) {
                        if (i3 >= i2) {
                            return b;
                        }
                        if (b >= -62) {
                            i = i3 + 1;
                            if (bArr[i3] > -65) {
                            }
                        }
                        return -1;
                    } else if (b >= -16) {
                        if (i3 >= i2 - 2) {
                            return C7110s1.m19614q(bArr, i3, i2);
                        }
                        int i4 = i3 + 1;
                        byte b2 = bArr[i3];
                        if (b2 <= -65 && (((b << PrinterCommands.OTHER_SYMBOL) + (b2 + 112)) >> 30) == 0) {
                            int i5 = i4 + 1;
                            if (bArr[i4] <= -65) {
                                i3 = i5 + 1;
                                if (bArr[i5] > -65) {
                                }
                            }
                        }
                        return -1;
                    } else if (i3 >= i2 - 1) {
                        return C7110s1.m19614q(bArr, i3, i2);
                    } else {
                        int i6 = i3 + 1;
                        byte b3 = bArr[i3];
                        if (b3 <= -65 && ((b != -32 || b3 >= -96) && (b != -19 || b3 < -96))) {
                            i = i6 + 1;
                            if (bArr[i6] > -65) {
                            }
                        }
                        return -1;
                    }
                }
                i = i3;
            }
            return 0;
        }

        @Override // com.google.protobuf.C7110s1.AbstractC7112b
        /* renamed from: b */
        String mo19583b(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (i < i3) {
                    byte b = bArr[i];
                    if (!C7111a.m19597n(b)) {
                        break;
                    }
                    i++;
                    C7111a.m19602i(b, cArr, i4);
                    i4++;
                }
                int i5 = i4;
                while (i < i3) {
                    int i6 = i + 1;
                    byte b2 = bArr[i];
                    if (C7111a.m19597n(b2)) {
                        int i7 = i5 + 1;
                        C7111a.m19602i(b2, cArr, i5);
                        while (i6 < i3) {
                            byte b3 = bArr[i6];
                            if (!C7111a.m19597n(b3)) {
                                break;
                            }
                            i6++;
                            C7111a.m19602i(b3, cArr, i7);
                            i7++;
                        }
                        i = i6;
                        i5 = i7;
                    } else if (C7111a.m19595p(b2)) {
                        if (i6 < i3) {
                            C7111a.m19600k(b2, bArr[i6], cArr, i5);
                            i = i6 + 1;
                            i5++;
                        } else {
                            throw InvalidProtocolBufferException.m20254e();
                        }
                    } else if (C7111a.m19596o(b2)) {
                        if (i6 < i3 - 1) {
                            int i8 = i6 + 1;
                            C7111a.m19601j(b2, bArr[i6], bArr[i8], cArr, i5);
                            i = i8 + 1;
                            i5++;
                        } else {
                            throw InvalidProtocolBufferException.m20254e();
                        }
                    } else if (i6 < i3 - 2) {
                        int i9 = i6 + 1;
                        byte b4 = bArr[i6];
                        int i10 = i9 + 1;
                        C7111a.m19603h(b2, b4, bArr[i9], bArr[i10], cArr, i5);
                        i = i10 + 1;
                        i5 = i5 + 1 + 1;
                    } else {
                        throw InvalidProtocolBufferException.m20254e();
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }

        @Override // com.google.protobuf.C7110s1.AbstractC7112b
        /* renamed from: d */
        String mo19582d(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            return m19591c(byteBuffer, i, i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
            return r10 + r0;
         */
        @Override // com.google.protobuf.C7110s1.AbstractC7112b
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int mo19581e(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
            /*
                Method dump skipped, instructions count: 254
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7110s1.C7113c.mo19581e(java.lang.CharSequence, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
            if (r8[r9] > (-65)) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
            if (r8[r9] > (-65)) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x007f, code lost:
            if (r8[r9] > (-65)) goto L51;
         */
        @Override // com.google.protobuf.C7110s1.AbstractC7112b
        /* renamed from: i */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int mo19580i(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L82
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1c
                r7 = -62
                if (r0 < r7) goto L1b
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
                goto L1b
            L18:
                r9 = r7
                goto L82
            L1b:
                return r2
            L1c:
                r4 = -16
                if (r0 >= r4) goto L49
                int r7 = r7 >> 8
                r7 = r7 ^ r2
                byte r7 = (byte) r7
                if (r7 != 0) goto L34
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L31
                int r7 = com.google.protobuf.C7110s1.m19630a(r0, r9)
                return r7
            L31:
                r5 = r9
                r9 = r7
                r7 = r5
            L34:
                if (r7 > r3) goto L48
                r4 = -96
                if (r0 != r1) goto L3c
                if (r7 < r4) goto L48
            L3c:
                r1 = -19
                if (r0 != r1) goto L42
                if (r7 >= r4) goto L48
            L42:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L48:
                return r2
            L49:
                int r1 = r7 >> 8
                r1 = r1 ^ r2
                byte r1 = (byte) r1
                r4 = 0
                if (r1 != 0) goto L5d
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5b
                int r7 = com.google.protobuf.C7110s1.m19630a(r0, r1)
                return r7
            L5b:
                r9 = r7
                goto L60
            L5d:
                int r7 = r7 >> 16
                byte r4 = (byte) r7
            L60:
                if (r4 != 0) goto L6e
                int r7 = r9 + 1
                r4 = r8[r9]
                if (r7 < r10) goto L6d
                int r7 = com.google.protobuf.C7110s1.m19629b(r0, r1, r4)
                return r7
            L6d:
                r9 = r7
            L6e:
                if (r1 > r3) goto L81
                int r7 = r0 << 28
                int r1 = r1 + 112
                int r7 = r7 + r1
                int r7 = r7 >> 30
                if (r7 != 0) goto L81
                if (r4 > r3) goto L81
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L81:
                return r2
            L82:
                int r7 = m19585m(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7110s1.C7113c.mo19580i(int, byte[], int, int):int");
        }

        @Override // com.google.protobuf.C7110s1.AbstractC7112b
        /* renamed from: l */
        int mo19579l(int i, ByteBuffer byteBuffer, int i2, int i3) {
            return m19586k(i, byteBuffer, i2, i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Utf8.java */
    /* renamed from: com.google.protobuf.s1$d */
    /* loaded from: classes2.dex */
    public static class C7114d extends IllegalArgumentException {
        C7114d(int i, int i2) {
            super("Unpaired surrogate at index " + i + " of " + i2);
        }
    }

    /* compiled from: Utf8.java */
    /* renamed from: com.google.protobuf.s1$e */
    /* loaded from: classes2.dex */
    static final class C7115e extends AbstractC7112b {
        C7115e() {
        }

        /* renamed from: m */
        static boolean m19578m() {
            return C7102r1.m19698I() && C7102r1.m19697J();
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x008e, code lost:
            return -1;
         */
        /* renamed from: n */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static int m19577n(long r8, int r10) {
            /*
                int r0 = m19575p(r8, r10)
                long r1 = (long) r0
                long r8 = r8 + r1
                int r10 = r10 - r0
            L7:
                r0 = 0
                r1 = 0
            L9:
                r2 = 1
                if (r10 <= 0) goto L1a
                long r4 = r8 + r2
                byte r1 = com.google.protobuf.C7102r1.m19660w(r8)
                if (r1 < 0) goto L19
                int r10 = r10 + (-1)
                r8 = r4
                goto L9
            L19:
                r8 = r4
            L1a:
                if (r10 != 0) goto L1d
                return r0
            L1d:
                int r10 = r10 + (-1)
                r0 = -32
                r4 = -65
                r5 = -1
                if (r1 >= r0) goto L3a
                if (r10 != 0) goto L29
                return r1
            L29:
                int r10 = r10 + (-1)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r8
                byte r8 = com.google.protobuf.C7102r1.m19660w(r8)
                if (r8 <= r4) goto L37
                goto L39
            L37:
                r8 = r2
                goto L7
            L39:
                return r5
            L3a:
                r6 = -16
                if (r1 >= r6) goto L64
                r6 = 2
                if (r10 >= r6) goto L46
                int r8 = m19573r(r8, r1, r10)
                return r8
            L46:
                int r10 = r10 + (-2)
                long r6 = r8 + r2
                byte r8 = com.google.protobuf.C7102r1.m19660w(r8)
                if (r8 > r4) goto L63
                r9 = -96
                if (r1 != r0) goto L56
                if (r8 < r9) goto L63
            L56:
                r0 = -19
                if (r1 != r0) goto L5c
                if (r8 >= r9) goto L63
            L5c:
                long r2 = r2 + r6
                byte r8 = com.google.protobuf.C7102r1.m19660w(r6)
                if (r8 <= r4) goto L37
            L63:
                return r5
            L64:
                r0 = 3
                if (r10 >= r0) goto L6c
                int r8 = m19573r(r8, r1, r10)
                return r8
            L6c:
                int r10 = r10 + (-3)
                long r6 = r8 + r2
                byte r8 = com.google.protobuf.C7102r1.m19660w(r8)
                if (r8 > r4) goto L8e
                int r9 = r1 << 28
                int r8 = r8 + 112
                int r9 = r9 + r8
                int r8 = r9 >> 30
                if (r8 != 0) goto L8e
                long r8 = r6 + r2
                byte r0 = com.google.protobuf.C7102r1.m19660w(r6)
                if (r0 > r4) goto L8e
                long r2 = r2 + r8
                byte r8 = com.google.protobuf.C7102r1.m19660w(r8)
                if (r8 <= r4) goto L37
            L8e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7110s1.C7115e.m19577n(long, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x008e, code lost:
            return -1;
         */
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static int m19576o(byte[] r8, long r9, int r11) {
            /*
                int r0 = m19574q(r8, r9, r11)
                int r11 = r11 - r0
                long r0 = (long) r0
                long r9 = r9 + r0
            L7:
                r0 = 0
                r1 = 0
            L9:
                r2 = 1
                if (r11 <= 0) goto L1a
                long r4 = r9 + r2
                byte r1 = com.google.protobuf.C7102r1.m19659x(r8, r9)
                if (r1 < 0) goto L19
                int r11 = r11 + (-1)
                r9 = r4
                goto L9
            L19:
                r9 = r4
            L1a:
                if (r11 != 0) goto L1d
                return r0
            L1d:
                int r11 = r11 + (-1)
                r0 = -32
                r4 = -65
                r5 = -1
                if (r1 >= r0) goto L3a
                if (r11 != 0) goto L29
                return r1
            L29:
                int r11 = r11 + (-1)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r9
                byte r9 = com.google.protobuf.C7102r1.m19659x(r8, r9)
                if (r9 <= r4) goto L37
                goto L39
            L37:
                r9 = r2
                goto L7
            L39:
                return r5
            L3a:
                r6 = -16
                if (r1 >= r6) goto L64
                r6 = 2
                if (r11 >= r6) goto L46
                int r8 = m19572s(r8, r1, r9, r11)
                return r8
            L46:
                int r11 = r11 + (-2)
                long r6 = r9 + r2
                byte r9 = com.google.protobuf.C7102r1.m19659x(r8, r9)
                if (r9 > r4) goto L63
                r10 = -96
                if (r1 != r0) goto L56
                if (r9 < r10) goto L63
            L56:
                r0 = -19
                if (r1 != r0) goto L5c
                if (r9 >= r10) goto L63
            L5c:
                long r2 = r2 + r6
                byte r9 = com.google.protobuf.C7102r1.m19659x(r8, r6)
                if (r9 <= r4) goto L37
            L63:
                return r5
            L64:
                r0 = 3
                if (r11 >= r0) goto L6c
                int r8 = m19572s(r8, r1, r9, r11)
                return r8
            L6c:
                int r11 = r11 + (-3)
                long r6 = r9 + r2
                byte r9 = com.google.protobuf.C7102r1.m19659x(r8, r9)
                if (r9 > r4) goto L8e
                int r10 = r1 << 28
                int r9 = r9 + 112
                int r10 = r10 + r9
                int r9 = r10 >> 30
                if (r9 != 0) goto L8e
                long r9 = r6 + r2
                byte r0 = com.google.protobuf.C7102r1.m19659x(r8, r6)
                if (r0 > r4) goto L8e
                long r2 = r2 + r9
                byte r9 = com.google.protobuf.C7102r1.m19659x(r8, r9)
                if (r9 <= r4) goto L37
            L8e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7110s1.C7115e.m19576o(byte[], long, int):int");
        }

        /* renamed from: p */
        private static int m19575p(long j, int i) {
            if (i < 16) {
                return 0;
            }
            int i2 = 8 - (((int) j) & 7);
            int i3 = i2;
            while (i3 > 0) {
                long j2 = 1 + j;
                if (C7102r1.m19660w(j) < 0) {
                    return i2 - i3;
                }
                i3--;
                j = j2;
            }
            int i4 = i - i2;
            while (i4 >= 8 && (C7102r1.m19703D(j) & (-9187201950435737472L)) == 0) {
                j += 8;
                i4 -= 8;
            }
            return i - i4;
        }

        /* renamed from: q */
        private static int m19574q(byte[] bArr, long j, int i) {
            int i2 = 0;
            if (i < 16) {
                return 0;
            }
            while (i2 < i) {
                long j2 = 1 + j;
                if (C7102r1.m19659x(bArr, j) < 0) {
                    return i2;
                }
                i2++;
                j = j2;
            }
            return i;
        }

        /* renamed from: r */
        private static int m19573r(long j, int i, int i2) {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        return C7110s1.m19616o(i, C7102r1.m19660w(j), C7102r1.m19660w(j + 1));
                    }
                    throw new AssertionError();
                }
                return C7110s1.m19617n(i, C7102r1.m19660w(j));
            }
            return C7110s1.m19618m(i);
        }

        /* renamed from: s */
        private static int m19572s(byte[] bArr, int i, long j, int i2) {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        return C7110s1.m19616o(i, C7102r1.m19659x(bArr, j), C7102r1.m19659x(bArr, j + 1));
                    }
                    throw new AssertionError();
                }
                return C7110s1.m19617n(i, C7102r1.m19659x(bArr, j));
            }
            return C7110s1.m19618m(i);
        }

        @Override // com.google.protobuf.C7110s1.AbstractC7112b
        /* renamed from: b */
        String mo19583b(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (i < i3) {
                    byte m19659x = C7102r1.m19659x(bArr, i);
                    if (!C7111a.m19597n(m19659x)) {
                        break;
                    }
                    i++;
                    C7111a.m19602i(m19659x, cArr, i4);
                    i4++;
                }
                int i5 = i4;
                while (i < i3) {
                    int i6 = i + 1;
                    byte m19659x2 = C7102r1.m19659x(bArr, i);
                    if (C7111a.m19597n(m19659x2)) {
                        int i7 = i5 + 1;
                        C7111a.m19602i(m19659x2, cArr, i5);
                        while (i6 < i3) {
                            byte m19659x3 = C7102r1.m19659x(bArr, i6);
                            if (!C7111a.m19597n(m19659x3)) {
                                break;
                            }
                            i6++;
                            C7111a.m19602i(m19659x3, cArr, i7);
                            i7++;
                        }
                        i = i6;
                        i5 = i7;
                    } else if (C7111a.m19595p(m19659x2)) {
                        if (i6 < i3) {
                            C7111a.m19600k(m19659x2, C7102r1.m19659x(bArr, i6), cArr, i5);
                            i = i6 + 1;
                            i5++;
                        } else {
                            throw InvalidProtocolBufferException.m20254e();
                        }
                    } else if (C7111a.m19596o(m19659x2)) {
                        if (i6 < i3 - 1) {
                            int i8 = i6 + 1;
                            C7111a.m19601j(m19659x2, C7102r1.m19659x(bArr, i6), C7102r1.m19659x(bArr, i8), cArr, i5);
                            i = i8 + 1;
                            i5++;
                        } else {
                            throw InvalidProtocolBufferException.m20254e();
                        }
                    } else if (i6 < i3 - 2) {
                        int i9 = i6 + 1;
                        int i10 = i9 + 1;
                        C7111a.m19603h(m19659x2, C7102r1.m19659x(bArr, i6), C7102r1.m19659x(bArr, i9), C7102r1.m19659x(bArr, i10), cArr, i5);
                        i = i10 + 1;
                        i5 = i5 + 1 + 1;
                    } else {
                        throw InvalidProtocolBufferException.m20254e();
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }

        @Override // com.google.protobuf.C7110s1.AbstractC7112b
        /* renamed from: d */
        String mo19582d(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) >= 0) {
                long m19672k = C7102r1.m19672k(byteBuffer) + i;
                long j = i2 + m19672k;
                char[] cArr = new char[i2];
                int i3 = 0;
                while (m19672k < j) {
                    byte m19660w = C7102r1.m19660w(m19672k);
                    if (!C7111a.m19597n(m19660w)) {
                        break;
                    }
                    m19672k++;
                    C7111a.m19602i(m19660w, cArr, i3);
                    i3++;
                }
                while (true) {
                    int i4 = i3;
                    while (m19672k < j) {
                        long j2 = m19672k + 1;
                        byte m19660w2 = C7102r1.m19660w(m19672k);
                        if (C7111a.m19597n(m19660w2)) {
                            int i5 = i4 + 1;
                            C7111a.m19602i(m19660w2, cArr, i4);
                            while (j2 < j) {
                                byte m19660w3 = C7102r1.m19660w(j2);
                                if (!C7111a.m19597n(m19660w3)) {
                                    break;
                                }
                                j2++;
                                C7111a.m19602i(m19660w3, cArr, i5);
                                i5++;
                            }
                            i4 = i5;
                            m19672k = j2;
                        } else if (C7111a.m19595p(m19660w2)) {
                            if (j2 < j) {
                                m19672k = j2 + 1;
                                C7111a.m19600k(m19660w2, C7102r1.m19660w(j2), cArr, i4);
                                i4++;
                            } else {
                                throw InvalidProtocolBufferException.m20254e();
                            }
                        } else if (C7111a.m19596o(m19660w2)) {
                            if (j2 < j - 1) {
                                long j3 = j2 + 1;
                                C7111a.m19601j(m19660w2, C7102r1.m19660w(j2), C7102r1.m19660w(j3), cArr, i4);
                                i4++;
                                m19672k = j3 + 1;
                            } else {
                                throw InvalidProtocolBufferException.m20254e();
                            }
                        } else if (j2 < j - 2) {
                            long j4 = j2 + 1;
                            byte m19660w4 = C7102r1.m19660w(j2);
                            long j5 = j4 + 1;
                            byte m19660w5 = C7102r1.m19660w(j4);
                            m19672k = j5 + 1;
                            C7111a.m19603h(m19660w2, m19660w4, m19660w5, C7102r1.m19660w(j5), cArr, i4);
                            i3 = i4 + 1 + 1;
                        } else {
                            throw InvalidProtocolBufferException.m20254e();
                        }
                    }
                    return new String(cArr, 0, i4);
                }
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }

        @Override // com.google.protobuf.C7110s1.AbstractC7112b
        /* renamed from: e */
        int mo19581e(CharSequence charSequence, byte[] bArr, int i, int i2) {
            char c;
            long j;
            long j2;
            long j3;
            int i3;
            char charAt;
            long j4 = i;
            long j5 = i2 + j4;
            int length = charSequence.length();
            if (length > i2 || bArr.length - i2 < i) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i + i2));
            }
            int i4 = 0;
            while (true) {
                c = 128;
                j = 1;
                if (i4 >= length || (charAt = charSequence.charAt(i4)) >= 128) {
                    break;
                }
                C7102r1.m19692O(bArr, j4, (byte) charAt);
                i4++;
                j4 = 1 + j4;
            }
            if (i4 == length) {
                return (int) j4;
            }
            while (i4 < length) {
                char charAt2 = charSequence.charAt(i4);
                if (charAt2 >= c || j4 >= j5) {
                    if (charAt2 < 2048 && j4 <= j5 - 2) {
                        long j6 = j4 + j;
                        C7102r1.m19692O(bArr, j4, (byte) ((charAt2 >>> 6) | 960));
                        C7102r1.m19692O(bArr, j6, (byte) ((charAt2 & '?') | 128));
                        j2 = j6 + j;
                        j3 = j;
                    } else if ((charAt2 >= 55296 && 57343 >= charAt2) || j4 > j5 - 3) {
                        if (j4 <= j5 - 4) {
                            int i5 = i4 + 1;
                            if (i5 != length) {
                                char charAt3 = charSequence.charAt(i5);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    long j7 = j4 + 1;
                                    C7102r1.m19692O(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                                    long j8 = j7 + 1;
                                    C7102r1.m19692O(bArr, j7, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j9 = j8 + 1;
                                    C7102r1.m19692O(bArr, j8, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j3 = 1;
                                    j2 = j9 + 1;
                                    C7102r1.m19692O(bArr, j9, (byte) ((codePoint & 63) | 128));
                                    i4 = i5;
                                } else {
                                    i4 = i5;
                                }
                            }
                            throw new C7114d(i4 - 1, length);
                        } else if (55296 <= charAt2 && charAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                            throw new C7114d(i4, length);
                        } else {
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + j4);
                        }
                    } else {
                        long j10 = j4 + j;
                        C7102r1.m19692O(bArr, j4, (byte) ((charAt2 >>> '\f') | 480));
                        long j11 = j10 + j;
                        C7102r1.m19692O(bArr, j10, (byte) (((charAt2 >>> 6) & 63) | 128));
                        C7102r1.m19692O(bArr, j11, (byte) ((charAt2 & '?') | 128));
                        j2 = j11 + 1;
                        j3 = 1;
                    }
                    i4++;
                    c = 128;
                    long j12 = j3;
                    j4 = j2;
                    j = j12;
                } else {
                    long j13 = j4 + j;
                    C7102r1.m19692O(bArr, j4, (byte) charAt2);
                    j3 = j;
                    j2 = j13;
                }
                i4++;
                c = 128;
                long j122 = j3;
                j4 = j2;
                j = j122;
            }
            return (int) j4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0059, code lost:
            if (com.google.protobuf.C7102r1.m19659x(r13, r2) > (-65)) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
            if (com.google.protobuf.C7102r1.m19659x(r13, r2) > (-65)) goto L56;
         */
        @Override // com.google.protobuf.C7110s1.AbstractC7112b
        /* renamed from: i */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int mo19580i(int r12, byte[] r13, int r14, int r15) {
            /*
                Method dump skipped, instructions count: 206
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7110s1.C7115e.mo19580i(int, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0063, code lost:
            if (com.google.protobuf.C7102r1.m19660w(r2) > (-65)) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00a8, code lost:
            if (com.google.protobuf.C7102r1.m19660w(r2) > (-65)) goto L56;
         */
        @Override // com.google.protobuf.C7110s1.AbstractC7112b
        /* renamed from: l */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int mo19579l(int r11, java.nio.ByteBuffer r12, int r13, int r14) {
            /*
                Method dump skipped, instructions count: 219
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C7110s1.C7115e.mo19579l(int, java.nio.ByteBuffer, int, int):int");
        }
    }

    static {
        f16944a = (!C7115e.m19578m() || C7014d.m20216c()) ? new C7113c() : new C7115e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static String m19624g(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
        return f16944a.m19592a(byteBuffer, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static String m19623h(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
        return f16944a.mo19583b(bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static int m19622i(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f16944a.mo19581e(charSequence, bArr, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static int m19621j(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (true) {
            if (i < length) {
                char charAt = charSequence.charAt(i);
                if (charAt >= 2048) {
                    i2 += m19620k(charSequence, i);
                    break;
                }
                i2 += (127 - charAt) >>> 31;
                i++;
            } else {
                break;
            }
        }
        if (i2 >= length) {
            return i2;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i2 + IjkMediaMeta.AV_CH_WIDE_RIGHT));
    }

    /* renamed from: k */
    private static int m19620k(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < 2048) {
                i2 += (127 - charAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i) < 65536) {
                        throw new C7114d(i, length);
                    }
                    i++;
                }
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static int m19619l(ByteBuffer byteBuffer, int i, int i2) {
        int i3 = i2 - 7;
        int i4 = i;
        while (i4 < i3 && (byteBuffer.getLong(i4) & (-9187201950435737472L)) == 0) {
            i4 += 8;
        }
        return i4 - i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static int m19618m(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static int m19617n(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static int m19616o(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static int m19615p(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    return m19616o(i, byteBuffer.get(i2), byteBuffer.get(i2 + 1));
                }
                throw new AssertionError();
            }
            return m19617n(i, byteBuffer.get(i2));
        }
        return m19618m(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static int m19614q(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    return m19616o(b, bArr[i], bArr[i + 1]);
                }
                throw new AssertionError();
            }
            return m19617n(b, bArr[i]);
        }
        return m19618m(b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static boolean m19613r(ByteBuffer byteBuffer) {
        return f16944a.m19590f(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    /* renamed from: s */
    public static boolean m19612s(byte[] bArr) {
        return f16944a.m19589g(bArr, 0, bArr.length);
    }

    /* renamed from: t */
    public static boolean m19611t(byte[] bArr, int i, int i2) {
        return f16944a.m19589g(bArr, i, i2);
    }
}
