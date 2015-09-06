package com.github.dnault.therapi.runtimejavadoc.ergonomic;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import static com.github.dnault.therapi.runtimejavadoc.internal.RuntimeJavadocHelper.unmodifiableDefensiveCopy;

public class ClassDoc {
    private final String name;
    private final List<CommentElement> comment;
    private final List<SeeAlsoDoc> seeAlso;
    private final List<OtherDoc> other;

    public ClassDoc(@JsonProperty("name") String name,
                    @JsonProperty("comment") List<CommentElement> comment,
                    @JsonProperty("other") List<OtherDoc> other,
                    @JsonProperty("seeAlso") List<SeeAlsoDoc> seeAlso) {
        this.name = name;
        this.comment = unmodifiableDefensiveCopy(comment);
        this.other = unmodifiableDefensiveCopy(other);
        this.seeAlso = unmodifiableDefensiveCopy(seeAlso);
    }

    public String getName() {
        return name;
    }

    public List<CommentElement> getComment() {
        return comment;
    }

    public List<SeeAlsoDoc> getSeeAlso() {
        return seeAlso;
    }

    public List<OtherDoc> getOther() {
        return other;
    }
}
