package kotlin.reflect.jvm.internal.impl.descriptors.p554l1.p555a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.e0.d.l;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.C12427e;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.C12446n;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.InterfaceC12447o;
import kotlin.p493j0.p494o.p495c.p497p0.p503d.p513b.p514a0.C12408a;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12608b;
import kotlin.p493j0.p494o.p495c.p497p0.p520f.C12609c;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p529u.C12756d;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.C12763b;
import kotlin.p493j0.p494o.p495c.p497p0.p523i.p531w.InterfaceC12777h;
import kotlin.p557z.C13724q;
import kotlin.p557z.C13742z;
import kotlin.reflect.jvm.internal.impl.descriptors.p552j1.C13416m;
/* compiled from: PackagePartScopeCache.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.l1.a.a */
/* loaded from: classes3.dex */
public final class C13454a {

    /* renamed from: a */
    private final C12427e f29808a;

    /* renamed from: b */
    private final C13461g f29809b;

    /* renamed from: c */
    private final ConcurrentHashMap<C12608b, InterfaceC12777h> f29810c;

    public C13454a(C12427e c12427e, C13461g c13461g) {
        l.f(c12427e, "resolver");
        l.f(c13461g, "kotlinClassFinder");
        this.f29808a = c12427e;
        this.f29809b = c13461g;
        this.f29810c = new ConcurrentHashMap<>();
    }

    /* renamed from: a */
    public final InterfaceC12777h m4941a(C13459f c13459f) {
        Collection<InterfaceC12447o> m3901b;
        List m3825B0;
        l.f(c13459f, "fileClass");
        ConcurrentHashMap<C12608b, InterfaceC12777h> concurrentHashMap = this.f29810c;
        C12608b mo4922h = c13459f.mo4922h();
        InterfaceC12777h interfaceC12777h = concurrentHashMap.get(mo4922h);
        if (interfaceC12777h == null) {
            C12609c m7389h = c13459f.mo4922h().m7389h();
            l.e(m7389h, "fileClass.classId.packageFqName");
            if (c13459f.mo4926a().m8997c() == C12408a.EnumC12409a.MULTIFILE_CLASS) {
                List<String> m8994f = c13459f.mo4926a().m8994f();
                m3901b = new ArrayList();
                for (String str : m8994f) {
                    C12608b m7384m = C12608b.m7384m(C12756d.m6833d(str).m6832e());
                    l.e(m7384m, "topLevel(JvmClassName.byInternalName(partName).fqNameForTopLevelClassMaybeWithDollars)");
                    InterfaceC12447o m8884b = C12446n.m8884b(this.f29809b, m7384m);
                    if (m8884b != null) {
                        m3901b.add(m8884b);
                    }
                }
            } else {
                m3901b = C13724q.m3901b(c13459f);
            }
            C13416m c13416m = new C13416m(this.f29808a.m8939e().m6496p(), m7389h);
            ArrayList arrayList = new ArrayList();
            for (InterfaceC12447o interfaceC12447o : m3901b) {
                InterfaceC12777h m8941c = this.f29808a.m8941c(c13416m, interfaceC12447o);
                if (m8941c != null) {
                    arrayList.add(m8941c);
                }
            }
            m3825B0 = C13742z.m3825B0(arrayList);
            C12763b.C12764a c12764a = C12763b.f28629d;
            InterfaceC12777h m6814a = c12764a.m6814a("package " + m7389h + " (" + c13459f + ')', m3825B0);
            InterfaceC12777h putIfAbsent = concurrentHashMap.putIfAbsent(mo4922h, m6814a);
            interfaceC12777h = putIfAbsent != null ? putIfAbsent : m6814a;
        }
        l.e(interfaceC12777h, "cache.getOrPut(fileClass.classId) {\n        val fqName = fileClass.classId.packageFqName\n\n        val parts =\n            if (fileClass.classHeader.kind == KotlinClassHeader.Kind.MULTIFILE_CLASS)\n                fileClass.classHeader.multifilePartNames.mapNotNull { partName ->\n                    val classId = ClassId.topLevel(JvmClassName.byInternalName(partName).fqNameForTopLevelClassMaybeWithDollars)\n                    kotlinClassFinder.findKotlinClass(classId)\n                }\n            else listOf(fileClass)\n\n        val packageFragment = EmptyPackageFragmentDescriptor(resolver.components.moduleDescriptor, fqName)\n\n        val scopes = parts.mapNotNull { part ->\n            resolver.createKotlinPackagePartScope(packageFragment, part)\n        }.toList()\n\n        ChainedMemberScope.create(\"package $fqName ($fileClass)\", scopes)\n    }");
        return interfaceC12777h;
    }
}
