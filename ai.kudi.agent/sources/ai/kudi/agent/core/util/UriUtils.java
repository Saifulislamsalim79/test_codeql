package ai.kudi.agent.core.util;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13262h;
import kotlin.p549l0.C13276s;
/* compiled from: UriUtils.kt */
@Metadata(m10422d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J;\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0002\u0010\fJ\u001c\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\u0013"}, m10421d2 = {"Lai/kudi/agent/core/util/UriUtils;", "", "()V", "getDataColumn", "", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "selection", "selectionArgs", "", "(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;", "getFilePathForDocumentDownloadsFolder", "getPath", "isDownloadsDocument", "", "isExternalStorageDocument", "isMediaDocument", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class UriUtils {
    public static final UriUtils INSTANCE;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        UriUtils $r0 = new UriUtils();
        INSTANCE = $r0;
    }

    private UriUtils() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final String getDataColumn(Context context, Uri uri, String str, String[] strArr) {
        String[] $r5 = {"_data"};
        Cursor $r6 = null;
        try {
            ContentResolver $r7 = context.getContentResolver();
            Log_OC.append(uri);
            $r6 = $r7.query(uri, $r5, str, strArr, null);
            if ($r6 != null) {
                try {
                    boolean $z0 = $r6.moveToFirst();
                    if ($z0) {
                        int $i0 = $r6.getColumnIndexOrThrow("_data");
                        String $r1 = $r6.getString($i0);
                        $r6.close();
                        return $r1;
                    }
                } catch (Throwable th) {
                    $r8 = th;
                    if ($r6 != null) {
                        $r6.close();
                    }
                    throw $r8;
                }
            }
            if ($r6 == null) {
                return null;
            }
            $r6.close();
            return null;
        } catch (Throwable th2) {
            $r8 = th2;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final String getFilePathForDocumentDownloadsFolder(Context context, Uri uri) {
        String[] $r3 = {"_display_name"};
        Cursor $r4 = null;
        try {
            ContentResolver $r5 = context.getContentResolver();
            Log_OC.append(uri);
            $r4 = $r5.query(uri, $r3, null, null, null);
            if ($r4 != null) {
                try {
                    boolean $z0 = $r4.moveToFirst();
                    if ($z0) {
                        int $i0 = $r4.getColumnIndexOrThrow("_display_name");
                        String $r6 = $r4.getString($i0);
                        $r4.close();
                        return $r6;
                    }
                } catch (Throwable th) {
                    $r7 = th;
                    if ($r4 != null) {
                        $r4.close();
                    }
                    throw $r7;
                }
            }
            if ($r4 == null) {
                return null;
            }
            $r4.close();
            return null;
        } catch (Throwable th2) {
            $r7 = th2;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean isDownloadsDocument(Uri uri) {
        String $r2 = uri.getAuthority();
        boolean $z0 = Log_OC.append("com.android.providers.downloads.documents", $r2);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean isExternalStorageDocument(Uri uri) {
        String $r2 = uri.getAuthority();
        boolean $z0 = Log_OC.append("com.android.externalstorage.documents", $r2);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean isMediaDocument(Uri uri) {
        String $r2 = uri.getAuthority();
        boolean $z0 = Log_OC.append("com.android.providers.media.documents", $r2);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getPath(Context context, Uri $r2) {
        boolean $z0;
        boolean $z02;
        boolean $z03;
        boolean $z04;
        Log_OC.getArray(context, "context");
        Log_OC.getArray($r2, "uri");
        boolean $z05 = Build.VERSION.SDK_INT >= 19;
        Uri $r3 = null;
        if ($z05) {
            boolean $z06 = DocumentsContract.isDocumentUri(context, $r2);
            if ($z06) {
                boolean $z07 = isExternalStorageDocument($r2);
                if ($z07) {
                    String $r4 = DocumentsContract.getDocumentId($r2);
                    Log_OC.loadImage($r4, "docId");
                    C13262h $r5 = new C13262h(":");
                    List $r6 = $r5.m5519h($r4, 0);
                    Object[] $r8 = $r6.toArray(new String[0]);
                    if ($r8 == null) {
                        NullPointerException $r11 = new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        throw $r11;
                    }
                    String[] $r7 = (String[]) $r8;
                    String $r42 = $r7[0];
                    $z04 = C13276s.m5442s("primary", $r42, true);
                    if ($z04) {
                        StringBuilder $r9 = new StringBuilder();
                        File $r10 = Environment.getExternalStorageDirectory();
                        String $r43 = $r10.toString();
                        $r9.append($r43);
                        $r9.append('/');
                        String $r44 = $r7[1];
                        $r9.append($r44);
                        String $r45 = $r9.toString();
                        return $r45;
                    }
                    return null;
                }
                boolean $z08 = isDownloadsDocument($r2);
                if ($z08) {
                    String $r46 = getFilePathForDocumentDownloadsFolder(context, $r2);
                    if ($r46 != null) {
                        StringBuilder $r92 = new StringBuilder();
                        File $r102 = Environment.getExternalStorageDirectory();
                        $r92.append($r102.toString());
                        $r92.append("/Download/");
                        $r92.append((Object) $r46);
                        String $r47 = $r92.toString();
                        return $r47;
                    }
                    String $r12 = DocumentsContract.getDocumentId($r2);
                    String $r48 = $r12;
                    Log_OC.loadImage($r12, "id");
                    $z03 = C13276s.m5447E($r12, "raw:", false, 2, null);
                    if ($z03) {
                        Log_OC.loadImage($r12, "id");
                        C13262h $r52 = new C13262h("raw:");
                        String $r122 = $r52.m5520g($r12, "");
                        $r48 = $r122;
                        File $r103 = new File($r122);
                        boolean $z09 = $r103.exists();
                        if ($z09) {
                            return $r122;
                        }
                    }
                    Uri $r22 = Uri.parse("content://downloads/public_downloads");
                    Long $r13 = Long.valueOf($r48);
                    Log_OC.loadImage($r13, "valueOf(id)");
                    long $l1 = $r13.longValue();
                    Uri $r23 = ContentUris.withAppendedId($r22, $l1);
                    Log_OC.loadImage($r23, "withAppendedId(\n                    Uri.parse(\"content://downloads/public_downloads\"),\n                    java.lang.Long.valueOf(id)\n                )");
                    String $r49 = getDataColumn(context, $r23, null, null);
                    return $r49;
                }
                boolean $z010 = isMediaDocument($r2);
                if ($z010) {
                    String $r410 = DocumentsContract.getDocumentId($r2);
                    Log_OC.loadImage($r410, "docId");
                    C13262h $r53 = new C13262h(":");
                    List $r62 = $r53.m5519h($r410, 0);
                    Object[] $r82 = $r62.toArray(new String[0]);
                    if ($r82 == null) {
                        NullPointerException $r112 = new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        throw $r112;
                    }
                    String[] $r72 = (String[]) $r82;
                    String $r411 = $r72[0];
                    int $i0 = $r411.hashCode();
                    if ($i0 == 93166550) {
                        boolean $z011 = $r411.equals("audio");
                        if ($z011) {
                            $r3 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                        }
                    } else if ($i0 == 100313435) {
                        boolean $z012 = $r411.equals("image");
                        if ($z012) {
                            $r3 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                        }
                    } else if ($i0 == 112202875) {
                        boolean $z013 = $r411.equals("video");
                        if ($z013) {
                            $r3 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                        }
                    }
                    String $r412 = $r72[1];
                    String[] $r14 = {$r412};
                    String $r413 = getDataColumn(context, $r3, "_id=?", $r14);
                    return $r413;
                }
                return null;
            }
        }
        String $r414 = $r2.getScheme();
        $z0 = C13276s.m5442s("content", $r414, true);
        if ($z0) {
            String $r415 = getDataColumn(context, $r2, null, null);
            return $r415;
        }
        String $r416 = $r2.getScheme();
        $z02 = C13276s.m5442s("file", $r416, true);
        if ($z02) {
            String $r417 = $r2.getPath();
            return $r417;
        }
        return null;
    }
}
