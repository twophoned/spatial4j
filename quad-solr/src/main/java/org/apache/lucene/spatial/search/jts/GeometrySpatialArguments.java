package org.apache.lucene.spatial.search.jts;

import org.apache.lucene.spatial.search.SpatialRelationship;
import org.apache.lucene.spatial.search.SpatialArgs;

import java.io.IOException;

import org.apache.lucene.index.IndexReader.AtomicReaderContext;
import org.apache.lucene.spatial.geometry.shape.Point2D;
import org.apache.lucene.util.Bits;
import org.apache.solr.search.function.DocValues;

import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.Point;

public class GeometrySpatialArguments extends SpatialArgs
{
  public Geometry shape = null;
  public SpatialRelationship op = SpatialRelationship.WITHIN;
}