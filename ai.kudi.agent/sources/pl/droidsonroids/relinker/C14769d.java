package pl.droidsonroids.relinker;

import android.os.Build;
import pl.droidsonroids.relinker.C14761b;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SystemLibraryLoader.java */
/* renamed from: pl.droidsonroids.relinker.d */
/* loaded from: classes3.dex */
public final class C14769d implements C14761b.InterfaceC14763b {
    @Override // pl.droidsonroids.relinker.C14761b.InterfaceC14763b
    /* renamed from: a */
    public String mo369a(String str) {
        return (str.startsWith("lib") && str.endsWith(".so")) ? str : System.mapLibraryName(str);
    }

    @Override // pl.droidsonroids.relinker.C14761b.InterfaceC14763b
    /* renamed from: b */
    public String mo368b(String str) {
        return str.substring(3, str.length() - 3);
    }

    @Override // pl.droidsonroids.relinker.C14761b.InterfaceC14763b
    /* renamed from: c */
    public String[] mo367c() {
        if (Build.VERSION.SDK_INT >= 21) {
            String[] strArr = Build.SUPPORTED_ABIS;
            if (strArr.length > 0) {
                return strArr;
            }
        }
        return !C14770e.m365a(Build.CPU_ABI2) ? new String[]{Build.CPU_ABI, Build.CPU_ABI2} : new String[]{Build.CPU_ABI};
    }

    @Override // pl.droidsonroids.relinker.C14761b.InterfaceC14763b
    /* renamed from: d */
    public void mo366d(String str) {
        System.load(str);
    }

    @Override // pl.droidsonroids.relinker.C14761b.InterfaceC14763b
    public void loadLibrary(String str) {
        System.loadLibrary(str);
    }
}
