package io.intercom.android.sdk.blocks.models;

import android.os.Parcel;
import android.os.Parcelable;
import io.intercom.android.sdk.blocks.BlockAlignment;
import io.intercom.android.sdk.blocks.BlockType;
import io.intercom.android.sdk.blocks.models.ConversationRatingOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class Block implements Parcelable {
    public static final Parcelable.Creator<Block> CREATOR = new Parcelable.Creator<Block>() { // from class: io.intercom.android.sdk.blocks.models.Block.1
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Block createFromParcel(Parcel parcel) {
            Block $r2 = new Block(parcel);
            return $r2;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Block createFromParcel(Parcel parcel) {
            Block $r1 = createFromParcel(parcel);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Block[] newArray(int i) {
            Block[] $r1 = new Block[i];
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Block[] newArray(int i) {
            Block[] $r1 = newArray(i);
            return $r1;
        }
    };
    private final BlockAlignment align;
    private final String articleId;
    private final List<BlockAttachment> attachments;
    private final String attribution;
    private final Author author;
    private final List<Channel> channels;
    private final Map<String, String> data;
    private final String description;
    private final String fallbackUrl;
    private final Link footerLink;
    private final int height;

    /* renamed from: id */
    private final String f23888id;
    private final Image image;
    private final List<String> items;
    private final String language;
    private final String linkType;
    private final String linkUrl;
    private final List<Link> links;
    private final String name;
    private final List<ConversationRatingOption> options;
    private final String previewUrl;
    private final String provider;
    private final int ratingIndex;
    private final String remark;
    private final String siteName;
    private final String text;
    private final String thumbnailUrl;
    private final String title;
    private final String trackingUrl;
    private final BlockType type;
    private final String username;
    private final int width;

    /* renamed from: io.intercom.android.sdk.blocks.models.Block$2 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C102072 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$blocks$BlockType;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        static {
            BlockType[] $r4 = BlockType.values();
            int $i0 = $r4.length;
            int[] $r5 = new int[$i0];
            $SwitchMap$io$intercom$android$blocks$BlockType = $r5;
            try {
                BlockType $r6 = BlockType.PARAGRAPH;
                int $i02 = $r6.ordinal();
                $r5[$i02] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                int[] $r52 = $SwitchMap$io$intercom$android$blocks$BlockType;
                BlockType $r62 = BlockType.LOCALIMAGE;
                int $i03 = $r62.ordinal();
                $r52[$i03] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                int[] $r53 = $SwitchMap$io$intercom$android$blocks$BlockType;
                BlockType $r63 = BlockType.IMAGE;
                int $i04 = $r63.ordinal();
                $r53[$i04] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                int[] $r54 = $SwitchMap$io$intercom$android$blocks$BlockType;
                BlockType $r64 = BlockType.LOCAL_ATTACHMENT;
                int $i05 = $r64.ordinal();
                $r54[$i05] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class Builder {
        String align;
        String articleId;
        List<BlockAttachment> attachments;
        String attribution;
        Author author;
        List<Channel> channels;
        Map<String, String> data;
        String description;
        String fallbackUrl;
        Builder footerLink;
        Integer height;

        /* renamed from: id */
        String f23889id;
        Image image;
        List<String> items;
        String language;
        String linkType;
        String linkUrl;
        List<Builder> links;
        String name;
        List<ConversationRatingOption.Builder> options;
        String previewUrl;
        String provider;
        Integer ratingIndex;
        Integer rating_index;
        String remark;
        String siteName;
        String text;
        String thumbnailUrl;
        String title;
        String trackingUrl;
        String type;
        String username;
        Integer width;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public Block build() {
            Block $r1 = new Block(this);
            return $r1;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                Class $r2 = obj.getClass();
                if (Builder.class != $r2) {
                    return false;
                }
                Builder $r3 = (Builder) obj;
                String $r4 = this.type;
                if ($r4 != null) {
                    String $r5 = $r3.type;
                    boolean $z0 = $r4.equals($r5);
                    if (!$z0) {
                        return false;
                    }
                } else if ($r3.type != null) {
                    return false;
                }
                String $r42 = this.text;
                if ($r42 != null) {
                    String $r52 = $r3.text;
                    boolean $z02 = $r42.equals($r52);
                    if (!$z02) {
                        return false;
                    }
                } else if ($r3.text != null) {
                    return false;
                }
                String $r43 = this.title;
                if ($r43 != null) {
                    String $r53 = $r3.title;
                    boolean $z03 = $r43.equals($r53);
                    if (!$z03) {
                        return false;
                    }
                } else if ($r3.title != null) {
                    return false;
                }
                String $r44 = this.description;
                if ($r44 != null) {
                    String $r54 = $r3.description;
                    boolean $z04 = $r44.equals($r54);
                    if (!$z04) {
                        return false;
                    }
                } else if ($r3.description != null) {
                    return false;
                }
                String $r45 = this.linkType;
                if ($r45 != null) {
                    String $r55 = $r3.linkType;
                    boolean $z05 = $r45.equals($r55);
                    if (!$z05) {
                        return false;
                    }
                } else if ($r3.linkType != null) {
                    return false;
                }
                String $r46 = this.siteName;
                if ($r46 != null) {
                    String $r56 = $r3.siteName;
                    boolean $z06 = $r46.equals($r56);
                    if (!$z06) {
                        return false;
                    }
                } else if ($r3.siteName != null) {
                    return false;
                }
                String $r47 = this.articleId;
                if ($r47 != null) {
                    String $r57 = $r3.articleId;
                    boolean $z07 = $r47.equals($r57);
                    if (!$z07) {
                        return false;
                    }
                } else if ($r3.articleId != null) {
                    return false;
                }
                Author $r6 = this.author;
                if ($r6 != null) {
                    Author $r7 = $r3.author;
                    boolean $z08 = $r6.equals($r7);
                    if (!$z08) {
                        return false;
                    }
                } else if ($r3.author != null) {
                    return false;
                }
                Image $r8 = this.image;
                if ($r8 != null) {
                    Image $r9 = $r3.image;
                    boolean $z09 = $r8.equals($r9);
                    if (!$z09) {
                        return false;
                    }
                } else if ($r3.image != null) {
                    return false;
                }
                Map $r10 = this.data;
                if ($r10 != null) {
                    Map $r11 = $r3.data;
                    boolean $z010 = $r10.equals($r11);
                    if (!$z010) {
                        return false;
                    }
                } else if ($r3.data != null) {
                    return false;
                }
                String $r48 = this.language;
                if ($r48 != null) {
                    String $r58 = $r3.language;
                    boolean $z011 = $r48.equals($r58);
                    if (!$z011) {
                        return false;
                    }
                } else if ($r3.language != null) {
                    return false;
                }
                String $r49 = this.name;
                if ($r49 != null) {
                    String $r59 = $r3.name;
                    boolean $z012 = $r49.equals($r59);
                    if (!$z012) {
                        return false;
                    }
                } else if ($r3.name != null) {
                    return false;
                }
                String $r410 = this.thumbnailUrl;
                if ($r410 != null) {
                    String $r510 = $r3.thumbnailUrl;
                    boolean $z013 = $r410.equals($r510);
                    if (!$z013) {
                        return false;
                    }
                } else if ($r3.thumbnailUrl != null) {
                    return false;
                }
                String $r411 = this.linkUrl;
                if ($r411 != null) {
                    String $r511 = $r3.linkUrl;
                    boolean $z014 = $r411.equals($r511);
                    if (!$z014) {
                        return false;
                    }
                } else if ($r3.linkUrl != null) {
                    return false;
                }
                String $r412 = this.trackingUrl;
                if ($r412 != null) {
                    String $r512 = $r3.trackingUrl;
                    boolean $z015 = $r412.equals($r512);
                    if (!$z015) {
                        return false;
                    }
                } else if ($r3.trackingUrl != null) {
                    return false;
                }
                String $r413 = this.fallbackUrl;
                if ($r413 != null) {
                    String $r513 = $r3.fallbackUrl;
                    boolean $z016 = $r413.equals($r513);
                    if (!$z016) {
                        return false;
                    }
                } else if ($r3.fallbackUrl != null) {
                    return false;
                }
                String $r414 = this.username;
                if ($r414 != null) {
                    String $r514 = $r3.username;
                    boolean $z017 = $r414.equals($r514);
                    if (!$z017) {
                        return false;
                    }
                } else if ($r3.username != null) {
                    return false;
                }
                String $r415 = this.provider;
                if ($r415 != null) {
                    String $r515 = $r3.provider;
                    boolean $z018 = $r415.equals($r515);
                    if (!$z018) {
                        return false;
                    }
                } else if ($r3.provider != null) {
                    return false;
                }
                String $r416 = this.f23889id;
                if ($r416 != null) {
                    String $r516 = $r3.f23889id;
                    boolean $z019 = $r416.equals($r516);
                    if (!$z019) {
                        return false;
                    }
                } else if ($r3.f23889id != null) {
                    return false;
                }
                String $r417 = this.align;
                if ($r417 != null) {
                    String $r517 = $r3.align;
                    boolean $z020 = $r417.equals($r517);
                    if (!$z020) {
                        return false;
                    }
                } else if ($r3.align != null) {
                    return false;
                }
                Integer $r12 = this.width;
                if ($r12 != null) {
                    Integer $r13 = $r3.width;
                    boolean $z021 = $r12.equals($r13);
                    if (!$z021) {
                        return false;
                    }
                } else if ($r3.width != null) {
                    return false;
                }
                Integer $r122 = this.height;
                if ($r122 != null) {
                    Integer $r132 = $r3.height;
                    boolean $z022 = $r122.equals($r132);
                    if (!$z022) {
                        return false;
                    }
                } else if ($r3.height != null) {
                    return false;
                }
                String $r418 = this.previewUrl;
                if ($r418 != null) {
                    String $r518 = $r3.previewUrl;
                    boolean $z023 = $r418.equals($r518);
                    if (!$z023) {
                        return false;
                    }
                } else if ($r3.previewUrl != null) {
                    return false;
                }
                String $r419 = this.attribution;
                if ($r419 != null) {
                    String $r519 = $r3.attribution;
                    boolean $z024 = $r419.equals($r519);
                    if (!$z024) {
                        return false;
                    }
                } else if ($r3.attribution != null) {
                    return false;
                }
                List $r14 = this.attachments;
                if ($r14 != null) {
                    List $r15 = $r3.attachments;
                    boolean $z025 = $r14.equals($r15);
                    if (!$z025) {
                        return false;
                    }
                } else if ($r3.attachments != null) {
                    return false;
                }
                List $r142 = this.items;
                if ($r142 != null) {
                    List $r152 = $r3.items;
                    boolean $z026 = $r142.equals($r152);
                    if (!$z026) {
                        return false;
                    }
                } else if ($r3.items != null) {
                    return false;
                }
                List $r143 = this.channels;
                if ($r143 != null) {
                    List $r153 = $r3.channels;
                    boolean $z027 = $r143.equals($r153);
                    if (!$z027) {
                        return false;
                    }
                } else if ($r3.channels != null) {
                    return false;
                }
                Integer $r123 = this.rating_index;
                if ($r123 != null) {
                    Integer $r133 = $r3.rating_index;
                    boolean $z028 = $r123.equals($r133);
                    if (!$z028) {
                        return false;
                    }
                } else if ($r3.rating_index != null) {
                    return false;
                }
                Integer $r124 = this.ratingIndex;
                if ($r124 != null) {
                    Integer $r134 = $r3.ratingIndex;
                    boolean $z029 = $r124.equals($r134);
                    if (!$z029) {
                        return false;
                    }
                } else if ($r3.ratingIndex != null) {
                    return false;
                }
                String $r420 = this.remark;
                if ($r420 != null) {
                    String $r520 = $r3.remark;
                    boolean $z030 = $r420.equals($r520);
                    if (!$z030) {
                        return false;
                    }
                } else if ($r3.remark != null) {
                    return false;
                }
                List $r144 = this.options;
                if ($r144 != null) {
                    List $r154 = $r3.options;
                    boolean $z031 = $r144.equals($r154);
                    if (!$z031) {
                        return false;
                    }
                } else if ($r3.options != null) {
                    return false;
                }
                List $r145 = this.links;
                if ($r145 != null) {
                    List $r155 = $r3.links;
                    boolean $z032 = $r145.equals($r155);
                    if (!$z032) {
                        return false;
                    }
                } else if ($r3.links != null) {
                    return false;
                }
                Builder $r0 = this.footerLink;
                Builder $r32 = $r3.footerLink;
                if ($r0 == null) {
                    return $r32 == null;
                }
                boolean $z033 = $r0.equals($r32);
                return $z033;
            }
            return false;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
         */
        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public int hashCode() {
            String $r1 = this.type;
            int $i1 = $r1 != null ? $r1.hashCode() : 0;
            int $i12 = $i1 * 31;
            String $r12 = this.text;
            int $i2 = $r12 != null ? $r12.hashCode() : 0;
            int $i13 = ($i12 + $i2) * 31;
            String $r13 = this.title;
            int $i22 = $r13 != null ? $r13.hashCode() : 0;
            int $i14 = ($i13 + $i22) * 31;
            String $r14 = this.description;
            int $i23 = $r14 != null ? $r14.hashCode() : 0;
            int $i15 = ($i14 + $i23) * 31;
            String $r15 = this.linkType;
            int $i24 = $r15 != null ? $r15.hashCode() : 0;
            int $i16 = ($i15 + $i24) * 31;
            String $r16 = this.siteName;
            int $i25 = $r16 != null ? $r16.hashCode() : 0;
            int $i17 = ($i16 + $i25) * 31;
            String $r17 = this.articleId;
            int $i26 = $r17 != null ? $r17.hashCode() : 0;
            int $i18 = ($i17 + $i26) * 31;
            Author $r2 = this.author;
            int $i27 = $r2 != null ? $r2.hashCode() : 0;
            int $i19 = ($i18 + $i27) * 31;
            Image $r3 = this.image;
            int $i28 = $r3 != null ? $r3.hashCode() : 0;
            int $i110 = ($i19 + $i28) * 31;
            Map $r4 = this.data;
            int $i29 = $r4 != null ? $r4.hashCode() : 0;
            int $i111 = ($i110 + $i29) * 31;
            String $r18 = this.language;
            int $i210 = $r18 != null ? $r18.hashCode() : 0;
            int $i112 = ($i111 + $i210) * 31;
            String $r19 = this.name;
            int $i211 = $r19 != null ? $r19.hashCode() : 0;
            int $i113 = ($i112 + $i211) * 31;
            String $r110 = this.thumbnailUrl;
            int $i212 = $r110 != null ? $r110.hashCode() : 0;
            int $i114 = ($i113 + $i212) * 31;
            String $r111 = this.linkUrl;
            int $i213 = $r111 != null ? $r111.hashCode() : 0;
            int $i115 = ($i114 + $i213) * 31;
            String $r112 = this.trackingUrl;
            int $i214 = $r112 != null ? $r112.hashCode() : 0;
            int $i116 = ($i115 + $i214) * 31;
            String $r113 = this.fallbackUrl;
            int $i215 = $r113 != null ? $r113.hashCode() : 0;
            int $i117 = ($i116 + $i215) * 31;
            String $r114 = this.username;
            int $i216 = $r114 != null ? $r114.hashCode() : 0;
            int $i118 = ($i117 + $i216) * 31;
            String $r115 = this.provider;
            int $i217 = $r115 != null ? $r115.hashCode() : 0;
            int $i119 = ($i118 + $i217) * 31;
            String $r116 = this.f23889id;
            int $i218 = $r116 != null ? $r116.hashCode() : 0;
            int $i120 = ($i119 + $i218) * 31;
            String $r117 = this.align;
            int $i219 = $r117 != null ? $r117.hashCode() : 0;
            int $i121 = ($i120 + $i219) * 31;
            Integer $r5 = this.width;
            int $i220 = $r5 != null ? $r5.hashCode() : 0;
            int $i122 = ($i121 + $i220) * 31;
            Integer $r52 = this.height;
            int $i221 = $r52 != null ? $r52.hashCode() : 0;
            int $i123 = ($i122 + $i221) * 31;
            String $r118 = this.previewUrl;
            int $i222 = $r118 != null ? $r118.hashCode() : 0;
            int $i124 = ($i123 + $i222) * 31;
            String $r119 = this.attribution;
            int $i223 = $r119 != null ? $r119.hashCode() : 0;
            int $i125 = ($i124 + $i223) * 31;
            List $r6 = this.attachments;
            int $i224 = $r6 != null ? $r6.hashCode() : 0;
            int $i126 = ($i125 + $i224) * 31;
            List $r62 = this.items;
            int $i225 = $r62 != null ? $r62.hashCode() : 0;
            int $i127 = ($i126 + $i225) * 31;
            List $r63 = this.channels;
            int $i226 = $r63 != null ? $r63.hashCode() : 0;
            int $i128 = ($i127 + $i226) * 31;
            Integer $r53 = this.rating_index;
            int $i227 = $r53 != null ? $r53.hashCode() : 0;
            int $i129 = ($i128 + $i227) * 31;
            Integer $r54 = this.ratingIndex;
            int $i228 = $r54 != null ? $r54.hashCode() : 0;
            int $i130 = ($i129 + $i228) * 31;
            String $r120 = this.remark;
            int $i229 = $r120 != null ? $r120.hashCode() : 0;
            int $i131 = ($i130 + $i229) * 31;
            List $r64 = this.options;
            int $i230 = $r64 != null ? $r64.hashCode() : 0;
            int $i132 = ($i131 + $i230) * 31;
            List $r65 = this.links;
            int $i231 = $r65 != null ? $r65.hashCode() : 0;
            int $i133 = ($i132 + $i231) * 31;
            Builder $r0 = this.footerLink;
            int $i0 = $r0 != null ? $r0.hashCode() : 0;
            return $i133 + $i0;
        }

        public Builder withAlign(String str) {
            this.align = str;
            return this;
        }

        public Builder withArticleId(String str) {
            this.articleId = str;
            return this;
        }

        public Builder withAttachments(List list) {
            this.attachments = list;
            return this;
        }

        public Builder withAttribution(String str) {
            this.attribution = str;
            return this;
        }

        public Builder withAuthor(Author author) {
            this.author = author;
            return this;
        }

        public Builder withChannels(List list) {
            this.channels = list;
            return this;
        }

        public Builder withData(Map map) {
            this.data = map;
            return this;
        }

        public Builder withDescription(String str) {
            this.description = str;
            return this;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public Builder withHeight(int i) {
            Integer $r1 = Integer.valueOf(i);
            this.height = $r1;
            return this;
        }

        public Builder withImage(Image image) {
            this.image = image;
            return this;
        }

        public Builder withItems(List list) {
            this.items = list;
            return this;
        }

        public Builder withLinkType(String str) {
            this.linkType = str;
            return this;
        }

        public Builder withOptions(List list) {
            this.options = list;
            return this;
        }

        public Builder withPreviewUrl(String str) {
            this.previewUrl = str;
            return this;
        }

        public Builder withRatingIndex(Integer num) {
            this.ratingIndex = num;
            return this;
        }

        public Builder withRemark(String str) {
            this.remark = str;
            return this;
        }

        public Builder withSiteName(String str) {
            this.siteName = str;
            return this;
        }

        public Builder withText(String str) {
            this.text = str;
            return this;
        }

        public Builder withThumbnailUrl(String str) {
            this.thumbnailUrl = str;
            return this;
        }

        public Builder withTitle(String str) {
            this.title = str;
            return this;
        }

        public Builder withType(String str) {
            this.type = str;
            return this;
        }

        public Builder withUrl(String str) {
            this.name = str;
            return this;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        public Builder withWidth(int i) {
            Integer $r1 = Integer.valueOf(i);
            this.width = $r1;
            return this;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    Block() {
        /*
            r1 = this;
            io.intercom.android.sdk.blocks.models.Block$Builder r0 = new io.intercom.android.sdk.blocks.models.Block$Builder
            r0.<init>()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.blocks.models.Block.<init>():void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    protected Block(Parcel parcel) {
        BlockType $r9;
        Parcelable.Creator $r3 = BlockAttachment.CREATOR;
        ArrayList $r4 = parcel.createTypedArrayList($r3);
        this.attachments = $r4;
        ArrayList $r42 = parcel.createStringArrayList();
        this.items = $r42;
        int $i0 = parcel.readInt();
        HashMap $r5 = new HashMap($i0);
        this.data = $r5;
        for (int $i1 = 0; $i1 < $i0; $i1++) {
            String $r6 = parcel.readString();
            String $r7 = parcel.readString();
            Map $r1 = this.data;
            $r1.put($r6, $r7);
        }
        int $i02 = parcel.readInt();
        BlockAlignment $r8 = null;
        if ($i02 == -1) {
            $r9 = null;
        } else {
            BlockType[] $r10 = BlockType.values();
            $r9 = $r10[$i02];
        }
        this.type = $r9;
        int $i03 = parcel.readInt();
        if ($i03 != -1) {
            BlockAlignment[] $r11 = BlockAlignment.values();
            $r8 = $r11[$i03];
        }
        this.align = $r8;
        ClassLoader $r13 = Author.class.getClassLoader();
        Parcelable $r14 = parcel.readParcelable($r13);
        Author $r15 = (Author) $r14;
        this.author = $r15;
        ClassLoader $r132 = Image.class.getClassLoader();
        Parcelable $r142 = parcel.readParcelable($r132);
        Image $r16 = (Image) $r142;
        this.image = $r16;
        String $r62 = parcel.readString();
        this.text = $r62;
        String $r63 = parcel.readString();
        this.title = $r63;
        String $r64 = parcel.readString();
        this.description = $r64;
        String $r65 = parcel.readString();
        this.linkType = $r65;
        String $r66 = parcel.readString();
        this.siteName = $r66;
        String $r67 = parcel.readString();
        this.articleId = $r67;
        String $r68 = parcel.readString();
        this.language = $r68;
        String $r69 = parcel.readString();
        this.name = $r69;
        String $r610 = parcel.readString();
        this.thumbnailUrl = $r610;
        String $r611 = parcel.readString();
        this.linkUrl = $r611;
        String $r612 = parcel.readString();
        this.trackingUrl = $r612;
        String $r613 = parcel.readString();
        this.fallbackUrl = $r613;
        String $r614 = parcel.readString();
        this.username = $r614;
        String $r615 = parcel.readString();
        this.provider = $r615;
        String $r616 = parcel.readString();
        this.previewUrl = $r616;
        String $r617 = parcel.readString();
        this.attribution = $r617;
        String $r618 = parcel.readString();
        this.f23888id = $r618;
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        Parcelable.Creator $r32 = Channel.CREATOR;
        ArrayList $r43 = parcel.createTypedArrayList($r32);
        this.channels = $r43;
        this.ratingIndex = parcel.readInt();
        String $r619 = parcel.readString();
        this.remark = $r619;
        ArrayList $r44 = new ArrayList();
        this.options = $r44;
        ClassLoader $r133 = ConversationRatingOption.class.getClassLoader();
        parcel.readList($r44, $r133);
        ArrayList $r45 = new ArrayList();
        this.links = $r45;
        ClassLoader $r134 = Link.class.getClassLoader();
        parcel.readList($r45, $r134);
        ClassLoader $r135 = Link.class.getClassLoader();
        Parcelable $r143 = parcel.readParcelable($r135);
        Link $r17 = (Link) $r143;
        this.footerLink = $r17;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* JADX WARN: Incorrect condition in loop: B:109:0x020b */
    /* JADX WARN: Incorrect condition in loop: B:117:0x0240 */
    /* JADX WARN: Incorrect condition in loop: B:74:0x014e */
    /* JADX WARN: Incorrect condition in loop: B:82:0x017d */
    /* JADX WARN: Incorrect condition in loop: B:90:0x01ac */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private Block(io.intercom.android.sdk.blocks.models.Block.Builder r31) {
        /*
            Method dump skipped, instructions count: 647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.blocks.models.Block.<init>(io.intercom.android.sdk.blocks.models.Block$Builder):void");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            Class $r2 = obj.getClass();
            if (Block.class != $r2) {
                return false;
            }
            Block $r3 = (Block) obj;
            int $i0 = this.width;
            int $i1 = $r3.width;
            if ($i0 != $i1) {
                return false;
            }
            int $i02 = this.height;
            int $i12 = $r3.height;
            if ($i02 != $i12) {
                return false;
            }
            int $i03 = this.ratingIndex;
            int $i13 = $r3.ratingIndex;
            if ($i03 != $i13) {
                return false;
            }
            List $r4 = this.attachments;
            if ($r4 != null) {
                List $r5 = $r3.attachments;
                boolean $z0 = $r4.equals($r5);
                if (!$z0) {
                    return false;
                }
            } else if ($r3.attachments != null) {
                return false;
            }
            List $r42 = this.items;
            if ($r42 != null) {
                List $r52 = $r3.items;
                boolean $z02 = $r42.equals($r52);
                if (!$z02) {
                    return false;
                }
            } else if ($r3.items != null) {
                return false;
            }
            Map $r6 = this.data;
            if ($r6 != null) {
                Map $r7 = $r3.data;
                boolean $z03 = $r6.equals($r7);
                if (!$z03) {
                    return false;
                }
            } else if ($r3.data != null) {
                return false;
            }
            BlockType $r8 = this.type;
            BlockType $r9 = $r3.type;
            if ($r8 != $r9) {
                return false;
            }
            BlockAlignment $r10 = this.align;
            BlockAlignment $r102 = $r3.align;
            if ($r10 != $r102) {
                return false;
            }
            Author $r12 = this.author;
            if ($r12 != null) {
                Author $r13 = $r3.author;
                boolean $z04 = $r12.equals($r13);
                if (!$z04) {
                    return false;
                }
            } else if ($r3.author != null) {
                return false;
            }
            Image $r14 = this.image;
            if ($r14 != null) {
                Image $r15 = $r3.image;
                boolean $z05 = $r14.equals($r15);
                if (!$z05) {
                    return false;
                }
            } else if ($r3.image != null) {
                return false;
            }
            String $r16 = this.text;
            if ($r16 != null) {
                String $r17 = $r3.text;
                boolean $z06 = $r16.equals($r17);
                if (!$z06) {
                    return false;
                }
            } else if ($r3.text != null) {
                return false;
            }
            String $r162 = this.title;
            if ($r162 != null) {
                String $r172 = $r3.title;
                boolean $z07 = $r162.equals($r172);
                if (!$z07) {
                    return false;
                }
            } else if ($r3.title != null) {
                return false;
            }
            String $r163 = this.description;
            if ($r163 != null) {
                String $r173 = $r3.description;
                boolean $z08 = $r163.equals($r173);
                if (!$z08) {
                    return false;
                }
            } else if ($r3.description != null) {
                return false;
            }
            String $r164 = this.linkType;
            if ($r164 != null) {
                String $r174 = $r3.linkType;
                boolean $z09 = $r164.equals($r174);
                if (!$z09) {
                    return false;
                }
            } else if ($r3.linkType != null) {
                return false;
            }
            String $r165 = this.siteName;
            if ($r165 != null) {
                String $r175 = $r3.siteName;
                boolean $z010 = $r165.equals($r175);
                if (!$z010) {
                    return false;
                }
            } else if ($r3.siteName != null) {
                return false;
            }
            String $r166 = this.articleId;
            if ($r166 != null) {
                String $r176 = $r3.articleId;
                boolean $z011 = $r166.equals($r176);
                if (!$z011) {
                    return false;
                }
            } else if ($r3.articleId != null) {
                return false;
            }
            String $r167 = this.language;
            if ($r167 != null) {
                String $r177 = $r3.language;
                boolean $z012 = $r167.equals($r177);
                if (!$z012) {
                    return false;
                }
            } else if ($r3.language != null) {
                return false;
            }
            String $r168 = this.name;
            if ($r168 != null) {
                String $r178 = $r3.name;
                boolean $z013 = $r168.equals($r178);
                if (!$z013) {
                    return false;
                }
            } else if ($r3.name != null) {
                return false;
            }
            String $r169 = this.thumbnailUrl;
            if ($r169 != null) {
                String $r179 = $r3.thumbnailUrl;
                boolean $z014 = $r169.equals($r179);
                if (!$z014) {
                    return false;
                }
            } else if ($r3.thumbnailUrl != null) {
                return false;
            }
            String $r1610 = this.previewUrl;
            if ($r1610 != null) {
                String $r1710 = $r3.previewUrl;
                boolean $z015 = $r1610.equals($r1710);
                if (!$z015) {
                    return false;
                }
            } else if ($r3.previewUrl != null) {
                return false;
            }
            String $r1611 = this.attribution;
            if ($r1611 != null) {
                String $r1711 = $r3.attribution;
                boolean $z016 = $r1611.equals($r1711);
                if (!$z016) {
                    return false;
                }
            } else if ($r3.attribution != null) {
                return false;
            }
            String $r1612 = this.linkUrl;
            if ($r1612 != null) {
                String $r1712 = $r3.linkUrl;
                boolean $z017 = $r1612.equals($r1712);
                if (!$z017) {
                    return false;
                }
            } else if ($r3.linkUrl != null) {
                return false;
            }
            String $r1613 = this.trackingUrl;
            if ($r1613 != null) {
                String $r1713 = $r3.trackingUrl;
                boolean $z018 = $r1613.equals($r1713);
                if (!$z018) {
                    return false;
                }
            } else if ($r3.trackingUrl != null) {
                return false;
            }
            String $r1614 = this.fallbackUrl;
            if ($r1614 != null) {
                String $r1714 = $r3.fallbackUrl;
                boolean $z019 = $r1614.equals($r1714);
                if (!$z019) {
                    return false;
                }
            } else if ($r3.fallbackUrl != null) {
                return false;
            }
            String $r1615 = this.username;
            if ($r1615 != null) {
                String $r1715 = $r3.username;
                boolean $z020 = $r1615.equals($r1715);
                if (!$z020) {
                    return false;
                }
            } else if ($r3.username != null) {
                return false;
            }
            String $r1616 = this.provider;
            if ($r1616 != null) {
                String $r1716 = $r3.provider;
                boolean $z021 = $r1616.equals($r1716);
                if (!$z021) {
                    return false;
                }
            } else if ($r3.provider != null) {
                return false;
            }
            String $r1617 = this.f23888id;
            if ($r1617 != null) {
                String $r1717 = $r3.f23888id;
                boolean $z022 = $r1617.equals($r1717);
                if (!$z022) {
                    return false;
                }
            } else if ($r3.f23888id != null) {
                return false;
            }
            List $r43 = this.channels;
            if ($r43 != null) {
                List $r53 = $r3.channels;
                boolean $z023 = $r43.equals($r53);
                if (!$z023) {
                    return false;
                }
            } else if ($r3.channels != null) {
                return false;
            }
            String $r1618 = this.remark;
            if ($r1618 != null) {
                String $r1718 = $r3.remark;
                boolean $z024 = $r1618.equals($r1718);
                if (!$z024) {
                    return false;
                }
            } else if ($r3.remark != null) {
                return false;
            }
            List $r44 = this.options;
            if ($r44 != null) {
                List $r54 = $r3.options;
                boolean $z025 = $r44.equals($r54);
                if (!$z025) {
                    return false;
                }
            } else if ($r3.options != null) {
                return false;
            }
            List $r45 = this.links;
            if ($r45 != null) {
                List $r55 = $r3.links;
                boolean $z026 = $r45.equals($r55);
                if (!$z026) {
                    return false;
                }
            } else if ($r3.links != null) {
                return false;
            }
            Link $r18 = this.footerLink;
            Link $r182 = $r3.footerLink;
            if ($r18 == null) {
                return $r182 == null;
            }
            boolean $z027 = $r18.equals($r182);
            return $z027;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public BlockAlignment getAlign() {
        BlockAlignment r1 = this.align;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getArticleId() {
        String r1 = this.articleId;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public List getAttachments() {
        List r1 = this.attachments;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getAttribution() {
        String r1 = this.attribution;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public Author getAuthor() {
        Author r1 = this.author;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public List getChannels() {
        List r1 = this.channels;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public Map getData() {
        Map r1 = this.data;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getDescription() {
        String r1 = this.description;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getFallbackUrl() {
        String r1 = this.fallbackUrl;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public Link getFooterLink() {
        Link r1 = this.footerLink;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public int getHeight() {
        int i0 = this.height;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getId() {
        String r1 = this.f23888id;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public Image getImage() {
        Image r1 = this.image;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public List getItems() {
        List r1 = this.items;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getLanguage() {
        String r1 = this.language;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getLinkType() {
        String r1 = this.linkType;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getLinkUrl() {
        String r1 = this.linkUrl;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public List getLinks() {
        List r1 = this.links;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public List getOptions() {
        List r1 = this.options;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getPreviewUrl() {
        String r1 = this.previewUrl;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getProvider() {
        String r1 = this.provider;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public int getRatingIndex() {
        int i0 = this.ratingIndex;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getRemark() {
        String r1 = this.remark;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getSiteName() {
        String r1 = this.siteName;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getText() {
        String r1 = this.text;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getThumbnailUrl() {
        String r1 = this.thumbnailUrl;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getTitle() {
        String r1 = this.title;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getTrackingUrl() {
        String r1 = this.trackingUrl;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public BlockType getType() {
        BlockType r1 = this.type;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getUrl() {
        String r1 = this.name;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String getUsername() {
        String r1 = this.username;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public int getWidth() {
        int i0 = this.width;
        return i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public int hashCode() {
        List $r1 = this.attachments;
        int $i1 = $r1 != null ? $r1.hashCode() : 0;
        int $i12 = $i1 * 31;
        List $r12 = this.items;
        int $i2 = $r12 != null ? $r12.hashCode() : 0;
        int $i13 = ($i12 + $i2) * 31;
        Map $r2 = this.data;
        int $i22 = $r2 != null ? $r2.hashCode() : 0;
        int $i14 = ($i13 + $i22) * 31;
        BlockType $r3 = this.type;
        int $i23 = $r3 != null ? $r3.hashCode() : 0;
        int $i15 = ($i14 + $i23) * 31;
        BlockAlignment $r4 = this.align;
        int $i24 = $r4 != null ? $r4.hashCode() : 0;
        int $i16 = ($i15 + $i24) * 31;
        Author $r5 = this.author;
        int $i25 = $r5 != null ? $r5.hashCode() : 0;
        int $i17 = ($i16 + $i25) * 31;
        Image $r6 = this.image;
        int $i26 = $r6 != null ? $r6.hashCode() : 0;
        int $i18 = ($i17 + $i26) * 31;
        String $r7 = this.text;
        int $i27 = $r7 != null ? $r7.hashCode() : 0;
        int $i19 = ($i18 + $i27) * 31;
        String $r72 = this.title;
        int $i28 = $r72 != null ? $r72.hashCode() : 0;
        int $i110 = ($i19 + $i28) * 31;
        String $r73 = this.description;
        int $i29 = $r73 != null ? $r73.hashCode() : 0;
        int $i111 = ($i110 + $i29) * 31;
        String $r74 = this.linkType;
        int $i210 = $r74 != null ? $r74.hashCode() : 0;
        int $i112 = ($i111 + $i210) * 31;
        String $r75 = this.siteName;
        int $i211 = $r75 != null ? $r75.hashCode() : 0;
        int $i113 = ($i112 + $i211) * 31;
        String $r76 = this.articleId;
        int $i212 = $r76 != null ? $r76.hashCode() : 0;
        int $i114 = ($i113 + $i212) * 31;
        String $r77 = this.language;
        int $i213 = $r77 != null ? $r77.hashCode() : 0;
        int $i115 = ($i114 + $i213) * 31;
        String $r78 = this.name;
        int $i214 = $r78 != null ? $r78.hashCode() : 0;
        int $i116 = ($i115 + $i214) * 31;
        String $r79 = this.thumbnailUrl;
        int $i215 = $r79 != null ? $r79.hashCode() : 0;
        int $i117 = ($i116 + $i215) * 31;
        String $r710 = this.previewUrl;
        int $i216 = $r710 != null ? $r710.hashCode() : 0;
        int $i118 = ($i117 + $i216) * 31;
        String $r711 = this.attribution;
        int $i217 = $r711 != null ? $r711.hashCode() : 0;
        int $i119 = ($i118 + $i217) * 31;
        String $r712 = this.linkUrl;
        int $i218 = $r712 != null ? $r712.hashCode() : 0;
        int $i120 = ($i119 + $i218) * 31;
        String $r713 = this.trackingUrl;
        int $i219 = $r713 != null ? $r713.hashCode() : 0;
        int $i121 = ($i120 + $i219) * 31;
        String $r714 = this.fallbackUrl;
        int $i220 = $r714 != null ? $r714.hashCode() : 0;
        int $i122 = ($i121 + $i220) * 31;
        String $r715 = this.username;
        int $i221 = $r715 != null ? $r715.hashCode() : 0;
        int $i123 = ($i122 + $i221) * 31;
        String $r716 = this.provider;
        int $i222 = $r716 != null ? $r716.hashCode() : 0;
        int $i124 = ($i123 + $i222) * 31;
        String $r717 = this.f23888id;
        int $i223 = $r717 != null ? $r717.hashCode() : 0;
        int $i224 = this.width;
        int $i225 = this.height;
        int $i125 = ((((($i124 + $i223) * 31) + $i224) * 31) + $i225) * 31;
        List $r13 = this.channels;
        int $i226 = $r13 != null ? $r13.hashCode() : 0;
        int $i227 = this.ratingIndex;
        int $i126 = ((($i125 + $i226) * 31) + $i227) * 31;
        String $r718 = this.remark;
        int $i228 = $r718 != null ? $r718.hashCode() : 0;
        int $i127 = ($i126 + $i228) * 31;
        List $r14 = this.options;
        int $i229 = $r14 != null ? $r14.hashCode() : 0;
        int $i128 = ($i127 + $i229) * 31;
        List $r15 = this.links;
        int $i230 = $r15 != null ? $r15.hashCode() : 0;
        int $i129 = ($i128 + $i230) * 31;
        Link $r8 = this.footerLink;
        int $i0 = $r8 != null ? $r8.hashCode() : 0;
        return $i129 + $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public Builder toBuilder() {
        Builder $r1 = new Builder();
        int[] $r2 = C102072.$SwitchMap$io$intercom$android$blocks$BlockType;
        BlockType $r3 = this.type;
        int $i0 = $r2[$r3.ordinal()];
        if ($i0 == 1) {
            String $r4 = this.text;
            Builder $r5 = $r1.withText($r4);
            BlockType $r32 = this.type;
            String $r42 = $r32.getSerializedName();
            $r5.withType($r42);
            return $r1;
        } else if ($i0 != 2 && $i0 != 3) {
            if ($i0 != 4) {
                return $r1;
            }
            BlockType $r33 = this.type;
            String $r43 = $r33.getSerializedName();
            Builder $r52 = $r1.withType($r43);
            List $r6 = this.attachments;
            $r52.withAttachments($r6);
            return $r1;
        } else {
            BlockType $r34 = this.type;
            String $r44 = $r34.getSerializedName();
            Builder $r53 = $r1.withType($r44);
            String $r45 = this.name;
            Builder $r54 = $r53.withUrl($r45);
            String $r46 = this.attribution;
            boolean $z0 = $r46.isEmpty();
            String $r7 = $z0 ? null : this.attribution;
            Builder $r55 = $r54.withAttribution($r7);
            String $r72 = this.previewUrl;
            boolean $z02 = $r72.isEmpty();
            String $r47 = $z02 ? null : this.previewUrl;
            $r55.withPreviewUrl($r47).withHeight(this.height).withWidth(this.width);
            return $r1;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public String toString() {
        StringBuilder $r2 = new StringBuilder();
        $r2.append("Block{attachments=");
        List $r3 = this.attachments;
        $r2.append($r3);
        $r2.append(", items=");
        List $r32 = this.items;
        $r2.append($r32);
        $r2.append(", data=");
        Map $r4 = this.data;
        $r2.append($r4);
        $r2.append(", type=");
        BlockType $r5 = this.type;
        $r2.append($r5);
        $r2.append(", align=");
        BlockAlignment $r6 = this.align;
        $r2.append($r6);
        $r2.append(", author=");
        Author $r7 = this.author;
        $r2.append($r7);
        $r2.append(", image=");
        Image $r8 = this.image;
        $r2.append($r8);
        $r2.append(", text='");
        String $r1 = this.text;
        $r2.append($r1);
        $r2.append('\'');
        $r2.append(", title='");
        String $r12 = this.title;
        $r2.append($r12);
        $r2.append('\'');
        $r2.append(", description='");
        String $r13 = this.description;
        $r2.append($r13);
        $r2.append('\'');
        $r2.append(", linkType='");
        String $r14 = this.linkType;
        $r2.append($r14);
        $r2.append('\'');
        $r2.append(", siteName='");
        String $r15 = this.siteName;
        $r2.append($r15);
        $r2.append('\'');
        $r2.append(", articleId='");
        String $r16 = this.articleId;
        $r2.append($r16);
        $r2.append('\'');
        $r2.append(", language='");
        String $r17 = this.language;
        $r2.append($r17);
        $r2.append('\'');
        $r2.append(", url='");
        String $r18 = this.name;
        $r2.append($r18);
        $r2.append('\'');
        $r2.append(", thumbnailUrl='");
        String $r19 = this.thumbnailUrl;
        $r2.append($r19);
        $r2.append('\'');
        $r2.append(", previewUrl='");
        String $r110 = this.previewUrl;
        $r2.append($r110);
        $r2.append('\'');
        $r2.append(", attribution='");
        String $r111 = this.attribution;
        $r2.append($r111);
        $r2.append('\'');
        $r2.append(", linkUrl='");
        String $r112 = this.linkUrl;
        $r2.append($r112);
        $r2.append('\'');
        $r2.append(", trackingUrl='");
        String $r113 = this.trackingUrl;
        $r2.append($r113);
        $r2.append('\'');
        $r2.append(", fallbackUrl='");
        String $r114 = this.fallbackUrl;
        $r2.append($r114);
        $r2.append('\'');
        $r2.append(", username='");
        String $r115 = this.username;
        $r2.append($r115);
        $r2.append('\'');
        $r2.append(", provider='");
        String $r116 = this.provider;
        $r2.append($r116);
        $r2.append('\'');
        $r2.append(", id='");
        String $r117 = this.f23888id;
        $r2.append($r117);
        $r2.append('\'');
        $r2.append(", width=");
        int $i0 = this.width;
        $r2.append($i0);
        $r2.append(", height=");
        int $i02 = this.height;
        $r2.append($i02);
        $r2.append(", channels=");
        List $r33 = this.channels;
        $r2.append($r33);
        $r2.append(", ratingIndex=");
        int $i03 = this.ratingIndex;
        $r2.append($i03);
        $r2.append(", remark='");
        String $r118 = this.remark;
        $r2.append($r118);
        $r2.append('\'');
        $r2.append(", options=");
        List $r34 = this.options;
        $r2.append($r34);
        $r2.append(", links=");
        List $r35 = this.links;
        $r2.append($r35);
        $r2.append(", footerLink=");
        Link $r9 = this.footerLink;
        $r2.append($r9);
        $r2.append('}');
        String $r119 = $r2.toString();
        return $r119;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchDebugInfoByOffset(DebugInfoApplyVisitor.java:106)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:83)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.util.ArrayList.forEach(ArrayList.java:1259)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x002f */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void writeToParcel(android.os.Parcel r22, int r23) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.blocks.models.Block.writeToParcel(android.os.Parcel, int):void");
    }
}
