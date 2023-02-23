package ai.kudi.agent.issues.domain.dataSource;

import ai.kudi.agent.issues.data.IssueCategories;
import java.util.List;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class ClassWriter implements InterfaceC11291f {

    /* renamed from: b */
    public static final /* synthetic */ ClassWriter f377b;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        ClassWriter $r0 = new ClassWriter();
        f377b = $r0;
    }

    private /* synthetic */ ClassWriter() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        IssueCategories $r3 = (IssueCategories) obj;
        List $r1 = ApiDataSource.m39355fetchIssueTypes$lambda0($r3);
        return $r1;
    }
}
