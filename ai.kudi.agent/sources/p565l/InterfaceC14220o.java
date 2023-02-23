package p565l;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
/* compiled from: Dns.java */
/* renamed from: l.o */
/* loaded from: classes3.dex */
public interface InterfaceC14220o {

    /* renamed from: a */
    public static final InterfaceC14220o f31137a = new C14221a();

    /* compiled from: Dns.java */
    /* renamed from: l.o$a */
    /* loaded from: classes3.dex */
    class C14221a implements InterfaceC14220o {
        C14221a() {
        }

        @Override // p565l.InterfaceC14220o
        public List<InetAddress> lookup(String str) throws UnknownHostException {
            if (str != null) {
                try {
                    return Arrays.asList(InetAddress.getAllByName(str));
                } catch (NullPointerException e) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + str);
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            }
            throw new UnknownHostException("hostname == null");
        }
    }

    List<InetAddress> lookup(String str) throws UnknownHostException;
}
