import React from 'react';
import styles from './CohortDetails.module.css';

function CohortDetails({ id, stream, startDate, status, coach, trainer }) {
  const headingStyle = {
    color: status.toLowerCase() === 'ongoing' ? 'green' : 'blue',
  };

  return (
   <div className={styles.box}>
  <h3 style={headingStyle}>{id} - {stream}</h3>
  <dl className={styles.detailList}>
    <div className={styles.detailItem}>
      <dt>Started On</dt>
      <dd>{'\t'}{startDate}</dd>
    </div>
    <div className={styles.detailItem}>
      <dt>Current Status</dt>
      <dd>{'\t'}{status}</dd>
    </div>
    <div className={styles.detailItem}>
      <dt>Coach</dt>
      <dd>{'\t'}{coach}</dd>
    </div>
    <div className={styles.detailItem}>
      <dt>Trainer</dt>
      <dd>{'\t'}{trainer}</dd>
    </div>
  </dl>
</div>

  );
}

export default CohortDetails;