package tcking.github.com.giraffeplayer2;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Message;
import android.util.Log;
import com.github.kevinsawicki.http.HttpRequest;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
/* loaded from: classes3.dex */
public class LazyLoadManager extends IntentService {

    /* renamed from: d */
    private static String f33216d = "fingerprint";

    /* renamed from: e */
    private static int f33217e;

    /* renamed from: f */
    private static String f33218f;

    /* renamed from: w */
    private static Message f33219w;

    /* renamed from: x */
    private static String f33220x;

    /* renamed from: y */
    private static InterfaceC14854b f33221y = new C14853a();

    /* renamed from: c */
    private int f33222c;

    /* renamed from: tcking.github.com.giraffeplayer2.LazyLoadManager$a */
    /* loaded from: classes3.dex */
    static class C14853a implements InterfaceC14854b {
        C14853a() {
        }

        @Override // tcking.github.com.giraffeplayer2.LazyLoadManager.InterfaceC14854b
        /* renamed from: a */
        public String mo207a(String str, String str2) {
            return String.format("https://raw.githubusercontent.com/tcking/GiraffePlayerLazyLoadFiles/master/%s/%s/so.zip", str2, str);
        }
    }

    /* renamed from: tcking.github.com.giraffeplayer2.LazyLoadManager$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC14854b {
        /* renamed from: a */
        String mo207a(String str, String str2);
    }

    public LazyLoadManager() {
        super("GiraffePlayerLazyLoader");
        this.f33222c = -1;
    }

    /* renamed from: a */
    public static void m217a(Context context, String str, Message message) {
        f33218f = str;
        f33219w = message;
        Intent intent = new Intent(context, LazyLoadManager.class);
        intent.putExtra(f33216d, str);
        context.startService(intent);
    }

    /* renamed from: b */
    private void m216b(String str) {
        C14863e m89j;
        f33217e = -1;
        if (f33218f == null || (m89j = C14894j.m92g().m89j(f33218f)) == null) {
            return;
        }
        m89j.m158X(str);
    }

    /* renamed from: c */
    public static String m215c(Context context) {
        String str = f33220x;
        if (str != null) {
            return str;
        }
        String str2 = context.getApplicationInfo().sourceDir;
        String[] strArr = Build.VERSION.SDK_INT >= 21 ? Build.SUPPORTED_ABIS : new String[]{Build.CPU_ABI, Build.CPU_ABI2};
        try {
            ZipFile zipFile = new ZipFile(str2);
            for (String str3 : strArr) {
                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry nextElement = entries.nextElement();
                    if (nextElement != null) {
                        String name = nextElement.getName();
                        if (name.startsWith("lib/") && name.endsWith("so") && str3.equalsIgnoreCase(name.substring(name.indexOf("/") + 1, name.lastIndexOf("/")))) {
                            f33220x = str3;
                            return str3;
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String str4 = strArr[0];
        f33220x = str4;
        return str4;
    }

    /* renamed from: d */
    public static File m214d(Context context) {
        return context.getDir("giraffePlayer2", 0);
    }

    /* renamed from: e */
    public static File m213e(Context context) {
        return new File(m214d(context).getAbsolutePath() + File.separator + "0.8.8" + File.separator + "so");
    }

    /* renamed from: f */
    private void m212f(File file) throws Exception {
        C14901n.m49g(C14863e.class.getClassLoader(), file);
        m211g(f33218f, "so installed");
        f33217e = 2;
        m209i();
    }

    /* renamed from: g */
    private void m211g(String str, String str2) {
        if (C14863e.f33254P) {
            Log.d("LazyLoadManager", String.format("[fingerprint:%s] %s", str, str2));
        }
    }

    /* renamed from: h */
    private void m210h(int i) {
        C14863e m89j;
        if (this.f33222c == i) {
            return;
        }
        this.f33222c = i;
        if (f33218f == null || (m89j = C14894j.m92g().m89j(f33218f)) == null) {
            return;
        }
        m89j.m157Y(this.f33222c);
    }

    /* renamed from: i */
    private void m209i() {
        C14863e m89j = C14894j.m92g().m89j(f33218f);
        if (m89j != null) {
            m89j.m173I(f33219w);
        }
        f33219w = null;
        f33218f = null;
    }

    /* renamed from: j */
    public static void m208j(File file, File file2) throws Exception {
        file2.mkdirs();
        ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file));
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry != null) {
                String name = nextEntry.getName();
                if (nextEntry.isDirectory()) {
                    String substring = name.substring(0, name.length() - 1);
                    new File(file2.getAbsolutePath() + File.separator + substring).mkdirs();
                } else {
                    File file3 = new File(file2.getAbsolutePath() + File.separator + name);
                    file3.createNewFile();
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = zipInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                        fileOutputStream.flush();
                    }
                    fileOutputStream.close();
                }
            } else {
                zipInputStream.close();
                return;
            }
        }
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        String stringExtra = intent.getStringExtra(f33216d);
        m211g(stringExtra, "loadStatus:" + f33217e);
        if (f33217e > 0) {
            m209i();
            return;
        }
        f33217e = 1;
        Context applicationContext = getApplicationContext();
        try {
            File m214d = m214d(applicationContext);
            File m213e = m213e(applicationContext);
            m211g(stringExtra, "soDir:" + m213e);
            if (new File(m213e, "libijkffmpeg.so").exists()) {
                m211g(stringExtra, "so files downloaded,try install");
                m212f(m213e);
                return;
            }
            String mo207a = f33221y.mo207a(m215c(applicationContext), "0.8.8");
            m211g(stringExtra, "download so from:" + mo207a);
            this.f33222c = -1;
            HttpRequest m32917i = HttpRequest.m32917i(mo207a);
            int m32922d = m32917i.m32922d();
            m211g(stringExtra, "server:" + m32922d);
            if (m32922d == 200) {
                File file = new File(new File(m214d, "tmp"), "so.zip");
                file.delete();
                file.getParentFile().mkdirs();
                file.createNewFile();
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                BufferedInputStream m32925a = m32917i.m32925a();
                byte[] bArr = new byte[4096];
                long j = 0;
                int m32920f = m32917i.m32920f();
                while (true) {
                    int read = m32925a.read(bArr);
                    if (read != -1) {
                        j += read;
                        if (m32920f > 0) {
                            m210h((int) ((100 * j) / m32920f));
                        }
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.close();
                        m208j(file, m213e);
                        file.delete();
                        m212f(m213e);
                        return;
                    }
                }
            } else {
                m216b("server response " + m32922d);
            }
        } catch (Exception e) {
            e.printStackTrace();
            m216b(e.getMessage());
        }
    }
}
