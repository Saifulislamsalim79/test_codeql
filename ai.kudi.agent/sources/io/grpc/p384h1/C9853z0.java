package io.grpc.p384h1;

import io.grpc.p384h1.C9565c0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JndiResourceResolverFactory.java */
/* renamed from: io.grpc.h1.z0 */
/* loaded from: classes2.dex */
public final class C9853z0 implements C9565c0.InterfaceC9573g {

    /* renamed from: a */
    private static final Throwable f23142a = m13837d();

    /* compiled from: JndiResourceResolverFactory.java */
    /* renamed from: io.grpc.h1.z0$a */
    /* loaded from: classes2.dex */
    static final class C9854a implements InterfaceC9856c {
        C9854a() {
        }

        /* renamed from: b */
        private static void m13836b() {
            if (C9853z0.f23142a != null) {
                throw new UnsupportedOperationException("JNDI is not currently available", C9853z0.f23142a);
            }
        }

        /* renamed from: c */
        private static void m13835c(NamingEnumeration<?> namingEnumeration, NamingException namingException) throws NamingException {
            try {
                namingEnumeration.close();
            } catch (NamingException unused) {
            }
            throw namingException;
        }

        /* renamed from: d */
        private static void m13834d(DirContext dirContext, NamingException namingException) throws NamingException {
            try {
                dirContext.close();
            } catch (NamingException unused) {
            }
            throw namingException;
        }

        @Override // io.grpc.p384h1.C9853z0.InterfaceC9856c
        /* renamed from: a */
        public List<String> mo13831a(String str, String str2) throws NamingException {
            m13836b();
            String[] strArr = {str};
            ArrayList arrayList = new ArrayList();
            Hashtable hashtable = new Hashtable();
            hashtable.put("com.sun.jndi.ldap.connect.timeout", "5000");
            hashtable.put("com.sun.jndi.ldap.read.timeout", "5000");
            InitialDirContext initialDirContext = new InitialDirContext(hashtable);
            try {
                NamingEnumeration all = initialDirContext.getAttributes(str2, strArr).getAll();
                while (all.hasMore()) {
                    try {
                        NamingEnumeration all2 = ((Attribute) all.next()).getAll();
                        while (all2.hasMore()) {
                            try {
                                arrayList.add(String.valueOf(all2.next()));
                            } catch (NamingException e) {
                                m13835c(all2, e);
                                throw null;
                            }
                        }
                        all2.close();
                    } catch (NamingException e2) {
                        m13835c(all, e2);
                        throw null;
                    }
                }
                all.close();
                initialDirContext.close();
                return arrayList;
            } catch (NamingException e3) {
                m13834d(initialDirContext, e3);
                throw null;
            }
        }
    }

    /* compiled from: JndiResourceResolverFactory.java */
    /* renamed from: io.grpc.h1.z0$b */
    /* loaded from: classes2.dex */
    static final class C9855b implements C9565c0.InterfaceC9572f {

        /* renamed from: b */
        private static final Logger f23143b = Logger.getLogger(C9855b.class.getName());

        /* renamed from: a */
        private final InterfaceC9856c f23144a;

        static {
            Pattern.compile("\\s+");
        }

        public C9855b(InterfaceC9856c interfaceC9856c) {
            this.f23144a = interfaceC9856c;
        }

        /* renamed from: b */
        static String m13832b(String str) {
            StringBuilder sb = new StringBuilder(str.length());
            int i = 0;
            boolean z = false;
            while (i < str.length()) {
                char charAt = str.charAt(i);
                if (z) {
                    if (charAt == '\"') {
                        z = false;
                    } else {
                        if (charAt == '\\') {
                            i++;
                            charAt = str.charAt(i);
                        }
                        sb.append(charAt);
                    }
                } else if (charAt != ' ') {
                    if (charAt == '\"') {
                        z = true;
                    }
                    sb.append(charAt);
                }
                i++;
            }
            return sb.toString();
        }

        @Override // io.grpc.p384h1.C9565c0.InterfaceC9572f
        /* renamed from: a */
        public List<String> mo13833a(String str) throws NamingException {
            if (f23143b.isLoggable(Level.FINER)) {
                f23143b.log(Level.FINER, "About to query TXT records for {0}", new Object[]{str});
            }
            InterfaceC9856c interfaceC9856c = this.f23144a;
            List<String> mo13831a = interfaceC9856c.mo13831a("TXT", "dns:///" + str);
            if (f23143b.isLoggable(Level.FINER)) {
                f23143b.log(Level.FINER, "Found {0} TXT records", new Object[]{Integer.valueOf(mo13831a.size())});
            }
            ArrayList arrayList = new ArrayList(mo13831a.size());
            for (String str2 : mo13831a) {
                arrayList.add(m13832b(str2));
            }
            return Collections.unmodifiableList(arrayList);
        }
    }

    /* compiled from: JndiResourceResolverFactory.java */
    /* renamed from: io.grpc.h1.z0$c */
    /* loaded from: classes2.dex */
    interface InterfaceC9856c {
        /* renamed from: a */
        List<String> mo13831a(String str, String str2) throws NamingException;
    }

    /* renamed from: d */
    private static Throwable m13837d() {
        try {
            Class.forName("javax.naming.directory.InitialDirContext");
            Class.forName("com.sun.jndi.dns.DnsContextFactory");
            return null;
        } catch (ClassNotFoundException e) {
            return e;
        } catch (Error e2) {
            return e2;
        } catch (RuntimeException e3) {
            return e3;
        }
    }

    @Override // io.grpc.p384h1.C9565c0.InterfaceC9573g
    /* renamed from: a */
    public C9565c0.InterfaceC9572f mo13840a() {
        if (mo13839b() != null) {
            return null;
        }
        return new C9855b(new C9854a());
    }

    @Override // io.grpc.p384h1.C9565c0.InterfaceC9573g
    /* renamed from: b */
    public Throwable mo13839b() {
        return f23142a;
    }
}
