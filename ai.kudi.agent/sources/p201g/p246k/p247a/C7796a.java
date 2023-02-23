package p201g.p246k.p247a;

import android.content.res.AssetManager;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;
/* compiled from: ExifInterface.java */
/* renamed from: g.k.a.a */
/* loaded from: classes2.dex */
public class C7796a {

    /* renamed from: A */
    private static final C7799c f18595A;

    /* renamed from: B */
    private static final C7799c[] f18596B;

    /* renamed from: C */
    private static final C7799c[] f18597C;

    /* renamed from: D */
    private static final C7799c[] f18598D;

    /* renamed from: E */
    private static final C7799c[] f18599E;

    /* renamed from: F */
    static final C7799c[][] f18600F;

    /* renamed from: G */
    private static final C7799c[] f18601G;

    /* renamed from: H */
    private static final HashMap<Integer, C7799c>[] f18602H;

    /* renamed from: I */
    private static final HashMap<String, C7799c>[] f18603I;

    /* renamed from: J */
    private static final HashSet<String> f18604J;

    /* renamed from: K */
    private static final HashMap<Integer, Integer> f18605K;

    /* renamed from: L */
    static final Charset f18606L;

    /* renamed from: M */
    static final byte[] f18607M;

    /* renamed from: m */
    public static final int[] f18608m;

    /* renamed from: n */
    public static final int[] f18609n;

    /* renamed from: o */
    static final byte[] f18610o;

    /* renamed from: p */
    private static final byte[] f18611p;

    /* renamed from: q */
    private static final byte[] f18612q;

    /* renamed from: r */
    private static SimpleDateFormat f18613r;

    /* renamed from: s */
    static final String[] f18614s;

    /* renamed from: t */
    static final int[] f18615t;

    /* renamed from: u */
    static final byte[] f18616u;

    /* renamed from: v */
    private static final C7799c[] f18617v;

    /* renamed from: w */
    private static final C7799c[] f18618w;

    /* renamed from: x */
    private static final C7799c[] f18619x;

    /* renamed from: y */
    private static final C7799c[] f18620y;

    /* renamed from: z */
    private static final C7799c[] f18621z;

    /* renamed from: a */
    private final String f18622a;

    /* renamed from: b */
    private final AssetManager.AssetInputStream f18623b;

    /* renamed from: c */
    private int f18624c;

    /* renamed from: d */
    private final HashMap<String, C7798b>[] f18625d;

    /* renamed from: e */
    private Set<Integer> f18626e;

    /* renamed from: f */
    private ByteOrder f18627f;

    /* renamed from: g */
    private int f18628g;

    /* renamed from: h */
    private int f18629h;

    /* renamed from: i */
    private int f18630i;

    /* renamed from: j */
    private int f18631j;

    /* renamed from: k */
    private int f18632k;

    /* renamed from: l */
    private int f18633l;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExifInterface.java */
    /* renamed from: g.k.a.a$b */
    /* loaded from: classes2.dex */
    public static class C7798b {

        /* renamed from: a */
        public final int f18640a;

        /* renamed from: b */
        public final int f18641b;

        /* renamed from: c */
        public final byte[] f18642c;

        C7798b(int i, int i2, byte[] bArr) {
            this.f18640a = i;
            this.f18641b = i2;
            this.f18642c = bArr;
        }

        /* renamed from: a */
        public static C7798b m17269a(String str) {
            byte[] bytes = (str + (char) 0).getBytes(C7796a.f18606L);
            return new C7798b(2, bytes.length, bytes);
        }

        /* renamed from: b */
        public static C7798b m17268b(long j, ByteOrder byteOrder) {
            return m17267c(new long[]{j}, byteOrder);
        }

        /* renamed from: c */
        public static C7798b m17267c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C7796a.f18615t[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new C7798b(4, jArr.length, wrap.array());
        }

        /* renamed from: d */
        public static C7798b m17266d(C7800d c7800d, ByteOrder byteOrder) {
            return m17265e(new C7800d[]{c7800d}, byteOrder);
        }

        /* renamed from: e */
        public static C7798b m17265e(C7800d[] c7800dArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C7796a.f18615t[5] * c7800dArr.length]);
            wrap.order(byteOrder);
            for (C7800d c7800d : c7800dArr) {
                wrap.putInt((int) c7800d.f18647a);
                wrap.putInt((int) c7800d.f18648b);
            }
            return new C7798b(5, c7800dArr.length, wrap.array());
        }

        /* renamed from: f */
        public static C7798b m17264f(int i, ByteOrder byteOrder) {
            return m17263g(new int[]{i}, byteOrder);
        }

        /* renamed from: g */
        public static C7798b m17263g(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C7796a.f18615t[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new C7798b(3, iArr.length, wrap.array());
        }

        /* renamed from: h */
        public double m17262h(ByteOrder byteOrder) {
            Object m17259k = m17259k(byteOrder);
            if (m17259k != null) {
                if (m17259k instanceof String) {
                    return Double.parseDouble((String) m17259k);
                }
                if (m17259k instanceof long[]) {
                    long[] jArr = (long[]) m17259k;
                    if (jArr.length == 1) {
                        return jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (m17259k instanceof int[]) {
                    int[] iArr = (int[]) m17259k;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (m17259k instanceof double[]) {
                    double[] dArr = (double[]) m17259k;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (m17259k instanceof C7800d[]) {
                    C7800d[] c7800dArr = (C7800d[]) m17259k;
                    if (c7800dArr.length == 1) {
                        return c7800dArr[0].m17257a();
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
            throw new NumberFormatException("NULL can't be converted to a double value");
        }

        /* renamed from: i */
        public int m17261i(ByteOrder byteOrder) {
            Object m17259k = m17259k(byteOrder);
            if (m17259k != null) {
                if (m17259k instanceof String) {
                    return Integer.parseInt((String) m17259k);
                }
                if (m17259k instanceof long[]) {
                    long[] jArr = (long[]) m17259k;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (m17259k instanceof int[]) {
                    int[] iArr = (int[]) m17259k;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }

        /* renamed from: j */
        public String m17260j(ByteOrder byteOrder) {
            Object m17259k = m17259k(byteOrder);
            if (m17259k == null) {
                return null;
            }
            if (m17259k instanceof String) {
                return (String) m17259k;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (m17259k instanceof long[]) {
                long[] jArr = (long[]) m17259k;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (m17259k instanceof int[]) {
                int[] iArr = (int[]) m17259k;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (m17259k instanceof double[]) {
                double[] dArr = (double[]) m17259k;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else if (m17259k instanceof C7800d[]) {
                C7800d[] c7800dArr = (C7800d[]) m17259k;
                while (i < c7800dArr.length) {
                    sb.append(c7800dArr[i].f18647a);
                    sb.append('/');
                    sb.append(c7800dArr[i].f18648b);
                    i++;
                    if (i != c7800dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            } else {
                return null;
            }
        }

        /* JADX WARN: Not initialized variable reg: 3, insn: 0x01a8: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:152:0x01a8 */
        /* JADX WARN: Removed duplicated region for block: B:167:0x01ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        java.lang.Object m17259k(java.nio.ByteOrder r11) {
            /*
                Method dump skipped, instructions count: 466
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p201g.p246k.p247a.C7796a.C7798b.m17259k(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            return "(" + C7796a.f18614s[this.f18640a] + ", data length:" + this.f18642c.length + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExifInterface.java */
    /* renamed from: g.k.a.a$d */
    /* loaded from: classes2.dex */
    public static class C7800d {

        /* renamed from: a */
        public final long f18647a;

        /* renamed from: b */
        public final long f18648b;

        C7800d(long j, long j2) {
            if (j2 == 0) {
                this.f18647a = 0L;
                this.f18648b = 1L;
                return;
            }
            this.f18647a = j;
            this.f18648b = j2;
        }

        /* renamed from: a */
        public double m17257a() {
            double d = this.f18647a;
            double d2 = this.f18648b;
            Double.isNaN(d);
            Double.isNaN(d2);
            return d / d2;
        }

        public String toString() {
            return this.f18647a + "/" + this.f18648b;
        }
    }

    static {
        C7799c[] c7799cArr;
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f18608m = new int[]{8, 8, 8};
        f18609n = new int[]{8};
        f18610o = new byte[]{-1, -40, -1};
        f18611p = new byte[]{79, 76, 89, 77, 80, 0};
        f18612q = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        f18614s = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};
        f18615t = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f18616u = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        f18617v = new C7799c[]{new C7799c("NewSubfileType", 254, 4), new C7799c("SubfileType", 255, 4), new C7799c("ImageWidth", 256, 3, 4), new C7799c("ImageLength", 257, 3, 4), new C7799c("BitsPerSample", 258, 3), new C7799c("Compression", 259, 3), new C7799c("PhotometricInterpretation", 262, 3), new C7799c("ImageDescription", 270, 2), new C7799c("Make", 271, 2), new C7799c("Model", 272, 2), new C7799c("StripOffsets", 273, 3, 4), new C7799c("Orientation", 274, 3), new C7799c("SamplesPerPixel", 277, 3), new C7799c("RowsPerStrip", 278, 3, 4), new C7799c("StripByteCounts", 279, 3, 4), new C7799c("XResolution", 282, 5), new C7799c("YResolution", 283, 5), new C7799c("PlanarConfiguration", 284, 3), new C7799c("ResolutionUnit", 296, 3), new C7799c("TransferFunction", 301, 3), new C7799c("Software", 305, 2), new C7799c("DateTime", 306, 2), new C7799c("Artist", 315, 2), new C7799c("WhitePoint", 318, 5), new C7799c("PrimaryChromaticities", 319, 5), new C7799c("SubIFDPointer", 330, 4), new C7799c("JPEGInterchangeFormat", 513, 4), new C7799c("JPEGInterchangeFormatLength", 514, 4), new C7799c("YCbCrCoefficients", 529, 5), new C7799c("YCbCrSubSampling", 530, 3), new C7799c("YCbCrPositioning", 531, 3), new C7799c("ReferenceBlackWhite", 532, 5), new C7799c("Copyright", 33432, 2), new C7799c("ExifIFDPointer", 34665, 4), new C7799c("GPSInfoIFDPointer", 34853, 4), new C7799c("SensorTopBorder", 4, 4), new C7799c("SensorLeftBorder", 5, 4), new C7799c("SensorBottomBorder", 6, 4), new C7799c("SensorRightBorder", 7, 4), new C7799c("ISO", 23, 3), new C7799c("JpgFromRaw", 46, 7)};
        f18618w = new C7799c[]{new C7799c("ExposureTime", 33434, 5), new C7799c("FNumber", 33437, 5), new C7799c("ExposureProgram", 34850, 3), new C7799c("SpectralSensitivity", 34852, 2), new C7799c("PhotographicSensitivity", 34855, 3), new C7799c("OECF", 34856, 7), new C7799c("ExifVersion", 36864, 2), new C7799c("DateTimeOriginal", 36867, 2), new C7799c("DateTimeDigitized", 36868, 2), new C7799c("ComponentsConfiguration", 37121, 7), new C7799c("CompressedBitsPerPixel", 37122, 5), new C7799c("ShutterSpeedValue", 37377, 10), new C7799c("ApertureValue", 37378, 5), new C7799c("BrightnessValue", 37379, 10), new C7799c("ExposureBiasValue", 37380, 10), new C7799c("MaxApertureValue", 37381, 5), new C7799c("SubjectDistance", 37382, 5), new C7799c("MeteringMode", 37383, 3), new C7799c("LightSource", 37384, 3), new C7799c("Flash", 37385, 3), new C7799c("FocalLength", 37386, 5), new C7799c("SubjectArea", 37396, 3), new C7799c("MakerNote", 37500, 7), new C7799c("UserComment", 37510, 7), new C7799c("SubSecTime", 37520, 2), new C7799c("SubSecTimeOriginal", 37521, 2), new C7799c("SubSecTimeDigitized", 37522, 2), new C7799c("FlashpixVersion", 40960, 7), new C7799c("ColorSpace", 40961, 3), new C7799c("PixelXDimension", 40962, 3, 4), new C7799c("PixelYDimension", 40963, 3, 4), new C7799c("RelatedSoundFile", 40964, 2), new C7799c("InteroperabilityIFDPointer", 40965, 4), new C7799c("FlashEnergy", 41483, 5), new C7799c("SpatialFrequencyResponse", 41484, 7), new C7799c("FocalPlaneXResolution", 41486, 5), new C7799c("FocalPlaneYResolution", 41487, 5), new C7799c("FocalPlaneResolutionUnit", 41488, 3), new C7799c("SubjectLocation", 41492, 3), new C7799c("ExposureIndex", 41493, 5), new C7799c("SensingMethod", 41495, 3), new C7799c("FileSource", 41728, 7), new C7799c("SceneType", 41729, 7), new C7799c("CFAPattern", 41730, 7), new C7799c("CustomRendered", 41985, 3), new C7799c("ExposureMode", 41986, 3), new C7799c("WhiteBalance", 41987, 3), new C7799c("DigitalZoomRatio", 41988, 5), new C7799c("FocalLengthIn35mmFilm", 41989, 3), new C7799c("SceneCaptureType", 41990, 3), new C7799c("GainControl", 41991, 3), new C7799c("Contrast", 41992, 3), new C7799c("Saturation", 41993, 3), new C7799c("Sharpness", 41994, 3), new C7799c("DeviceSettingDescription", 41995, 7), new C7799c("SubjectDistanceRange", 41996, 3), new C7799c("ImageUniqueID", 42016, 2), new C7799c("DNGVersion", 50706, 1), new C7799c("DefaultCropSize", 50720, 3, 4)};
        f18619x = new C7799c[]{new C7799c("GPSVersionID", 0, 1), new C7799c("GPSLatitudeRef", 1, 2), new C7799c("GPSLatitude", 2, 5), new C7799c("GPSLongitudeRef", 3, 2), new C7799c("GPSLongitude", 4, 5), new C7799c("GPSAltitudeRef", 5, 1), new C7799c("GPSAltitude", 6, 5), new C7799c("GPSTimeStamp", 7, 5), new C7799c("GPSSatellites", 8, 2), new C7799c("GPSStatus", 9, 2), new C7799c("GPSMeasureMode", 10, 2), new C7799c("GPSDOP", 11, 5), new C7799c("GPSSpeedRef", 12, 2), new C7799c("GPSSpeed", 13, 5), new C7799c("GPSTrackRef", 14, 2), new C7799c("GPSTrack", 15, 5), new C7799c("GPSImgDirectionRef", 16, 2), new C7799c("GPSImgDirection", 17, 5), new C7799c("GPSMapDatum", 18, 2), new C7799c("GPSDestLatitudeRef", 19, 2), new C7799c("GPSDestLatitude", 20, 5), new C7799c("GPSDestLongitudeRef", 21, 2), new C7799c("GPSDestLongitude", 22, 5), new C7799c("GPSDestBearingRef", 23, 2), new C7799c("GPSDestBearing", 24, 5), new C7799c("GPSDestDistanceRef", 25, 2), new C7799c("GPSDestDistance", 26, 5), new C7799c("GPSProcessingMethod", 27, 7), new C7799c("GPSAreaInformation", 28, 7), new C7799c("GPSDateStamp", 29, 2), new C7799c("GPSDifferential", 30, 3)};
        f18620y = new C7799c[]{new C7799c("InteroperabilityIndex", 1, 2)};
        f18621z = new C7799c[]{new C7799c("NewSubfileType", 254, 4), new C7799c("SubfileType", 255, 4), new C7799c("ThumbnailImageWidth", 256, 3, 4), new C7799c("ThumbnailImageLength", 257, 3, 4), new C7799c("BitsPerSample", 258, 3), new C7799c("Compression", 259, 3), new C7799c("PhotometricInterpretation", 262, 3), new C7799c("ImageDescription", 270, 2), new C7799c("Make", 271, 2), new C7799c("Model", 272, 2), new C7799c("StripOffsets", 273, 3, 4), new C7799c("Orientation", 274, 3), new C7799c("SamplesPerPixel", 277, 3), new C7799c("RowsPerStrip", 278, 3, 4), new C7799c("StripByteCounts", 279, 3, 4), new C7799c("XResolution", 282, 5), new C7799c("YResolution", 283, 5), new C7799c("PlanarConfiguration", 284, 3), new C7799c("ResolutionUnit", 296, 3), new C7799c("TransferFunction", 301, 3), new C7799c("Software", 305, 2), new C7799c("DateTime", 306, 2), new C7799c("Artist", 315, 2), new C7799c("WhitePoint", 318, 5), new C7799c("PrimaryChromaticities", 319, 5), new C7799c("SubIFDPointer", 330, 4), new C7799c("JPEGInterchangeFormat", 513, 4), new C7799c("JPEGInterchangeFormatLength", 514, 4), new C7799c("YCbCrCoefficients", 529, 5), new C7799c("YCbCrSubSampling", 530, 3), new C7799c("YCbCrPositioning", 531, 3), new C7799c("ReferenceBlackWhite", 532, 5), new C7799c("Copyright", 33432, 2), new C7799c("ExifIFDPointer", 34665, 4), new C7799c("GPSInfoIFDPointer", 34853, 4), new C7799c("DNGVersion", 50706, 1), new C7799c("DefaultCropSize", 50720, 3, 4)};
        f18595A = new C7799c("StripOffsets", 273, 3);
        f18596B = new C7799c[]{new C7799c("ThumbnailImage", 256, 7), new C7799c("CameraSettingsIFDPointer", 8224, 4), new C7799c("ImageProcessingIFDPointer", 8256, 4)};
        f18597C = new C7799c[]{new C7799c("PreviewImageStart", 257, 4), new C7799c("PreviewImageLength", 258, 4)};
        f18598D = new C7799c[]{new C7799c("AspectFrame", 4371, 3)};
        C7799c[] c7799cArr2 = {new C7799c("ColorSpace", 55, 3)};
        f18599E = c7799cArr2;
        C7799c[] c7799cArr3 = f18617v;
        f18600F = new C7799c[][]{c7799cArr3, f18618w, f18619x, f18620y, f18621z, c7799cArr3, f18596B, f18597C, f18598D, c7799cArr2};
        f18601G = new C7799c[]{new C7799c("SubIFDPointer", 330, 4), new C7799c("ExifIFDPointer", 34665, 4), new C7799c("GPSInfoIFDPointer", 34853, 4), new C7799c("InteroperabilityIFDPointer", 40965, 4), new C7799c("CameraSettingsIFDPointer", 8224, 1), new C7799c("ImageProcessingIFDPointer", 8256, 1)};
        C7799c[][] c7799cArr4 = f18600F;
        f18602H = new HashMap[c7799cArr4.length];
        f18603I = new HashMap[c7799cArr4.length];
        f18604J = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f18605K = new HashMap<>();
        Charset forName = Charset.forName("US-ASCII");
        f18606L = forName;
        f18607M = "Exif\u0000\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        f18613r = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        for (int i = 0; i < f18600F.length; i++) {
            f18602H[i] = new HashMap<>();
            f18603I[i] = new HashMap<>();
            for (C7799c c7799c : f18600F[i]) {
                f18602H[i].put(Integer.valueOf(c7799c.f18643a), c7799c);
                f18603I[i].put(c7799c.f18644b, c7799c);
            }
        }
        f18605K.put(Integer.valueOf(f18601G[0].f18643a), 5);
        f18605K.put(Integer.valueOf(f18601G[1].f18643a), 1);
        f18605K.put(Integer.valueOf(f18601G[2].f18643a), 2);
        f18605K.put(Integer.valueOf(f18601G[3].f18643a), 3);
        f18605K.put(Integer.valueOf(f18601G[4].f18643a), 7);
        f18605K.put(Integer.valueOf(f18601G[5].f18643a), 8);
        Pattern.compile(".*[1-9].*");
        Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
    }

    public C7796a(String str) throws IOException {
        this.f18625d = new HashMap[f18600F.length];
        this.f18626e = new HashSet(f18600F.length);
        this.f18627f = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            FileInputStream fileInputStream = null;
            this.f18623b = null;
            this.f18622a = str;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    m17279u(fileInputStream2);
                    m17298b(fileInputStream2);
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    m17298b(fileInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            throw new IllegalArgumentException("filename cannot be null");
        }
    }

    /* renamed from: A */
    private void m17303A(C7797a c7797a) throws IOException {
        HashMap<String, C7798b> hashMap = this.f18625d[4];
        C7798b c7798b = hashMap.get("Compression");
        if (c7798b != null) {
            int m17261i = c7798b.m17261i(this.f18627f);
            this.f18628g = m17261i;
            if (m17261i != 1) {
                if (m17261i == 6) {
                    m17287m(c7797a, hashMap);
                    return;
                } else if (m17261i != 7) {
                    return;
                }
            }
            if (m17281s(hashMap)) {
                m17286n(c7797a, hashMap);
                return;
            }
            return;
        }
        this.f18628g = 6;
        m17287m(c7797a, hashMap);
    }

    /* renamed from: B */
    private void m17302B(int i, int i2) throws IOException {
        if (this.f18625d[i].isEmpty() || this.f18625d[i2].isEmpty()) {
            return;
        }
        C7798b c7798b = this.f18625d[i].get("ImageLength");
        C7798b c7798b2 = this.f18625d[i].get("ImageWidth");
        C7798b c7798b3 = this.f18625d[i2].get("ImageLength");
        C7798b c7798b4 = this.f18625d[i2].get("ImageWidth");
        if (c7798b == null || c7798b2 == null || c7798b3 == null || c7798b4 == null) {
            return;
        }
        int m17261i = c7798b.m17261i(this.f18627f);
        int m17261i2 = c7798b2.m17261i(this.f18627f);
        int m17261i3 = c7798b3.m17261i(this.f18627f);
        int m17261i4 = c7798b4.m17261i(this.f18627f);
        if (m17261i >= m17261i3 || m17261i2 >= m17261i4) {
            return;
        }
        HashMap<String, C7798b>[] hashMapArr = this.f18625d;
        HashMap<String, C7798b> hashMap = hashMapArr[i];
        hashMapArr[i] = hashMapArr[i2];
        hashMapArr[i2] = hashMap;
    }

    /* renamed from: C */
    private void m17301C(C7797a c7797a, int i) throws IOException {
        C7798b m17264f;
        C7798b m17264f2;
        C7798b c7798b = this.f18625d[i].get("DefaultCropSize");
        C7798b c7798b2 = this.f18625d[i].get("SensorTopBorder");
        C7798b c7798b3 = this.f18625d[i].get("SensorLeftBorder");
        C7798b c7798b4 = this.f18625d[i].get("SensorBottomBorder");
        C7798b c7798b5 = this.f18625d[i].get("SensorRightBorder");
        if (c7798b == null) {
            if (c7798b2 != null && c7798b3 != null && c7798b4 != null && c7798b5 != null) {
                int m17261i = c7798b2.m17261i(this.f18627f);
                int m17261i2 = c7798b4.m17261i(this.f18627f);
                int m17261i3 = c7798b5.m17261i(this.f18627f);
                int m17261i4 = c7798b3.m17261i(this.f18627f);
                if (m17261i2 <= m17261i || m17261i3 <= m17261i4) {
                    return;
                }
                C7798b m17264f3 = C7798b.m17264f(m17261i2 - m17261i, this.f18627f);
                C7798b m17264f4 = C7798b.m17264f(m17261i3 - m17261i4, this.f18627f);
                this.f18625d[i].put("ImageLength", m17264f3);
                this.f18625d[i].put("ImageWidth", m17264f4);
                return;
            }
            m17274z(c7797a, i);
            return;
        }
        if (c7798b.f18640a == 5) {
            C7800d[] c7800dArr = (C7800d[]) c7798b.m17259k(this.f18627f);
            if (c7800dArr != null && c7800dArr.length == 2) {
                m17264f = C7798b.m17266d(c7800dArr[0], this.f18627f);
                m17264f2 = C7798b.m17266d(c7800dArr[1], this.f18627f);
            } else {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(c7800dArr));
                return;
            }
        } else {
            int[] iArr = (int[]) c7798b.m17259k(this.f18627f);
            if (iArr != null && iArr.length == 2) {
                m17264f = C7798b.m17264f(iArr[0], this.f18627f);
                m17264f2 = C7798b.m17264f(iArr[1], this.f18627f);
            } else {
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
        }
        this.f18625d[i].put("ImageWidth", m17264f);
        this.f18625d[i].put("ImageLength", m17264f2);
    }

    /* renamed from: D */
    private void m17300D(InputStream inputStream) throws IOException {
        m17302B(0, 5);
        m17302B(0, 4);
        m17302B(5, 4);
        C7798b c7798b = this.f18625d[1].get("PixelXDimension");
        C7798b c7798b2 = this.f18625d[1].get("PixelYDimension");
        if (c7798b != null && c7798b2 != null) {
            this.f18625d[0].put("ImageWidth", c7798b);
            this.f18625d[0].put("ImageLength", c7798b2);
        }
        if (this.f18625d[4].isEmpty() && m17280t(this.f18625d[5])) {
            HashMap<String, C7798b>[] hashMapArr = this.f18625d;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (m17280t(this.f18625d[4])) {
            return;
        }
        Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
    }

    /* renamed from: a */
    private void m17299a() {
        String m17296d = m17296d("DateTimeOriginal");
        if (m17296d != null && m17296d("DateTime") == null) {
            this.f18625d[0].put("DateTime", C7798b.m17269a(m17296d));
        }
        if (m17296d("ImageWidth") == null) {
            this.f18625d[0].put("ImageWidth", C7798b.m17268b(0L, this.f18627f));
        }
        if (m17296d("ImageLength") == null) {
            this.f18625d[0].put("ImageLength", C7798b.m17268b(0L, this.f18627f));
        }
        if (m17296d("Orientation") == null) {
            this.f18625d[0].put("Orientation", C7798b.m17268b(0L, this.f18627f));
        }
        if (m17296d("LightSource") == null) {
            this.f18625d[1].put("LightSource", C7798b.m17268b(0L, this.f18627f));
        }
    }

    /* renamed from: b */
    private static void m17298b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    private static long[] m17297c(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = iArr[i];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    /* renamed from: f */
    private C7798b m17294f(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f18600F.length; i++) {
            C7798b c7798b = this.f18625d[i].get(str);
            if (c7798b != null) {
                return c7798b;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0115, code lost:
        r10.m17273F(r9.f18627f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011a, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057 A[FALL_THROUGH] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m17293g(p201g.p246k.p247a.C7796a.C7797a r10, int r11, int r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p201g.p246k.p247a.C7796a.m17293g(g.k.a.a$a, int, int):void");
    }

    /* renamed from: h */
    private int m17292h(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (m17285o(bArr)) {
            return 4;
        }
        if (m17283q(bArr)) {
            return 9;
        }
        if (m17284p(bArr)) {
            return 7;
        }
        return m17282r(bArr) ? 10 : 0;
    }

    /* renamed from: i */
    private void m17291i(C7797a c7797a) throws IOException {
        m17289k(c7797a);
        C7798b c7798b = this.f18625d[1].get("MakerNote");
        if (c7798b != null) {
            C7797a c7797a2 = new C7797a(c7798b.f18642c);
            c7797a2.m17273F(this.f18627f);
            byte[] bArr = new byte[f18611p.length];
            c7797a2.readFully(bArr);
            c7797a2.m17270m(0L);
            byte[] bArr2 = new byte[f18612q.length];
            c7797a2.readFully(bArr2);
            if (Arrays.equals(bArr, f18611p)) {
                c7797a2.m17270m(8L);
            } else if (Arrays.equals(bArr2, f18612q)) {
                c7797a2.m17270m(12L);
            }
            m17275y(c7797a2, 6);
            C7798b c7798b2 = this.f18625d[7].get("PreviewImageStart");
            C7798b c7798b3 = this.f18625d[7].get("PreviewImageLength");
            if (c7798b2 != null && c7798b3 != null) {
                this.f18625d[5].put("JPEGInterchangeFormat", c7798b2);
                this.f18625d[5].put("JPEGInterchangeFormatLength", c7798b3);
            }
            C7798b c7798b4 = this.f18625d[8].get("AspectFrame");
            if (c7798b4 != null) {
                int[] iArr = (int[]) c7798b4.m17259k(this.f18627f);
                if (iArr != null && iArr.length == 4) {
                    if (iArr[2] <= iArr[0] || iArr[3] <= iArr[1]) {
                        return;
                    }
                    int i = (iArr[2] - iArr[0]) + 1;
                    int i2 = (iArr[3] - iArr[1]) + 1;
                    if (i < i2) {
                        int i3 = i + i2;
                        i2 = i3 - i2;
                        i = i3 - i2;
                    }
                    C7798b m17264f = C7798b.m17264f(i, this.f18627f);
                    C7798b m17264f2 = C7798b.m17264f(i2, this.f18627f);
                    this.f18625d[0].put("ImageWidth", m17264f);
                    this.f18625d[0].put("ImageLength", m17264f2);
                    return;
                }
                Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
            }
        }
    }

    /* renamed from: j */
    private void m17290j(C7797a c7797a) throws IOException {
        c7797a.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        c7797a.read(bArr);
        c7797a.skipBytes(4);
        c7797a.read(bArr2);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        m17293g(c7797a, i, 5);
        c7797a.m17270m(i2);
        c7797a.m17273F(ByteOrder.BIG_ENDIAN);
        int readInt = c7797a.readInt();
        for (int i3 = 0; i3 < readInt; i3++) {
            int readUnsignedShort = c7797a.readUnsignedShort();
            int readUnsignedShort2 = c7797a.readUnsignedShort();
            if (readUnsignedShort == f18595A.f18643a) {
                short readShort = c7797a.readShort();
                short readShort2 = c7797a.readShort();
                C7798b m17264f = C7798b.m17264f(readShort, this.f18627f);
                C7798b m17264f2 = C7798b.m17264f(readShort2, this.f18627f);
                this.f18625d[0].put("ImageLength", m17264f);
                this.f18625d[0].put("ImageWidth", m17264f2);
                return;
            }
            c7797a.skipBytes(readUnsignedShort2);
        }
    }

    /* renamed from: k */
    private void m17289k(C7797a c7797a) throws IOException {
        C7798b c7798b;
        m17278v(c7797a, c7797a.available());
        m17275y(c7797a, 0);
        m17301C(c7797a, 0);
        m17301C(c7797a, 5);
        m17301C(c7797a, 4);
        m17300D(c7797a);
        if (this.f18624c != 8 || (c7798b = this.f18625d[1].get("MakerNote")) == null) {
            return;
        }
        C7797a c7797a2 = new C7797a(c7798b.f18642c);
        c7797a2.m17273F(this.f18627f);
        c7797a2.m17270m(6L);
        m17275y(c7797a2, 9);
        C7798b c7798b2 = this.f18625d[9].get("ColorSpace");
        if (c7798b2 != null) {
            this.f18625d[1].put("ColorSpace", c7798b2);
        }
    }

    /* renamed from: l */
    private void m17288l(C7797a c7797a) throws IOException {
        m17289k(c7797a);
        if (this.f18625d[0].get("JpgFromRaw") != null) {
            m17293g(c7797a, this.f18633l, 5);
        }
        C7798b c7798b = this.f18625d[0].get("ISO");
        C7798b c7798b2 = this.f18625d[1].get("PhotographicSensitivity");
        if (c7798b == null || c7798b2 != null) {
            return;
        }
        this.f18625d[1].put("PhotographicSensitivity", c7798b);
    }

    /* renamed from: m */
    private void m17287m(C7797a c7797a, HashMap hashMap) throws IOException {
        int i;
        C7798b c7798b = (C7798b) hashMap.get("JPEGInterchangeFormat");
        C7798b c7798b2 = (C7798b) hashMap.get("JPEGInterchangeFormatLength");
        if (c7798b == null || c7798b2 == null) {
            return;
        }
        int m17261i = c7798b.m17261i(this.f18627f);
        int min = Math.min(c7798b2.m17261i(this.f18627f), c7797a.available() - m17261i);
        int i2 = this.f18624c;
        if (i2 == 4 || i2 == 9 || i2 == 10) {
            i = this.f18629h;
        } else {
            if (i2 == 7) {
                i = this.f18630i;
            }
            if (m17261i > 0 || min <= 0 || this.f18622a != null || this.f18623b != null) {
                return;
            }
            c7797a.m17270m(m17261i);
            c7797a.readFully(new byte[min]);
            return;
        }
        m17261i += i;
        if (m17261i > 0) {
        }
    }

    /* renamed from: n */
    private void m17286n(C7797a c7797a, HashMap hashMap) throws IOException {
        C7798b c7798b = (C7798b) hashMap.get("StripOffsets");
        C7798b c7798b2 = (C7798b) hashMap.get("StripByteCounts");
        if (c7798b == null || c7798b2 == null) {
            return;
        }
        long[] m17297c = m17297c(c7798b.m17259k(this.f18627f));
        long[] m17297c2 = m17297c(c7798b2.m17259k(this.f18627f));
        if (m17297c == null) {
            Log.w("ExifInterface", "stripOffsets should not be null.");
        } else if (m17297c2 == null) {
            Log.w("ExifInterface", "stripByteCounts should not be null.");
        } else {
            long j = 0;
            for (long j2 : m17297c2) {
                j += j2;
            }
            byte[] bArr = new byte[(int) j];
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < m17297c.length; i3++) {
                int i4 = (int) m17297c[i3];
                int i5 = (int) m17297c2[i3];
                int i6 = i4 - i;
                if (i6 < 0) {
                    Log.d("ExifInterface", "Invalid strip offset value");
                }
                c7797a.m17270m(i6);
                int i7 = i + i6;
                byte[] bArr2 = new byte[i5];
                c7797a.read(bArr2);
                i = i7 + i5;
                System.arraycopy(bArr2, 0, bArr, i2, i5);
                i2 += i5;
            }
        }
    }

    /* renamed from: o */
    private static boolean m17285o(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = f18610o;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    /* renamed from: p */
    private boolean m17284p(byte[] bArr) throws IOException {
        C7797a c7797a = new C7797a(bArr);
        ByteOrder m17277w = m17277w(c7797a);
        this.f18627f = m17277w;
        c7797a.m17273F(m17277w);
        short readShort = c7797a.readShort();
        c7797a.close();
        return readShort == 20306 || readShort == 21330;
    }

    /* renamed from: q */
    private boolean m17283q(byte[] bArr) throws IOException {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; i++) {
            if (bArr[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    private boolean m17282r(byte[] bArr) throws IOException {
        C7797a c7797a = new C7797a(bArr);
        ByteOrder m17277w = m17277w(c7797a);
        this.f18627f = m17277w;
        c7797a.m17273F(m17277w);
        short readShort = c7797a.readShort();
        c7797a.close();
        return readShort == 85;
    }

    /* renamed from: s */
    private boolean m17281s(HashMap hashMap) throws IOException {
        C7798b c7798b;
        C7798b c7798b2 = (C7798b) hashMap.get("BitsPerSample");
        if (c7798b2 != null) {
            int[] iArr = (int[]) c7798b2.m17259k(this.f18627f);
            if (Arrays.equals(f18608m, iArr)) {
                return true;
            }
            if (this.f18624c != 3 || (c7798b = (C7798b) hashMap.get("PhotometricInterpretation")) == null) {
                return false;
            }
            int m17261i = c7798b.m17261i(this.f18627f);
            return (m17261i == 1 && Arrays.equals(iArr, f18609n)) || (m17261i == 6 && Arrays.equals(iArr, f18608m));
        }
        return false;
    }

    /* renamed from: t */
    private boolean m17280t(HashMap hashMap) throws IOException {
        C7798b c7798b = (C7798b) hashMap.get("ImageLength");
        C7798b c7798b2 = (C7798b) hashMap.get("ImageWidth");
        if (c7798b == null || c7798b2 == null) {
            return false;
        }
        return c7798b.m17261i(this.f18627f) <= 512 && c7798b2.m17261i(this.f18627f) <= 512;
    }

    /* renamed from: u */
    private void m17279u(InputStream inputStream) throws IOException {
        for (int i = 0; i < f18600F.length; i++) {
            try {
                this.f18625d[i] = new HashMap<>();
            } catch (IOException unused) {
            } catch (Throwable th) {
                m17299a();
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        this.f18624c = m17292h(bufferedInputStream);
        C7797a c7797a = new C7797a(bufferedInputStream);
        switch (this.f18624c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
                m17289k(c7797a);
                break;
            case 4:
                m17293g(c7797a, 0, 0);
                break;
            case 7:
                m17291i(c7797a);
                break;
            case 9:
                m17290j(c7797a);
                break;
            case 10:
                m17288l(c7797a);
                break;
        }
        m17303A(c7797a);
        m17299a();
    }

    /* renamed from: v */
    private void m17278v(C7797a c7797a, int i) throws IOException {
        ByteOrder m17277w = m17277w(c7797a);
        this.f18627f = m17277w;
        c7797a.m17273F(m17277w);
        int readUnsignedShort = c7797a.readUnsignedShort();
        int i2 = this.f18624c;
        if (i2 != 7 && i2 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = c7797a.readInt();
        if (readInt >= 8 && readInt < i) {
            int i3 = readInt - 8;
            if (i3 <= 0 || c7797a.skipBytes(i3) == i3) {
                return;
            }
            throw new IOException("Couldn't jump to first Ifd: " + i3);
        }
        throw new IOException("Invalid first Ifd offset: " + readInt);
    }

    /* renamed from: w */
    private ByteOrder m17277w(C7797a c7797a) throws IOException {
        short readShort = c7797a.readShort();
        if (readShort != 18761) {
            if (readShort == 19789) {
                return ByteOrder.BIG_ENDIAN;
            }
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    /* renamed from: x */
    private void m17276x(byte[] bArr, int i) throws IOException {
        C7797a c7797a = new C7797a(bArr);
        m17278v(c7797a, bArr.length);
        m17275y(c7797a, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f5  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m17275y(p201g.p246k.p247a.C7796a.C7797a r24, int r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 807
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p201g.p246k.p247a.C7796a.m17275y(g.k.a.a$a, int):void");
    }

    /* renamed from: z */
    private void m17274z(C7797a c7797a, int i) throws IOException {
        C7798b c7798b;
        C7798b c7798b2 = this.f18625d[i].get("ImageLength");
        C7798b c7798b3 = this.f18625d[i].get("ImageWidth");
        if ((c7798b2 == null || c7798b3 == null) && (c7798b = this.f18625d[i].get("JPEGInterchangeFormat")) != null) {
            m17293g(c7797a, c7798b.m17261i(this.f18627f), i);
        }
    }

    /* renamed from: d */
    public String m17296d(String str) {
        C7798b m17294f = m17294f(str);
        if (m17294f != null) {
            if (!f18604J.contains(str)) {
                return m17294f.m17260j(this.f18627f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = m17294f.f18640a;
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + m17294f.f18640a);
                    return null;
                }
                C7800d[] c7800dArr = (C7800d[]) m17294f.m17259k(this.f18627f);
                if (c7800dArr != null && c7800dArr.length == 3) {
                    return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) c7800dArr[0].f18647a) / ((float) c7800dArr[0].f18648b))), Integer.valueOf((int) (((float) c7800dArr[1].f18647a) / ((float) c7800dArr[1].f18648b))), Integer.valueOf((int) (((float) c7800dArr[2].f18647a) / ((float) c7800dArr[2].f18648b))));
                }
                Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(c7800dArr));
                return null;
            }
            try {
                return Double.toString(m17294f.m17262h(this.f18627f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* renamed from: e */
    public int m17295e(String str, int i) {
        C7798b m17294f = m17294f(str);
        if (m17294f == null) {
            return i;
        }
        try {
            return m17294f.m17261i(this.f18627f);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ExifInterface.java */
    /* renamed from: g.k.a.a$a */
    /* loaded from: classes2.dex */
    public static class C7797a extends InputStream implements DataInput {

        /* renamed from: w */
        private static final ByteOrder f18634w = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: x */
        private static final ByteOrder f18635x = ByteOrder.BIG_ENDIAN;

        /* renamed from: c */
        private DataInputStream f18636c;

        /* renamed from: d */
        private ByteOrder f18637d;

        /* renamed from: e */
        final int f18638e;

        /* renamed from: f */
        int f18639f;

        public C7797a(InputStream inputStream) throws IOException {
            this.f18637d = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f18636c = dataInputStream;
            int available = dataInputStream.available();
            this.f18638e = available;
            this.f18639f = 0;
            this.f18636c.mark(available);
        }

        /* renamed from: F */
        public void m17273F(ByteOrder byteOrder) {
            this.f18637d = byteOrder;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f18636c.available();
        }

        /* renamed from: c */
        public int m17272c() {
            return this.f18639f;
        }

        /* renamed from: g */
        public long m17271g() throws IOException {
            return readInt() & 4294967295L;
        }

        /* renamed from: m */
        public void m17270m(long j) throws IOException {
            int i = this.f18639f;
            if (i > j) {
                this.f18639f = 0;
                this.f18636c.reset();
                this.f18636c.mark(this.f18638e);
            } else {
                j -= i;
            }
            int i2 = (int) j;
            if (skipBytes(i2) != i2) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            this.f18639f++;
            return this.f18636c.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws IOException {
            this.f18639f++;
            return this.f18636c.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            int i = this.f18639f + 1;
            this.f18639f = i;
            if (i <= this.f18638e) {
                int read = this.f18636c.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() throws IOException {
            this.f18639f += 2;
            return this.f18636c.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f18639f + i2;
            this.f18639f = i3;
            if (i3 <= this.f18638e) {
                if (this.f18636c.read(bArr, i, i2) != i2) {
                    throw new IOException("Couldn't read up to the length of buffer");
                }
                return;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            int i = this.f18639f + 4;
            this.f18639f = i;
            if (i <= this.f18638e) {
                int read = this.f18636c.read();
                int read2 = this.f18636c.read();
                int read3 = this.f18636c.read();
                int read4 = this.f18636c.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.f18637d;
                    if (byteOrder == f18634w) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f18635x) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    throw new IOException("Invalid byte order: " + this.f18637d);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readLine() throws IOException {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            int i = this.f18639f + 8;
            this.f18639f = i;
            if (i <= this.f18638e) {
                int read = this.f18636c.read();
                int read2 = this.f18636c.read();
                int read3 = this.f18636c.read();
                int read4 = this.f18636c.read();
                int read5 = this.f18636c.read();
                int read6 = this.f18636c.read();
                int read7 = this.f18636c.read();
                int read8 = this.f18636c.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.f18637d;
                    if (byteOrder == f18634w) {
                        return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f18635x) {
                        return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
                    }
                    throw new IOException("Invalid byte order: " + this.f18637d);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            int i = this.f18639f + 2;
            this.f18639f = i;
            if (i <= this.f18638e) {
                int read = this.f18636c.read();
                int read2 = this.f18636c.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f18637d;
                    if (byteOrder == f18634w) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == f18635x) {
                        return (short) ((read << 8) + read2);
                    }
                    throw new IOException("Invalid byte order: " + this.f18637d);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readUTF() throws IOException {
            this.f18639f += 2;
            return this.f18636c.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws IOException {
            this.f18639f++;
            return this.f18636c.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            int i = this.f18639f + 2;
            this.f18639f = i;
            if (i <= this.f18638e) {
                int read = this.f18636c.read();
                int read2 = this.f18636c.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f18637d;
                    if (byteOrder == f18634w) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == f18635x) {
                        return (read << 8) + read2;
                    }
                    throw new IOException("Invalid byte order: " + this.f18637d);
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public int skipBytes(int i) throws IOException {
            int min = Math.min(i, this.f18638e - this.f18639f);
            int i2 = 0;
            while (i2 < min) {
                i2 += this.f18636c.skipBytes(min - i2);
            }
            this.f18639f += i2;
            return i2;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = this.f18636c.read(bArr, i, i2);
            this.f18639f += read;
            return read;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            int length = this.f18639f + bArr.length;
            this.f18639f = length;
            if (length <= this.f18638e) {
                if (this.f18636c.read(bArr, 0, bArr.length) != bArr.length) {
                    throw new IOException("Couldn't read up to the length of buffer");
                }
                return;
            }
            throw new EOFException();
        }

        public C7797a(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExifInterface.java */
    /* renamed from: g.k.a.a$c */
    /* loaded from: classes2.dex */
    public static class C7799c {

        /* renamed from: a */
        public final int f18643a;

        /* renamed from: b */
        public final String f18644b;

        /* renamed from: c */
        public final int f18645c;

        /* renamed from: d */
        public final int f18646d;

        C7799c(String str, int i, int i2) {
            this.f18644b = str;
            this.f18643a = i;
            this.f18645c = i2;
            this.f18646d = -1;
        }

        /* renamed from: a */
        boolean m17258a(int i) {
            int i2;
            int i3 = this.f18645c;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.f18646d) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((this.f18645c == 9 || this.f18646d == 9) && i == 8) {
                return true;
            }
            return (this.f18645c == 12 || this.f18646d == 12) && i == 11;
        }

        C7799c(String str, int i, int i2, int i3) {
            this.f18644b = str;
            this.f18643a = i;
            this.f18645c = i2;
            this.f18646d = i3;
        }
    }

    public C7796a(InputStream inputStream) throws IOException {
        this.f18625d = new HashMap[f18600F.length];
        this.f18626e = new HashSet(f18600F.length);
        this.f18627f = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f18622a = null;
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f18623b = (AssetManager.AssetInputStream) inputStream;
            } else {
                this.f18623b = null;
            }
            m17279u(inputStream);
            return;
        }
        throw new IllegalArgumentException("inputStream cannot be null");
    }
}
