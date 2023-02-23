package ai.kudi.agent.issues.domain.dataSource;

import ai.kudi.agent.issues.data.IssueCategoryDetails;
import java.util.List;
import p425j.p444e.p450e0.InterfaceC11291f;
/* compiled from: lambda */
/* renamed from: ai.kudi.agent.issues.domain.dataSource.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0251b implements InterfaceC11291f {

    /* renamed from: e */
    public static final /* synthetic */ C0251b f379e;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C0251b $r0 = new C0251b();
        f379e = $r0;
    }

    private /* synthetic */ C0251b() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p444e.p450e0.InterfaceC11291f
    /* renamed from: a */
    public final Object mo10663a(Object obj) {
        IssueCategoryDetails $r3 = (IssueCategoryDetails) obj;
        List $r1 = ApiDataSource.m39354fetchIssueDetails$lambda1($r3);
        return $r1;
    }
}
