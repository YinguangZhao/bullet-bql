/*
 *  Copyright 2018, Oath Inc.
 *  Licensed under the terms of the Apache License, Version 2.0.
 *  See the LICENSE file associated with the project for terms.
 */

/*
 * Adapted and modified from the Presto project:
 * https://github.com/prestodb/presto/blob/1898faf2ec4881709c9b8197e8332f302d618875/presto-parser/src/main/java/com/facebook/presto/sql/tree/QueryBody.java
 */
package com.yahoo.bullet.bql.tree;

import java.util.Optional;

public abstract class QueryBody extends Relation {
    /**
     * Constructor that requires a {@link NodeLocation}.
     *
     * @param location A {@link NodeLocation}.
     */
    protected QueryBody(Optional<NodeLocation> location) {
        super(location);
    }

    @Override
    public <R, C> R accept(ASTVisitor<R, C> visitor, C context) {
        return visitor.visitQueryBody(this, context);
    }
}
