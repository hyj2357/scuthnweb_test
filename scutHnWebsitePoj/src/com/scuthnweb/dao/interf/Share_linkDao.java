package com.scuthnweb.dao.interf;

import java.util.List;

import com.scuthnweb.domain.Share_link;

public interface Share_linkDao {
	/**
	 * 
	 * @param sl
	 * @return
	 */
     public  void createShare_link(  Share_link sl);
     
     
    /**
     * Jun:
     * @param sl
     * @return
     */
     public  void updateShare_link(Share_link sl);
     
     
     
     /**
      * Jun:����ʽ������Դ���ӱ�
      * @param share_link_id
      * @param share_link_name
      * @param share_link_content
      * @param share_link_publisher 
      * @param share_link_state
      * @return
      */
     public  List<Share_link> findShare_linkM( int     share_link_id,
                                               String  share_link_name, 
                                               String  share_link_content,
                                               int     share_link_publisher,
                                               int     share_link_state );
     
     /**
      * Jun:
      * @param share_link_id
      * @return
      */
     public  Share_link findByShare_link_id(int  share_link_id);
     
     
     /**
      * Jun:
      * @param share_link_state 0：审核通过 1：审核不通过 2：等待审核
      * @return
      */
     public  List<Object[]> findAllShare_link(int  share_link_state);
     
     
     /**
      * Jun:
      * @param share_link_publisher
      * @return
      */
     public  List<Object[]> findByShare_link_publisher(int share_link_publisher);
     
           
     /**
      * 
      * @param sl
      * @return
      */
     public  void  deleteShare_link( Share_link sl);
}
